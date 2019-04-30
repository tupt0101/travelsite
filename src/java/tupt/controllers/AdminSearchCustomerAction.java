/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupt.controllers;

import java.util.List;
import tupt.daos.AdminDAO;
import tupt.dtos.Customer;

/**
 *
 * @author TuPT
 */
public class AdminSearchCustomerAction {
    private String search;
    private List<Customer> listUser;
    
    public AdminSearchCustomerAction() {
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public List<Customer> getListUser() {
        return listUser;
    }

    public void setListUser(List<Customer> listUser) {
        this.listUser = listUser;
    }
    
    public String execute() throws Exception {
        AdminDAO dao = new AdminDAO();
        listUser = dao.findCusByLikeName(search);
        return "success";
    }
    
}
