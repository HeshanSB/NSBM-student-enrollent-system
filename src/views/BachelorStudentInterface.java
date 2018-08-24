/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Controller.NormalSubjectController;
import database.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Heshan
 */
public class BachelorStudentInterface extends javax.swing.JFrame {

    public static int different;
    public BachelorStudentInterface() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fristSemBtn = new javax.swing.JButton();
        secondSemBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        viewBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        resultBtn = new javax.swing.JButton();
        stuId = new javax.swing.JLabel();
        course = new javax.swing.JLabel();
        stuIdTxt = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        emailTxt = new javax.swing.JLabel();
        nameTxt = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Bachelor Student Area");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 210, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Choose Subjects For Semesters");

        fristSemBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fristSemBtn.setText("Frist Semester");
        fristSemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fristSemBtnActionPerformed(evt);
            }
        });

        secondSemBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        secondSemBtn.setText("Second Semester");
        secondSemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondSemBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(secondSemBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fristSemBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(fristSemBtn)
                .addGap(31, 31, 31)
                .addComponent(secondSemBtn)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(290, 70, 340, 160);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Payment Details");

        viewBtn.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(viewBtn)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(viewBtn)
                .addContainerGap())
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 160, 260, 70);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText(" Result");

        resultBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        resultBtn.setText("Result");
        resultBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(resultBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(resultBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 70, 260, 80);

        stuId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(stuId);
        stuId.setBounds(50, 320, 100, 20);

        course.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(course);
        course.setBounds(50, 350, 100, 20);

        stuIdTxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(stuIdTxt);
        stuIdTxt.setBounds(180, 320, 200, 20);

        name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(name);
        name.setBounds(50, 290, 100, 20);

        emailTxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(emailTxt);
        emailTxt.setBounds(180, 350, 420, 20);

        nameTxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(nameTxt);
        nameTxt.setBounds(180, 290, 200, 20);

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitBtn);
        exitBtn.setBounds(560, 460, 51, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/if_Student-3_379413.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(540, 10, 60, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fristSemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fristSemBtnActionPerformed
        int semester1 = 0;
        try {
            semester1 = NormalSubjectController.canOrCantChooseSubject(1);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BachelorStudentInterface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BachelorStudentInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(semester1 == 0){
            JOptionPane.showMessageDialog(this, "Time is up can't choose subject for 1st semester");
        }
        else if(semester1 == 1){
            JOptionPane.showMessageDialog(this, "Still can change subjects");
            
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BachelorStudentFristSubjectChoose().setVisible(true);
                }
            });
            
        }
    }//GEN-LAST:event_fristSemBtnActionPerformed

    private void resultBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultBtnActionPerformed
        different = 1;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentResultView().setVisible(true);
            }
        });
       
    }//GEN-LAST:event_resultBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void secondSemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondSemBtnActionPerformed
        int semester2 =0;
        try {
            semester2 = NormalSubjectController.canOrCantChooseSubject(2);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BachelorStudentInterface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BachelorStudentInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(semester2 == 0){
            JOptionPane.showMessageDialog(this, "Time is up can't choose subject for 1st semester");
        }
        else if(semester2 == 1){
            JOptionPane.showMessageDialog(this, "Still can change subjects");
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BachelorStudentSecondSubjectChoose().setVisible(true);
                }
            });
        }
    }//GEN-LAST:event_secondSemBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayementInterface().setVisible(true);
            }
        });
    }//GEN-LAST:event_viewBtnActionPerformed

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
            java.util.logging.Logger.getLogger(BachelorStudentInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BachelorStudentInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BachelorStudentInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BachelorStudentInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BachelorStudentInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel course;
    private javax.swing.JLabel emailTxt;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton fristSemBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nameTxt;
    private javax.swing.JButton resultBtn;
    private javax.swing.JButton secondSemBtn;
    private javax.swing.JLabel stuId;
    private javax.swing.JLabel stuIdTxt;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}