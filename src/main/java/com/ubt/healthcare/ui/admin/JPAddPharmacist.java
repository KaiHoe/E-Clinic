/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubt.healthcare.ui.admin;

import com.toedter.calendar.JDateChooser;
import com.ubt.healthcare.business.LoadTables;
import com.ubt.healthcare.dto.City;
import com.ubt.healthcare.dto.Country;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author F
 */
public class JPAddPharmacist extends javax.swing.JPanel {
    
    private String gender;
    private LoadTables loadTable;

    /**
     * Creates new form JPAddDoctor
     */
    public JPAddPharmacist() {
        initComponents();
        loadTable = new LoadTables();
        fillComboBoxBirthCity();
        fillComboBoxCountry();
        fillComboBoxCity();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlNameInformation = new javax.swing.JLabel();
        jlFirstName = new javax.swing.JLabel();
        jtfFirstName = new javax.swing.JTextField();
        jlMiddleName = new javax.swing.JLabel();
        jtfMiddleName = new javax.swing.JTextField();
        jlLastName = new javax.swing.JLabel();
        jtfLastName = new javax.swing.JTextField();
        jlPersonalInformation = new javax.swing.JLabel();
        jlPersonalId = new javax.swing.JLabel();
        jtfPersonalId = new javax.swing.JTextField();
        jlDateOfBirth = new javax.swing.JLabel();
        jlBirthPlace = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jlContactInformation = new javax.swing.JLabel();
        jlMobilePhone = new javax.swing.JLabel();
        jtfMobilePhone = new javax.swing.JTextField();
        jlEmail = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jlAddressInformation = new javax.swing.JLabel();
        jlAddress1 = new javax.swing.JLabel();
        jtfAddress1 = new javax.swing.JTextField();
        jlCity1 = new javax.swing.JLabel();
        jlPostCode1 = new javax.swing.JLabel();
        jtfPostCode1 = new javax.swing.JTextField();
        jlCountry = new javax.swing.JLabel();
        jlBack = new javax.swing.JLabel();
        jlRegister = new javax.swing.JLabel();
        jdchDateOfBirth = new com.toedter.calendar.JDateChooser();
        jcbBirthPlace = new javax.swing.JComboBox<>();
        jcbCity = new javax.swing.JComboBox<>();
        jcbCountry = new javax.swing.JComboBox<>();
        jpwPassword = new javax.swing.JPasswordField();
        jlPassword = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1800, 920));

        jlNameInformation.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jlNameInformation.setForeground(new java.awt.Color(102, 102, 255));
        jlNameInformation.setText("Name Information ");

        jlFirstName.setForeground(new java.awt.Color(0, 153, 204));
        jlFirstName.setText("   First name :");

        jtfFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFirstNameActionPerformed(evt);
            }
        });

        jlMiddleName.setForeground(new java.awt.Color(0, 153, 204));
        jlMiddleName.setText("Middle name :");

        jlLastName.setForeground(new java.awt.Color(0, 153, 204));
        jlLastName.setText("   Last Name :");

        jlPersonalInformation.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jlPersonalInformation.setForeground(new java.awt.Color(102, 102, 255));
        jlPersonalInformation.setText("Personal Information ");

        jlPersonalId.setForeground(new java.awt.Color(0, 153, 204));
        jlPersonalId.setText("Personal ID :");

        jtfPersonalId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPersonalIdActionPerformed(evt);
            }
        });

        jlDateOfBirth.setForeground(new java.awt.Color(0, 153, 204));
        jlDateOfBirth.setText("    Date of Birth :");

        jlBirthPlace.setForeground(new java.awt.Color(0, 153, 204));
        jlBirthPlace.setText("  Birth Place ");

        jLabel18.setDisplayedMnemonic('[');
        jLabel18.setPreferredSize(new java.awt.Dimension(237, 202));

        jlContactInformation.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jlContactInformation.setForeground(new java.awt.Color(102, 102, 255));
        jlContactInformation.setText("Contact Information");

        jlMobilePhone.setForeground(new java.awt.Color(0, 153, 204));
        jlMobilePhone.setText("Mobile Phone :");

        jlEmail.setForeground(new java.awt.Color(0, 153, 204));
        jlEmail.setText("E-mail :");

        jlAddressInformation.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jlAddressInformation.setForeground(new java.awt.Color(102, 102, 255));
        jlAddressInformation.setText("      Address Information ");

        jlAddress1.setForeground(new java.awt.Color(0, 153, 204));
        jlAddress1.setText("Address  :");

        jlCity1.setForeground(new java.awt.Color(0, 153, 204));
        jlCity1.setText("City :");

        jlPostCode1.setForeground(new java.awt.Color(0, 153, 204));
        jlPostCode1.setText("Post Code :");

        jlCountry.setForeground(new java.awt.Color(0, 153, 204));
        jlCountry.setText("   Country :");

        jlBack.setText("Back");

        jlRegister.setText("Register");

        jlPassword.setForeground(new java.awt.Color(0, 153, 204));
        jlPassword.setText("Password :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jlNameInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jlPersonalInformation))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlMiddleName, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlFirstName, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jlLastName)
                                    .addGap(2, 2, 2)))
                            .addComponent(jlPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpwPassword)
                            .addComponent(jtfFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jtfMiddleName, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jtfLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlAddressInformation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlContactInformation)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlMobilePhone)
                            .addComponent(jlEmail))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfEmail)
                            .addComponent(jtfMobilePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jlRegister)
                .addGap(134, 134, 134)
                .addComponent(jlBack)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jlPersonalId, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDateOfBirth, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlBirthPlace, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfPersonalId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jcbBirthPlace, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jdchDateOfBirth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCountry, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlAddress1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlPostCode1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlCity1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtfPostCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jcbCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlNameInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jpwPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlPersonalInformation))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlContactInformation)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMobilePhone)
                            .addComponent(jtfMobilePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlAddressInformation))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPersonalId, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPersonalId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAddress1)
                    .addComponent(jtfAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDateOfBirth)
                            .addComponent(jdchDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlBirthPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbBirthPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCountry)
                            .addComponent(jcbCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCity1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfPostCode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPostCode1))))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRegister)
                    .addComponent(jlBack))
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfFirstNameActionPerformed

    private void jtfPersonalIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPersonalIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPersonalIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JComboBox<String> jcbBirthPlace;
    private javax.swing.JComboBox<String> jcbCity;
    private javax.swing.JComboBox<String> jcbCountry;
    private com.toedter.calendar.JDateChooser jdchDateOfBirth;
    private javax.swing.JLabel jlAddress1;
    private javax.swing.JLabel jlAddressInformation;
    private javax.swing.JLabel jlBack;
    private javax.swing.JLabel jlBirthPlace;
    private javax.swing.JLabel jlCity1;
    private javax.swing.JLabel jlContactInformation;
    private javax.swing.JLabel jlCountry;
    private javax.swing.JLabel jlDateOfBirth;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlFirstName;
    private javax.swing.JLabel jlLastName;
    private javax.swing.JLabel jlMiddleName;
    private javax.swing.JLabel jlMobilePhone;
    private javax.swing.JLabel jlNameInformation;
    private javax.swing.JLabel jlPassword;
    private javax.swing.JLabel jlPersonalId;
    private javax.swing.JLabel jlPersonalInformation;
    private javax.swing.JLabel jlPostCode1;
    private javax.swing.JLabel jlRegister;
    private javax.swing.JPasswordField jpwPassword;
    private javax.swing.JTextField jtfAddress1;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfFirstName;
    private javax.swing.JTextField jtfLastName;
    private javax.swing.JTextField jtfMiddleName;
    private javax.swing.JTextField jtfMobilePhone;
    private javax.swing.JTextField jtfPersonalId;
    private javax.swing.JTextField jtfPostCode1;
    // End of variables declaration//GEN-END:variables
  
    public void addBackToAdminScreenMouseAdapter(MouseAdapter e) {
        jlBack.addMouseListener(e);
    }
    
     public void addRegisterDoctorMouseAdapter(MouseAdapter e) {
        jlRegister.addMouseListener(e);
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public JLabel getjLabel18() {
        return jLabel18;
    }

    public void setjLabel18(JLabel jLabel18) {
        this.jLabel18 = jLabel18;
    }

    public JComboBox<String> getJcbBirthPlace() {
        return jcbBirthPlace;
    }

    public void setJcbBirthPlace(JComboBox<String> jcbBirthPlace) {
        this.jcbBirthPlace = jcbBirthPlace;
    }

    public JComboBox<String> getJcbCity() {
        return jcbCity;
    }

    public void setJcbCity(JComboBox<String> jcbCity) {
        this.jcbCity = jcbCity;
    }

    public JComboBox<String> getJcbCountry() {
        return jcbCountry;
    }

    public void setJcbCountry(JComboBox<String> jcbCountry) {
        this.jcbCountry = jcbCountry;
    }

    public JDateChooser getJdchDateOfBirth() {
        return jdchDateOfBirth;
    }

    public void setJdchDateOfBirth(JDateChooser jdchDateOfBirth) {
        this.jdchDateOfBirth = jdchDateOfBirth;
    }

    public JLabel getJlAddress1() {
        return jlAddress1;
    }

    public void setJlAddress1(JLabel jlAddress1) {
        this.jlAddress1 = jlAddress1;
    }

    public JLabel getJlAddressInformation() {
        return jlAddressInformation;
    }

    public void setJlAddressInformation(JLabel jlAddressInformation) {
        this.jlAddressInformation = jlAddressInformation;
    }

    public JLabel getJlBack() {
        return jlBack;
    }

    public void setJlBack(JLabel jlBack) {
        this.jlBack = jlBack;
    }

    public JLabel getJlBirthPlace() {
        return jlBirthPlace;
    }

    public void setJlBirthPlace(JLabel jlBirthPlace) {
        this.jlBirthPlace = jlBirthPlace;
    }

    public JLabel getJlCity1() {
        return jlCity1;
    }

    public void setJlCity1(JLabel jlCity1) {
        this.jlCity1 = jlCity1;
    }

    public JLabel getJlContactInformation() {
        return jlContactInformation;
    }

    public void setJlContactInformation(JLabel jlContactInformation) {
        this.jlContactInformation = jlContactInformation;
    }

    public JLabel getJlCountry() {
        return jlCountry;
    }

    public void setJlCountry(JLabel jlCountry) {
        this.jlCountry = jlCountry;
    }

    public JLabel getJlDateOfBirth() {
        return jlDateOfBirth;
    }

    public void setJlDateOfBirth(JLabel jlDateOfBirth) {
        this.jlDateOfBirth = jlDateOfBirth;
    }

    public JLabel getJlEmail() {
        return jlEmail;
    }

    public void setJlEmail(JLabel jlEmail) {
        this.jlEmail = jlEmail;
    }

    public JLabel getJlFirstName() {
        return jlFirstName;
    }

    public void setJlFirstName(JLabel jlFirstName) {
        this.jlFirstName = jlFirstName;
    }

    public JLabel getJlLastName() {
        return jlLastName;
    }

    public void setJlLastName(JLabel jlLastName) {
        this.jlLastName = jlLastName;
    }

    public JLabel getJlMiddleName() {
        return jlMiddleName;
    }

    public void setJlMiddleName(JLabel jlMiddleName) {
        this.jlMiddleName = jlMiddleName;
    }

    public JLabel getJlMobilePhone() {
        return jlMobilePhone;
    }

    public void setJlMobilePhone(JLabel jlMobilePhone) {
        this.jlMobilePhone = jlMobilePhone;
    }

    public JLabel getJlNameInformation() {
        return jlNameInformation;
    }

    public void setJlNameInformation(JLabel jlNameInformation) {
        this.jlNameInformation = jlNameInformation;
    }

    public JLabel getJlPersonalId() {
        return jlPersonalId;
    }

    public void setJlPersonalId(JLabel jlPersonalId) {
        this.jlPersonalId = jlPersonalId;
    }

    public JLabel getJlPersonalInformation() {
        return jlPersonalInformation;
    }

    public void setJlPersonalInformation(JLabel jlPersonalInformation) {
        this.jlPersonalInformation = jlPersonalInformation;
    }

    public JLabel getJlPostCode1() {
        return jlPostCode1;
    }

    public void setJlPostCode1(JLabel jlPostCode1) {
        this.jlPostCode1 = jlPostCode1;
    }

    public JLabel getJlRegister() {
        return jlRegister;
    }

    public void setJlRegister(JLabel jlRegister) {
        this.jlRegister = jlRegister;
    }

    public JTextField getJtfAddress1() {
        return jtfAddress1;
    }

    public void setJtfAddress1(JTextField jtfAddress1) {
        this.jtfAddress1 = jtfAddress1;
    }

    public JTextField getJtfEmail() {
        return jtfEmail;
    }

    public void setJtfEmail(JTextField jtfEmail) {
        this.jtfEmail = jtfEmail;
    }

    public JTextField getJtfFirstName() {
        return jtfFirstName;
    }

    public void setJtfFirstName(JTextField jtfFirstName) {
        this.jtfFirstName = jtfFirstName;
    }

    public JTextField getJtfLastName() {
        return jtfLastName;
    }

    public void setJtfLastName(JTextField jtfLastName) {
        this.jtfLastName = jtfLastName;
    }

    public JTextField getJtfMiddleName() {
        return jtfMiddleName;
    }

    public void setJtfMiddleName(JTextField jtfMiddleName) {
        this.jtfMiddleName = jtfMiddleName;
    }

    public JTextField getJtfMobilePhone() {
        return jtfMobilePhone;
    }

    public void setJtfMobilePhone(JTextField jtfMobilePhone) {
        this.jtfMobilePhone = jtfMobilePhone;
    }

    public JTextField getJtfPersonalId() {
        return jtfPersonalId;
    }

    public void setJtfPersonalId(JTextField jtfPersonalId) {
        this.jtfPersonalId = jtfPersonalId;
    }

    public JTextField getJtfPostCode1() {
        return jtfPostCode1;
    }

    public void setJtfPostCode1(JTextField jtfPostCode1) {
        this.jtfPostCode1 = jtfPostCode1;
    }

    public String getGenderValue() {
        return gender;
    }

    public JPasswordField getJpwPassword() {
        return jpwPassword;
    }

    public void fillComboBoxBirthCity()
    {
        List <Object> obj = loadTable.fillComboBoxBirthCity();
        for(Object o : obj)
        {
            jcbBirthPlace.addItem(((City)o).getCityName());
        }
    }
    
    public void fillComboBoxCountry()
    {
        List <Object> obj = loadTable.fillComboBoxCountry();
        for(Object o : obj)
        {
            jcbCountry.addItem(((Country)o).getCountryName());
        }
    }
    
    public void fillComboBoxCity()
    {
        List <Object> obj = loadTable.fillComboBoxBirthCity();
        for(Object o : obj)
        {
            jcbCity.addItem(((City)o).getCityName());
        }
    }
}
