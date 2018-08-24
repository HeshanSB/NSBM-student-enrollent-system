/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Controller.InstructorController;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Instructor;

/**
 *
 * @author Heshan
 */
public class InstructorSignPage extends javax.swing.JFrame {

    /**
     * Creates new form InstructorSignPage
     */
    public InstructorSignPage() {
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
        inIdTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        exitBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();
        signUpBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Add Instructor Details");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(235, 0, 260, 60);

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
        jLabel3.setText("Instructor ID        :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 110, 120, 20);

        inIdTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inIdTxtActionPerformed(evt);
            }
        });
        jPanel1.add(inIdTxt);
        inIdTxt.setBounds(180, 110, 490, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Email                   :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 150, 120, 20);

        emailTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(emailTxt);
        emailTxt.setBounds(180, 150, 490, 30);

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitBtn);
        exitBtn.setBounds(590, 460, 51, 23);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Password            :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 190, 120, 20);

        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });
        jPanel1.add(passwordTxt);
        passwordTxt.setBounds(180, 190, 125, 30);

        signUpBtn.setText("Sign In");
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });
        jPanel1.add(signUpBtn);
        signUpBtn.setBounds(470, 460, 80, 23);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/if_teacher_64_116735.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(300, 280, 70, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inIdTxtActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtActionPerformed

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        String name = nameTxt.getText();
        int inId = 0;
        try{
            inId = Integer.parseInt(inIdTxt.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Instructor Id : Please enter number value");
        }
        String email = emailTxt.getText();
        String password = passwordTxt.getText();
        
        Instructor inst = new Instructor(inId,name,password);
        if(inId != 0){
            try{
                int res = InstructorController.addInstructor(inst);
                if(res>0){
                    JOptionPane.showMessageDialog(this, "Added Success");
                    java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                    new AdminInterface().setVisible(true);
                        }
                    });
                }
            }catch(ClassNotFoundException ex){
                JOptionPane.showMessageDialog(this, "No Driver found");
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_signUpBtnActionPerformed

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
            java.util.logging.Logger.getLogger(InstructorSignPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstructorSignPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstructorSignPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstructorSignPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstructorSignPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailTxt;
    private javax.swing.JButton exitBtn;
    private javax.swing.JTextField inIdTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JButton signUpBtn;
    // End of variables declaration//GEN-END:variables
}