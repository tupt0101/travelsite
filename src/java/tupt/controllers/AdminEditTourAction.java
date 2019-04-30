/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupt.controllers;

import com.opensymphony.xwork2.ActionContext;
import java.util.Map;
import tupt.daos.AdminDAO;
import tupt.dtos.Tour;

/**
 *
 * @author TuPT
 */
public class AdminEditTourAction {
    private String tourID;
    
    public AdminEditTourAction() {
    }

    public String getTourID() {
        return tourID;
    }

    public void setTourID(String tourID) {
        this.tourID = tourID;
    }
    
    public String execute() throws Exception {
        AdminDAO dao = new AdminDAO();
        Tour tour = dao.findTourByPK(tourID);
        Map session = ActionContext.getContext().getSession();
        session.put("DTO", tour);
        return "success";
    }
    
}
