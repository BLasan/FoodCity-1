/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CategoryController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author kasun
 */
public class AddCategoryForm extends javax.swing.JFrame {
    private CategoryController controller=new CategoryController();
    /**
     * Creates new form AddCategoryForm
     */
    public AddCategoryForm() {
        initComponents();
        this.setSize(983,480);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        sepFour1 = new javax.swing.JSeparator();
        lblName = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New");

        pnlBase.setBackground(new java.awt.Color(153, 0, 153));
        pnlBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Add New Category");
        pnlBase.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 410, 110));

        txtName.setBackground(new java.awt.Color(153, 0, 153));
        txtName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setText("Enter Name Here");
        txtName.setToolTipText("");
        txtName.setBorder(null);
        txtName.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        pnlBase.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 400, 30));
        pnlBase.add(sepFour1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 320, 10));

        lblName.setBackground(new java.awt.Color(255, 255, 255));
        lblName.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name");
        pnlBase.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 230, 80));

        btnSubmit.setBackground(new java.awt.Color(51, 0, 255));
        btnSubmit.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        pnlBase.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 380, 120, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        txtName.setText("");
    }//GEN-LAST:event_txtNameFocusGained

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        try {
            String name = txtName.getText();
            boolean isAdded = controller.addCategory(name);
            if(isAdded)
            this.setVisible(false);
            else{
                JOptionPane.showMessageDialog(this,"Added Failed", "Something went wrong", JOptionPane.ERROR);
                txtName.setText("");
            }

        } catch (SQLException ex) {
            Logger.getLogger(AddSupplierForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

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
                 UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");    
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddCategoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCategoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCategoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCategoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCategoryForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JSeparator sepFour1;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
