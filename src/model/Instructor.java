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
public class Instructor {
    private int lecturId;
    private String name;
    private String password;

    public Instructor() {
    }

    public Instructor(int lecturId, String name) {
        this.lecturId = lecturId;
        this.name = name;
    }

    public Instructor(int lecturId, String name, String password) {
        this.lecturId = lecturId;
        this.name = name;
        this.password = password;
    }

    public int getLecturId() {
        return lecturId;
    }

    public void setLecturId(int lecturId) {
        this.lecturId = lecturId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
