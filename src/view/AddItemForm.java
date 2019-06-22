/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CategoryController;
import controller.ItemController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
 *
 * @author Benura
 */
public class AddItemForm extends javax.swing.JFrame {
  private ItemController controller=null;
  private CategoryController category=null;
  private boolean isLoaded=false;
  public GetBatchDetails getId;
    /**
     * Creates new form AddItemForm
     */
    public AddItemForm() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setSize(1366,696);
    }
    
    
    public void loadId(int id){
        itemBatchId.setText(String.valueOf(id));
         isLoaded=true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        itemCategoryName = new javax.swing.JTextField();
        sepFour1 = new javax.swing.JSeparator();
        sepFour2 = new javax.swing.JSeparator();
        itemBatchId = new javax.swing.JTextField();
        sepFour3 = new javax.swing.JSeparator();
        thogaPrice = new javax.swing.JTextField();
        sepFour4 = new javax.swing.JSeparator();
        itemQuantity = new javax.swing.JTextField();
        sepFour5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        itemPrice = new javax.swing.JTextField();
        sepFour7 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        itemId = new javax.swing.JTextField();
        sepFour8 = new javax.swing.JSeparator();
        select_batchId = new javax.swing.JButton();
        ourPrice = new javax.swing.JTextField();
        sepFour6 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        warningLevel = new javax.swing.JTextField();
        enter_btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Add Items");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 360, 80));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Batch ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Thoga Price");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 160, 40));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantity");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 140, 40));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Our Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 200, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 120, 40));

        itemCategoryName.setBackground(new java.awt.Color(153, 0, 153));
        itemCategoryName.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        itemCategoryName.setForeground(new java.awt.Color(255, 255, 255));
        itemCategoryName.setText("Enter Category Name Here");
        itemCategoryName.setToolTipText("");
        itemCategoryName.setBorder(null);
        itemCategoryName.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        itemCategoryName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                itemCategoryNameFocusGained(evt);
            }
        });
        itemCategoryName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCategoryNameActionPerformed(evt);
            }
        });
        jPanel1.add(itemCategoryName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, 330, 30));
        jPanel1.add(sepFour1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 320, 0));
        jPanel1.add(sepFour2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 350, 10));

        itemBatchId.setBackground(new java.awt.Color(153, 0, 153));
        itemBatchId.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        itemBatchId.setForeground(new java.awt.Color(255, 255, 255));
        itemBatchId.setText("Enter Batch ID Here");
        itemBatchId.setToolTipText("");
        itemBatchId.setBorder(null);
        itemBatchId.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        itemBatchId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                itemBatchIdFocusGained(evt);
            }
        });
        itemBatchId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBatchIdActionPerformed(evt);
            }
        });
        jPanel1.add(itemBatchId, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 240, 30));
        jPanel1.add(sepFour3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 290, 10));

        thogaPrice.setBackground(new java.awt.Color(153, 0, 153));
        thogaPrice.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        thogaPrice.setForeground(new java.awt.Color(255, 255, 255));
        thogaPrice.setText("Enter Thoga Price Here");
        thogaPrice.setToolTipText("");
        thogaPrice.setBorder(null);
        thogaPrice.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        thogaPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                thogaPriceFocusGained(evt);
            }
        });
        thogaPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thogaPriceActionPerformed(evt);
            }
        });
        jPanel1.add(thogaPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 310, 30));
        jPanel1.add(sepFour4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 320, 10));

        itemQuantity.setBackground(new java.awt.Color(153, 0, 153));
        itemQuantity.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        itemQuantity.setForeground(new java.awt.Color(255, 255, 255));
        itemQuantity.setText("Enter Quantity Here");
        itemQuantity.setToolTipText("");
        itemQuantity.setBorder(null);
        itemQuantity.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        itemQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                itemQuantityFocusGained(evt);
            }
        });
        itemQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemQuantityActionPerformed(evt);
            }
        });
        jPanel1.add(itemQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 310, 30));
        jPanel1.add(sepFour5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 320, 10));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Item ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 160, 40));

        itemPrice.setBackground(new java.awt.Color(153, 0, 153));
        itemPrice.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        itemPrice.setForeground(new java.awt.Color(255, 255, 255));
        itemPrice.setText("Enter Price Here");
        itemPrice.setToolTipText("");
        itemPrice.setBorder(null);
        itemPrice.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        itemPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                itemPriceFocusGained(evt);
            }
        });
        itemPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPriceActionPerformed(evt);
            }
        });
        jPanel1.add(itemPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 310, 30));
        jPanel1.add(sepFour7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 320, 10));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Category Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 210, 40));

        itemId.setBackground(new java.awt.Color(153, 0, 153));
        itemId.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        itemId.setForeground(new java.awt.Color(255, 255, 255));
        itemId.setText("Enter Id Here");
        itemId.setToolTipText("");
        itemId.setBorder(null);
        itemId.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        itemId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                itemIdFocusGained(evt);
            }
        });
        itemId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIdActionPerformed(evt);
            }
        });
        jPanel1.add(itemId, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 310, 30));
        jPanel1.add(sepFour8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 320, 10));

        select_batchId.setBackground(new java.awt.Color(0, 0, 255));
        select_batchId.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        select_batchId.setText("Choose");
        select_batchId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_batchIdActionPerformed(evt);
            }
        });
        jPanel1.add(select_batchId, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 140, 40));

        ourPrice.setBackground(new java.awt.Color(153, 0, 153));
        ourPrice.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        ourPrice.setForeground(new java.awt.Color(255, 255, 255));
        ourPrice.setText("Enter Our Price Here");
        ourPrice.setToolTipText("");
        ourPrice.setBorder(null);
        ourPrice.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        ourPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ourPriceFocusGained(evt);
            }
        });
        ourPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ourPriceActionPerformed(evt);
            }
        });
        jPanel1.add(ourPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 290, 30));
        jPanel1.add(sepFour6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 300, 10));

        jPanel2.setBackground(new java.awt.Color(204, 0, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Description");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, 40));

        description.setBackground(new java.awt.Color(204, 0, 204));
        description.setColumns(20);
        description.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        description.setForeground(new java.awt.Color(255, 255, 255));
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 290, 150));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Warning Level");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 170, 50));

        warningLevel.setBackground(new java.awt.Color(204, 0, 204));
        warningLevel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        warningLevel.setForeground(new java.awt.Color(255, 255, 255));
        warningLevel.setText("Warning Level");
        warningLevel.setToolTipText("");
        warningLevel.setBorder(null);
        warningLevel.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        warningLevel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                warningLevelFocusGained(evt);
            }
        });
        warningLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warningLevelActionPerformed(evt);
            }
        });
        jPanel2.add(warningLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 300, 30));

        enter_btn.setBackground(new java.awt.Color(0, 0, 255));
        enter_btn.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        enter_btn.setText("Submit");
        enter_btn.setBorder(null);
        enter_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_btnActionPerformed(evt);
            }
        });
        jPanel2.add(enter_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 110, 50));

        jPanel3.setBackground(new java.awt.Color(204, 0, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemCategoryNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_itemCategoryNameFocusGained
        
        itemCategoryName.setText("");
        
    }//GEN-LAST:event_itemCategoryNameFocusGained

    private void itemCategoryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCategoryNameActionPerformed
      
    }//GEN-LAST:event_itemCategoryNameActionPerformed

    private void itemBatchIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_itemBatchIdFocusGained
         
         if(!isLoaded)
        itemBatchId.setText(null);
    }//GEN-LAST:event_itemBatchIdFocusGained

    private void itemBatchIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBatchIdActionPerformed
       
    }//GEN-LAST:event_itemBatchIdActionPerformed

    private void thogaPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_thogaPriceFocusGained
         thogaPrice.setText(null);
    }//GEN-LAST:event_thogaPriceFocusGained

    private void thogaPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thogaPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thogaPriceActionPerformed

    private void itemQuantityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_itemQuantityFocusGained
        itemQuantity.setText(null);
    }//GEN-LAST:event_itemQuantityFocusGained

    private void itemQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemQuantityActionPerformed

    private void enter_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter_btnActionPerformed
         try {
            String id = itemBatchId.getText();
            int item_id=Integer.parseInt(id);
            String category_name=itemCategoryName.getText();
            
            int category_id=category.getCategory(category_name).getC_id();
            
            double thoga_price=Double.parseDouble(thogaPrice.getText());
            double quantity=Integer.parseInt(itemQuantity.getText());
            double item_price=Double.parseDouble(itemPrice.getText());
            int batch_id=Integer.parseInt(itemId.getText());
            double taking_price=Double.parseDouble(warningLevel.getText());
            double our_price=Double.parseDouble(ourPrice.getText());
            String item_description=description.getText();
            int warning=Integer.parseInt(warningLevel.getText());
            boolean isAdded = controller.addItem(item_id,thoga_price,quantity,item_price,batch_id,taking_price,our_price,item_description,category_id,warning);
            if(isAdded)
            this.setVisible(false);
            else{
                JOptionPane.showMessageDialog(this,"Added Failed", "Something went wrong", JOptionPane.ERROR);
                itemCategoryName.setText("");
            }

        } catch (SQLException ex) {
            Logger.getLogger(AddSupplierForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_enter_btnActionPerformed

    private void itemPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_itemPriceFocusGained
       itemPrice.setText(null);
    }//GEN-LAST:event_itemPriceFocusGained

    private void itemPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemPriceActionPerformed

    private void itemIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_itemIdFocusGained
        itemId.setText(null);
    }//GEN-LAST:event_itemIdFocusGained

    private void itemIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemIdActionPerformed

    private void select_batchIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_batchIdActionPerformed
       this.dispose();
       new GetBatchDetails().setVisible(true);
    }//GEN-LAST:event_select_batchIdActionPerformed

    private void ourPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ourPriceFocusGained
        ourPrice.setText(null);
    }//GEN-LAST:event_ourPriceFocusGained

    private void ourPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ourPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ourPriceActionPerformed

    private void warningLevelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_warningLevelFocusGained
        warningLevel.setText(null);
    }//GEN-LAST:event_warningLevelFocusGained

    private void warningLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warningLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warningLevelActionPerformed

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
            java.util.logging.Logger.getLogger(AddItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddItemForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea description;
    private javax.swing.JButton enter_btn;
    private javax.swing.JTextField itemBatchId;
    private javax.swing.JTextField itemCategoryName;
    private javax.swing.JTextField itemId;
    private javax.swing.JTextField itemPrice;
    private javax.swing.JTextField itemQuantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ourPrice;
    private javax.swing.JButton select_batchId;
    private javax.swing.JSeparator sepFour1;
    private javax.swing.JSeparator sepFour2;
    private javax.swing.JSeparator sepFour3;
    private javax.swing.JSeparator sepFour4;
    private javax.swing.JSeparator sepFour5;
    private javax.swing.JSeparator sepFour6;
    private javax.swing.JSeparator sepFour7;
    private javax.swing.JSeparator sepFour8;
    private javax.swing.JTextField thogaPrice;
    private javax.swing.JTextField warningLevel;
    // End of variables declaration//GEN-END:variables
}
