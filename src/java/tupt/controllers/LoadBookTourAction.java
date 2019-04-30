/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupt.controllers;

import com.opensymphony.xwork2.ActionContext;
import java.util.List;
import java.util.Map;
import tupt.daos.NormalDAO;
import tupt.dtos.BookTour;

/**
 *
 * @author TuPT
 */
public class LoadBookTourAction {
    String customerID;
    List<BookTour> bookedTourOfUser = null;
    
    public LoadBookTourAction() {
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    
    public List<BookTour> getBookTourOfUser() {
        return bookedTourOfUser;
    }
    
    
    public String execute() throws Exception {
        NormalDAO dao = new NormalDAO();
        bookedTourOfUser = dao.loadBookedTour(customerID);
        Map session = ActionContext.getContext().getSession();
        session.put("CART", bookedTourOfUser);
        return "success";
    }

}
