/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupt.dtos;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author TuPT
 */
public class BookTour implements Serializable {
    private String bookTourID, tourID;
    Date bookDay, expiredDay;
    private int numOfSeat, totalPrice;
    private String unit, status;
    private boolean active;

    public BookTour(String bookTourID, String tourID, Date bookDay, Date expiredDay, int numOfSeat, int totalPrice, String unit, String status) {
        this.bookTourID = bookTourID;
        this.tourID = tourID;
        this.bookDay = bookDay;
        this.expiredDay = expiredDay;
        this.numOfSeat = numOfSeat;
        this.totalPrice = totalPrice;
        this.unit = unit;
        this.status = status;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
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
    
    
}
