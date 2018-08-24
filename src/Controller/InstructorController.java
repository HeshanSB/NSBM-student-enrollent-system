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
import model.Instructor;
import model.Lecture;

/**
 *
 * @author Heshan
 */
public class InstructorController {
    public static int addInstructor(Instructor inst)throws ClassNotFoundException, SQLException{
        String sql = "Insert into instructor values(?,?,?)";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1,inst.getLecturId() );
        stm.setObject(2,inst.getName());
        stm.setObject(3, inst.getPassword());
        
        return stm.executeUpdate();
    }
    public static int instructorLogin(int username, String password)throws ClassNotFoundException, SQLException{
        String sql4 = "SELECT * FROM instructor";
        Connection con4 = DBConnection.getDBConnection().getConnection();
        Statement st = (Statement)con4.createStatement();
        ResultSet rs = st.executeQuery(sql4);
        int log = 1;
        while(rs.next()){
            if(Integer.parseInt(rs.getString(1)) == username && rs.getString(3).equals(password)){
                log = 0;
                break;
            }
        }
        return log;
     }
    public static Instructor searchInstructor(int username)throws ClassNotFoundException, SQLException{
        String sql = "Select * From instructor where lecture_Id = ?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, username);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Instructor inst = new Instructor(Integer.parseInt(rst.getString(1)), rst.getString(2), rst.getString(3));
            return inst;
        }
        else{
            return null;
        }
    }
    public static int updateInstructor(Instructor inst)throws ClassNotFoundException, SQLException{
        String sql = "Update instructor set name=?, password=? where lecture_Id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        
        stm.setObject(1, inst.getName());
        stm.setObject(2, inst.getPassword());
        stm.setObject(3, inst.getLecturId());
        
        return stm.executeUpdate();
    }
   public static int deleteInstructor(int InstId)throws ClassNotFoundException, SQLException{
       String sql = "Delete From instructor where lecture_Id=?";
       Connection conn = DBConnection.getDBConnection().getConnection();
       PreparedStatement stm = conn.prepareStatement(sql);
       stm.setObject(1, InstId);
       return stm.executeUpdate();
   }
   public static ArrayList<Instructor> getAllLecture() throws ClassNotFoundException, SQLException{
        String sql = "Select * From instructor";
        Connection con  = DBConnection.getDBConnection().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Instructor> instructorList = new ArrayList();
        while(rst.next()){
            Instructor lecture = new Instructor(Integer.parseInt(rst.getString(1)), rst.getString(2));
            instructorList.add(lecture);
        }
        return instructorList;
    }
}
