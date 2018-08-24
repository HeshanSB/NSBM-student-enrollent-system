/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
 
public class Result {
    private int subjectId;
    private String finalResult;
    private int studentId;

    public Result() {
    }

    public Result(int subjectId, String finalResult) {
        this.subjectId = subjectId;
        this.finalResult = finalResult;
    }

    public Result(int subjectId, String finalResult, int studentId) {
        this.subjectId = subjectId;
        this.finalResult = finalResult;
        this.studentId = studentId;
    }
    

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getFinalResult() {
        return finalResult;
    }

    public void setFinalResult(String finalResult) {
        this.finalResult = finalResult;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
}
