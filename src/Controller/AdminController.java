/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import database.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Heshan
 */
public class AdminController {
    public static int adminLogin(int username, String password)throws ClassNotFoundException, SQLException {
        String sql1 = "SELECT * FROM admin";
        Connection con1 = DBConnection.getDBConnection().getConnection();
        Statement st = (Statement)con1.createStatement();
        ResultSet rs = st.executeQuery(sql1);
        int log = 1;
        while(rs.next()){
            if(Integer.parseInt(rs.getString(1)) == username && rs.getString(2).equals(password)){
                log = 0;
                break;
            }
        }
        return log; 
    }
            
}
