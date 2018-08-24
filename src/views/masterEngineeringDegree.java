/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Controller.NormalSubjectController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.NormalSubject;

/**
 *
 * @author Heshan
 */
public class masterEngineeringDegree extends javax.swing.JFrame {

    /**
     * Creates new form masterEngineeringDegree
     */
    public masterEngineeringDegree() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fristSemTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        fristSemsub4 = new javax.swing.JTextField();
        fristSemsub1 = new javax.swing.JTextField();
        fristSemsub2 = new javax.swing.JTextField();
        fristSemsub3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        secondSemTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        secondSemsub4 = new javax.swing.JTextField();
        secondSemsub1 = new javax.swing.JTextField();
        secondSemsub2 = new javax.swing.JTextField();
        secondSemsub3 = new javax.swing.JTextField();
        exitBtn = new javax.swing.JButton();
        signUpBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        fristSemBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        secondSemBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Engineering Degree Subjects");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(190, 0, 340, 60);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Frist Year Frist Semester");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 60, 150, 20);

        fristSemTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fristSemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject Id", "Subject"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(fristSemTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 90, 452, 130);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Choose four subject for frist semester (enter subjects codes here) :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 230, 420, 15);
        jPanel1.add(fristSemsub4);
        fristSemsub4.setBounds(450, 225, 50, 25);
        jPanel1.add(fristSemsub1);
        fristSemsub1.setBounds(510, 225, 50, 25);
        jPanel1.add(fristSemsub2);
        fristSemsub2.setBounds(570, 225, 50, 25);
        jPanel1.add(fristSemsub3);
        fristSemsub3.setBounds(630, 225, 50, 25);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Frist Year Second Semester");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 260, 170, 20);

        secondSemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject Id", "Subject"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(secondSemTable);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(30, 290, 452, 130);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Choose four subject for second semester (enter subjects codes here) :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 430, 432, 15);
        jPanel1.add(secondSemsub4);
        secondSemsub4.setBounds(465, 425, 50, 25);
        jPanel1.add(secondSemsub1);
        secondSemsub1.setBounds(520, 425, 50, 25);
        jPanel1.add(secondSemsub2);
        secondSemsub2.setBounds(575, 425, 50, 25);
        jPanel1.add(secondSemsub3);
        secondSemsub3.setBounds(630, 425, 50, 25);

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitBtn);
        exitBtn.setBounds(570, 470, 51, 23);

        signUpBtn.setText("Sign In");
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });
        jPanel1.add(signUpBtn);
        signUpBtn.setBounds(461, 470, 70, 23);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fristSemBtn.setText("View");
        fristSemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fristSemBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(546, Short.MAX_VALUE)
                .addComponent(fristSemBtn)
                .addGap(68, 68, 68))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(fristSemBtn)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 55, 675, 200);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        secondSemBtn.setText("View");
        secondSemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondSemBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(546, Short.MAX_VALUE)
                .addComponent(secondSemBtn)
                .addGap(68, 68, 68))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(secondSemBtn)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 260, 675, 200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        int subject1 = Integer.parseInt(fristSemsub1.getText());
        int subject2 = Integer.parseInt(fristSemsub2.getText());
        int subject3 = Integer.parseInt(fristSemsub3.getText());
        int subject4 = Integer.parseInt(fristSemsub4.getText());
        int studentId = SignPageMaster.mStuId;
        int semester = 1;
        int res = 0;
        try{
            res = NormalSubjectController.addOptionalMasterSubject(semester, studentId, subject1, subject2, subject3, subject4);
            if(res>0){
                JOptionPane.showMessageDialog(this, "Frist Semester Added Success");
            }
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(this, "No Driver found");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        int sub1 = Integer.parseInt(secondSemsub1.getText());
        int sub2 = Integer.parseInt(secondSemsub2.getText());
        int sub3 = Integer.parseInt(secondSemsub3.getText());    
        int sub4 = Integer.parseInt(secondSemsub4.getText());
        int sem = 2;
        int res1 = 0;
        try{
            res1 = NormalSubjectController.addOptionalBachelorSubject(sem, studentId, sub1, sub2, sub3, sub4);
            if(res1>0){
                JOptionPane.showMessageDialog(this, "Second Semester Added Success");
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                    new AdminInterface().setVisible(true);
                    }
                });
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "No Driver found");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_signUpBtnActionPerformed

    private void fristSemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fristSemBtnActionPerformed
        try{
            int semester = 1;
            int yearStu = SignPageMaster.year;
            int courseId = 6000;
            ArrayList<NormalSubject> normal = NormalSubjectController.optionalSubjectView(semester, yearStu, courseId);
            DefaultTableModel dtm = (DefaultTableModel) fristSemTable.getModel();
            dtm.setRowCount(0);
            for(NormalSubject normalL: normal){
                Object[] rowData = {normalL.getSubjectId(), normalL.getSubjectName()};
                dtm.addRow(rowData);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(masterEngineeringDegree.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(masterEngineeringDegree.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_fristSemBtnActionPerformed

    private void secondSemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondSemBtnActionPerformed
         try{
            int semester = 2;
            int yearStu = SignPageMaster.year;
            int courseId = 6000;
            ArrayList<NormalSubject> normal = NormalSubjectController.optionalSubjectView(semester, yearStu, courseId);
            DefaultTableModel dtm = (DefaultTableModel) secondSemTable.getModel();
            dtm.setRowCount(0);
            for(NormalSubject normalL: normal){
                Object[] rowData = {normalL.getSubjectId(), normalL.getSubjectName()};
                dtm.addRow(rowData);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(masterEngineeringDegree.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(masterEngineeringDegree.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_secondSemBtnActionPerformed

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
            java.util.logging.Logger.getLogger(masterEngineeringDegree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(masterEngineeringDegree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(masterEngineeringDegree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(masterEngineeringDegree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new masterEngineeringDegree().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton fristSemBtn;
    private javax.swing.JTable fristSemTable;
    private javax.swing.JTextField fristSemsub1;
    private javax.swing.JTextField fristSemsub2;
    private javax.swing.JTextField fristSemsub3;
    private javax.swing.JTextField fristSemsub4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton secondSemBtn;
    private javax.swing.JTable secondSemTable;
    private javax.swing.JTextField secondSemsub1;
    private javax.swing.JTextField secondSemsub2;
    private javax.swing.JTextField secondSemsub3;
    private javax.swing.JTextField secondSemsub4;
    private javax.swing.JButton signUpBtn;
    // End of variables declaration//GEN-END:variables
}
