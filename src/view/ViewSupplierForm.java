/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.SupplierController;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import model.Supplier;

/**
 *
 * @author kasun
 */
public class ViewSupplierForm extends javax.swing.JFrame {
    private SupplierController controller;
    /**
     * Creates new form ViewSupplierForm
     */
    public ViewSupplierForm() {
        controller=new SupplierController();
        initComponents();
//        this.setSize(1139,636);
        this.setLocationRelativeTo(null);
       
        Font headerfont=new Font("Century Gothic",Font.BOLD,18);
         tblSuppliers.getTableHeader().setFont(headerfont);
         
         loadTable();
    }
    
    public void loadTable(){
        try {
            DefaultTableModel dtm=(DefaultTableModel) tblSuppliers.getModel();
            dtm.setRowCount(0);
            List<Supplier> all = controller.getAll();
            for (Supplier supplier : all) {
            Object [] row={supplier.getS_id(),supplier.getName(),supplier.getMobile().get(0),supplier.getMobile().get(1)};
            dtm.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewSupplierForm.class.getName()).log(Level.SEVERE, null, ex);
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

        pnlMain = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSuppliers = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        lblUpdate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Supplier");

        pnlMain.setBackground(new java.awt.Color(153, 0, 153));
        pnlMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSuppliers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblSuppliers.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tblSuppliers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Suppler ID", "Name", "Mobile 1", "Mobile 2(Optional)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSuppliers);

        pnlMain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 889, -1));

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Supplier Details");
        pnlMain.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 410, 110));

        lblUpdate.setBackground(new java.awt.Color(51, 0, 255));
        lblUpdate.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblUpdate.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUpdate.setText("Update");
        lblUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblUpdate.setOpaque(true);
        lblUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUpdateMouseClicked(evt);
            }
        });
        pnlMain.add(lblUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 590, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, 1139, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateMouseClicked
    DefaultTableModel dtm=(DefaultTableModel) tblSuppliers.getModel();
        if(tblSuppliers.getSelectedRowCount()>1){
      }
        else if(tblSuppliers.getSelectedRowCount()==0)
            JOptionPane.showMessageDialog(this, "select one row at time", "Warning", JOptionPane.WARNING_MESSAGE);
        else{
            int  id = (int) dtm.getValueAt(tblSuppliers.getSelectedRow(), 0);
            String name =  (String) dtm.getValueAt(tblSuppliers.getSelectedRow(), 1);
            String mob1=(String) dtm.getValueAt(tblSuppliers.getSelectedRow(), 2);
            String mob2="";
            if(dtm.getValueAt(tblSuppliers.getSelectedRow(), 3)!=null)
             mob2=(String) dtm.getValueAt(tblSuppliers.getSelectedRow(), 3);
            Supplier sup=new Supplier();
            sup.setS_id(id);
            sup.setName(name);
            ArrayList list=new ArrayList<>();
            list.add(mob1);
            if(mob2.trim().length()!=0)
                list.add(mob2);
            sup.setMobile(list);
            JFrame frame= new UpdateSupplierForm(sup,this);
            frame.setVisible(true);        
            dtm.setRowCount(0);
            loadTable();
      
        }
            
    }//GEN-LAST:event_lblUpdateMouseClicked

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
            java.util.logging.Logger.getLogger(ViewSupplierForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSupplierForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSupplierForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSupplierForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSupplierForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUpdate;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JTable tblSuppliers;
    // End of variables declaration//GEN-END:variables
}
