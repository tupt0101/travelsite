/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupt.controllers;

import tupt.daos.AdminDAO;

/**
 *
 * @author TuPT
 */
public class AdminBanCustomerAction {
    private String customerID;
    
    public AdminBanCustomerAction() {
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    
    public String execute() throws Exception {
        AdminDAO dao = new AdminDAO();
        if (dao.banCustomer(customerID))
            return "success";
        return "fail";
    }
    
}
