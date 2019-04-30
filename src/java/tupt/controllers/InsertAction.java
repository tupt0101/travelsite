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
import tupt.dtos.Member;

/**
 *
 * @author TuPT
 */
public class InsertAction extends ActionSupport {
    private String fullname, email, password, phone, address;

    public InsertAction() {
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String execute() throws Exception {
        NormalDAO dao = new NormalDAO();
        Customer cust = new Customer(fullname, address, email, phone);
        int index = dao.countOfMember() + 1;
        cust.setCustomerID("CUS" + index);
        Member mem = new Member(cust.getCustomerID(), email, password, "user");
        boolean check = dao.insert(cust, mem);
        HttpServletRequest request = ServletActionContext.getRequest();
        if (check)
            return "success";
        else {
            request.setAttribute("ERROR", "Insert failed.");
            return "fail";
        }
    }
}
