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
import model.BachelorStudent;
import model.Result;


public class ResultController {
    public static ArrayList<Result> getExamResultsBacholerNormal(int stuId)throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM normal_subject_has_bachelor_student WHERE bachelor_student_student_Id = ?";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, stuId);
        ResultSet rst = stm.executeQuery();
        ArrayList<Result> resultList = new ArrayList<>();
        while(rst.next()){
            Result result = new Result(Integer.parseInt(rst.getString(1)), rst.getString(3),Integer.parseInt(rst.getString(2)));
            resultList.add(result);
        }
        return resultList;
    }
    public static ArrayList<Result> getExamResultBacholerPractical(int stuId)throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM `practical_subject_has_bachelor_student` WHERE bachelor_student_student_Id = ?";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, stuId);
        ResultSet rst = stm.executeQuery();
        ArrayList<Result> resultList = new ArrayList<>();
        while(rst.next()){
            Result result = new Result(Integer.parseInt(rst.getString(1)), rst.getString(3),Integer.parseInt(rst.getString(2)));
            resultList.add(result);
        }
        return resultList;
    }
    public static ArrayList<Result> getExamResultMasterNormal(int stuId) throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM `master_student_has_normal_subject` WHERE master_student_Student_Id = ?";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, stuId);
        ResultSet rst = stm.executeQuery();
        ArrayList<Result> resultList = new ArrayList<>();
        while(rst.next()){
            Result result = new Result(Integer.parseInt(rst.getString(2)), rst.getString(3),Integer.parseInt(rst.getString(1)));
            resultList.add(result);
        }
        return resultList;
    }
    public static ArrayList<Result> getExamResultMasterPractical(int stuId) throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM `master_student_has_pratical_subject` WHERE master_student_Student_Id = ?";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, stuId);
        ResultSet rst = stm.executeQuery();
        ArrayList<Result> resultList = new ArrayList<>();
        while(rst.next()){
            Result result = new Result(Integer.parseInt(rst.getString(2)), rst.getString(3),Integer.parseInt(rst.getString(1)));
            resultList.add(result);
        }
        return resultList;
    }
    public static double gpaCalculate(String result){
        double credit = 0; 
        switch(result){
            case("A+"):
                credit = 4.25;
                break;
            case("A"):
                credit = 4.0;
                break;
            case("A-"):
                credit = 3.75;
                break;
            case("B+"):
                credit = 3.50;
                break;
            case("B"):
                credit = 3.0;
                break;
            case("B-"):
                credit = 2.75;
                break;
            case("C+"):
                credit = 2.50;
                break;
            case("C"):
                credit = 2.0;
                break;
            case("C-"):
                credit = 1.75;
                break;
            case("D+"):
                credit = 1.50;
                break;
            case("D"):
                credit = 1.0;
                break;
            case("D-"):
                credit = 0.75;
                break;
            case("E"):
                credit = 0;
                break;
        }
        return credit;
    }
    public static ArrayList<Result> getExamResultsBacholerNormalSub(int subId)throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM normal_subject_has_bachelor_student WHERE normal_subject_subject_Id = ?";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, subId);
        ResultSet rst = stm.executeQuery();
        ArrayList<Result> resultList = new ArrayList<>();
        while(rst.next()){
            Result result = new Result(Integer.parseInt(rst.getString(1)), rst.getString(3),Integer.parseInt(rst.getString(2)));
            resultList.add(result);
        }
        return resultList;
    }
     public static ArrayList<Result> getExamResultBacholerPracticalSub(int subId)throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM practical_subject_has_bachelor_student WHERE subject_Subject_Id = ? ";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, subId);
        ResultSet rst = stm.executeQuery();
        ArrayList<Result> resultList = new ArrayList<>();
        while(rst.next()){
            Result result = new Result(Integer.parseInt(rst.getString(1)), rst.getString(3),Integer.parseInt(rst.getString(2)));
            resultList.add(result);
        }
        return resultList;
    }
    public static ArrayList<Result> getExamResultMasterNormalSub(int subId) throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM master_student_has_normal_subject WHERE normal_subject_subject_Id = ?";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, subId);
        ResultSet rst = stm.executeQuery();
        ArrayList<Result> resultList = new ArrayList<>();
        while(rst.next()){
            Result result = new Result(Integer.parseInt(rst.getString(2)), rst.getString(3),Integer.parseInt(rst.getString(1)));
            resultList.add(result);
        }
        return resultList;
    }
     public static ArrayList<Result> getExamResultMasterPracticalSub(int subId) throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM master_student_has_pratical_subject WHERE pratical_subject_Subject_Id = ? ";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, subId);
        ResultSet rst = stm.executeQuery();
        ArrayList<Result> resultList = new ArrayList<>();
        while(rst.next()){
            Result result = new Result(Integer.parseInt(rst.getString(2)), rst.getString(3),Integer.parseInt(rst.getString(1)));
            resultList.add(result);
        }
        return resultList;
    }
    public static int deleteBachelorNormal(int subId) throws ClassNotFoundException, SQLException{
        String sql = "DELETE FROM `normal_subject_has_bachelor_student` WHERE normal_subject_subject_Id = ?";
         Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, subId);
        
        return stm.executeUpdate();        
    }
    public static int deleteBachelorPractical(int subId) throws ClassNotFoundException, SQLException{
        String sql = "DELETE FROM `practical_subject_has_bachelor_student` WHERE subject_Subject_Id = ?";
         Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, subId);
        
        return stm.executeUpdate();        
    }
    public static int deleteMasterNormal(int subId) throws ClassNotFoundException, SQLException{
        String sql = "DELETE FROM `master_student_has_normal_subject` WHERE normal_subject_subject_Id = ?";
         Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, subId);
        
        return stm.executeUpdate();        
    }
    public static int deleteMasterPractical(int subId) throws ClassNotFoundException, SQLException{
        String sql = "DELETE FROM `master_student_has_pratical_subject` WHERE pratical_subject_Subject_Id = ?";
         Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, subId);
        
        return stm.executeUpdate();        
    }
}
