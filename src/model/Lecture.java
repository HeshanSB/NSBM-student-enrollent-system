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
public class Lecture {
    private int lectureeId;
    private String name;
    private String password;
    private String lectureLevel;

    public Lecture() {
    }

    public Lecture(int lectureeId, String name, String lectureLevel) {
        this.lectureeId = lectureeId;
        this.name = name;
        this.lectureLevel = lectureLevel;
    }

    public Lecture(int lectureeId, String name, String password, String lectureLevel) {
        this.lectureeId = lectureeId;
        this.name = name;
        this.password = password;
        this.lectureLevel = lectureLevel;
    }
    

    public int getLectureeId() {
        return lectureeId;
    }

    public void setLectureeId(int lectureeId) {
        this.lectureeId = lectureeId;
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

    public String getLectureLevel() {
        return lectureLevel;
    }

    public void setLectureLevel(String lectureLevel) {
        this.lectureLevel = lectureLevel;
    }
    
}
