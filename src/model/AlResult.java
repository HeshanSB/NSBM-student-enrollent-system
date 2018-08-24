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
public class AlResult {
    private int stuId;
    private int year;
    private int indexNo;
    private int rank;
    private String subjects;
    //private String subject2;
    //private String subject3;
    private String results;
    //private String result2;
    //private String result3;

    public AlResult() {
    }

    public AlResult(int stuId,int year,int indexNo, int rank, String subjects, String results) {
        this.stuId = stuId;
        this.year = year;
        this.indexNo = indexNo;
        this.rank = rank;
        this.subjects= subjects;
        //this.subject2 = subject2;
        //this.subject3 = subject3;
        this.results = results;
        //this.result2 = result2;
        //this.result3 = result3;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }
    

    public int getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(int indexNo) {
        this.indexNo = indexNo;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

   /* public String getSubject2() {
        return subject2;
    }

    public void setSubject2(String subject2) {
        this.subject2 = subject2;
    }

    public String getSubject3() {
        return subject3;
    }

    public void setSubject3(String subject3) {
        this.subject3 = subject3;
    }
*/
    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

  /*  public String getResult2() {
        return result2;
    }

    public void setResult2(String result2) {
        this.result2 = result2;
    }

    public String getResult3() {
        return result3;
    }

    public void setResult3(String result3) {
        this.result3 = result3;
    }
*/
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
