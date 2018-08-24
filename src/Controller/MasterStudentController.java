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
import model.DegreeDetails;
import model.MasterStudent;
import views.SignPage;
import views.SignPageMaster;

/**
 *
 * @author Heshan
 */
public class MasterStudentController {
    public static int addStudent(MasterStudent mStu) throws ClassNotFoundException, SQLException {
        String sql1 = "Insert into master_student values(?,?,?,?,?,?,?,( SELECT course_Id FROM course WHERE course.course_Id = ? ))";
        Connection con1 = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm1 = con1.prepareStatement(sql1);
        SignPageMaster sp = new SignPageMaster();
        stm1.setObject(1,mStu.getStudentId());
        stm1.setObject(2,mStu.getFullName());
        stm1.setObject(3,mStu.getNameWithInitials());
        stm1.setObject(6,mStu.getYear());
        stm1.setObject(4, mStu.getDob());
        stm1.setObject(5, mStu.getEmail());
        stm1.setObject(7, mStu.getPassword());
        stm1.setObject(8, sp.mCourseId);
        
        return stm1.executeUpdate();
    }
    public static int addStudentAddress(MasterStudent mStu) throws ClassNotFoundException, SQLException{
        String sql2 = "Insert into address_table_m values((SELECT Student_Id FROM master_student WHERE master_student.Student_Id = ?),?,?,?)";
        Connection con2 = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm2 = con2.prepareStatement(sql2);
        stm2.setObject(1, mStu.getStudentId());
        stm2.setObject(2, mStu.getAddressNo());
        stm2.setObject(3, mStu.getAddressRd());
        stm2.setObject(4, mStu.getAddressCity());
        
        return stm2.executeUpdate();
    }
    public static int addDgreeDetials(DegreeDetails dD) throws ClassNotFoundException, SQLException{
        String sql3 = "Insert into previous_degree_details values((SELECT Student_Id FROM master_student WHERE master_student.Student_Id = ?),?,?,?,?)";
        Connection con3 = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm3 = con3.prepareStatement(sql3);
        stm3.setObject(1, dD.getmStuId());
        stm3.setObject(2, dD.getDegreeName());
        stm3.setObject(3, dD.getUniversityName());
        stm3.setObject(4, dD.getDegreeClass());
        stm3.setObject(5, dD.getgYear());
        
        return stm3.executeUpdate();
    }
    public static int masterStudentLogin(int username, String password)throws ClassNotFoundException, SQLException{
        String sql4 = "SELECT * FROM master_student";
        Connection con4 = DBConnection.getDBConnection().getConnection();
        Statement st = (Statement)con4.createStatement();
        ResultSet rs = st.executeQuery(sql4);
        int log = 1;
        while(rs.next()){
            if(Integer.parseInt(rs.getString(1)) == username && rs.getString(7).equals(password)){
                log = 0;
                break;
            }
        }
        return log;
    }
    public static MasterStudent searchStudent(int username)throws ClassNotFoundException, SQLException{
        String sql = "Select * From master_student";
        Connection con = DBConnection.getDBConnection().getConnection();
        Statement stm = (Statement)con.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        MasterStudent mStudent = new MasterStudent();
        while(rst.next()){
            if(Integer.parseInt(rst.getString(1))== username){
                mStudent.setFullName(rst.getString(2));
                mStudent.setNameWithInitials(rst.getString(3));
                mStudent.setStudentId(Integer.parseInt(rst.getString(1)));
                mStudent.setEmail(rst.getString(5));
                mStudent.setDob(rst.getString(4));
                mStudent.setYear(Integer.parseInt(rst.getString(6)));
                break;        
            }
        }
        return mStudent;
    }
    public static MasterStudent searchAddress(int username)throws ClassNotFoundException, SQLException{
        String sql = "Select * From address_table_m";
        Connection con  = DBConnection.getDBConnection().getConnection();
        Statement stm = (Statement)con.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        MasterStudent mStudent = new MasterStudent();
        while(rst.next()){
            if(Integer.parseInt(rst.getString(1))== username){
                mStudent.setAddressNo(rst.getString(2));
                mStudent.setAddressRd(rst.getString(3));
                mStudent.setAddressCity(rst.getString(4));
                break;
            }
        }
        return mStudent;
    }
    public static int updateMasterStudent(MasterStudent mStudent) throws ClassNotFoundException, SQLException{
        String sql = "Update master_student set full_name=?, name_with_initials=?, year=?,email=?,password=? where student_Id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        
        stm.setObject(1,mStudent.getFullName());
        stm.setObject(2,mStudent.getNameWithInitials());
        stm.setObject(3,mStudent.getYear());
        stm.setObject(4,mStudent.getEmail());
        stm.setObject(5,mStudent.getPassword());
        stm.setObject(6,mStudent.getStudentId());
        return stm.executeUpdate();
    }
    public static int updateAddress(MasterStudent mStudent) throws ClassNotFoundException, SQLException{
        String sql = "Update address_table_m set no=?, road=?, city=? where master_student_Student_Id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        
        stm.setObject(1, mStudent.getAddressNo());
        stm.setObject(2, mStudent.getAddressRd());
        stm.setObject(3, mStudent.getAddressCity());
        stm.setObject(4, mStudent.getStudentId());
        return stm.executeUpdate();
    }
    public static int deleteMasterStudent(int stuId) throws ClassNotFoundException, SQLException{
        String sql = "Delete From master_student where Student_Id = ?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, stuId);
        return stm.executeUpdate();
    }
    public static ArrayList<MasterStudent> getAllComputingStudent() throws ClassNotFoundException, SQLException{
        String sql = "Select * From master_student where course_course_Id = 4000";
        Connection con = DBConnection.getDBConnection().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<MasterStudent> studentList = new ArrayList<>();
        while(rst.next()){
            MasterStudent mStu = new MasterStudent(rst.getString(2),rst.getString(3),Integer.parseInt(rst.getString(1)), rst.getString(5),Integer.parseInt(rst.getString(6)));
            studentList.add(mStu);   
        }
        return studentList;
    }
    public static ArrayList<MasterStudent> getAllBusinessStudent() throws ClassNotFoundException, SQLException{
        String sql = "Select * From master_student where course_course_Id = 5000";
        Connection con = DBConnection.getDBConnection().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<MasterStudent> studentList = new ArrayList<>();
        while(rst.next()){
            MasterStudent mStu = new MasterStudent(rst.getString(2),rst.getString(3),Integer.parseInt(rst.getString(1)), rst.getString(5),Integer.parseInt(rst.getString(6)));
            studentList.add(mStu);   
        }
        return studentList;
    }
    public static ArrayList<MasterStudent> getAllEngineeringStudent() throws ClassNotFoundException, SQLException{
        String sql = "Select * From master_student where course_course_Id = 6000";
        Connection con = DBConnection.getDBConnection().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<MasterStudent> studentList = new ArrayList<>();
        while(rst.next()){
            MasterStudent mStu = new MasterStudent(rst.getString(2),rst.getString(3),Integer.parseInt(rst.getString(1)), rst.getString(5),Integer.parseInt(rst.getString(6)));
            studentList.add(mStu);   
        }
        return studentList;
    }
    public static int getCourseId(int stuId) throws ClassNotFoundException, SQLException{
        String sql = "SELECT course_course_Id FROM master_student WHERE Student_Id=?";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, stuId);
        ResultSet rst = stm.executeQuery();
        int courseId = 0;
        if(rst.next()){
            courseId = Integer.parseInt(rst.getString(1));
        }
        return courseId;
    }
    public static int getYear(int stuId) throws ClassNotFoundException, SQLException{
        String sql = "SELECT year FROM master_student WHERE Student_Id = ?";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, stuId);
        ResultSet rst = stm.executeQuery();
        int year = 0;
        if(rst.next()){
            year = Integer.parseInt(rst.getString(1));
        }
        return year;
    }
    public static ArrayList<MasterStudent> getAllStudents(int courseId, int year)throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM master_student WHERE course_course_Id =? and year =?";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, courseId);
        stm.setObject(2, year);
        ResultSet rst = stm.executeQuery();
        ArrayList<MasterStudent> studentList = new ArrayList<>();
        while(rst.next()){
            MasterStudent mStu = new MasterStudent();
            mStu.setStudentId(Integer.parseInt(rst.getString(1)));
            studentList.add(mStu);
        }
        return studentList;
    }
}
