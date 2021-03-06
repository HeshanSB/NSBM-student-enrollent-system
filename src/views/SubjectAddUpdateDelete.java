/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Controller.NormalSubjectController;
import Controller.PraticalSubjectController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.NormalSubject;
import model.PracticalSubject;

/**
 *
 * @author Heshan
 */
public class SubjectAddUpdateDelete extends javax.swing.JFrame {

    /**
     * Creates new form SubjectAddUpdateDelete
     */
    public SubjectAddUpdateDelete() {
        initComponents();
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
        subjectId = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        subjectNameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        gpaTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tieTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lectureTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dateTxt = new javax.swing.JTextField();
        noOfAssTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        hallNoTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        subjectIdTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        subYearTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        semesterTxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        courseIdTxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        compalsoryTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        updatBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Subject Id :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 20, 110, 24);

        subjectId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        subjectId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectIdActionPerformed(evt);
            }
        });
        jPanel1.add(subjectId);
        subjectId.setBounds(150, 20, 170, 30);

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn);
        addBtn.setBounds(210, 430, 73, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Subject name     :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 70, 120, 20);

        subjectNameTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(subjectNameTxt);
        subjectNameTxt.setBounds(180, 70, 310, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Number Of Credit    :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(370, 110, 130, 20);

        gpaTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gpaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpaTxtActionPerformed(evt);
            }
        });
        jPanel1.add(gpaTxt);
        gpaTxt.setBounds(520, 110, 130, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Semester                :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(370, 150, 130, 20);

        tieTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(tieTxt);
        tieTxt.setBounds(520, 275, 130, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Date                  :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 270, 110, 20);

        lectureTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(lectureTxt);
        lectureTxt.setBounds(180, 190, 130, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("No Of Assignments :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 230, 120, 20);

        dateTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(dateTxt);
        dateTxt.setBounds(180, 270, 130, 30);

        noOfAssTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        noOfAssTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfAssTxtActionPerformed(evt);
            }
        });
        jPanel1.add(noOfAssTxt);
        noOfAssTxt.setBounds(180, 230, 130, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Hall No              :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 310, 120, 20);

        hallNoTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(hallNoTxt);
        hallNoTxt.setBounds(180, 310, 130, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Subject Id          :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 110, 120, 20);

        subjectIdTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        subjectIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectIdTxtActionPerformed(evt);
            }
        });
        jPanel1.add(subjectIdTxt);
        subjectIdTxt.setBounds(180, 110, 130, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Year                   :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 150, 120, 20);

        subYearTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(subYearTxt);
        subYearTxt.setBounds(180, 150, 130, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Lecture Id          :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 190, 120, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Time                      :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(370, 275, 130, 20);

        semesterTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(semesterTxt);
        semesterTxt.setBounds(520, 150, 130, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Course Id               :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(370, 195, 130, 20);

        courseIdTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(courseIdTxt);
        courseIdTxt.setBounds(520, 190, 130, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("compalsory(y/n)    :");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(370, 235, 130, 20);

        compalsoryTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(compalsoryTxt);
        compalsoryTxt.setBounds(520, 230, 130, 30);

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchBtn);
        searchBtn.setBounds(360, 25, 73, 23);

        updatBtn.setText("Update");
        updatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updatBtn);
        updatBtn.setBounds(350, 430, 73, 30);

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitBtn);
        exitBtn.setBounds(580, 430, 51, 30);

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

    private void subjectIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectIdActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        int chooseNumber = ChooseSubjectNormalOrPratical.choose;
        String subName = subjectNameTxt.getText();
        String compalsory = compalsoryTxt.getText();
        int com = 0;
        if(compalsory.equals("Y")){
            com = 1;
        }
        String day = dateTxt.getText();
        String time = tieTxt.getText();
        int subId =0;
        int gpa = 0;
        int year =0;
        int semester = 0;
        int lectureId = 0;
        int courseId = 0;
        int noOfAss = 0;
        int hallNo = 0;
        try{
            subId =Integer.parseInt(subjectIdTxt.getText());
            gpa = Integer.parseInt(gpaTxt.getText());
            year = Integer.parseInt(subYearTxt.getText());
            semester = Integer.parseInt(semesterTxt.getText());
            lectureId = Integer.parseInt(lectureTxt.getText());
            courseId = Integer.parseInt(courseIdTxt.getText());
            noOfAss = Integer.parseInt(noOfAssTxt.getText());
            hallNo = Integer.parseInt(hallNoTxt.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invaild value", "error",JOptionPane.ERROR_MESSAGE);
        }
        if(chooseNumber==1){
            NormalSubject normalSubject = new NormalSubject(subId, subName,year,hallNo,time,lectureId,courseId,noOfAss,day,semester, com, gpa);
            int res = 0;
            try {
                res = NormalSubjectController.addNormalSubject(normalSubject);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SubjectAddUpdateDelete.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(SubjectAddUpdateDelete.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(res>0){
                JOptionPane.showMessageDialog(this, "Added Successfully");
                subjectNameTxt.setText("");
                subjectIdTxt.setText("");
                gpaTxt.setText("");
                subYearTxt.setText("");
                semesterTxt.setText("");
                lectureTxt.setText("");
                courseIdTxt.setText("");
                noOfAssTxt.setText("");
                compalsoryTxt.setText("");
                dateTxt.setText("");
                tieTxt.setText("");
                hallNoTxt.setText("");

            }
        }else{
            PracticalSubject pSubject = new PracticalSubject(subId, subName, year, hallNo,time,lectureId,courseId,noOfAss,day,gpa,semester);
            int res = 0;
            try {
                res = PraticalSubjectController.addPracticalSubject(pSubject);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SubjectAddUpdateDelete.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(SubjectAddUpdateDelete.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(res>0){
                JOptionPane.showMessageDialog(this, "Added Successfully");
                subjectNameTxt.setText("");
                subjectIdTxt.setText("");
                gpaTxt.setText("");
                subYearTxt.setText("");
                semesterTxt.setText("");
                lectureTxt.setText("");
                courseIdTxt.setText("");
                noOfAssTxt.setText("");
                compalsoryTxt.setText("");
                dateTxt.setText("");
                tieTxt.setText("");
                hallNoTxt.setText("");
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void gpaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpaTxtActionPerformed

    private void noOfAssTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfAssTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noOfAssTxtActionPerformed

    private void subjectIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectIdTxtActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        int chooseNumber = ChooseSubjectNormalOrPratical.choose;
        int subId = 0;
        try{
            subId = Integer.parseInt(subjectId.getText());
        }catch(NumberFormatException e ){
            JOptionPane.showMessageDialog(this, "Invaild value", "error",JOptionPane.ERROR_MESSAGE);
        }
        if(chooseNumber == 1){
            if(subId != 0){
                try{
                    NormalSubject normalSub = NormalSubjectController.searchNormalSubject(subId);
                    if(normalSub != null){
                        subjectNameTxt.setText(normalSub.getSubjectName());
                        subjectIdTxt.setText(Integer.toString(normalSub.getSubjectId()));
                        gpaTxt.setText(Integer.toString(normalSub.getGpa()));
                        subYearTxt.setText(Integer.toString(normalSub.getYear()));
                        semesterTxt.setText(Integer.toString(normalSub.getSemester()));
                        lectureTxt.setText(Integer.toString(normalSub.getLectureId()));
                        courseIdTxt.setText(Integer.toString(normalSub.getCourseId()));
                        noOfAssTxt.setText(Integer.toString(normalSub.getNumberOfAssignment()));
                        if(normalSub.getCompalsory()==1){
                            compalsoryTxt.setText("Y");
                        }
                        else{
                            compalsoryTxt.setText("N");
                        }
                        dateTxt.setText(normalSub.getDay());
                        tieTxt.setText(normalSub.getTime());
                        hallNoTxt.setText(Integer.toString(normalSub.getHallNo()));
                    }else{
                        JOptionPane.showMessageDialog(this, "No subject with this Id!!!!");
                        subjectNameTxt.setText("");
                        subjectIdTxt.setText("");
                        gpaTxt.setText("");
                        subYearTxt.setText("");
                        semesterTxt.setText("");
                        lectureTxt.setText("");
                        courseIdTxt.setText("");
                        noOfAssTxt.setText("");
                        compalsoryTxt.setText("");
                        dateTxt.setText("");
                        tieTxt.setText("");
                        hallNoTxt.setText("");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SubjectAddUpdateDelete.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(SubjectAddUpdateDelete.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else if(chooseNumber == 2){
            if(subId!=0){
                try{
                    PracticalSubject praSubject = PraticalSubjectController.searchPracticalSubject(subId);
                    if(praSubject != null){
                        subjectNameTxt.setText(praSubject.getSubjectName());
                        subjectIdTxt.setText(Integer.toString(praSubject.getSubjectId()));
                        gpaTxt.setText(Integer.toString(praSubject.getGpa()));
                        subYearTxt.setText(Integer.toString(praSubject.getYear()));
                        semesterTxt.setText(Integer.toString(praSubject.getSemester()));
                        lectureTxt.setText(Integer.toString(praSubject.getInstructorId()));
                        courseIdTxt.setText(Integer.toString(praSubject.getCourseId()));
                        noOfAssTxt.setText(Integer.toString(praSubject.getNumberOfAssignment()));
                        dateTxt.setText(praSubject.getDay());
                        tieTxt.setText(praSubject.getTime());
                        hallNoTxt.setText(Integer.toString(praSubject.getLabNo()));
                    }else{
                        JOptionPane.showMessageDialog(this, "No subject with this Id!!!!");
                        subjectNameTxt.setText("");
                        subjectIdTxt.setText("");
                        gpaTxt.setText("");
                        subYearTxt.setText("");
                        semesterTxt.setText("");
                        lectureTxt.setText("");
                        courseIdTxt.setText("");
                        noOfAssTxt.setText("");
                        compalsoryTxt.setText("");
                        dateTxt.setText("");
                        tieTxt.setText("");
                        hallNoTxt.setText("");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SubjectAddUpdateDelete.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(SubjectAddUpdateDelete.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void updatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatBtnActionPerformed
        int chooseNumber = ChooseSubjectNormalOrPratical.choose;
        String subName = subjectNameTxt.getText();
        String compalsory = compalsoryTxt.getText();
        int com = 0;
        if(compalsory.equals("Y")){
            com = 1;
        }
        String day = dateTxt.getText();
        String time = tieTxt.getText();
        int subId =0;
        int gpa = 0;
        int stuYear =0;
        int semester = 0;
        int lectureId = 0;
        int courseId = 0;
        int noOfAss = 0;
        int hallNo = 0;
        try{
            subId =Integer.parseInt(subjectIdTxt.getText());
            gpa = Integer.parseInt(gpaTxt.getText());
            stuYear = Integer.parseInt(subYearTxt.getText());
            semester = Integer.parseInt(semesterTxt.getText());
            lectureId = Integer.parseInt(lectureTxt.getText());
            courseId = Integer.parseInt(courseIdTxt.getText());
            noOfAss = Integer.parseInt(noOfAssTxt.getText());
            hallNo = Integer.parseInt(hallNoTxt.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invaild value", "error",JOptionPane.ERROR_MESSAGE);
        }
        if(chooseNumber == 1){
            NormalSubject normalSubject = new NormalSubject(subId, subName,stuYear,hallNo,time,lectureId,courseId,noOfAss,day,semester, com, gpa);
            int res = 0;
            try{
                res = NormalSubjectController.updateNormalSubject(normalSubject);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SubjectAddUpdateDelete.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(SubjectAddUpdateDelete.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(res>0){
                JOptionPane.showMessageDialog(this, "Added Successfully");
                subjectNameTxt.setText("");
                subjectIdTxt.setText("");
                gpaTxt.setText("");
                subYearTxt.setText("");
                semesterTxt.setText("");
                lectureTxt.setText("");
                courseIdTxt.setText("");
                noOfAssTxt.setText("");
                compalsoryTxt.setText("");
                dateTxt.setText("");
                tieTxt.setText("");
                hallNoTxt.setText("");
            }
        }else{
            PracticalSubject pSubject = new PracticalSubject(subId, subName, stuYear, hallNo,time,lectureId,courseId,noOfAss,day,gpa,semester);
            int res = 0;
            try{
                res = PraticalSubjectController.updatePraticalSubject(pSubject);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SubjectAddUpdateDelete.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(SubjectAddUpdateDelete.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(res>0){
                JOptionPane.showMessageDialog(this, "Added Successfully");
                subjectNameTxt.setText("");
                subjectIdTxt.setText("");
                gpaTxt.setText("");
                subYearTxt.setText("");
                semesterTxt.setText("");
                lectureTxt.setText("");
                courseIdTxt.setText("");
                noOfAssTxt.setText("");
                compalsoryTxt.setText("");
                dateTxt.setText("");
                tieTxt.setText("");
                hallNoTxt.setText("");
            }
        }
    }//GEN-LAST:event_updatBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SubjectAddUpdateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubjectAddUpdateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubjectAddUpdateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubjectAddUpdateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubjectAddUpdateDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField compalsoryTxt;
    private javax.swing.JTextField courseIdTxt;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JButton exitBtn;
    private javax.swing.JTextField gpaTxt;
    private javax.swing.JTextField hallNoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lectureTxt;
    private javax.swing.JTextField noOfAssTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField semesterTxt;
    private javax.swing.JTextField subYearTxt;
    private javax.swing.JTextField subjectId;
    private javax.swing.JTextField subjectIdTxt;
    private javax.swing.JTextField subjectNameTxt;
    private javax.swing.JTextField tieTxt;
    private javax.swing.JButton updatBtn;
    // End of variables declaration//GEN-END:variables
}
