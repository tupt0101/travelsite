/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupt.controllers;

import com.opensymphony.xwork2.ActionContext;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import tupt.daos.NormalDAO;
import tupt.dtos.Customer;

/**
 *
 * @author TuPT
 */
public class ReloadProfileAction {
    
    public ReloadProfileAction() {
    }
    
    public String execute() throws Exception {
        NormalDAO dao = new NormalDAO();
        Map session = ActionContext.getContext().getSession();
        HttpServletRequest request = ServletActionContext.getRequest();
        String customerID = request.getParameter("customerID");
        Customer cust = dao.reloadProfile(customerID);
        if (cust != null) {
            session.put("CUSTOMER", cust);
            return "success";
        } else {
            request.setAttribute("ERROR", "Reload profile failed!");
            return "fail";
        }
    }
    
}
