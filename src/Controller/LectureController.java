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
import model.Lecture;
import views.LectureSignUp;

/**
 *
 * @author Heshan
 */
public class LectureController {
    public static int addLecture(Lecture lecture) throws ClassNotFoundException, SQLException{
        String sql = "Insert into lecture values(?,?,?,?)";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, lecture.getLectureeId());
        stm.setObject(2, lecture.getName());
        stm.setObject(3, lecture.getPassword());
        stm.setObject(4, lecture.getLectureLevel());
        
        return stm.executeUpdate();
    }
     public static int lectureLogin(int username, String password)throws ClassNotFoundException, SQLException{
        String sql4 = "SELECT * FROM lecture";
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
    public static Lecture searchLecture(int username)throws ClassNotFoundException, SQLException{
        String sql = "Select * From lecture where lecture_Id = ?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, username);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Lecture lecture = new Lecture(Integer.parseInt(rst.getString(1)), rst.getString(2),rst.getString(3),rst.getString(4));
            return lecture;
        }
        else{
            return null;
        }
    }
    public static int updateLecture(Lecture lecture) throws ClassNotFoundException, SQLException{
        String sql = "Update lecture set name=?, password=?, lecture_level=? where lecture_Id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        
        stm.setObject(1, lecture.getName());
        stm.setObject(2, lecture.getPassword());
        stm.setObject(3, lecture.getLectureLevel());
        stm.setObject(4, lecture.getLectureeId());
        return stm.executeUpdate();
    }
    public static int deleteLecture(int lecId) throws ClassNotFoundException, SQLException{
        String sql = "Delete from lecture where lecture_Id = ?";
        Connection conn  = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, lecId);
        return stm.executeUpdate();
    }
    public static ArrayList<Lecture> getAllLecture() throws ClassNotFoundException, SQLException{
        String sql = "Select * From lecture";
        Connection con  = DBConnection.getDBConnection().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Lecture> lectureList = new ArrayList();
        while(rst.next()){
            Lecture lecture = new Lecture(Integer.parseInt(rst.getString(1)), rst.getString(2), rst.getString(4));
            lectureList.add(lecture);
        }
        return lectureList;
    }
    
}
