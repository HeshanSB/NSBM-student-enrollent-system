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
public class PracticalSubject {
   private int subjectId;
   private String subjectName;
   private int year;
   private int labNo;
   private String time;
   private int lectureId;
   private int instructorId;
   private int courseId;
   private int numberOfAssignment;
   private String day;
   private int gpa;
   private int semester;
   
    public PracticalSubject() {
    }

    public PracticalSubject(int subjectId, String subjectName, int labNo, String time, String day) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.labNo = labNo;
        this.time = time;
        this.day = day;
    }

    public PracticalSubject(int subjectId, String subjectName, int year, int labNo, String time, int courseId, int numberOfAssignment, String day, int gpa, int semester) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.year = year;
        this.labNo = labNo;
        this.time = time;
        this.courseId = courseId;
        this.numberOfAssignment = numberOfAssignment;
        this.day = day;
        this.gpa = gpa;
        this.semester = semester;
    }

    public PracticalSubject(int subjectId, String subjectName, int year, int labNo, String time, int instructorId, int courseId, int numberOfAssignment, String day, int gpa, int semester) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.year = year;
        this.labNo = labNo;
        this.time = time;
        this.instructorId = instructorId;
        this.courseId = courseId;
        this.numberOfAssignment = numberOfAssignment;
        this.day = day;
        this.gpa = gpa;
        this.semester = semester;
    }
    
   

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLabNo() {
        return labNo;
    }

    public void setLabNo(int labNo) {
        this.labNo = labNo;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getNumberOfAssignment() {
        return numberOfAssignment;
    }

    public void setNumberOfAssignment(int numberOfAssignment) {
        this.numberOfAssignment = numberOfAssignment;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
   
}
