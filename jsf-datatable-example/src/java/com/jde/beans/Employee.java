/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jde.beans;

/**
 *
 * @author Ahmed
 */
public class Employee {

    private String name;
    private String surname;
    private int birthyear;

    public Employee() {
    }

    public Employee(String name, String surname, int birthyear) {
        this.name = name;
        this.surname = surname;
        this.birthyear = birthyear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + getName() + ", surname=" + getSurname() + ", birthyear=" + getBirthyear() + '}';
    }

}
