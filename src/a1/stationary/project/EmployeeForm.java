package a1.stationary.project;

import static a1.stationary.project.Databaseconnection.rs;
import static a1.stationary.project.Databaseconnection.statement;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class EmployeeForm extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeForm
     */
    public EmployeeForm() {
        initComponents();
        Databaseconnection.getcon();
        //Databaseconnection.readRecords();
        Databaseconnection.readEmpRecords();
        int nextembid = getNextembID();
        // if (!nextmemberid.equals("")) {
        textEmpID.setText(String.valueOf(nextembid));
    }

    public static int getNextembID() {
        int curembid;
        try {
            rs.last();
            curembid = rs.getInt("empID");
            int intNextembId = curembid + 1;
            return intNextembId; //String.format("%01d", intNextembId);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            JOptionPane.showMessageDialog(null, "Error on last record",
                    "information", JOptionPane.INFORMATION_MESSAGE);
            return 1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textEmpID = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        textFirstName = new javax.swing.JTextField();
        textLastName = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        userID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox();
        userlevel = new javax.swing.JComboBox();
        save = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        butView = new javax.swing.JButton();
        butEidt = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        butDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("EMPLOYEE");

        jLabel2.setText("Emplouee ID");

        jLabel3.setText("Password");

        jLabel4.setText("Last Name");

        jLabel5.setText("DOB");

        jLabel6.setText("First Name");

        jLabel7.setText("Phone");

        jLabel8.setText("User ID");

        jLabel9.setText("Gender");

        jLabel10.setText("Address");

        textEmpID.setEnabled(false);

        jLabel11.setText("User level");

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "MALE", "FEMALE" }));

        userlevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select User Level", "MANAGER", "STAFF" }));

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");

        butView.setText("View");
        butView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butViewActionPerformed(evt);
            }
        });

        butEidt.setText("Eidt");
        butEidt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEidtActionPerformed(evt);
            }
        });

        butDelete.setText("Delete");
        butDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFirstName)
                            .addComponent(textLastName)
                            .addComponent(phone)
                            .addComponent(address)
                            .addComponent(userID)
                            .addComponent(Password)
                            .addComponent(gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userlevel, 0, 148, Short.MAX_VALUE)
                            .addComponent(textEmpID)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(butDelete)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(butView)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                        .addComponent(butEidt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ExitButton)))
                                .addContainerGap(23, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(textLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(phone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(userlevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(butView)
                    .addComponent(butEidt)
                    .addComponent(ExitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butDelete))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String gander = gender.getSelectedItem().toString().trim();
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

            rs.moveToInsertRow();
            rs.updateString(1, textEmpID.getText());
            rs.updateString(2, textFirstName.getText());
            rs.updateString(3, textLastName.getText());
            rs.updateString(4, format.format(jDateChooser1.getDate()));
            rs.updateString(6, address.getText());
            rs.updateString(5, phone.getText());
            rs.updateString(7, gender.getSelectedItem().toString());
            rs.updateString(8, userID.getText());
            rs.updateString(9, Password.getText());
            rs.updateString(10, userlevel.getSelectedItem().toString());
            rs.insertRow();
            rs.last();

            JOptionPane.showMessageDialog(null, "Record added successfully",
                    "information", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error on adding record" + ex,
                    "information", JOptionPane.INFORMATION_MESSAGE);
        }
        int nextmemberid = getNextembID();

        textEmpID.setText(String.valueOf(getNextembID()));

        textFirstName.setText(null);
        textLastName.setText(null);
        jDateChooser1.setDate(null);
        phone.setText(null);
        address.setText(null);
        gender.setSelectedIndex(0);
        userID.setText(null);
        userlevel.setSelectedIndex(0);
        Password.setText(null);


    }//GEN-LAST:event_saveActionPerformed

    private void butViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butViewActionPerformed
       save.setVisible(false);
        try {
            rs = statement.executeQuery("Select * From employee WHERE emplastname='" + textLastName.getText() + "'"
                    + "AND empname='" + textFirstName.getText() + "'");
            rs.first();

            textEmpID.setText(String.valueOf(rs.getInt(1)));
            jDateChooser1.setDate(rs.getDate(4));
            phone.setText(rs.getString(5));
            address.setText(rs.getString(6));
            gender.setSelectedItem(rs.getString(7));
            userID.setText(rs.getString(8));
            Password.setText(rs.getString(9));
            userlevel.setSelectedItem(rs.getString(10));
           

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }


    }//GEN-LAST:event_butViewActionPerformed

    private void butEidtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEidtActionPerformed
//       String gander = gender.getSelectedItem().toString().trim();
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            rs.updateString(1,textEmpID.getText());
            rs.updateString(2,textFirstName.getText());
            rs.updateString(3,textLastName.getText());
            rs.updateString(4,format.format(jDateChooser1.getDate()));
            rs.updateString(6,address.getText());
            rs.updateString(5,phone.getText());
            rs.updateString(7,gender.getSelectedItem().toString());
            rs.updateString(8,userID.getText());
            rs.updateString(9,Password.getText());
            rs.updateString(10,userlevel.getSelectedItem().toString());
            rs.updateRow();           
            JOptionPane.showMessageDialog(null, "Record Updated successfully",
                    "information", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error on updateing record" + ex,
                    "information", JOptionPane.INFORMATION_MESSAGE);
        }
        textEmpID.setText("");

        textFirstName.setText(null);
        textLastName.setText(null);
        jDateChooser1.setDate(null);
        phone.setText(null);
        address.setText(null);
        gender.setSelectedIndex(0);
        userID.setText(null);
        userlevel.setSelectedIndex(0);
        Password.setText(null);
    }//GEN-LAST:event_butEidtActionPerformed

    private void butDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeleteActionPerformed
try{
        rs.deleteRow();
           JOptionPane.showMessageDialog(null, "Record deleted successfully",
                         "information", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error on record deletion" + ex,
                         "information", JOptionPane.INFORMATION_MESSAGE);
        }  
textEmpID.setText("");

        textFirstName.setText(null);
        textLastName.setText(null);
        jDateChooser1.setDate(null);
        phone.setText(null);
        address.setText(null);
        gender.setSelectedIndex(0);
        userID.setText(null);
        userlevel.setSelectedIndex(0);
        Password.setText(null);
    }//GEN-LAST:event_butDeleteActionPerformed


    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField Password;
    private javax.swing.JTextField address;
    private javax.swing.JButton butDelete;
    private javax.swing.JButton butEidt;
    private javax.swing.JButton butView;
    private javax.swing.JComboBox gender;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField phone;
    private javax.swing.JButton save;
    private javax.swing.JTextField textEmpID;
    private javax.swing.JTextField textFirstName;
    private javax.swing.JTextField textLastName;
    private javax.swing.JTextField userID;
    private javax.swing.JComboBox userlevel;
    // End of variables declaration//GEN-END:variables
}
