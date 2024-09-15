/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalmanagementsyatem;

import java.awt.HeadlessException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author hp
 */
public class GeneralOpd extends javax.swing.JFrame {

    /**
     * Creates new form GeneralOpd
     */
    public GeneralOpd() {
        initComponents();
        
        getDateTime();
        
        getDoctorData();
    }
    
    
    public void getDateTime()
    {
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm:ss");
        
        LocalDateTime now = LocalDateTime.now();
        
        lbldatetimeprint.setText(dtf.format(now));
    }
    
    
    
    public void getDoctorData()
    {
        try
        {
             String query = "select * from doctor";
             
             DBConnect con  = new DBConnect();
             
             ResultSet rs = DBConnect.stmt.executeQuery(query);
             
             while(rs.next())
             {
                 cmbdoctortype.addItem(rs.getString("specialization"));
                
             }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrpGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblgender = new javax.swing.JLabel();
        txtpname = new javax.swing.JTextField();
        lblpatientname = new javax.swing.JLabel();
        txtmobileno = new javax.swing.JTextField();
        lblmobileno = new javax.swing.JLabel();
        rbtfemale = new javax.swing.JRadioButton();
        rbtmale = new javax.swing.JRadioButton();
        rbtother = new javax.swing.JRadioButton();
        lbldoctortype = new javax.swing.JLabel();
        lblcharge = new javax.swing.JLabel();
        lbldoctor = new javax.swing.JLabel();
        lbldoctorname = new javax.swing.JLabel();
        lbldoctorcharge = new javax.swing.JLabel();
        cmbdoctortype = new javax.swing.JComboBox<>();
        lbldatetime = new javax.swing.JLabel();
        lbldatetimeprint = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 173));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204), 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("General OPD");

        lblgender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblgender.setForeground(new java.awt.Color(255, 255, 204));
        lblgender.setText("Gender:");

        txtpname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtpname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpnameActionPerformed(evt);
            }
        });

        lblpatientname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblpatientname.setForeground(new java.awt.Color(255, 255, 204));
        lblpatientname.setText("Patient Name:");

        txtmobileno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        lblmobileno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblmobileno.setForeground(new java.awt.Color(255, 255, 204));
        lblmobileno.setText("Mobile No:");

        btngrpGender.add(rbtfemale);
        rbtfemale.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rbtfemale.setForeground(new java.awt.Color(255, 255, 204));
        rbtfemale.setText("Female");

        btngrpGender.add(rbtmale);
        rbtmale.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rbtmale.setForeground(new java.awt.Color(255, 255, 204));
        rbtmale.setText("Male");

        btngrpGender.add(rbtother);
        rbtother.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rbtother.setForeground(new java.awt.Color(255, 255, 204));
        rbtother.setText("Other");

        lbldoctortype.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbldoctortype.setForeground(new java.awt.Color(255, 255, 204));
        lbldoctortype.setText("Doctor Type:");

        lblcharge.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblcharge.setForeground(new java.awt.Color(255, 255, 204));
        lblcharge.setText("Charge:");

        lbldoctor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbldoctor.setForeground(new java.awt.Color(255, 255, 204));
        lbldoctor.setText("Doctor Name:");

        lbldoctorname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbldoctorname.setForeground(new java.awt.Color(255, 255, 204));

        lbldoctorcharge.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbldoctorcharge.setForeground(new java.awt.Color(255, 255, 204));

        cmbdoctortype.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbdoctortype.setForeground(new java.awt.Color(255, 255, 204));
        cmbdoctortype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        cmbdoctortype.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbdoctortypeItemStateChanged(evt);
            }
        });
        cmbdoctortype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbdoctortypeActionPerformed(evt);
            }
        });

        lbldatetime.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbldatetime.setForeground(new java.awt.Color(255, 255, 204));
        lbldatetime.setText("Date:");

        lbldatetimeprint.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbldatetimeprint.setForeground(new java.awt.Color(255, 255, 204));

        btnadd.setBackground(new java.awt.Color(0, 0, 0));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btncancel.setBackground(new java.awt.Color(0, 0, 0));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(0, 0, 0));
        btnback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblpatientname)
                                    .addComponent(lblgender)
                                    .addComponent(lblmobileno)
                                    .addComponent(lbldoctortype)
                                    .addComponent(lbldoctor)
                                    .addComponent(lblcharge)
                                    .addComponent(lbldatetime, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(110, 110, 110)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbtmale, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbtfemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbtother, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtpname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmobileno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbdoctortype, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbldoctorname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbldoctorcharge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbldatetimeprint, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpatientname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblgender, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtfemale)
                    .addComponent(rbtother)
                    .addComponent(rbtmale))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmobileno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmobileno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldoctortype, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbdoctortype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbldoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldoctorname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldoctorcharge, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcharge, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldatetimeprint, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldatetime, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btncancel)
                    .addComponent(btnback))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbdoctortypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbdoctortypeActionPerformed
      
        try
        {
            String doctype = cmbdoctortype.getSelectedItem().toString();
            
            String qry = "select * from doctor where specialization='"+doctype+"'";
            
            DBConnect Dbcon = new DBConnect();
            
            ResultSet rs = DBConnect.stmt.executeQuery(qry);
            
            if(rs.next())
            {
                lbldoctorcharge.setText(rs.getString(6));
                lbldoctorname.setText(rs.getString(2));
            }         
        }
        catch(ClassNotFoundException | SQLException e)
        {
            
        }
    }//GEN-LAST:event_cmbdoctortypeActionPerformed

    private void cmbdoctortypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbdoctortypeItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbdoctortypeItemStateChanged

    private void txtpnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpnameActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        
        String name = txtpname.getText();
        String gender = null;
        int status=0;
                
        
        if(rbtmale.isSelected()==true)
        {
            gender = "male";
            status=1;
        }
        else if(rbtfemale.isSelected()==true)
        {
            gender = "female";
            status=1;
        }
        else
        {
            gender = "other";
            status =1;
        }
        
        String mobile = txtmobileno.getText();
        String doctorType = cmbdoctortype.getSelectedItem().toString();
        String doctorname = lbldoctorname.getText();
        String doctorcharge = lbldoctorcharge.getText();
        String datetime = lbldatetimeprint.getText();
        
        if("".equals(txtpname.getText()) || "".equals(txtmobileno.getText()) || cmbdoctortype.getSelectedIndex()==-1 || status==0 || "".equals(lbldoctorname.getText()) || "".equals(lblcharge.getText()))        
        {
              JOptionPane.showMessageDialog(null, "Please Enter Values into Fields..!");
        }
        else
        {
            try
            {
                String qry = "insert into opd values('"+name+"','"+gender+"','"+mobile+"','"+doctorType+"','"+doctorname+"','"+doctorcharge+"','"+datetime+"')";
                
                DBConnect con = new DBConnect();
                
                int res = DBConnect.stmt.executeUpdate(qry);
               
                if(res>0)
                {
                     JOptionPane.showMessageDialog(null, "Patient Details Added Successfully.");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Something is Worng Record is not Added..!");
                }
            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {
                
            }
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
      
          txtpname.setText("");
          txtmobileno.setText("");
          btngrpGender.clearSelection();
          cmbdoctortype.setSelectedIndex(0);
          lbldoctorcharge.setText("");
          lbldoctorname.setText("");
        
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

   
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
            java.util.logging.Logger.getLogger(GeneralOpd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneralOpd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneralOpd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneralOpd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneralOpd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncancel;
    private javax.swing.ButtonGroup btngrpGender;
    private javax.swing.JComboBox<String> cmbdoctortype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblcharge;
    private javax.swing.JLabel lbldatetime;
    private javax.swing.JLabel lbldatetimeprint;
    private javax.swing.JLabel lbldoctor;
    private javax.swing.JLabel lbldoctorcharge;
    private javax.swing.JLabel lbldoctorname;
    private javax.swing.JLabel lbldoctortype;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lblmobileno;
    private javax.swing.JLabel lblpatientname;
    private javax.swing.JRadioButton rbtfemale;
    private javax.swing.JRadioButton rbtmale;
    private javax.swing.JRadioButton rbtother;
    private javax.swing.JTextField txtmobileno;
    private javax.swing.JTextField txtpname;
    // End of variables declaration//GEN-END:variables
}
