/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupt.controllers;

import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import tupt.daos.NormalDAO;
import tupt.dtos.Customer;

/**
 *
 * @author TuPT
 */
public class UpdateProfileAction extends ActionSupport {
    private String customerName, phone, sex, dob, address;

    public UpdateProfileAction() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String execute() throws Exception {
        NormalDAO dao = new NormalDAO();
        HttpServletRequest request = ServletActionContext.getRequest();
        String customerID = request.getParameter("customerID");
        Customer cust = new Customer(customerID, customerName, dob, sex, address, phone);
        boolean check = dao.updateCustomer(cust);
        if (check)
            return "success";
        else {
            request.setAttribute("ERROR", "Update failed!");
            return "fail";
        }
    }
}
