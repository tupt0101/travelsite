/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupt.controllers;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import tupt.daos.NormalDAO;
import tupt.dtos.Tour;

/**
 *
 * @author TuPT
 */
public class LoadTourAction extends ActionSupport {

    private String tourID;
    private Tour tour;

    public LoadTourAction() {
    }

    public String getTourID() {
        return tourID;
    }

    public void setTourID(String tourID) {
        this.tourID = tourID;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    @Override
    public String execute() throws Exception {
        NormalDAO dao = new NormalDAO();
        tour = dao.findTourByPK(tourID);
        HttpServletRequest request = ServletActionContext.getRequest();
        if (tour != null) {
            request.setAttribute("DTO", tour);
            return "success";
        } else {
            request.setAttribute("ERROR", "Tour is not available.");
        }
        return "fail";
    }
}
