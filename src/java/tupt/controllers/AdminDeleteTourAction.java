/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupt.controllers;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import tupt.daos.AdminDAO;

/**
 *
 * @author TuPT
 */
public class AdminDeleteTourAction {

    private String tourID;
    
    public AdminDeleteTourAction() {
    }
    
    public String getTourID() {
        return tourID;
    }
    
    public void setTourID(String tourID) {
        this.tourID = tourID;
    }
    
    public String execute() throws Exception {
        AdminDAO dao = new AdminDAO();
        HttpServletRequest request = ServletActionContext.getRequest();
        if (dao.deleteTour(tourID)) {
            return "success";
        } else {
            request.setAttribute("ERROR", "Delete failed!");
            return "fail";
        }
    }
    
}
