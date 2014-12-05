/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static store.LOGIN.L;
import static store.STORE.S;
import static store.DELETE_ITEM.del_item;
import static store.add_item.add_item;
//import static store.ADD_CUSTOMER.add_customer;
import static store.DELETE_CUSTOMER.del_customer;
import static store.add_dealer.add_dealer;
import static store.DELETE_DEALER.del_dealer;
import static store.MODIFY_CUSTOMER.mod_customer;
import static store.MODIFY_CUSTOMER.getConnection;
import static store.MODIFY_DEALER.mod_dealer;
import static store.MODIFY_ITEM.mod_item;
import static store.SELL.sell;
import static store.purchase.pur;
//import static store.popup.pop;


/**
 *
 * @author mahe-msk
 */
public class popup extends javax.swing.JFrame {

    /**
     * Creates new form popup
     */
    public popup() {
        initComponents();
    }
    public static popup pop=new popup();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 200, 200, 200));
        setMaximizedBounds(new java.awt.Rectangle(250, 150, 500, 450));
        setPreferredSize(new java.awt.Dimension(400, 450));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CUSTOMER ID");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BALANCE");
        jLabel3.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TOTAL PAID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TOTAL BILL");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("!CONFIRM PAYMENT!");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("PAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Rs.");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Rs.");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("CONFIRM");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Rs.");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("TRANSACTION ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton1)
                            .addGap(39, 39, 39)
                            .addComponent(jButton2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(70, 70, 70)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)))
                                .addComponent(jButton3)
                                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addGap(16, 16, 16)
                .addComponent(jButton3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextField2.setVisible(true);
        jButton3.setVisible(true);
        jLabel3.setVisible(true);
        jLabel9.setVisible(true);
        jButton1.setEnabled(false);
        Double tb=Double.parseDouble(jTextField4.getText());
        Double tp=Double.parseDouble(jTextField5.getText());
        jTextField2.setText(Double.toString(-(tb-tp)));
        Double balance=Double.parseDouble(jTextField2.getText());
        
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed
    public static Connection getConnection() throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/store";
        String username = "root";
        String password = "root";

        Class.forName(driver);//used to load the JDBC driver class
        //causes the JDBC driver from some jdbc vendor to be loaded into the application
        Connection conn = DriverManager.getConnection(url, username, password);
        return conn;
    }
     
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        //quantity wala panga
        String driver = "com.mysql.jdbc.Driver",query,qty1="";
        sell.items.deleteCharAt(sell.items.length()-1);
        System.out.println(sell.items);
        String temp=sell.items.toString();
        String [] a=temp.split(",");
        int i=0;
        
        while(i<a.length)
        {
        Connection conn = null;
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;   
         String []z=a[i].split(" ");
         String itemid="\""+z[0]+"\"";
         double qty=Double.parseDouble(z[1]);
         System.out.println("itemid="+itemid+" "+"qty="+qty);
         try {
            Class.forName(driver);
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "root");
        } catch (Exception ex) {
            Logger.getLogger(MODIFY_DEALER.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(con.toString());
        query = "select qty from item where itemid=" +itemid+";";
        System.out.println(query);
        try {
            System.out.println(query);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            System.out.println(query);
            if (rs.next()) {
                qty1 = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        qty=Double.parseDouble(qty1)-qty;
            System.out.println(qty);
        query ="update item set qty="+qty+" where itemid="+itemid+";";
        System.out.println("Query :" + query);
        Statement st=null;
        try {
            st = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MODIFY_DEALER.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            int val = st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(MODIFY_DEALER.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("1 row affected");
       
         ++i;
        }   
         //changing customer details
         String customerid="\""+jTextField1.getText()+"\"";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = getConnection();
        } catch (Exception e) {
            System.out.println("Error in connection");
            e.printStackTrace();
        }

        System.out.println("conn=" + conn);

        // prepare query
        //String query = "select name,rollno from student where rollno LIKE " + 2;
        query = "select balance from customer where customerid =" +customerid+";";
            double balance1=0.0;
        try {
            // create a statement
            stmt = conn.createStatement();

            // execute query and return result as a ResultSet
            rs = stmt.executeQuery(query);

            // extract data from the ResultSet
        
            while (rs.next()) 
            {  
                balance1 = Double.parseDouble(rs.getString(1));   
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // release database resources
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        Double balance=Double.parseDouble(jTextField2.getText());
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MODIFY_DEALER.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con=null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "root");
        } catch (SQLException ex) {
            Logger.getLogger(MODIFY_DEALER.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(con.toString());
        customerid="\""+jTextField1.getText()+"\"";
        balance+=balance1;
        query ="update customer set balance="+balance+" where customerid="+customerid+";";
        System.out.println("Query :" + query);
        Statement st=null;
        try {
            st = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MODIFY_DEALER.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            int val = st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(MODIFY_DEALER.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("1 row affected");
       
        //execute transaction
        String t="\""+jTextField3.getText()+"\"";
        StringBuilder item=new StringBuilder("\"");
        item.append(sell.items);
        item.append("\"");
        System.out.println(item);
        Double tb=Double.parseDouble(jTextField4.getText());
        query="insert into transaction values("+t+","+customerid+","+item+","+tb+");";
         System.out.println("Query :" + query);
        try {
            st = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(popup.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            int val = st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(popup.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("1 row affected");
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(popup.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //dispose off 
        sell.cart=0.0;
         sell.jPanel1.setVisible(false);
        sell.jTextField1.setText("");
        sell.jTextField2.setText("");
        sell.jTextField3.setText("");
        sell.jTextField4.setText("");
        sell.jTextField6.setText("");
        
        sell.items=new StringBuilder("");
        //jPanel1.setVisible(false);
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jButton1.setEnabled(true);
        pop.dispose();
        S.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        sell.cart=0.0;
        sell.jPanel1.setVisible(false);
        sell.jTextField1.setText("");
        sell.jTextField2.setText("");
        sell.jTextField3.setText("");
        sell.jTextField4.setText("");
        sell.jTextField6.setText("");
        pop.dispose();
        S.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(popup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(popup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(popup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(popup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                pop.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    javax.swing.JTextField jTextField4;
    javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
