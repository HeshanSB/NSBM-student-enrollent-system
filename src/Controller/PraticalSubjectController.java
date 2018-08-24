/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.PracticalSubject;

/**
 *
 * @author Heshan
 */
public class PraticalSubjectController {
    public static ArrayList<PracticalSubject> viewSubjectToLecture(int instId) throws ClassNotFoundException, SQLException{
        String sql = "SELECT practical_subject.subject_Id, practical_subject.subject_name, practical_subject.lab_no, practical_subject.time, practical_subject.day FROM practical_subject, instructor_subject WHERE instructor_instructor_Id=?";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, instId);
        ResultSet rst = stm.executeQuery();
        ArrayList<PracticalSubject> practicalList = new ArrayList();
        while(rst.next()){
            PracticalSubject practical = new PracticalSubject(Integer.parseInt(rst.getString(1)),rst.getString(2),Integer.parseInt(rst.getString(3)),rst.getString(4), rst.getString(5));
            practicalList.add(practical);
        }
        return practicalList;
    }
    public static PracticalSubject searchPracticalSubject(int subId) throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM `practical_subject` WHERE subject_Id =?";
        String sql2 = "SELECT * FROM `instructor_subject` WHERE subject_subject_Id =?";
        Connection con = DBConnection.getDBConnection().getConnection();
        Connection con2 = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm2 = con2.prepareStatement(sql2);
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, subId);
        stm2.setObject(1, subId);
        ResultSet rst = stm.executeQuery();
        ResultSet rst2 = stm2.executeQuery();
        if(rst.next()){
            PracticalSubject pSubject = new PracticalSubject(Integer.parseInt(rst.getString(1)), rst.getString(2), Integer.parseInt(rst.getString(3)), Integer.parseInt(rst.getString(6)), rst.getString(7),Integer.parseInt(rst.getString(9)),Integer.parseInt(rst.getString(5)),rst.getString(8),Integer.parseInt(rst.getString(10)),Integer.parseInt(rst.getString(4)));
            if(rst2.next()){
                pSubject.setInstructorId(Integer.parseInt(rst2.getString(1)));
            }
            return pSubject;
        }
        else{
            return null;
        }
    }
    public static int addPracticalSubject(PracticalSubject practicalSubject)throws ClassNotFoundException, SQLException{
        String sql = "INSERT INTO practical_subject (subject_Id, subject_name, year, semester, no_of_assignments, lab_no, time, day, practical_subject_course_id, gpa) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        String sql2 = "INSERT INTO instructor_subject VALUES(?,?)";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        Connection con2 = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm2 = con2.prepareStatement(sql2);
        stm.setObject(1, practicalSubject.getSubjectId());
        stm.setObject(2, practicalSubject.getSubjectName());
        stm.setObject(3, practicalSubject.getYear());
        stm.setObject(4, practicalSubject.getSemester());
        stm.setObject(5, practicalSubject.getNumberOfAssignment());
        stm.setObject(6, practicalSubject.getLabNo());
        stm.setObject(7, practicalSubject.getTime());
        stm.setObject(8, practicalSubject.getDay());
        stm.setObject(9, practicalSubject.getCourseId());
        stm.setObject(10, practicalSubject.getGpa());
        stm2.setObject(1, practicalSubject.getInstructorId());
        stm2.setObject(2, practicalSubject.getSubjectId());
        stm.executeUpdate();
        return stm2.executeUpdate();
    }
    public static int updatePraticalSubject(PracticalSubject pSubject)throws ClassNotFoundException, SQLException{
        String sql = "UPDATE practical_subject SET subject_Id = ?, subject_name = ?, year = ?, semester = ?, no_of_assignments = ?, lab_no = ?, time = ?, day = ?, practical_subject_course_id = ?, gpa = ? WHERE subject_Id = ?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        
        stm.setObject(1,pSubject.getSubjectId());
        stm.setObject(2,pSubject.getSubjectName());
        stm.setObject(3,pSubject.getYear());
        stm.setObject(4,pSubject.getSemester());
        stm.setObject(5,pSubject.getNumberOfAssignment());
        stm.setObject(6,pSubject.getLabNo());
        stm.setObject(7,pSubject.getTime());
        stm.setObject(8,pSubject.getDay());
        stm.setObject(9,pSubject.getCourseId());
        stm.setObject(10,pSubject.getGpa());
        stm.setObject(11,pSubject.getSubjectId());
        
        return stm.executeUpdate();
    }
    public static int getCourseNumber(int subId) throws ClassNotFoundException, SQLException{
        String sql = "SELECT practical_subject_course_id FROM practical_subject WHERE subject_Id = ?";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, subId);
        ResultSet rst = stm.executeQuery();
        int courseId = 0;
        if(rst.next()){
            courseId = Integer.parseInt(rst.getString(1));
        }
        return courseId;
    }
    public static int addBachelorPracticalResult(int subId, int stuId, String result) throws ClassNotFoundException, SQLException{
        String sql = "INSERT INTO `practical_subject_has_bachelor_student` (`subject_Subject Id`, `bachelor_student_student_Id`, `final_marks`) VALUES (?,?,?);";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, subId);
        stm.setObject(2, stuId);
        stm.setObject(3, result);
        
        return stm.executeUpdate();
    }
    public static int addMasterPracticalResult(int subId, int stuId, String result) throws ClassNotFoundException, SQLException{
        String sql = "INSERT INTO master_student_has_pratical_subject (master_student_Student_Id, pratical_subject_Subject_Id, final_marks) VALUES (?,?,?)";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, stuId);
        stm.setObject(2, subId);
        stm.setObject(3, result);
        
        return stm.executeUpdate();
    }
    public static int getSubjectYear(int subId) throws ClassNotFoundException, SQLException{
        String sql = "SELECT year FROM practical_subject WHERE subject_Id = ? ";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, subId);
        ResultSet rst = stm.executeQuery();
        int year = 0;
        if(rst.next()){
            year = Integer.parseInt(rst.getString(1));
        }
        return year;
    }
}
