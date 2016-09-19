/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jde.userctrl;

import com.jde.beans.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Ahmed
 */
@ManagedBean
@SessionScoped
public class UserController {

    private List<Employee> employees = null;
    private Employee selectedemployee = null;

    @PostConstruct
    public void init() {
        employees = new ArrayList();
        employees.add(new Employee("Ahmed", "Amin", 1988));
        employees.add(new Employee("Sarah", "Ali", 2000));
        employees.add(new Employee("Tarek", "Moneir", 1999));
        selectedemployee = new Employee();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Employee getSelectedemployee() {
        return selectedemployee;
    }

    public void setSelectedemployee(Employee selectedemployee) {
        this.selectedemployee = selectedemployee;
    }

    public void select(Employee e) {
        //   System.out.println(e.toString());
        selectedemployee = e;
    }

    public void add() {
        employees.add(selectedemployee);
        selectedemployee = new Employee();
    }

    public void update() {
        selectedemployee = new Employee();
    }

    public void delete() {
        employees.remove(selectedemployee);
        selectedemployee = new Employee();
    }
}
