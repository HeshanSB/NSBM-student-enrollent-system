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
public class DegreeDetails {
    private int mStuId;
    private String degreeName;
    private String universityName;
    private String degreeClass;
    private int gYear;

    public DegreeDetails(int mStuId, String degreeName, String universityName, String degreeClass, int gYear) {

        this.mStuId = mStuId;
        this.degreeName = degreeName;
        this.universityName = universityName;
        this.degreeClass = degreeClass;
        this.gYear = gYear;
    }

    public int getmStuId() {
        return mStuId;
    }

    public void setmStuId(int mStuId) {
        this.mStuId = mStuId;
    }
    

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getDegreeClass() {
        return degreeClass;
    }

    public void setDegreeClass(String degreeClass) {
        this.degreeClass = degreeClass;
    }

    public int getgYear() {
        return gYear;
    }

    public void setgYear(int gYear) {
        this.gYear = gYear;
    }
    
}
