/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupt.controllers;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import tupt.daos.NormalDAO;
import tupt.dtos.Tour;

/**
 *
 * @author TuPT
 */
public class SearchAction extends ActionSupport {
    private String search, departure;
    private List<Tour> result;

    public List<Tour> getResult() {
        return result;
    }

    public void setResult(List<Tour> result) {
        this.result = result;
    }

    public SearchAction() {
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }
    
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public String execute() throws Exception {
        NormalDAO dao = new NormalDAO();
        result = dao.findTourByLikeName(search, departure);
        return "success";
    }
}
