/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Controller.InstructorController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Instructor;

/**
 *
 * @author Heshan
 */
public class InstructorSearch extends javax.swing.JFrame {

    /**
     * Creates new form InstructorSearch
     */
    public InstructorSearch() {
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
        instrutorId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        exitBtn = new javax.swing.JButton();
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
        jLabel1.setText("Instructor Id          :");
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
        jLabel3.setText("Instructor Id        :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 110, 120, 20);

        instrutorId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        instrutorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrutorIdActionPerformed(evt);
            }
        });
        jPanel1.add(instrutorId);
        instrutorId.setBounds(180, 110, 490, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Password             :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 150, 120, 20);

        passwordTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(passwordTxt);
        passwordTxt.setBounds(180, 150, 490, 30);

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitBtn);
        exitBtn.setBounds(590, 460, 51, 23);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void instrutorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrutorIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instrutorIdActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        int instId=  Integer.parseInt(userNameTxt.getText());
        String name = nameTxt.getText();
        String password = passwordTxt.getText();
        Instructor inst = new Instructor(instId, name, password);
        try{
            int res = InstructorController.updateInstructor(inst);
            if(res>0){
                JOptionPane.showMessageDialog(this, "Update Success");
            }
            else{
                JOptionPane.showMessageDialog(this, "Update Fail");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InstructorSearch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InstructorSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int instId = Integer.parseInt(userNameTxt.getText());
        try{
            int res = InstructorController.deleteInstructor(instId);
            if(res>0){
                JOptionPane.showMessageDialog(this, "Delete Success");
                nameTxt.setText("");
                instrutorId.setText("");
                passwordTxt.setText("");
            }else{
                JOptionPane.showMessageDialog(this, "Delete Fail");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InstructorSearch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InstructorSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        int userName = 0;
        try{
            userName = Integer.parseInt(userNameTxt.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invaild value","error",JOptionPane.ERROR_MESSAGE);
        }
        if(userName != 0){
            try{
                Instructor inst = InstructorController.searchInstructor(userName);
                if(inst != null){
                    nameTxt.setText(inst.getName());
                    instrutorId.setText(Integer.toString(inst.getLecturId()));
                    passwordTxt.setText(inst.getPassword());
                }else{
                    JOptionPane.showMessageDialog(this, "No such Instructor");
                    nameTxt.setText("");
                    instrutorId.setText("");
                    passwordTxt.setText("");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(InstructorSearch.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(InstructorSearch.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(InstructorSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstructorSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstructorSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstructorSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstructorSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JTextField instrutorId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
