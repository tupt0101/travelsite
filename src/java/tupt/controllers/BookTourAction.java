/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupt.controllers;

import com.opensymphony.xwork2.ActionSupport;
import java.time.LocalDate;
import java.sql.Date;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import tupt.daos.NormalDAO;
import tupt.dtos.BookTour;
import tupt.dtos.Tour;

/**
 *
 * @author TuPT
 */
public class BookTourAction extends ActionSupport {
    private String customerID;
    private String bookTourID, tourID;
    Date bookDay, expiredDay;
    private int numOfSeat, totalPrice, numOfAdult, numOfChild;
    private String unit, status;
    int numOfAvailableSeat;
    public BookTourAction() {
    }

    public int getNumOfAdult() {
        return numOfAdult;
    }

    public void setNumOfAdult(int numOfAdult) {
        this.numOfAdult = numOfAdult;
    }

    public int getNumOfChild() {
        return numOfChild;
    }

    public void setNumOfChild(int numOfChild) {
        this.numOfChild = numOfChild;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getBookTourID() {
        return bookTourID;
    }

    public void setBookTourID(String bookTourID) {
        this.bookTourID = bookTourID;
    }

    public String getTourID() {
        return tourID;
    }

    public void setTourID(String tourID) {
        this.tourID = tourID;
    }

    public Date getBookDay() {
        return bookDay;
    }

    public void setBookDay(Date bookDay) {
        this.bookDay = bookDay;
    }

    public Date getExpiredDay() {
        return expiredDay;
    }

    public void setExpiredDay(Date expiredDay) {
        this.expiredDay = expiredDay;
    }

    public int getNumOfSeat() {
        return numOfSeat;
    }

    public void setNumOfSeat(int numOfSeat) {
        this.numOfSeat = numOfSeat;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Date getCurrentDate() {
        LocalDate date = LocalDate.now();
        return Date.valueOf(date);
    }
    
    public String execute() throws Exception {
        NormalDAO dao = new NormalDAO();
        HttpServletRequest request = ServletActionContext.getRequest();
        int index = dao.countOfBookedTour() + 1;
        bookTourID = "BT-2019-" + index;
        bookDay = getCurrentDate();
        expiredDay = getCurrentDate();
        numOfSeat = numOfAdult + numOfChild;
        numOfAvailableSeat = dao.numOfAvailableSeat(tourID);
        Tour tour = dao.findTourByPK(tourID);
        totalPrice = numOfAdult * tour.getAdultPrice() + numOfChild * tour.getChildPrice();
        BookTour dto = new BookTour(bookTourID, tourID, bookDay, expiredDay, numOfSeat, totalPrice, unit, status);
        numOfAvailableSeat -= numOfSeat;
        dao.updateNumOfBookedSeat(numOfAvailableSeat, tourID);
        dto.setActive(true);
        if (dao.bookTour(customerID, dto)) {
            request.setAttribute("TOTAL", totalPrice);
            return "success";
        }
        return "fail";
    }

    @Override
    public void validate() {
        if (numOfSeat > numOfAvailableSeat)
            addFieldError("numOfAdult", "Not enough rooms left for this tour!");
    }
     
}
