/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iuh.di.dto;

/**
 *
 * @author xuankhang
 */
public class Student {
    private String id;
    private String name;
    private int yob;
    private double gpa;
    private String major;

    public Student() {
    }

    public Student(String id, String name, int yob, double gpa, String major) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }
    
    public void showProfile(){
        System.out.printf("|%-10s|%-15s|%-4d|%4.2f|%-2s|\n"
                            ,getId(), getName(), getYob(), getGpa(), getMajor());
    }
}
