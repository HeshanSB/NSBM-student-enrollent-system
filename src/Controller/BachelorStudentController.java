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
import model.AlResult;
import model.BachelorStudent;
import views.SignPage;

/**
 *
 * @author Heshan
 */
public class BachelorStudentController {
    public static int addStudent(BachelorStudent bStu) throws ClassNotFoundException, SQLException {
        String sql1 = "Insert into bachelor_student values(?,?,?,?,?,?,?,( SELECT course_Id FROM course WHERE course.course_Id = ? ))";
        Connection con1 = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm1 = con1.prepareStatement(sql1);
        SignPage sp = new SignPage();
        stm1.setObject(1,bStu.getStudentId());
        stm1.setObject(2,bStu.getFullName());
        stm1.setObject(3,bStu.getNameWithInitials());
        stm1.setObject(4,bStu.getYear());
        stm1.setObject(5, bStu.getDob());
        stm1.setObject(6, bStu.getEmail());
        stm1.setObject(7, bStu.getPassword());
        stm1.setObject(8, sp.courseId);
        
        return stm1.executeUpdate();
    }
    public static int addStudentAddress(BachelorStudent aStu) throws ClassNotFoundException, SQLException{
        String sql2 = "Insert into address_table_b values(?,?,?,?)";
        Connection con2 = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm2 = con2.prepareStatement(sql2);
        stm2.setObject(1,aStu.getStudentId());
        stm2.setObject(2,aStu.getAddressNo());
        stm2.setObject(3,aStu.getAddressRd());
        stm2.setObject(4,aStu.getAddressCity()); 
        
        return stm2.executeUpdate();
    }
    public static int addStudentAlResult(AlResult aR) throws ClassNotFoundException, SQLException{
        String sql3 = "Insert into al_result values(( SELECT student_Id FROM bachelor_student WHERE bachelor_student.student_Id = ? ),?,?,?,?,?)";
        Connection con3 = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm3 = con3.prepareStatement(sql3);
        stm3.setObject(1,aR.getStuId());
        stm3.setObject(2,aR.getYear());
        stm3.setObject(3,aR.getIndexNo());
        stm3.setObject(4,aR.getRank());
        stm3.setObject(5,aR.getSubjects());
        stm3.setObject(6,aR.getResults());
        return stm3.executeUpdate();
    }
    public static int bachelorStudentLogin(int username, String password)throws ClassNotFoundException, SQLException{
        String sql4 = "SELECT * FROM bachelor_student";
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
    public static BachelorStudent searchStudent(int username)throws ClassNotFoundException, SQLException{
        String sql = "Select * From bachelor_student";
        Connection con = DBConnection.getDBConnection().getConnection();
        Statement stm = (Statement)con.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        BachelorStudent bStudent = new BachelorStudent();
        while(rst.next()){
            if(Integer.parseInt(rst.getString(1))== username){
                bStudent.setFullName(rst.getString(2));
                bStudent.setNameWithInitials(rst.getString(3));
                bStudent.setStudentId( Integer.parseInt(rst.getString(1)));
                bStudent.setEmail(rst.getString(6));
                bStudent.setDob(rst.getString(5));
                bStudent.setYear(Integer.parseInt(rst.getString(4)));
                break;
            }
        }
        return bStudent;   
    }
    public static BachelorStudent searchAddress(int username)throws ClassNotFoundException, SQLException{
        String sql = "Select * From address_table_b";
        Connection con = DBConnection.getDBConnection().getConnection();
        Statement stm = (Statement)con.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        BachelorStudent bStudent = new BachelorStudent();
        while(rst.next()){
            if(Integer.parseInt(rst.getString(1))== username){
                bStudent.setAddressNo(rst.getString(2));
                bStudent.setAddressRd(rst.getString(3));
                bStudent.setAddressCity(rst.getString(4));
                break;
            }
        }
        return bStudent;
    }
    public static int updateBachelorStudent(BachelorStudent bStudent) throws ClassNotFoundException, SQLException{
        String sql = "Update bachelor_student set full_name=?, name_with_intials=?, year=?,email=?,password=? where student_Id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        
        stm.setObject(1,bStudent.getFullName());
        stm.setObject(2,bStudent.getNameWithInitials());
        stm.setObject(3,bStudent.getYear());
        stm.setObject(4,bStudent.getEmail());
        stm.setObject(5,bStudent.getPassword());
        stm.setObject(6,bStudent.getStudentId());
        return stm.executeUpdate();
    }
    public static int updateAddress(BachelorStudent bStudent) throws ClassNotFoundException, SQLException{
        String sql = "Update address_table_b set no=?, road=?, city=? where bachelor_student_student_Id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        
        stm.setObject(1, bStudent.getAddressNo());
        stm.setObject(2, bStudent.getAddressRd());
        stm.setObject(3, bStudent.getAddressCity());
        stm.setObject(4, bStudent.getStudentId());
        return stm.executeUpdate();
    }
    public static int deleteBachelorStudent(int stuId) throws ClassNotFoundException, SQLException{
        String sql = "Delete From bachelor_student where student_Id = ?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, stuId);
        return stm.executeUpdate();
    }
    public static ArrayList<BachelorStudent> getAllComputingStudent() throws ClassNotFoundException, SQLException{
        String sql = "Select * From bachelor_student where course_course_Id = 1000";
        Connection con = DBConnection.getDBConnection().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<BachelorStudent> studentList = new ArrayList<>();
        while(rst.next()){
            BachelorStudent bStu = new BachelorStudent(rst.getString(2),rst.getString(3),Integer.parseInt(rst.getString(1)), rst.getString(6),Integer.parseInt(rst.getString(4)));
            studentList.add(bStu);   
        }
        return studentList;
    }
    public static ArrayList<BachelorStudent> getAllBusinessStudent() throws ClassNotFoundException, SQLException{
        String sql = "Select * From bachelor_student where course_course_Id = 2000";
        Connection con = DBConnection.getDBConnection().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<BachelorStudent> studentList = new ArrayList<>();
        while(rst.next()){
            BachelorStudent bStu = new BachelorStudent(rst.getString(2),rst.getString(3),Integer.parseInt(rst.getString(1)), rst.getString(6),Integer.parseInt(rst.getString(4)));
            studentList.add(bStu);   
        }
        return studentList;
    }
    public static ArrayList<BachelorStudent> getAllEngineeringStudent() throws ClassNotFoundException, SQLException{
        String sql = "Select * From bachelor_student where course_course_Id = 3000";
        Connection con = DBConnection.getDBConnection().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<BachelorStudent> studentList = new ArrayList<>();
        while(rst.next()){
            BachelorStudent bStu = new BachelorStudent(rst.getString(2),rst.getString(3),Integer.parseInt(rst.getString(1)), rst.getString(6),Integer.parseInt(rst.getString(4)));
            studentList.add(bStu);   
        }
        return studentList;
    }
    public static int getCourseId(int stuId) throws ClassNotFoundException, SQLException{
        String sql = "SELECT course_course_Id FROM bachelor_student WHERE student_Id =?";
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
        String sql = "SELECT year FROM bachelor_student WHERE student_Id =?";
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
    public static ArrayList<BachelorStudent> getAllStudents(int courseId, int year)throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM bachelor_student WHERE course_course_Id = ? and year = ?";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, courseId);
        stm.setObject(2, year);
        ResultSet rst = stm.executeQuery();
        ArrayList<BachelorStudent> studentList = new ArrayList<>();
        while(rst.next()){
            BachelorStudent bStu = new BachelorStudent();
            bStu.setStudentId(Integer.parseInt(rst.getString(1)));
            studentList.add(bStu);
        }
        return studentList;
    }
    
}
