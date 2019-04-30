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
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;
import tupt.daos.NormalDAO;
import tupt.dtos.Customer;

/**
 *
 * @author TuPT
 */
public class LoginAction extends ActionSupport {

    private String username, password;

    public LoginAction() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() throws Exception {
        NormalDAO dao = new NormalDAO();
        String role = dao.checkLogin(username, password);
        System.out.println(role);
        Map session = ActionContext.getContext().getSession();
        Customer cust = dao.loadUserProfile(username);
        HttpServletRequest request = ServletActionContext.getRequest();
        if (role.equals("fail")) {
            request.setAttribute("ERROR", "Invalid username or password.");
            return role;
        } else {
            session.put("ROLE", role);
            session.put("USERLOGIN", username);
            session.put("CUSTOMER", cust);
        }
        return role;
    }
    
    //validation
    @Override
    public void validate() {
        if (username.length() == 0)
            addFieldError("username", "Username is required!");
        if (password.length() == 0)
            addFieldError("password", "Password is required!");
    }
}
