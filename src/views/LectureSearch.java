/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Controller.LectureController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Lecture;

/**
 *
 * @author Heshan
 */
public class LectureSearch extends javax.swing.JFrame {

    /**
     * Creates new form LectureSearch
     */
    public LectureSearch() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lectureId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        lectureLevel = new javax.swing.JTextField();
        userNameTxt = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Lecture Id          :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 20, 210, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Name                   :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 70, 120, 20);

        nameTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(nameTxt);
        nameTxt.setBounds(180, 70, 490, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Lecture Id            :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 110, 120, 20);

        lectureId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lectureId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lectureIdActionPerformed(evt);
            }
        });
        jPanel1.add(lectureId);
        lectureId.setBounds(180, 110, 490, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Password             :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 150, 120, 20);

        passwordTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(passwordTxt);
        passwordTxt.setBounds(180, 150, 490, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Lecture Level       :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 190, 120, 20);

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitBtn);
        exitBtn.setBounds(590, 460, 51, 23);

        lectureLevel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(lectureLevel);
        lectureLevel.setBounds(180, 190, 490, 30);

        userNameTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(userNameTxt);
        userNameTxt.setBounds(240, 25, 180, 30);

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn);
        updateBtn.setBounds(350, 460, 73, 23);

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchBtn);
        searchBtn.setBounds(450, 30, 70, 23);

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn);
        deleteBtn.setBounds(470, 460, 73, 23);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/if_system-search_118797.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(620, 10, 48, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lectureIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lectureIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lectureIdActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        int lectureId = Integer.parseInt(userNameTxt.getText());
        String name = nameTxt.getText();
        String password = passwordTxt.getText();
        String lectureL = lectureLevel.getText();
        Lecture lecture = new Lecture(lectureId, name, password, lectureL);
        try{
            int res = LectureController.updateLecture(lecture);
            if(res>0){
                JOptionPane.showMessageDialog(this, "Update Success");
            }
            else{
                JOptionPane.showMessageDialog(this, "Update Fail");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LectureSearch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LectureSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int lecId = Integer.parseInt(userNameTxt.getText());
        try{
            int res = LectureController.deleteLecture(lecId);
            if(res>0){
                JOptionPane.showMessageDialog(this, "Delete Success");
                nameTxt.setText("");
                lectureId.setText("");
                lectureLevel.setText("");
                passwordTxt.setText("");
            }else{
                JOptionPane.showMessageDialog(this, "Delete fail");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LectureSearch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LectureSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
         int userName = 0;
        
        try{
            userName =  Integer.parseInt(userNameTxt.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invaild value","error",JOptionPane.ERROR_MESSAGE);
        }
        if(userName != 0){
            try{
                Lecture lecture = LectureController.searchLecture(userName);
                if(lecture != null){
                    nameTxt.setText(lecture.getName());
                    lectureId.setText(Integer.toString(lecture.getLectureeId()));
                    lectureLevel.setText(lecture.getLectureLevel());
                    passwordTxt.setText(lecture.getPassword());
                }else{
                    JOptionPane.showMessageDialog(this, "No such lecture ");
                    nameTxt.setText("");
                    lectureId.setText("");
                    lectureLevel.setText("");
                    passwordTxt.setText("");
                }
                
            } catch (ClassNotFoundException ex) {
                 Logger.getLogger(LectureSearch.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(LectureSearch.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        
    }//GEN-LAST:event_searchBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LectureSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LectureSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LectureSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LectureSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LectureSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lectureId;
    private javax.swing.JTextField lectureLevel;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
