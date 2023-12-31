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
import java.awt.HeadlessException;
import java.sql.SQLException;
/**
 *
 * @author amrit
 */
public class Feedback extends javax.swing.JFrame {
    Connection con = DatabasePackage.getConnection();
    CallableStatement csmt = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    /**
     * Creates new form Homepage
     */
    public Feedback() {
        initComponents();
       Toolkit toolkit=getToolkit();
Dimension size=toolkit.getScreenSize();
setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
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
        Welcome_Text = new javax.swing.JLabel();
        SalesBerryText_Panel = new javax.swing.JPanel();
        SalesBerry_Logo_Text = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        name_txt = new javax.swing.JLabel();
        phone_txt = new javax.swing.JLabel();
        address_txt = new javax.swing.JLabel();
        feedback_txt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customer_email = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        feedback_name = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        customer_phone = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        feedback_comment = new javax.swing.JTextPane();
        home_button = new javax.swing.JButton();
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

        Welcome_Text.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Welcome_Text.setForeground(new java.awt.Color(0, 153, 153));
        Welcome_Text.setText("Please provide us feedback!");

        SalesBerryText_Panel.setBackground(new java.awt.Color(211, 239, 236));

        SalesBerry_Logo_Text.setBackground(new java.awt.Color(0, 153, 153));
        SalesBerry_Logo_Text.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        SalesBerry_Logo_Text.setForeground(new java.awt.Color(0, 102, 102));
        SalesBerry_Logo_Text.setText("SalesBerry");

        javax.swing.GroupLayout SalesBerryText_PanelLayout = new javax.swing.GroupLayout(SalesBerryText_Panel);
        SalesBerryText_Panel.setLayout(SalesBerryText_PanelLayout);
        SalesBerryText_PanelLayout.setHorizontalGroup(
            SalesBerryText_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalesBerryText_PanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(SalesBerry_Logo_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        SalesBerryText_PanelLayout.setVerticalGroup(
            SalesBerryText_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SalesBerryText_PanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(SalesBerry_Logo_Text)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(211, 239, 236));

        name_txt.setText("Name:");

        phone_txt.setText("Phone:");

        address_txt.setText("Email:");

        feedback_txt.setText("Comment:");

        jScrollPane1.setViewportView(customer_email);

        jScrollPane2.setViewportView(feedback_name);

        jScrollPane3.setViewportView(customer_phone);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(feedback_comment);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(235, 235, 235))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(feedback_txt)
                    .addComponent(address_txt)
                    .addComponent(phone_txt)
                    .addComponent(name_txt))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane4))
                .addGap(154, 154, 154))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(name_txt)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(address_txt)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(phone_txt)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(feedback_txt)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(11, Short.MAX_VALUE))
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

        javax.swing.GroupLayout Body_PanelLayout = new javax.swing.GroupLayout(Body_Panel);
        Body_Panel.setLayout(Body_PanelLayout);
        Body_PanelLayout.setHorizontalGroup(
            Body_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Body_PanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
            .addGroup(Body_PanelLayout.createSequentialGroup()
                .addGroup(Body_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Body_PanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(home_button)
                        .addGap(84, 84, 84)
                        .addComponent(SalesBerryText_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Body_PanelLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(Welcome_Text)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Body_PanelLayout.setVerticalGroup(
            Body_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Body_PanelLayout.createSequentialGroup()
                .addGroup(Body_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Body_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SalesBerryText_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Body_PanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(home_button)))
                .addGap(18, 18, 18)
                .addComponent(Welcome_Text)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
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
Purchase as=new Purchase();
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String sql = "insert into feedback"
            +"(feedback_name, feedback_address, feedback_phone , feedback_comment)"
            +"values (?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, feedback_name.getText());
            ps.setString(2, customer_email.getText());
            ps.setString(3, customer_phone.getText());
            ps.setString(4, feedback_comment.getText());
    ps.execute();
    JOptionPane.showMessageDialog(null, "Feedback Added");

            //rs.close();
            ps.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        new Feedback().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void home_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_buttonActionPerformed
Homepage ako=new Homepage();
ako.setVisible(true);
this.dispose();
    }//GEN-LAST:event_home_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feedback().setVisible(true);
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
    private javax.swing.JLabel Welcome_Text;
    private javax.swing.JLabel address_txt;
    private javax.swing.JTextPane customer_email;
    private javax.swing.JTextPane customer_phone;
    private javax.swing.JTextPane feedback_comment;
    private javax.swing.JTextPane feedback_name;
    private javax.swing.JLabel feedback_txt;
    private javax.swing.JButton home_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel name_txt;
    private javax.swing.JLabel phone_txt;
    // End of variables declaration//GEN-END:variables
}
