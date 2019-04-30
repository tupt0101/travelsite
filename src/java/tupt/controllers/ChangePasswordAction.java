/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupt.controllers;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import tupt.daos.NormalDAO;

/**
 *
 * @author TuPT
 */
public class ChangePasswordAction {
    private String oldPassword, newPassword, confirmPassword;
    
    public ChangePasswordAction() {
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    
    public String execute() throws Exception {
        NormalDAO dao = new NormalDAO();
        HttpServletRequest request = ServletActionContext.getRequest();
        String customerID = request.getParameter("customerID");
        if (dao.changePassword(customerID,oldPassword, newPassword)) {
            return "success";
        } else {
            request.setAttribute("ERROR", "Change password failed!");
            return "fail";
        }
    }
    
}
