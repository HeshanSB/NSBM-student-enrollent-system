/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Controller.MasterStudentController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.DegreeDetails;
/**
 *
 * @author Heshan
 */
public class MasterDetails extends javax.swing.JFrame {

    /**
     * Creates new form MasterDetails
     */
    public MasterDetails() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        masterGraduatedYear = new javax.swing.JTextField();
        masterDegreeName = new javax.swing.JTextField();
        masterUniversity = new javax.swing.JTextField();
        masterDegreeClass = new javax.swing.JTextField();
        nextBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("More Details (Master Course)");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(165, 0, 370, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("University /  Institute    :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 110, 150, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Class of Degree            :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 150, 150, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Graduated year            :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 190, 150, 25);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Degree Name               :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 70, 150, 25);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        masterGraduatedYear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(masterGraduatedYear);
        masterGraduatedYear.setBounds(210, 130, 90, 30);

        masterDegreeName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(masterDegreeName);
        masterDegreeName.setBounds(210, 10, 350, 30);

        masterUniversity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(masterUniversity);
        masterUniversity.setBounds(210, 50, 350, 30);

        masterDegreeClass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(masterDegreeClass);
        masterDegreeClass.setBounds(210, 90, 220, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 60, 680, 170);

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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/if_12_2058811.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(230, 310, 130, 110);

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

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        String degreeName = masterDegreeName.getText();
        String uniName = masterUniversity.getText();
        String degreeClass = masterDegreeClass.getText();
        int gYear=0;
        SignPageMaster spm = new SignPageMaster();
        int stuId = spm.mStuId;
        try{
        gYear = Integer.parseInt(masterGraduatedYear.getText());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Grauated year :Please enter number value");
        }
        DegreeDetails dD = new DegreeDetails(stuId,degreeName, uniName, degreeClass, gYear);
        try{
            int course = SignPageMaster.mCourseId;
            int res1 = MasterStudentController.addDgreeDetials(dD);
            if(res1>0){
                JOptionPane.showMessageDialog(this, "Added succuess");
                if(course == 4000){
                     java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                        new masterComputingDegree().setVisible(true);
                            }
                        });
                }
                else if(course == 5000 ){
                     java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                        new masterBusinessDegree().setVisible(true);
                        }
                    });
                }
                else if(course == 6000){
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                        new masterEngineeringDegree().setVisible(true);
                        }
                    });
                }
            }
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(this, "Driver not found");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
    }//GEN-LAST:event_nextBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MasterDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField masterDegreeClass;
    private javax.swing.JTextField masterDegreeName;
    private javax.swing.JTextField masterGraduatedYear;
    private javax.swing.JTextField masterUniversity;
    private javax.swing.JButton nextBtn;
    // End of variables declaration//GEN-END:variables
}
