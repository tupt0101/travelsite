/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupt.controllers;

import tupt.daos.NormalDAO;
import tupt.dtos.Contact;

/**
 *
 * @author TuPT
 */
public class SendContactAction {
    private String fullname, email, subject, message;
    
    public SendContactAction() {
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String execute() throws Exception {
        NormalDAO dao = new NormalDAO();
        int index = dao.countOfContact() + 1;
        String contactID = "CT-2019-" + index;
        Contact dto = new Contact(contactID, fullname, email, subject, message);
        if (dao.addContact(dto))
            return "success";
        return "fail";
    }
    
}
