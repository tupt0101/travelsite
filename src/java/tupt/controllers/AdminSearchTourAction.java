/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupt.controllers;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import tupt.daos.AdminDAO;
import tupt.dtos.Tour;

/**
 *
 * @author TuPT
 */
public class AdminSearchTourAction extends ActionSupport {
    private String search;
    private List<Tour> result;

    public List<Tour> getResult() {
        return result;
    }

    public void setResult(List<Tour> result) {
        this.result = result;
    }

    public AdminSearchTourAction() {
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public String execute() throws Exception {
        AdminDAO dao = new AdminDAO();
        result = dao.findTourByLikeName(search);
        return "success";
       
    }
}
