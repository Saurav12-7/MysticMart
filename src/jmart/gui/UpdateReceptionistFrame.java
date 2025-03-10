/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmart.gui;

import java.sql.SQLException;
import java.util.Map;
import javax.swing.JOptionPane;
import jmart.dao.ReceptionistDao;

/**
 *
 * @author Dell
 */
public class UpdateReceptionistFrame extends javax.swing.JFrame {

    /**
     * Creates new form UpdateReceptionistFrame
     */
    Map<String,String> receptionistList;
    public UpdateReceptionistFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadReceptionistDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblReceptionistId = new javax.swing.JLabel();
        lblReceptionistName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblRePassword = new javax.swing.JLabel();
        jComboReceptionistId = new javax.swing.JComboBox<>();
        txtReceptionistName = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jRePassword = new javax.swing.JPasswordField();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Receptionist", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N

        btnLogout.setBackground(new java.awt.Color(255, 0, 0));
        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 0, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(319, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(58, 58, 58)
                .addComponent(btnLogout)
                .addGap(54, 54, 54))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout)
                    .addComponent(btnBack))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 0, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N

        lblReceptionistId.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblReceptionistId.setForeground(new java.awt.Color(255, 255, 255));
        lblReceptionistId.setText("Receptionist Id");

        lblReceptionistName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblReceptionistName.setForeground(new java.awt.Color(255, 255, 255));
        lblReceptionistName.setText("Receptionist Name");

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password");

        lblRePassword.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblRePassword.setForeground(new java.awt.Color(255, 255, 255));
        lblRePassword.setText("Re-Password");

        jComboReceptionistId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboReceptionistIdActionPerformed(evt);
            }
        });

        txtReceptionistName.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReceptionistId)
                    .addComponent(lblReceptionistName)
                    .addComponent(lblPassword)
                    .addComponent(lblRePassword))
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboReceptionistId, 0, 188, Short.MAX_VALUE)
                    .addComponent(txtReceptionistName)
                    .addComponent(jPassword)
                    .addComponent(jRePassword))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReceptionistId)
                    .addComponent(jComboReceptionistId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReceptionistName)
                    .addComponent(txtReceptionistName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRePassword)
                    .addComponent(jRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        btnUpdate.setBackground(new java.awt.Color(255, 0, 0));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(btnUpdate)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LoginFrame login=new LoginFrame();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ManageReceptionistFrame mf=new ManageReceptionistFrame();
        mf.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jComboReceptionistIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboReceptionistIdActionPerformed
        
        String id=jComboReceptionistId.getSelectedItem().toString();
        txtReceptionistName.setText(receptionistList.get(id));
    }//GEN-LAST:event_jComboReceptionistIdActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(!validateInput())
            return;
        
        try
        {
            String id=jComboReceptionistId.getSelectedItem().toString();
            String pwd=String.valueOf(jPassword.getPassword());
            boolean res=ReceptionistDao.updatePassword(id, pwd);
            if(res==true)
            {
                JOptionPane.showMessageDialog(null,"REC UPDATED SUCCESSFULLY!!");
                jComboReceptionistId.setSelectedIndex(0);
                jPassword.setText("");
                jRePassword.setText("");
                return ;
            }
            JOptionPane.showMessageDialog(null,"REC NOT UPDATED");
            jPassword.setText("");
            jRePassword.setText("");
        }
        catch (SQLException sqle)
        {
            JOptionPane.showMessageDialog(null,"ERROR IN DB","ERROR",JOptionPane.ERROR_MESSAGE);
            sqle.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateReceptionistFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> jComboReceptionistId;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPasswordField jRePassword;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRePassword;
    private javax.swing.JLabel lblReceptionistId;
    private javax.swing.JLabel lblReceptionistName;
    private javax.swing.JTextField txtReceptionistName;
    // End of variables declaration//GEN-END:variables

    private void loadReceptionistDetails() {
        try
        {
            receptionistList=ReceptionistDao.getUserReceptionist();
            if(receptionistList.isEmpty())
            {
                JOptionPane.showMessageDialog(null,"NO RECEPTION REC FOUND!!");
                btnUpdate.setEnabled(false);
                return;
            }
            btnUpdate.setEnabled(true);
            for(String key:receptionistList.keySet())
            {
                jComboReceptionistId.addItem(key);
            }
        }
        catch (SQLException sqle)
        {
            JOptionPane.showMessageDialog(null,"ERROR IN DB","ERROR",JOptionPane.ERROR_MESSAGE);
            sqle.printStackTrace();
        }
    }

    private boolean validateInput() {
        if(jPassword.getPassword().length<4 || jRePassword.getPassword().length<4)
        {
            JOptionPane.showMessageDialog(null,"Password must be 4 character long");
            return false;
        }
        else if (String.valueOf(jPassword.getPassword()).equals(String.valueOf(jRePassword.getPassword()))==false)
        {
            JOptionPane.showMessageDialog(null,"Password do not match");
            jPassword.setText("");
            jRePassword.setText("");
            return false;
        }
        return true;
    }
}
