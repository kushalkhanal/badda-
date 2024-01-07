/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package salesberry;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import InventoryManagementSystem.DatabasePackage;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author amrit
 */
public class Unit extends javax.swing.JFrame {
    Connection con = DatabasePackage.getConnection();
    CallableStatement csmt = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    /**
     * Creates new form Homepage
     */
    public Unit() {
        initComponents();
       Toolkit toolkit=getToolkit();
Dimension size=toolkit.getScreenSize();
setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
tabl();
    }

    public void tabl(){
           try{ 
            String sql ="select * from unit";
            ps = con.prepareStatement(sql);
            rs=ps.executeQuery();
         custable.setModel(DbUtils.resultSetToTableModel(rs));//custable= name of the table
        }
    
     catch(Exception e){

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

        Body_Panel = new javax.swing.JPanel();
        SalesBerryText_Panel = new javax.swing.JPanel();
        SalesBerry_Logo_Text = new javax.swing.JLabel();
        home_button = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        custable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        UnitID = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        UnitAlias = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        UnitName = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        add_button = new javax.swing.JButton();
        clr_button = new javax.swing.JButton();
        dlt_button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        UnitRemarks = new javax.swing.JTextPane();
        MenuBar = new javax.swing.JMenuBar();
        SetupMenu = new javax.swing.JMenu();
        Category = new javax.swing.JMenuItem();
        Unit = new javax.swing.JMenuItem();
        Product = new javax.swing.JMenuItem();
        Customer = new javax.swing.JMenuItem();
        Supplier = new javax.swing.JMenuItem();
        TransactionMenu = new javax.swing.JMenu();
        PurchaseTransaction = new javax.swing.JMenuItem();
        SalesTransaction = new javax.swing.JMenuItem();
        ReportsMenu = new javax.swing.JMenu();
        PurchaseReport = new javax.swing.JMenuItem();
        SalesReport = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Body_Panel.setBackground(new java.awt.Color(211, 239, 236));
        Body_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        Body_Panel.setForeground(new java.awt.Color(0, 102, 102));

        SalesBerryText_Panel.setBackground(new java.awt.Color(211, 239, 236));

        SalesBerry_Logo_Text.setBackground(new java.awt.Color(0, 153, 153));
        SalesBerry_Logo_Text.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        SalesBerry_Logo_Text.setForeground(new java.awt.Color(0, 102, 102));
        SalesBerry_Logo_Text.setText("SalesBerry");

        javax.swing.GroupLayout SalesBerryText_PanelLayout = new javax.swing.GroupLayout(SalesBerryText_Panel);
        SalesBerryText_Panel.setLayout(SalesBerryText_PanelLayout);
        SalesBerryText_PanelLayout.setHorizontalGroup(
            SalesBerryText_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SalesBerryText_PanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(SalesBerry_Logo_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        SalesBerryText_PanelLayout.setVerticalGroup(
            SalesBerryText_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalesBerryText_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SalesBerry_Logo_Text)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        home_button.setBackground(new java.awt.Color(0, 102, 102));
        home_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        home_button.setForeground(new java.awt.Color(255, 255, 255));
        home_button.setText("HOME");
        home_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_buttonActionPerformed(evt);
            }
        });

        custable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Product Name", "Alias", "Remarks"
            }
        ));
        jScrollPane5.setViewportView(custable);

        jScrollPane2.setViewportView(UnitID);

        jLabel1.setText("Unit ID:");

        jLabel4.setText("Alias:");

        jLabel2.setText("Unit Name:");

        jScrollPane6.setViewportView(UnitAlias);

        jScrollPane3.setViewportView(UnitName);

        jPanel2.setBackground(new java.awt.Color(211, 239, 236));

        add_button.setBackground(new java.awt.Color(0, 102, 102));
        add_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add_button.setForeground(new java.awt.Color(255, 255, 255));
        add_button.setText("SUBMIT");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });

        clr_button.setBackground(new java.awt.Color(0, 102, 102));
        clr_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clr_button.setForeground(new java.awt.Color(255, 255, 255));
        clr_button.setText("CLEAR");
        clr_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr_buttonActionPerformed(evt);
            }
        });

        dlt_button.setBackground(new java.awt.Color(0, 102, 102));
        dlt_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dlt_button.setForeground(new java.awt.Color(255, 255, 255));
        dlt_button.setText("DELETE");
        dlt_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlt_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(add_button)
                .addGap(18, 18, 18)
                .addComponent(clr_button)
                .addGap(18, 18, 18)
                .addComponent(dlt_button)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_button)
                    .addComponent(clr_button)
                    .addComponent(dlt_button))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jLabel5.setText("Remarks:");

        jScrollPane7.setViewportView(UnitRemarks);

        javax.swing.GroupLayout Body_PanelLayout = new javax.swing.GroupLayout(Body_Panel);
        Body_Panel.setLayout(Body_PanelLayout);
        Body_PanelLayout.setHorizontalGroup(
            Body_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Body_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Body_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Body_PanelLayout.createSequentialGroup()
                        .addGroup(Body_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Body_PanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(home_button)
                                .addGroup(Body_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Body_PanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(Body_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addGap(18, 18, 18)
                                        .addGroup(Body_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane3)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36)
                                        .addGroup(Body_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(Body_PanelLayout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(Body_PanelLayout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(Body_PanelLayout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(SalesBerryText_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 105, Short.MAX_VALUE))
                            .addGroup(Body_PanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39))
                    .addGroup(Body_PanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        Body_PanelLayout.setVerticalGroup(
            Body_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Body_PanelLayout.createSequentialGroup()
                .addGroup(Body_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Body_PanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(home_button))
                    .addGroup(Body_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SalesBerryText_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Body_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Body_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MenuBar.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        SetupMenu.setBackground(new java.awt.Color(0, 51, 51));
        SetupMenu.setText("Setup");

        Category.setText("Category");
        Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryActionPerformed(evt);
            }
        });
        SetupMenu.add(Category);

        Unit.setText("Unit");
        Unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnitActionPerformed(evt);
            }
        });
        SetupMenu.add(Unit);

        Product.setText("Product");
        Product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductActionPerformed(evt);
            }
        });
        SetupMenu.add(Product);

        Customer.setText("Customer");
        Customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerActionPerformed(evt);
            }
        });
        SetupMenu.add(Customer);

        Supplier.setText("Supplier");
        Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierActionPerformed(evt);
            }
        });
        SetupMenu.add(Supplier);

        MenuBar.add(SetupMenu);

        TransactionMenu.setText("Transaction");

        PurchaseTransaction.setText("Purchase");
        PurchaseTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PurchaseTransactionActionPerformed(evt);
            }
        });
        TransactionMenu.add(PurchaseTransaction);

        SalesTransaction.setText("Sales");
        TransactionMenu.add(SalesTransaction);

        MenuBar.add(TransactionMenu);

        ReportsMenu.setText("Reports");

        PurchaseReport.setText("Purchase Report");
        PurchaseReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PurchaseReportActionPerformed(evt);
            }
        });
        ReportsMenu.add(PurchaseReport);

        SalesReport.setText("Sales Report");
        SalesReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalesReportActionPerformed(evt);
            }
        });
        ReportsMenu.add(SalesReport);

        MenuBar.add(ReportsMenu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Body_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Body_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PurchaseTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PurchaseTransactionActionPerformed
Unit as=new Unit();
as.setVisible(true);
this.dispose();
    }//GEN-LAST:event_PurchaseTransactionActionPerformed

    private void CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryActionPerformed
