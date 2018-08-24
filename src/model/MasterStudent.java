/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Heshan
 */
public class MasterStudent {
    private String fullName;
    private String nameWithInitials;
    private int studentId=0;
    private String addressNo;
    private String addressRd;
    private String addressCity;
    private String dob;
    private String email;
    private String password;
    private int year;

    public MasterStudent() {
    }

    public MasterStudent(String fullName, String nameWithInitials,int studentId, String email, int year) {
        this.fullName = fullName;
        this.nameWithInitials = nameWithInitials;
        this.studentId = studentId;
        this.email = email;
        this.year = year;
    }

    public MasterStudent(String fullName, String nameWithInitials, int studentId, String addressNo, String addressRd, String addressCity, String dob, String email, String password, int year) {
        this.fullName = fullName;
        this.nameWithInitials = nameWithInitials;
        this.studentId = studentId;
        this.addressNo = addressNo;
        this.addressRd = addressRd;
        this.addressCity = addressCity;
        this.dob = dob;
        this.email = email;
        this.password = password;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNameWithInitials() {
        return nameWithInitials;
    }

    public void setNameWithInitials(String nameWithInitials) {
        this.nameWithInitials = nameWithInitials;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getAddressNo() {
        return addressNo;
    }

    public void setAddressNo(String addressNo) {
        this.addressNo = addressNo;
    }

    public String getAddressRd() {
        return addressRd;
    }

    public void setAddressRd(String addressRd) {
        this.addressRd = addressRd;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
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
    
}
