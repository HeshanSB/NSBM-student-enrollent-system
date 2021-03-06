/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Controller.MasterStudentController;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.MasterStudent;

/**
 *
 * @author Heshan
 */
public class SignPageMaster extends javax.swing.JFrame {

    public static int mStuId;
    public static int mCourseId;
    public static int year;
    public SignPageMaster() {
        initComponents();
        setSize(700,550);
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
        fullNameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nameWithIntialsText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        studentId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addressNoTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addressRdTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        addressTownTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dobTxt = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        courses = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        nextBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        yearTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Add Student Details");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(235, 0, 230, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Full Name              :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 70, 120, 20);

        fullNameTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fullNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(fullNameTxt);
        fullNameTxt.setBounds(180, 70, 490, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Name With Initials :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 110, 120, 20);

        nameWithIntialsText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nameWithIntialsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameWithIntialsTextActionPerformed(evt);
            }
        });
        jPanel1.add(nameWithIntialsText);
        nameWithIntialsText.setBounds(180, 110, 490, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Student ID           :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 150, 120, 20);

        studentId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(studentId);
        studentId.setBounds(180, 150, 490, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Address               :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 190, 120, 20);

        addressNoTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(addressNoTxt);
        addressNoTxt.setBounds(180, 190, 180, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText(",");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(360, 210, 10, 15);

        addressRdTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(addressRdTxt);
        addressRdTxt.setBounds(180, 230, 180, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText(",");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(360, 250, 4, 15);

        addressTownTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addressTownTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTownTxtActionPerformed(evt);
            }
        });
        jPanel1.add(addressTownTxt);
        addressTownTxt.setBounds(180, 270, 180, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText(".");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(360, 290, 4, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Date Of Birth      :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 310, 120, 20);
        jPanel1.add(dobTxt);
        dobTxt.setBounds(180, 310, 180, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Email                  :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 350, 120, 20);

        courses.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        courses.setMaximumRowCount(2);
        courses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computing", "Business", "Engineering" }));
        courses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesActionPerformed(evt);
            }
        });
        jPanel1.add(courses);
        courses.setBounds(180, 430, 90, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Year      :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(350, 395, 80, 20);

        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        jPanel1.add(nextBtn);
        nextBtn.setBounds(490, 460, 55, 23);

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitBtn);
        exitBtn.setBounds(590, 460, 51, 23);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Choose Degree  :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 430, 120, 20);

        emailTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(emailTxt);
        emailTxt.setBounds(180, 350, 490, 30);

        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });
        jPanel1.add(passwordTxt);
        passwordTxt.setBounds(180, 390, 125, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Password           :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 390, 120, 20);
        jPanel1.add(yearTxt);
        yearTxt.setBounds(430, 390, 60, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameWithIntialsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameWithIntialsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameWithIntialsTextActionPerformed

    private void addressTownTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTownTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTownTxtActionPerformed

    private void coursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coursesActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        String fullName = fullNameTxt.getText();
        String nameWithInitials = nameWithIntialsText.getText();
        String addressNo = addressNoTxt.getText();
        String addressRd = addressRdTxt.getText();
        String addressCity = addressTownTxt.getText();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        String dob = dateFormat.format(dobTxt.getDate());
        String email = emailTxt.getText();
        String password = passwordTxt.getText();
        year = 0;
        try{
            mStuId = Integer.parseInt(studentId.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "StudentId :Please enter number value");
        }
        try{
            year = Integer.parseInt(yearTxt.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Year :Please enter number value");
        }
        int comboItem = (int)courses.getSelectedIndex();
        switch (comboItem) {
            case 0:
            mCourseId = 4000;
            break;
            case 1:
            mCourseId = 5000;
            break;
            default:
            mCourseId = 6000;
            break;
        }
        MasterStudent mStu = new MasterStudent(fullName, nameWithInitials, mStuId,addressNo,addressRd,addressCity,dob,email,password, year);
        if(mStuId!=0 && year!=0){
            try{
               int res1 = MasterStudentController.addStudent(mStu);
            }catch(SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SignPageMaster.class.getName()).log(Level.SEVERE, null, ex);
            }
            try{
                int res2 = MasterStudentController.addStudentAddress(mStu);
                if(res2>0){
                    JOptionPane.showMessageDialog(this, "Added Success");
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                        new MasterDetails().setVisible(true);
                        }
                    });
                }
            }catch (ClassNotFoundException ex){
                JOptionPane.showMessageDialog(this, "Driver not found");
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtActionPerformed

    private void fullNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameTxtActionPerformed

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
            java.util.logging.Logger.getLogger(SignPageMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignPageMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignPageMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignPageMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignPageMaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressNoTxt;
    private javax.swing.JTextField addressRdTxt;
    private javax.swing.JTextField addressTownTxt;
    private javax.swing.JComboBox<String> courses;
    private com.toedter.calendar.JDateChooser dobTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JButton exitBtn;
    private javax.swing.JTextField fullNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameWithIntialsText;
    private javax.swing.JButton nextBtn;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JTextField studentId;
    private javax.swing.JTextField yearTxt;
    // End of variables declaration//GEN-END:variables
}
