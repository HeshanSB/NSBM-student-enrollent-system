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
public class NormalSubject {
   private int subjectId;
   private String subjectName;
   private int year;
   private int hallNo;
   private String time;
   private int lectureId;
   private int courseId;
   private int numberOfAssignment;
   private String day;
   private int semester;
   private int compalsory;
   private int gpa;

    public NormalSubject() {
    }

    public NormalSubject(int subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }

    public NormalSubject(int subjectId, String subjectName, int hallNo, String time, String day) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.hallNo = hallNo;
        this.time = time;
        this.day = day;
    }

    public NormalSubject(int subjectId, String subjectName, int year, int hallNo, String time, int lectureId, int courseId, int numberOfAssignment) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.year = year;
        this.hallNo = hallNo;
        this.time = time;
        this.lectureId = lectureId;
        this.courseId = courseId;
        this.numberOfAssignment = numberOfAssignment;
    }

    public NormalSubject(int subjectId, String subjectName, int year, int hallNo, String time, int lectureId, int courseId, int numberOfAssignment, String day, int semester, int compalsory,int gpa) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.year = year;
        this.hallNo = hallNo;
        this.time = time;
        this.lectureId = lectureId;
        this.courseId = courseId;
        this.numberOfAssignment = numberOfAssignment;
        this.day = day;
        this.semester = semester;
        this.compalsory = compalsory;
        this.gpa = gpa;
    }

    public NormalSubject(int subjectId, String subjectName, int year, int hallNo, String time, int courseId, int numberOfAssignment, String day, int semester, int compalsory, int gpa) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.year = year;
        this.hallNo = hallNo;
        this.time = time;
        this.courseId = courseId;
        this.numberOfAssignment = numberOfAssignment;
        this.day = day;
        this.semester = semester;
        this.compalsory = compalsory;
        this.gpa = gpa;
    }

   
    
    public int getNumberOfAssignment() {
        return numberOfAssignment;
    }

    public void setNumberOfAssignment(int numberOfAssignment) {
        this.numberOfAssignment = numberOfAssignment;
    }
           
    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
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

    public int getHallNo() {
        return hallNo;
    }

    public void setHallNo(int hallNo) {
        this.hallNo = hallNo;
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

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getCompalsory() {
        return compalsory;
    }

    public void setCompalsory(int compalsory) {
        this.compalsory = compalsory;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
    
    
   
}