Category solld=new Category();
solld.setVisible(true);
this.dispose();
    }//GEN-LAST:event_CategoryActionPerformed

    private void SalesReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalesReportActionPerformed
SalesReports akq=new SalesReports();
akq.setVisible(true);
this.dispose();
    }//GEN-LAST:event_SalesReportActionPerformed

    private void PurchaseReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PurchaseReportActionPerformed
PurchaseReports ak=new PurchaseReports();
ak.setVisible(true);
this.dispose();
    }//GEN-LAST:event_PurchaseReportActionPerformed

    private void UnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnitActionPerformed
Unit asee=new Unit();
asee.setVisible(true);
this.dispose();
    }//GEN-LAST:event_UnitActionPerformed

    private void ProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductActionPerformed
Product fa=new Product();
fa.setVisible(true);
this.dispose();
    }//GEN-LAST:event_ProductActionPerformed

    private void CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerActionPerformed
Customer faa=new Customer();
faa.setVisible(true);
this.dispose();
    }//GEN-LAST:event_CustomerActionPerformed

    private void home_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_buttonActionPerformed
        Homepage ako=new Homepage();
        ako.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_home_buttonActionPerformed

    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
        try {
            String sql = "insert into unit"
            +"(UnitID, UnitAlias, UnitName, UnitRemarks)"
            +"values (?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, UnitID.getText());
            ps.setString(2, UnitAlias.getText());
            ps.setString(3, UnitName.getText());
            ps.setString(4, UnitRemarks.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Purchased Product Successfully Added!");

            //rs.close();
            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        new Product().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_add_buttonActionPerformed

    private void clr_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr_buttonActionPerformed

        UnitID.setText("");
        UnitAlias.setText("");
        UnitName.setText("");
        UnitRemarks.setText("");
    }//GEN-LAST:event_clr_buttonActionPerformed

    private void dlt_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlt_buttonActionPerformed
        //delete  option
        int row=custable.getSelectedRow();
        String ch= custable.getModel().getValueAt(row,0).toString();
        String sql = "DELETE FROM `product_purchase` WHERE P_ID ="+ch;
        try {
            ps=con.prepareStatement(sql);
            ps.execute();
            int response= JOptionPane.showConfirmDialog(this,"Do you want to delete ?","confirm",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            if(response==JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(this,"sucessfully delete");

            }
            tabl();
        } catch(Exception  e){
            JOptionPane.showMessageDialog(this,"unable to  delete");

        }
    }//GEN-LAST:event_dlt_buttonActionPerformed

    private void SupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierActionPerformed
Supplier faas=new Supplier();
faas.setVisible(true);
this.dispose();
    }//GEN-LAST:event_SupplierActionPerformed

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
            java.util.logging.Logger.getLogger(Unit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Unit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Unit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Unit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Unit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body_Panel;
    private javax.swing.JMenuItem Category;
    private javax.swing.JMenuItem Customer;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem Product;
    private javax.swing.JMenuItem PurchaseReport;
    private javax.swing.JMenuItem PurchaseTransaction;
    private javax.swing.JMenu ReportsMenu;
    private javax.swing.JPanel SalesBerryText_Panel;
    private javax.swing.JLabel SalesBerry_Logo_Text;
    private javax.swing.JMenuItem SalesReport;
    private javax.swing.JMenuItem SalesTransaction;
    private javax.swing.JMenu SetupMenu;
    private javax.swing.JMenuItem Supplier;
    private javax.swing.JMenu TransactionMenu;
    private javax.swing.JMenuItem Unit;
    private javax.swing.JTextPane UnitAlias;
    private javax.swing.JTextPane UnitID;
    private javax.swing.JTextPane UnitName;
    private javax.swing.JTextPane UnitRemarks;
    private javax.swing.JButton add_button;
    private javax.swing.JButton clr_button;
    private javax.swing.JTable custable;
    private javax.swing.JButton dlt_button;
    private javax.swing.JButton home_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    // End of variables declaration//GEN-END:variables
}
