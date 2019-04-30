/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupt.dtos;

import java.io.Serializable;

/**
 *
 * @author TuPT
 */
public class Customer implements Serializable {
    private String customerID, customerName, dob, sex, address, mail, phone, note;
    private boolean active;

    public Customer() {
    }

    public Customer(String customerName, String address, String mail, String phone) {
        this.customerName = customerName;
        this.address = address;
        this.mail = mail;
        this.phone = phone;
    }

    public Customer(String customerID, String customerName, String dob, String sex, String address, String mail, String phone) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.dob = dob;
        this.sex = sex;
        this.address = address;
        this.mail = mail;
        this.phone = phone;
        this.active = true;
    }
    
    public Customer(String customerID, String customerName, String dob, String sex, String address, String mail, String phone, String note, boolean active) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.dob = dob;
        this.sex = sex;
        this.address = address;
        this.mail = mail;
        this.phone = phone;
        this.note = note;
        this.active = active;
    }

    public Customer(String customerID, String customerName, String address, String mail, String phone) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.address = address;
        this.mail = mail;
        this.phone = phone;
    }

    public Customer(String customerID, String customerName, String dob, String sex, String address, String phone) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.dob = dob;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
    }
    
    

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    
}
