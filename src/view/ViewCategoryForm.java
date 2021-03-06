/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CategoryController;
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
import model.Category;
import model.Supplier;

/**
 *
 * @author kasun
 */
public class ViewCategoryForm extends javax.swing.JFrame {
    private CategoryController controller=null;
    /**
     * Creates new form ViewCategoryForm
     */
    public ViewCategoryForm() {
        controller=new CategoryController();
        initComponents();
        this.setSize(1139,658);
        this.setLocationRelativeTo(null);
       
        Font headerfont=new Font("Century Gothic",Font.BOLD,18);
         tblCategories.getTableHeader().setFont(headerfont);
         
         loadTable();
    }
    
    public void loadTable(){
        try {
            DefaultTableModel dtm=(DefaultTableModel) tblCategories.getModel();
            dtm.setRowCount(0);
            List<Category> all = controller.getAll();
            for (Category category : all) {
            Object [] row={category.getC_id(),category.getName()};
            dtm.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewSupplierForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategories = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        lblUpdate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Catehory");

        pnlBase.setBackground(new java.awt.Color(153, 0, 153));
        pnlBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCategories.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblCategories.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tblCategories.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCategories);

        pnlBase.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 119, 889, -1));

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Category Details");
        pnlBase.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 9, 410, 110));

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
        pnlBase.add(lblUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1037, 589, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBase, javax.swing.GroupLayout.PREFERRED_SIZE, 1135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBase, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateMouseClicked
        DefaultTableModel dtm=(DefaultTableModel) tblCategories.getModel();
        if(tblCategories.getSelectedRowCount()>1){
            JOptionPane.showMessageDialog(this, "select only one row at time", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else if(tblCategories.getSelectedRowCount()==0)
        JOptionPane.showMessageDialog(this, "select one row at time", "Warning", JOptionPane.WARNING_MESSAGE);
        else{
            int  id = (int) dtm.getValueAt(tblCategories.getSelectedRow(), 0);
            String name =  (String) dtm.getValueAt(tblCategories.getSelectedRow(), 1);
            Category cat=new Category();
            cat.setC_id(id);
            cat.setName(name);
            JFrame frame= new UpdateCategoryForm(cat,this);
            frame.setVisible(true);
            dtm.setRowCount(0);
            loadTable();
//            loadTable();
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
            java.util.logging.Logger.getLogger(ViewCategoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCategoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCategoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCategoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCategoryForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUpdate;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JTable tblCategories;
    // End of variables declaration//GEN-END:variables
}
