/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupt.dtos;

import java.io.Serializable;

/**
 *
 * @author TuPT
 */
public class BookTourDetail implements Serializable {
    private String bookTourID, customerID, note;

    public BookTourDetail(String bookTourID, String customerID, String note) {
        this.bookTourID = bookTourID;
        this.customerID = customerID;
        this.note = note;
    }

    public BookTourDetail(String bookTourID, String customerID) {
        this.bookTourID = bookTourID;
        this.customerID = customerID;
    }

    public String getBookTourID() {
        return bookTourID;
    }

    public void setBookTourID(String bookTourID) {
        this.bookTourID = bookTourID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
}
