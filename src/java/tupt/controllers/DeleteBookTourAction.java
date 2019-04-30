/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupt.controllers;

import tupt.daos.NormalDAO;

/**
 *
 * @author TuPT
 */
public class DeleteBookTourAction {
    private String bookTourID;
    
    public DeleteBookTourAction() {
    }

    public String getBookTourID() {
        return bookTourID;
    }

    public void setBookTourID(String bookTourID) {
        this.bookTourID = bookTourID;
    }
    
    public String execute() throws Exception {
        NormalDAO dao = new NormalDAO();
        if (dao.deleteBookedTour(bookTourID)) {
            return "success";
        }
        return "success";
    }
    
}
