/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ItemController;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import model.Item;

/**
 *
 * @author Benura
 */
public class DeleteItemForm extends javax.swing.JFrame {

private ItemController itemcontroller=new ItemController();
    
    public DeleteItemForm() {
        initComponents();
        this.setSize(772,520);
        this.setLocationRelativeTo(null);
        loadTable();
    }
    private void loadTable(){
        try {
            DefaultTableModel dtm=(DefaultTableModel) view_details.getModel();
            List<Item> all = itemcontroller.getAll();
            for (Item elem : all) {
                Object[] row={elem.getI_id(),elem.getB_id(),elem.getC_id(),elem.getDescription(),elem.getTaking_price(),elem.getThoga_price(),elem.getOur_price(),elem.getWarning(),elem.getQuantity()};
                dtm.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewItemForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        view_details = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Delete");

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Delete Items");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 400, 70));

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jButton1.setText("DELETE");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 710, 150, 50));

        view_details.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        view_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Batch ID", "Category ID", "Description", "Taking Price", "Thoga Price", "Our Price", "Warning Level", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        view_details.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(view_details);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 850, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1141, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     DefaultTableModel dtm=(DefaultTableModel) view_details.getModel();
        if(view_details.getSelectedRowCount()>0){
            JOptionPane.showMessageDialog(this, "select only one row at time", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else if(view_details.getSelectedRowCount()==0)
            JOptionPane.showMessageDialog(this, "select one row at time", "Warning", JOptionPane.WARNING_MESSAGE);
        else{
        
         try {
             int  id = (int) dtm.getValueAt(view_details.getSelectedRow(), 0);
             boolean isDeleted = itemcontroller.deleteItem(id);
             if(isDeleted){
                 this.dispose();
                 
             }else{
                 JOptionPane.showMessageDialog(this, "Something Went Wrong", "Error", JOptionPane.ERROR);
             }
         } catch (SQLException ex) {
             Logger.getLogger(DeleteItemForm.class.getName()).log(Level.SEVERE, null, ex);
         }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteItemForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable view_details;
    // End of variables declaration//GEN-END:variables
}
