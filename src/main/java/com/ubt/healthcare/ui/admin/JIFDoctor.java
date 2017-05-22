/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubt.healthcare.ui.admin;

import com.ubt.healthcare.business.AddressService;
import com.ubt.healthcare.business.CityService;
import com.ubt.healthcare.business.ContactService;
import com.ubt.healthcare.business.CountryService;
import com.ubt.healthcare.business.DoctorService;
import com.ubt.healthcare.business.EducationProgramService;
import com.ubt.healthcare.business.EducationService;
import com.ubt.healthcare.business.EducationTypeService;
import com.ubt.healthcare.business.GenderService;
import com.ubt.healthcare.ui.util.InputValidation;
import com.ubt.healthcare.business.LoginGroupService;
import com.ubt.healthcare.business.MartialStatusService;
import com.ubt.healthcare.business.PasswordHashing;
import com.ubt.healthcare.business.PersonEducationService;
import com.ubt.healthcare.business.PersonService;
import com.ubt.healthcare.business.ReligionService;
import com.ubt.healthcare.business.UserGroupService;
import com.ubt.healthcare.dto.Address;
import com.ubt.healthcare.dto.City;
import com.ubt.healthcare.dto.Contact;
import com.ubt.healthcare.dto.Country;
import com.ubt.healthcare.dto.Doctor;
import com.ubt.healthcare.dto.Education;
import com.ubt.healthcare.dto.EducationProgram;
import com.ubt.healthcare.dto.EducationType;
import com.ubt.healthcare.dto.Gender;
import com.ubt.healthcare.dto.MartialStatus;
import com.ubt.healthcare.dto.Person;
import com.ubt.healthcare.dto.PersonEducation;
import com.ubt.healthcare.dto.Religion;
import com.ubt.healthcare.dto.UserGroup;
import com.ubt.healthcare.ui.JIFAddCity;
import com.ubt.healthcare.ui.JIFAddCountry;
import com.ubt.healthcare.ui.admin.model.DoctorTableModelEducation;
import java.awt.event.MouseAdapter;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author F
 */
public class JIFDoctor extends javax.swing.JInternalFrame {

    private DoctorTableModelEducation doctorTableModelEducation;
    private List<PersonEducation> doctorEducation;
    private DoctorService doctorService;
    private ContactService contactService;
    private EducationTypeService educationTypeService;
    private EducationProgramService educationProgramService;
    private EducationService educationService;
    private PersonEducationService personEducationService;
    private GenderService genderService;
    private MartialStatusService martialStatusService;
    private CityService cityService;
    private CountryService countryService;
    private ReligionService religionService;
    private AddressService addressService;
    private PersonService personService;
    private UserGroupService userGroupService;
    private LoginGroupService loginGroupService;
    private Doctor doctor;
    private JIFSearchDoctor jifViewDoctor;
    private JIFEditDoctor jifEditDoctor;
    private JIFAddDoctor jifAddDoctor;
    private PasswordHashing passwordHashing;
    private InputValidation inputValidation;
    private JIFAddCity jifAddCity;
    private JIFAddCountry jifAddCountry;

