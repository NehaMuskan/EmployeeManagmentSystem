/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.project.demo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Update extends javax.swing.JFrame {
     ResultSet st=null;
    PreparedStatement ps=null;
    /**
     * Creates new form Update
     */
    public Update() {
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        c2 = new javax.swing.JComboBox<>();
        c1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 102, 0), new java.awt.Color(255, 153, 0)));

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Update Employee :");

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Employee ID:");

        t1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(102, 102, 102)));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("First Name:");

        t2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(102, 102, 102)));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Last Name:");

        t3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(102, 102, 102)));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Designation:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Department:");

        c2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 13)); // NOI18N
        c2.setForeground(new java.awt.Color(102, 102, 102));
        c2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Designation:" }));
        c2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));

        c1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 13)); // NOI18N
        c1.setForeground(new java.awt.Color(102, 102, 102));
        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department:", "Accounts", "Sales", "Manufacturing", "Packing", " ", " " }));
        c1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Contact no. :");

        t4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(102, 102, 102)));

        t5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(102, 102, 102)));

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Email ID:");

        t6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(102, 102, 102)));

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Address:");

        b1.setBackground(new java.awt.Color(204, 0, 0));
        b1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("UPDATE");
        b1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(0, 51, 153));
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("GO BACK");
        b2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(t4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(t2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(t1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c1, javax.swing.GroupLayout.Alignment.LEADING, 0, 226, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(70, 70, 70)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10)
                                        .addComponent(t6)
                                        .addComponent(t3)
                                        .addComponent(c2, 0, 212, Short.MAX_VALUE)))
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(t5))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(20, 20, 20)
                .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b2)
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 475, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
      ArrayList<String> a=new ArrayList<>();
      Iterator<String> i;
      if(c1.getSelectedItem().equals("Accounts")){
          a.add("Charted Accountant");
          a.add("Head Accountant");
          a.add("Senior Accountant");
          a.add("Junior Accountant");
          i=a.iterator();
          while(i.hasNext()){
          c2.addItem(i.next());
          }
      }
      else if(c1.getSelectedItem().equals("Manufacturing")){
      a.add("Head Officer");
       a.add("Checker");
        a.add("Supervisor");
         a.add("Helper");
         i=a.iterator();
          while(i.hasNext()){
          c2.addItem(i.next());
          }

      }
      else if(c1.getSelectedItem().equals("Packing")){
      a.add("Head Packing Officer");
       a.add("Assembler");
        a.add("Supervisor");
         a.add("Helper");
         i=a.iterator();
          while(i.hasNext()){
          c2.addItem(i.next());
          }

      }
      else if(c1.getSelectedItem().equals("Sales")){
      a.add("Head Sales Officer");
       a.add("Quality Man");
        a.add("Dispatcher");
         a.add("Helper");
         i=a.iterator();
          while(i.hasNext()){
          c2.addItem(i.next());
          }

      }   
    }//GEN-LAST:event_c1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
     String value1=t2.getText();
     String value2=t3.getText();
     String value3=t1.getText();
     String value4=t5.getText();
     String value6=t6.getText();
     String value8=t4.getText();
     String value9=c1.getSelectedItem().toString();
     String value10=c2.getSelectedItem().toString();
     int p=JOptionPane.showConfirmDialog(null, "Are you sure to update this record?", "Update Record", JOptionPane.YES_NO_OPTION);
        if(p==0){
            String sql="UPDATE `employee_list` SET `fname`='"+value1+"',`lname`='"+value2+"',`address`='"+value4+"',`email`='"+value6+"',`number`='"+value8+"',`Department`='"+value9+"',`Designation`='"+value10+"' WHERE `eid`='"+value3+"'";
            try {
               ps=Myconnection.getConnection().prepareStatement(sql);
               
               ps.execute();
                JOptionPane.showConfirmDialog(null,"Data is updated successfully");
                
            } catch (Exception ex) {
             JOptionPane.showConfirmDialog(null, ex);  
            }
        }  
        
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        Menu m=new Menu();
        m.setVisible(true);
        m.pack();
        m.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_b2ActionPerformed

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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables
}
