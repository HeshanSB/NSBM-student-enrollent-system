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
import java.sql.Statement;
import java.util.ArrayList;
import model.BachelorStudent;
import model.NormalSubject;

/**
 *
 * @author Heshan
 */
public class NormalSubjectController {
    public static ArrayList<NormalSubject> viewSubjectToLecture(int lectureId) throws ClassNotFoundException, SQLException{
        String sql = "SELECT normal_subject.subject_Id, normal_subject.subject_name, normal_subject.hall_no, normal_subject.time, normal_subject.day "
                + "FROM normal_subject, lecture_subject WHERE normal_subject.subject_Id IN(SELECT lecture_subject.subject_subject_Id FROM lecture_subject WHERE lecture_subject.lecture_lecture_Id = ?)";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, lectureId);
        ResultSet rst = stm.executeQuery();
        ArrayList<NormalSubject> normalList = new ArrayList();
        while(rst.next()){
            NormalSubject normal = new NormalSubject(Integer.parseInt(rst.getString(1)),rst.getString(2),Integer.parseInt(rst.getString(3)), rst.getString(4), rst.getString(5));
            normalList.add(normal);
        }
        return normalList;
    }
    public static ArrayList<NormalSubject> optionalSubjectView(int semester, int year, int course) throws ClassNotFoundException, SQLException{
        String sql = "SELECT subject_Id, subject_name FROM normal_subject WHERE normal_subject_course_id = ? AND semester = ? AND year = ? AND compulsory = 0 ";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, course);
        stm.setObject(2, semester);
        stm.setObject(3, year);
        ResultSet rst = stm.executeQuery();
        ArrayList<NormalSubject> normalList = new ArrayList();
        while(rst.next()){
            NormalSubject normal = new NormalSubject(Integer.parseInt(rst.getString(1)),rst.getString(2));
            normalList.add(normal);
        }
        return normalList;
    }
    public static int addOptionalBachelorSubject(int semester,int studentId, int subject1, int subject2, int subject3, int subject4)throws ClassNotFoundException, SQLException{
        String sql1 = "INSERT INTO bachelor_student_choose VALUES (?,?,?)";
        String sql2 = "INSERT INTO bachelor_student_choose VALUES (?,?,?)";
        String sql3 = "INSERT INTO bachelor_student_choose VALUES (?,?,?)";
        String sql4 = "INSERT INTO bachelor_student_choose VALUES (?,?,?)";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm1 = con.prepareStatement(sql1);
        PreparedStatement stm2 = con.prepareStatement(sql2);
        PreparedStatement stm3 = con.prepareStatement(sql3);
        PreparedStatement stm4 = con.prepareStatement(sql4);
        stm1.setObject(1,studentId);
        stm1.setObject(2,subject1);
        stm1.setObject(3,semester);
        stm2.setObject(1,studentId);
        stm2.setObject(2,subject2);
        stm2.setObject(3,semester);
        stm3.setObject(1,studentId);
        stm3.setObject(2,subject3);
        stm3.setObject(3,semester);
        stm4.setObject(1,studentId);
        stm4.setObject(2,subject4);
        stm4.setObject(3,semester);
        stm1.executeUpdate();
        stm2.executeUpdate();
        stm3.executeUpdate();
        return stm4.executeUpdate();
    }
    public static int addOptionalMasterSubject(int semester,int studentId, int subject1, int subject2, int subject3, int subject4)throws ClassNotFoundException, SQLException{
        String sql1 = "INSERT INTO master_student_choose VALUES (?,?,?)";
        String sql2 = "INSERT INTO master_student_choose VALUES (?,?,?)";
        String sql3 = "INSERT INTO master_student_choose VALUES (?,?,?)";
        String sql4 = "INSERT INTO master_student_choose VALUES (?,?,?)";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm1 = con.prepareStatement(sql1);
        PreparedStatement stm2 = con.prepareStatement(sql2);
        PreparedStatement stm3 = con.prepareStatement(sql3);
        PreparedStatement stm4 = con.prepareStatement(sql4);
        stm1.setObject(1,studentId);
        stm1.setObject(2,subject1);
        stm1.setObject(3,semester);
        stm2.setObject(1,studentId);
        stm2.setObject(2,subject2);
        stm2.setObject(3,semester);
        stm3.setObject(1,studentId);
        stm3.setObject(2,subject3);
        stm3.setObject(3,semester);
        stm4.setObject(1,studentId);
        stm4.setObject(2,subject4);
        stm4.setObject(3,semester);
        stm1.executeUpdate();
        stm2.executeUpdate();
        stm3.executeUpdate();
        return stm4.executeUpdate();
    }
    public static int adminChooseSubject(int semester, int state)throws ClassNotFoundException, SQLException{
        String sql = "Update admin_optional set choose=? where semester=?";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, state);
        stm.setObject(2, semester);
        return stm.executeUpdate();
    }
    public static int canOrCantChooseSubject(int sem) throws ClassNotFoundException, SQLException{
        String sql = "SELECT choose FROM admin_optional WHERE semester = ?";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, sem);
        ResultSet rst = stm.executeQuery();
        int can = 0;
        if(rst.next()){
            can = Integer.parseInt(rst.getString(1));
        }
        return can;
    }
    public static void deleteOptionalSubject(int studentId, int semester)throws ClassNotFoundException, SQLException{
        String sql = "DELETE FROM bachelor_student_choose WHERE student_Id=? and semester=?";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, studentId);
        stm.setObject(2, semester);
        stm.executeUpdate();  
    }
    public static void deleteOptionalSubjectMaster(int studentId, int semester) throws ClassNotFoundException, SQLException{
        String sql = "DELETE FROM master_student_choose WHERE student_Id=? and semester=?";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, studentId);
        stm.setObject(2, semester);
        stm.executeUpdate();  
    }
    public static int addNormalSubject(NormalSubject normalSubject) throws ClassNotFoundException, SQLException{
        String sql = "Insert into normal_subject values(?,?,?,?,?,?,?,?,?,?,?)";
        String sql2 = "Insert into lecture_subject values(?,?)";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        Connection con2 = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm2 = con2.prepareStatement(sql2);
        stm.setObject(1, normalSubject.getSubjectId());
        stm.setObject(2, normalSubject.getSubjectName());
        stm.setObject(3, normalSubject.getYear());
        stm.setObject(4, normalSubject.getSemester());
        stm.setObject(5, normalSubject.getHallNo());
        stm.setObject(6, normalSubject.getTime());
        stm.setObject(7, normalSubject.getDay());
        stm.setObject(8, normalSubject.getCompalsory());
        stm.setObject(9, normalSubject.getNumberOfAssignment());
        stm.setObject(10, normalSubject.getCourseId());
        stm.setObject(11, normalSubject.getGpa());
        stm2.setObject(1, normalSubject.getLectureId());
        stm2.setObject(2, normalSubject.getSubjectId());
        stm.executeUpdate();
        return stm2.executeUpdate();
    }
    public static NormalSubject searchNormalSubject(int subId) throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM normal_subject WHERE subject_Id =?";
        String sql2 = "SELECT * FROM lecture_subject WHERE subject_subject_Id =?";
        Connection con = DBConnection.getDBConnection().getConnection();
        Connection con2 = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm2 = con2.prepareStatement(sql2);
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, subId);
        stm2.setObject(1, subId);
        ResultSet rst = stm.executeQuery();
        ResultSet rst2 = stm2.executeQuery();
        if(rst.next()){
            NormalSubject normalSubject = new NormalSubject(Integer.parseInt(rst.getString(1)),rst.getString(2), Integer.parseInt(rst.getString(3)),Integer.parseInt(rst.getString(5)),rst.getString(6),Integer.parseInt(rst.getString(10)),Integer.parseInt(rst.getString(9)),rst.getString(7),Integer.parseInt(rst.getString(4)),Integer.parseInt(rst.getString(8)),Integer.parseInt(rst.getString(11)));
            if(rst2.next()){
                normalSubject.setLectureId(Integer.parseInt(rst2.getString(1)));
            }
            return normalSubject;
        }
        else{
            return null;
        }
    }
    public static int updateNormalSubject(NormalSubject nSubject)throws ClassNotFoundException, SQLException{
       String sql = "UPDATE normal_subject SET subject_Id =?, subject_name =?, year = ?, semester = ?, hall_no = ?, time = ?, day = ?, compulsory = ?, numberOfAssignment = ?, normal_subject_course_id = ?, gpa = ? WHERE subject_Id = ?";
       Connection conn = DBConnection.getDBConnection().getConnection();
       PreparedStatement stm = conn.prepareStatement(sql);
      
       stm.setObject(1, nSubject.getSubjectId());
       stm.setObject(2, nSubject.getSubjectName());
       stm.setObject(3, nSubject.getYear());
       stm.setObject(4, nSubject.getSemester());
       stm.setObject(5, nSubject.getHallNo());
       stm.setObject(6, nSubject.getTime());
       stm.setObject(7, nSubject.getDay());
       stm.setObject(8, nSubject.getCompalsory());
       stm.setObject(9, nSubject.getNumberOfAssignment());
       stm.setObject(10, nSubject.getCourseId());
       stm.setObject(11, nSubject.getGpa());
       stm.setObject(12, nSubject.getSubjectId());
       return stm.executeUpdate();
    }
    public static int getCourseNumber(int subId) throws ClassNotFoundException, SQLException{
        String sql = "Select normal_subject_course_id FROM normal_subject WHERE subject_Id =?";
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
    public static int checkOptionalOrNot(int subId) throws ClassNotFoundException, SQLException{
         String sql = "Select compulsory FROM normal_subject WHERE subject_Id =?";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, subId);
        ResultSet rst = stm.executeQuery();
        int check = 0;
        if(rst.next()){
            check = Integer.parseInt(rst.getString(1));
        }
        return check;
    }
    public static ArrayList getAllBachelorOptionalSubjectChooseStuId(int subId) throws ClassNotFoundException, SQLException{
        String sql = "SELECT student_Id FROM bachelor_student_choose WHERE subject_Id = ?";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, subId);
        ResultSet rst = stm.executeQuery();
        ArrayList studentList = new ArrayList();
        while(rst.next()){
            studentList.add(Integer.parseInt(rst.getString(1)));
        }
        return studentList;
    }
    public static ArrayList getAllMasterOptionalSubjectChooseStuId(int subId) throws ClassNotFoundException, SQLException{
        String sql = "SELECT student_Id FROM master_student_choose WHERE subject_Id = ?";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, subId);
        ResultSet rst = stm.executeQuery();
        ArrayList studentList = new ArrayList();
        while(rst.next()){
            studentList.add(Integer.parseInt(rst.getString(1)));
        }
        return studentList;
    }
    public static int addBachelorNormalResult(int subId, int stuId, String result) throws ClassNotFoundException, SQLException{
        String sql = "INSERT INTO normal_subject_has_bachelor_student(normal_subject_subject_Id, bachelor_student_student_Id, final_marks) VALUES (?,?,?)";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, subId);
        stm.setObject(2, stuId);
        stm.setObject(3, result);
        
        return stm.executeUpdate();
    }
    public static int addMasterNormalResult(int subId, int stuId, String result) throws ClassNotFoundException, SQLException{
        String sql = "INSERT INTO master_student_has_normal_subject (master_student_Student_Id, normal_subject_subject_Id, final_marks) VALUES (?,?,?)";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, stuId);
        stm.setObject(2, subId);
        stm.setObject(3, result);
        
        return stm.executeUpdate();
    }
    public static int getSubjectYear(int subId) throws ClassNotFoundException, SQLException{
        String sql = "SELECT year FROM normal_subject WHERE subject_Id = ?";
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
