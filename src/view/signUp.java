/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import dao.dao_abstract;
import dao.controller_abstract;
import java.sql.*;
import javax.swing.*;


public class  signUp extends javax.swing.JFrame {

    private controller_abstract dao_abstract;
    
    private void handleSignUp() {
    String username_user = txtUser.getText().trim();
    String password_user = new String(txtPass.getPassword());
    String firstName_user = txtFirst.getText().trim();
    String lastName_user = txtLast.getText().trim();
    String gender = "";

    // Validasi gender
    if (male.isSelected()) {
        gender = "Male";
    } else if (female.isSelected()) {
        gender = "Female";
    }

    // Validasi input
    if (username_user.isEmpty() || password_user.isEmpty() || firstName_user.isEmpty() || lastName_user.isEmpty() || gender.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Semua data harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

        if (dao_abstract.signUpPassenger(username_user, password_user, firstName_user, lastName_user, gender)) {
        JOptionPane.showMessageDialog(this, "Pendaftaran berhasil!", "Success", JOptionPane.INFORMATION_MESSAGE);
        // Navigasi ke login page
        this.setVisible(false); // Sembunyikan JFrame saat ini
        loginPassenger mainFrame = new loginPassenger();
        mainFrame.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(this, "Pendaftaran gagal. Coba lagi.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
    public signUp() {
        initComponents();
        titleBar1.initJFram(this);
        this.setLocationRelativeTo(null);
        dao_abstract = new dao_abstract();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtFirst = new javax.swing.JTextField();
        formEmail = new javax.swing.JTextField();
        txtLast = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        btnAdd = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        titleBar1 = new javaswingdev.swing.titlebar.TitleBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFirst.setForeground(new java.awt.Color(120, 179, 206));
        txtFirst.setBorder(null);
        jPanel1.add(txtFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 110, 30));

        formEmail.setForeground(new java.awt.Color(120, 179, 206));
        formEmail.setBorder(null);
        jPanel1.add(formEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 180, 20));

        txtLast.setForeground(new java.awt.Color(120, 179, 206));
        txtLast.setBorder(null);
        jPanel1.add(txtLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 110, 30));

        txtUser.setForeground(new java.awt.Color(120, 179, 206));
        txtUser.setBorder(null);
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 260, 20));

        txtPass.setForeground(new java.awt.Color(120, 179, 206));
        txtPass.setBorder(null);
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 260, 20));

        radioGroup.add(female);
        male.setActionCommand("Female");
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 390, -1, -1));

        radioGroup.add(male);
        male.setActionCommand("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, -1, -1));
        male.getAccessibleContext().setAccessibleDescription("");

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 9.png"))); // NOI18N
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 480, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signUp euy.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jLabel9.setPreferredSize(new java.awt.Dimension(466, 466));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 620));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
        getContentPane().add(titleBar1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked

        handleSignUp();
        
    }//GEN-LAST:event_btnAddMouseClicked

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

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
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdd;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField formEmail;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton male;
    private javax.swing.ButtonGroup radioGroup;
    private javaswingdev.swing.titlebar.TitleBar titleBar1;
    private javax.swing.JTextField txtFirst;
    private javax.swing.JTextField txtLast;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