    /**
     * Creates new form JIFDoctor
     *
     * @param jifViewDoctor
     * @param jifAddDoctor
     * @param jifEditDoctor
     * @param jifAddCity
     * @param jifAddCountry
     */
    public JIFDoctor(JIFSearchDoctor jifViewDoctor, JIFAddDoctor jifAddDoctor, JIFEditDoctor jifEditDoctor, JIFAddCity jifAddCity, JIFAddCountry jifAddCountry) {

        initComponents();
        doctorTableModelEducation = new DoctorTableModelEducation();
        doctorService = new DoctorService();
        contactService = new ContactService();
        educationTypeService = new EducationTypeService();
        educationProgramService = new EducationProgramService();
        personEducationService = new PersonEducationService();
        educationService = new EducationService();
        religionService = new ReligionService();
        genderService = new GenderService();
        martialStatusService = new MartialStatusService();
        cityService = new CityService();
        countryService = new CountryService();
        addressService = new AddressService();
        personService = new PersonService();
        userGroupService = new UserGroupService();
        loginGroupService = new LoginGroupService();
        passwordHashing = new PasswordHashing();
        inputValidation = new InputValidation();
        this.jifViewDoctor = jifViewDoctor;
        this.jifAddDoctor = jifAddDoctor;
        this.jifEditDoctor = jifEditDoctor;
        this.jifAddCity = jifAddCity;
        this.jifAddCountry = jifAddCountry;
        this.setEditableJTextFields(false);
        jspPersonalInformation.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jspPersonalInformation.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jspEducationDetails.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jspEducationDetails.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpDoctorDetails = new javax.swing.JTabbedPane();
        jspPersonalInformation = new javax.swing.JScrollPane();
        jpPersonalInformation = new javax.swing.JPanel();
        jlFirstName = new javax.swing.JLabel();
        jtfFirstName = new javax.swing.JTextField();
        jlMiddleName = new javax.swing.JLabel();
        jtfMiddleName = new javax.swing.JTextField();
        jlLastName = new javax.swing.JLabel();
        jtfLastName = new javax.swing.JTextField();
        jlPersonalId = new javax.swing.JLabel();
        jtfPersonalId = new javax.swing.JTextField();
        jlBirthPlace = new javax.swing.JLabel();
        jtfBirthCity = new javax.swing.JTextField();
        jlSex = new javax.swing.JLabel();
        jtfGender = new javax.swing.JTextField();
        jlMaritalStatus = new javax.swing.JLabel();
        jtfMaritalStatus = new javax.swing.JTextField();
        jlAddress1 = new javax.swing.JLabel();
        jtfAddress = new javax.swing.JTextField();
        jlCity = new javax.swing.JLabel();
        jtfCity = new javax.swing.JTextField();
        jlCountry = new javax.swing.JLabel();
        jtfCountry = new javax.swing.JTextField();
        jlHomePhone = new javax.swing.JLabel();
        jtfHomePhone = new javax.swing.JTextField();
        jlWorkPhone = new javax.swing.JLabel();
        jtfWorkPhone = new javax.swing.JTextField();
        jlMobilePhone = new javax.swing.JLabel();
        jtfMobilePhone = new javax.swing.JTextField();
        jlEmail = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jspEducationDetails = new javax.swing.JScrollPane();
        jtEducationDetails = new javax.swing.JTable();
        jbEdit = new javax.swing.JButton();
        jbSearchDoctor = new javax.swing.JButton();
        jbAddNewDoctor = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Doctor Screen");
        setToolTipText("");
        setName(""); // NOI18N
        setVisible(true);

        jlFirstName.setForeground(new java.awt.Color(0, 153, 204));
        jlFirstName.setText("First name :");

        jtfFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFirstNameActionPerformed(evt);
            }
        });

        jlMiddleName.setForeground(new java.awt.Color(0, 153, 204));
        jlMiddleName.setText("Middle name :");

        jlLastName.setForeground(new java.awt.Color(0, 153, 204));
        jlLastName.setText("Last Name :");

        jlPersonalId.setForeground(new java.awt.Color(0, 153, 204));
        jlPersonalId.setText("Personal ID :");

        jtfPersonalId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPersonalIdActionPerformed(evt);
            }
        });

        jlBirthPlace.setForeground(new java.awt.Color(0, 153, 204));
        jlBirthPlace.setText("Birth City :");

        jlSex.setForeground(new java.awt.Color(0, 153, 204));
        jlSex.setText("Sex :");

        jlMaritalStatus.setForeground(new java.awt.Color(0, 153, 204));
        jlMaritalStatus.setText("Marital Status :");

        jlAddress1.setForeground(new java.awt.Color(0, 153, 204));
        jlAddress1.setText("Address :");

        jlCity.setForeground(new java.awt.Color(0, 153, 204));
        jlCity.setText("City :");

        jlCountry.setForeground(new java.awt.Color(0, 153, 204));
        jlCountry.setText("   Country :");

        jtfCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCountryActionPerformed(evt);
            }
        });

        jlHomePhone.setForeground(new java.awt.Color(0, 153, 204));
        jlHomePhone.setText("Home Phone :");

        jlWorkPhone.setForeground(new java.awt.Color(0, 153, 204));
        jlWorkPhone.setText(" Work Phone :");

        jlMobilePhone.setForeground(new java.awt.Color(0, 153, 204));
        jlMobilePhone.setText("Mobile Phone :");

        jlEmail.setForeground(new java.awt.Color(0, 153, 204));
        jlEmail.setText(" E-mail :");

        javax.swing.GroupLayout jpPersonalInformationLayout = new javax.swing.GroupLayout(jpPersonalInformation);
        jpPersonalInformation.setLayout(jpPersonalInformationLayout);
        jpPersonalInformationLayout.setHorizontalGroup(
            jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPersonalInformationLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPersonalInformationLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlSex)
                            .addComponent(jlBirthPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jlMiddleName)
                        .addComponent(jlFirstName)
                        .addGroup(jpPersonalInformationLayout.createSequentialGroup()
                            .addComponent(jlLastName)
                            .addGap(2, 2, 2))
                        .addComponent(jlPersonalId, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfFirstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(jtfMiddleName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(jtfLastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(jtfPersonalId)
                    .addComponent(jtfBirthCity)
                    .addComponent(jtfGender)
                    .addComponent(jtfMaritalStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPersonalInformationLayout.createSequentialGroup()
                        .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPersonalInformationLayout.createSequentialGroup()
                                .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlHomePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlWorkPhone))
                                .addGap(18, 18, 18)
                                .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfWorkPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfHomePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfCity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPersonalInformationLayout.createSequentialGroup()
                                .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlMobilePhone)
                                    .addComponent(jlEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfEmail)
                                    .addComponent(jtfMobilePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPersonalInformationLayout.createSequentialGroup()
                        .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlAddress1)
                            .addComponent(jlCountry)
                            .addComponent(jlCity, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(349, 349, 349))))
        );
        jpPersonalInformationLayout.setVerticalGroup(
            jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPersonalInformationLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPersonalId, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPersonalId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAddress1))
                .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPersonalInformationLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpPersonalInformationLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCity, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCountry))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPersonalInformationLayout.createSequentialGroup()
                        .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlBirthPlace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfBirthCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlSex, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMaritalStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(91, 91, 91))
                    .addGroup(jpPersonalInformationLayout.createSequentialGroup()
                        .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlHomePhone)
                            .addComponent(jtfHomePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlWorkPhone)
                            .addComponent(jtfWorkPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfMobilePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMobilePhone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jspPersonalInformation.setViewportView(jpPersonalInformation);

        jtpDoctorDetails.addTab("Personal Information", jspPersonalInformation);

        jtEducationDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jspEducationDetails.setViewportView(jtEducationDetails);

        jtpDoctorDetails.addTab("Education Details", jspEducationDetails);

        jbEdit.setText("Edit");
        jbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditActionPerformed(evt);
            }
        });

        jbSearchDoctor.setText("Search");

        jbAddNewDoctor.setText("Add New");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jbSearchDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(94, 94, 94)
                        .addComponent(jbEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(94, 94, 94)
                        .addComponent(jbAddNewDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jtpDoctorDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAddNewDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSearchDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(175, 175, 175)
                .addComponent(jtpDoctorDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEditActionPerformed

    private void jtfFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfFirstNameActionPerformed

    private void jtfPersonalIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPersonalIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPersonalIdActionPerformed

    private void jtfCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCountryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAddNewDoctor;
    private javax.swing.JButton jbEdit;
    private javax.swing.JButton jbSearchDoctor;
    private javax.swing.JLabel jlAddress1;
    private javax.swing.JLabel jlBirthPlace;
    private javax.swing.JLabel jlCity;
    private javax.swing.JLabel jlCountry;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlFirstName;
    private javax.swing.JLabel jlHomePhone;
    private javax.swing.JLabel jlLastName;
    private javax.swing.JLabel jlMaritalStatus;
    private javax.swing.JLabel jlMiddleName;
    private javax.swing.JLabel jlMobilePhone;
    private javax.swing.JLabel jlPersonalId;
    private javax.swing.JLabel jlSex;
    private javax.swing.JLabel jlWorkPhone;
    private javax.swing.JPanel jpPersonalInformation;
    private javax.swing.JScrollPane jspEducationDetails;
    private javax.swing.JScrollPane jspPersonalInformation;
    private javax.swing.JTable jtEducationDetails;
    private javax.swing.JTextField jtfAddress;
    private javax.swing.JTextField jtfBirthCity;
    private javax.swing.JTextField jtfCity;
    private javax.swing.JTextField jtfCountry;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfFirstName;
    private javax.swing.JTextField jtfGender;
    private javax.swing.JTextField jtfHomePhone;
    private javax.swing.JTextField jtfLastName;
    private javax.swing.JTextField jtfMaritalStatus;
    private javax.swing.JTextField jtfMiddleName;
    private javax.swing.JTextField jtfMobilePhone;
    private javax.swing.JTextField jtfPersonalId;
    private javax.swing.JTextField jtfWorkPhone;
    private javax.swing.JTabbedPane jtpDoctorDetails;
    // End of variables declaration//GEN-END:variables

    public void loadEducationTable() {
        doctorEducation = personEducationService.findEducation(doctor);
        doctorTableModelEducation.add(doctorEducation);
        jtEducationDetails.setModel(doctorTableModelEducation);
        doctorTableModelEducation.fireTableDataChanged();
        // selectedIndexChange Method...
    }

    public void addSearchDoctorInternalFrameMouseAdapter(MouseAdapter e) {
        jbSearchDoctor.addMouseListener(e);
    }

    public void addOpenAddDoctorInternalFrameMouseAdapter(MouseAdapter e) {
        jbAddNewDoctor.addMouseListener(e);
    }

    public DoctorService getDoctorService() {
        return doctorService;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public JTextField getJtfAddress1() {
        return jtfAddress;
    }

    public JTextField getJtfCity1() {
        return jtfCity;
    }

    public JTextField getJtfCountry() {
        return jtfCountry;
    }

    public JTextField getJtfEmail() {
        return jtfEmail;
    }

    public JTextField getJtfFirstName() {
        return jtfFirstName;
    }

    public JTextField getJtfGender() {
        return jtfGender;
    }

    public JTextField getJtfHomePhone() {
        return jtfHomePhone;
    }

    public JTextField getJtfLastName() {
        return jtfLastName;
    }

    public JTextField getJtfMaritalStatus() {
        return jtfMaritalStatus;
    }

    public JTextField getJtfMiddleName() {
        return jtfMiddleName;
    }

    public JTextField getJtfMobilePhone() {
        return jtfMobilePhone;
    }

    public JTextField getJtfPersonalId() {
        return jtfPersonalId;
    }

    public JTextField getJtfPlace() {
        return jtfBirthCity;
    }

    public JTextField getJtfWorkPhone() {
        return jtfWorkPhone;
    }

    public void viewSelectedDoctor() {

        int row = jifViewDoctor.getJtDoctorTable().getSelectedRow();// do not allow multiple row selection
        if (row > -1) {

            // get selected doctor
            doctor = jifViewDoctor.getDoctorTableModelViewDoctor().getDoctor(row);

            //update the JIFDoctor fields with doctors object
            updateDoctorFields(doctor);
            loadEducationTable();

            //clear the fields of JIFSearchDoctor
            jifViewDoctor.getJtfSearchByName().setText("");
            jifViewDoctor.getJtfSearchBySurName().setText("");

            // check if no item found...
            jifViewDoctor.getDoctorTableModelViewDoctor().removeAll();

        } else// if no row selected display message that no row is selected 
        {
            JOptionPane.showMessageDialog(rootPane, "No Doctor Selected");
            //clear the fields of JIFSearchDoctor
            jifViewDoctor.getJtfSearchByName().setText("");
            jifViewDoctor.getJtfSearchBySurName().setText("");

            // check if no item found...
            if (jifViewDoctor.getDoctorList() != null) {
                jifViewDoctor.getDoctorTableModelViewDoctor().removeAll();
            }
            clearViewDoctorFields();
            if (doctorEducation != null && doctorEducation.size() > 0) {
                doctorTableModelEducation.removeAll();
            }
        }
        if (jifViewDoctor.getJtDoctorTable() != null) {
            jifViewDoctor.getJtDoctorTable().clearSelection();
        }
        // close the JIFSearchDoctor
        jifViewDoctor.dispose();
        this.show();

    }

    public JIFSearchDoctor getJifViewDoctor() {
        return jifViewDoctor;
    }

    public JIFAddDoctor getJifAddDoctor() {
        return jifAddDoctor;
    }

    private void updateDoctorFields(Doctor doctor) {
        jtfPersonalId.setText(doctor.getPersonId().getPersonId().toString());
        jtfFirstName.setText(doctor.getPersonId().getFirstName());
        jtfLastName.setText(doctor.getPersonId().getLastName());
        jtfMiddleName.setText(doctor.getPersonId().getMiddleName());
        jtfBirthCity.setText(doctor.getPersonId().getBirthCityId().getCityName());
        jtfGender.setText(doctor.getPersonId().getGenderId().getGenderName());
        jtfMaritalStatus.setText(doctor.getPersonId().getMartialStatusId().getMartialStatusName());
        jtfAddress.setText(doctor.getPersonId().getAddressId().getStreetName());
        jtfCity.setText(doctor.getPersonId().getAddressId().getCityId().getCityName());
        jtfCountry.setText(doctor.getPersonId().getAddressId().getCityId().getCountryId().getCountryName());
        Collection<Contact> contactCollection = doctor.getPersonId().getContactCollection();
        if (contactCollection != null && contactCollection.size() > 0) {
            for (Contact contact : contactCollection) {

                switch (contact.getType().trim()) {
                    case "HOME":
                        jtfHomePhone.setText(contact.getValue());
                        break;
                    case "WORK":
                        jtfWorkPhone.setText(contact.getValue());
                        break;
                    case "MOB":
                        jtfMobilePhone.setText(contact.getValue());
                        break;
                    case "EMAIL":
                        jtfEmail.setText(contact.getValue());
                        break;
                    default:
                        break;
                }

            }
        } else {
            jtfHomePhone.setText("");
            jtfWorkPhone.setText("");
            jtfMobilePhone.setText("");
            jtfEmail.setText("");

        }

    }

    public void saveDoctorInternalFrameAddDoctor() {
        //jifAddDoctor.getT
        // check if all mandatory fields are not empty
        // if so warn the user don't let move to next step
        //if user has typed just education and no personal infromation don't let move on next step

        //save doctor on database using doctor service
        String personId = jifAddDoctor.getJtfPersonalId().getText();
        String firstName = jifAddDoctor.getJtfFirstName().getText();
        String middleName = jifAddDoctor.getJtfMiddleName().getText();
        String lastName = jifAddDoctor.getJtfLastName().getText();
        String sex = jifAddDoctor.getJcbGender().getSelectedItem().toString();
        String martialStatus = jifAddDoctor.getJcbMaritalStatus().getSelectedItem().toString();
        String password = new String(jifAddDoctor.getJpfPassword().getPassword());
        Date dateOfBirth = jifAddDoctor.getJdchDateOfBirth().getDate();
        String birthPlace = jifAddDoctor.getJcbBirthPlace().getSelectedItem().toString();
        String address = jifAddDoctor.getJtfAddress().getText();
        String city = jifAddDoctor.getJcbCity().getSelectedItem().toString();
        String country = jifAddDoctor.getJcbCountry().getSelectedItem().toString();
        String buildingNumber = jifAddDoctor.getJtfBuildingNumber().getText();
        String mobilePhone = jifAddDoctor.getJtfMobilePhone().getText();
        String workPhone = jifAddDoctor.getJtfWorkPhone().getText();
        String homePhone = jifAddDoctor.getJtfHomePhone().getText();
        String email = jifAddDoctor.getJtfEmail().getText();
        String religion = jifAddDoctor.getJcbReligion().getSelectedItem().toString();

        //validate all inputs which are not taken from combobox...
        if (!("Valid".equals(inputValidation.validatePersonID(personId)))) {
            JOptionPane.showMessageDialog(rootPane, inputValidation.validatePersonID(personId));
        } else if (!("Valid".equals(inputValidation.validatePersonFirstName(firstName)))) {
            JOptionPane.showMessageDialog(rootPane, inputValidation.validatePersonFirstName(firstName));
        } else if (!("Valid".equals(inputValidation.validatePersonLastName(lastName)))) {
            JOptionPane.showMessageDialog(rootPane, inputValidation.validatePersonLastName(lastName));
        } else if (!("Valid".equals(inputValidation.validatePersonDateOfBirth(dateOfBirth)))) {
            JOptionPane.showMessageDialog(rootPane, inputValidation.validatePersonDateOfBirth(dateOfBirth));
        } else if (!("Valid".equals(inputValidation.validateAddress(address)))) {
            JOptionPane.showMessageDialog(rootPane, inputValidation.validateAddress(address));
        } else if (!("Valid".equals(inputValidation.validateBuildingNumber(buildingNumber)))) {
            JOptionPane.showMessageDialog(rootPane, inputValidation.validateBuildingNumber(buildingNumber));
        } else if (!("Valid".equals(inputValidation.validatePhoneNumber(mobilePhone)))) {
            JOptionPane.showMessageDialog(rootPane, inputValidation.validatePhoneNumber(mobilePhone));
        } else if (!("Valid".equals(inputValidation.validatePhoneNumber(workPhone)))) {
            JOptionPane.showMessageDialog(rootPane, inputValidation.validatePhoneNumber(workPhone));
        } else if (!("Valid".equals(inputValidation.validatePhoneNumber(homePhone)))) {
            JOptionPane.showMessageDialog(rootPane, inputValidation.validatePhoneNumber(homePhone));
        } else if (!("Valid".equals(inputValidation.validateEmail(email)))) {
            JOptionPane.showMessageDialog(rootPane, inputValidation.validateEmail(email));
        } else {

            // else we can persist the data....
            doctor = new Doctor();
            Person person = new Person();

            doctor.setPersonId(person);
            person.setDoctor(doctor);

            doctor.getPersonId().setPersonId(Integer.parseInt(personId));
            doctor.getPersonId().setFirstName(firstName);
            doctor.getPersonId().setMiddleName(middleName);
            doctor.getPersonId().setLastName(lastName);
            doctor.setPassCode(passwordHashing.encodehashPassword(password));
            doctor.getPersonId().setDateOfBirth(dateOfBirth);

            Gender findTheGender = genderService.findTheGender(sex);
            MartialStatus findTheMartialStatus = martialStatusService.findTheMartialStatus(martialStatus);
            City birthPlaceObject = cityService.findTheCity(birthPlace);
            Country findTheCountry = countryService.findTheCountry(country);
            Religion findTheReligion = religionService.findTheReligion(religion);
            City findTheCity = cityService.findTheCity(city);

            findTheCity.setCountryId(findTheCountry);

            Address theAddress = new Address();

            theAddress.setStreetName(address);
            theAddress.setCityId(findTheCity);
            theAddress.setBuildingNumber(Integer.parseInt(buildingNumber));

            theAddress = addressService.findTheAddress(theAddress);

            //set the combobox values to doctor
            doctor.getPersonId().setGenderId(findTheGender);
            doctor.getPersonId().setMartialStatusId(findTheMartialStatus);
            doctor.getPersonId().setAddressId(theAddress);
            doctor.getPersonId().setBirthCityId(birthPlaceObject);
            doctor.getPersonId().setReigionId(findTheReligion);

            //before we save the address make sure the user doesn't exist in db. Some users may overload the db with many addresses if we dont check
            String personMsg = personService.checkIfUserExists(doctor.getPersonId());

            if ("Save".equals(personMsg)) {

                // store address 
                String addressMsg = addressService.checkIfAddressExists(theAddress);
                if ("Save".equals(addressMsg)) {
                    addressService.persistAddress(theAddress);
                }

                if ("Save".equals(personMsg)) {
                    // validate doctor input
                    String doctorSavedMsg = doctorService.persistDoctor(doctor);
                    JOptionPane.showMessageDialog(null, doctorSavedMsg);// if doctor is not saved do not save other stuff.

                    // save the education details.
                    persistEducation();

                    // persist UserGroup
                    String userGroupMsg = userGroupService.checkIfUserGroupExists(doctor);
                    if ("Save".equals(userGroupMsg)) {
                        UserGroup userGroup = new UserGroup();
                        userGroup.setUserId(doctor.getDoctorId());
                        userGroup.setGroupId(loginGroupService.findTheLoginGroup("Doctor"));
                        userGroupService.persistUserInUserGroup(userGroup);
                    }

                    // save the conntact details...
                    contactService.persistContact(person, "EMAIL", email);
                    contactService.persistContact(person, "HOME", homePhone);
                    contactService.persistContact(person, "WORK", workPhone);
                    contactService.persistContact(person, "MOB", mobilePhone);

                    // clear the Fields 
                    clearAddDoctorFields();

                    // close the add new doctor 
                    jifAddDoctor.dispose();
                    this.show();
                    // update the fields on jifDoctor to see the newly added doctor
                    updateDoctorFields(doctor);
                    loadEducationTable();
                }

            } else {
                JOptionPane.showMessageDialog(null, "User exists");
            }
        }

    }

    public void closeAddNewDoctorInternalFrameAddDoctor() {
        // clear the fields of addnewdoctor
        clearAddDoctorFields();
        //close the internalframe

        // close the add new doctor 
        jifAddDoctor.dispose();
        this.show();
        //open the doctor internalframe
        //keep the fields as they where before
    }

    private void clearAddDoctorFields() {
        jifAddDoctor.getJtfFirstName().setText("");
        jifAddDoctor.getJtfLastName().setText("");
        jifAddDoctor.getJtfMiddleName().setText("");
        jifAddDoctor.getJtfPersonalId().setText("");
        jifAddDoctor.getJtfMobilePhone().setText("");
        jifAddDoctor.getJtfHomePhone().setText("");
        jifAddDoctor.getJtfWorkPhone().setText("");
        jifAddDoctor.getJtfEmail().setText("");
        jifAddDoctor.getJtfAddress().setText("");
        jifAddDoctor.getJtfBuildingNumber().setText("");
        jifAddDoctor.getJpfPassword().setText("");

    }

    private void clearViewDoctorFields() {
        jtfPersonalId.setText("");
        jtfFirstName.setText("");
        jtfLastName.setText("");
        jtfMiddleName.setText("");
        jtfBirthCity.setText("");
        jtfGender.setText("");
        jtfMaritalStatus.setText("");
        jtfAddress.setText("");
        jtfCity.setText("");
        jtfCountry.setText("");
        jtfMobilePhone.setText("");
        jtfWorkPhone.setText("");
        jtfEmail.setText("");
        jtfHomePhone.setText("");

    }

    private void persistEducation() {

        // save the education details...
        int i = 0;
        //iterate as long as there is personEducation
        for (PersonEducation pe : jifAddDoctor.getDoctorTableModelEducation().getPersonEducation()) {

            Education education = null;
            EducationType educationType = null;
            EducationProgram educationProgram = null;

            // get the educationType 
            educationType = educationTypeService.findTheEducationType(pe.getEducationId().getEucationTypeId().getEducationName());

            //check if educationProgram exists, if not create new and save with educationProgramService
            educationProgram = educationProgramService.findTheEducationProgram(pe.getEducationId().getEducationProgramId().getProgramName());
            if (educationProgram == null) {
                educationProgram = new EducationProgram();
                educationProgram.setProgramName(pe.getEducationId().getEducationProgramId().getProgramName());
                // persist the educationprogram
                educationProgramService.persistEducationProgram(educationProgram);
                education = new Education();
                education.setInstitutionName(pe.getEducationId().getInstitutionName());

            } else {

                // check if education exists, if not create new and save with educationService
                education = educationService.findTheEducation(pe.getEducationId().getInstitutionName(), educationProgram.getProgramName(), educationType.getEducationName());
                if (education == null) {
                    education = new Education();
                    education.setInstitutionName(pe.getEducationId().getInstitutionName());

                    //set the education of PersonEdcation object
                    education.setEucationTypeId(educationType);
                    education.setEducationProgramId(educationProgram);

                    // persist the educationprogram
                    educationService.persistEducation(education);
                }
            }

            jifAddDoctor.getDoctorTableModelEducation().getPersonEducation().get(i).setEducationId(education);
            jifAddDoctor.getDoctorTableModelEducation().getPersonEducation().get(i).setPersonId(doctor.getPersonId());

            //persist personEducation Object in db 
            personEducationService.persistPersonEducation(jifAddDoctor.getDoctorTableModelEducation().getPersonEducation().get(i++));

        }

    }

    public void setEditableJTextFields(boolean isEditable) {
        jtfPersonalId.setEditable(isEditable);
        jtfFirstName.setEditable(isEditable);
        jtfMiddleName.setEditable(isEditable);
        jtfLastName.setEditable(isEditable);
        jtfBirthCity.setEditable(isEditable);
        jtfGender.setEditable(isEditable);
        jtfMaritalStatus.setEditable(isEditable);
        jtfAddress.setEditable(isEditable);
        jtfCity.setEditable(isEditable);
        jtfCountry.setEditable(isEditable);
        jtfHomePhone.setEditable(isEditable);
        jtfWorkPhone.setEditable(isEditable);
        jtfMobilePhone.setEditable(isEditable);
        jtfEmail.setEditable(isEditable);
    }

    public JIFAddCity getJifAddCity() {
        return jifAddCity;
    }

    public JIFAddCountry getJifAddCountry() {
        return jifAddCountry;
    }

}
