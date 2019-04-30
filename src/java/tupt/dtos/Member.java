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
public class Member implements Serializable {
    private String customerID, username, password, role;
    private boolean active;
    
    public Member() {
    }

    public Member(String customerID, String username, String password, String role) {
        this.customerID = customerID;
        this.username = username;
        this.password = password;
        this.role = role;
        this.active = true;
    }

    public Member(String customerID, String username, String role) {
        this.customerID = customerID;
        this.username = username;
        this.role = role;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    
}
