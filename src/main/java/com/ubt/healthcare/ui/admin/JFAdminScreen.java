/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubt.healthcare.ui.admin;

import java.awt.event.MouseAdapter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author F
 */
public class JFAdminScreen extends javax.swing.JFrame {

    private JIFDoctorF jifDoctorF;
    private JIFNurse jifNurse;
    private JIFReceptionist jifReceptionist;
    private JIFPharmacist jifPharmacist;
    private JIFPharmacyManager jifPharmacyManager;

    /**
     * Creates new form JFAdminScreen
     */
    public JFAdminScreen() {
        initComponents();
    }

    public JFAdminScreen(JIFDoctorF jifDoctorF, JIFNurse jifNurse, JIFReceptionist jifReceptionist, JIFPharmacist jifPharmacist, JIFPharmacyManager jifPharmacyManager) {
        this.jifDoctorF = jifDoctorF;
        this.jifNurse = jifNurse;
        this.jifReceptionist = jifReceptionist;
        this.jifPharmacist = jifPharmacist;
        this.jifPharmacyManager = jifPharmacyManager;

        //frameStlye();
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        jlAdminClinic.setIcon(new ImageIcon(getClass().getResource("/com/ubt/healthcare/ui/images/adminClinic.png")));
        jlDoctor.setIcon(new ImageIcon(getClass().getResource("/com/ubt/healthcare/ui/images/doctor.png")));
        jlLogout.setIcon(new ImageIcon(getClass().getResource("/com/ubt/healthcare/ui/images/logout.png")));
        jlNurse.setIcon(new ImageIcon(getClass().getResource("/com/ubt/healthcare/ui/images/nurse.png")));
        jlPharmacist.setIcon(new ImageIcon(getClass().getResource("/com/ubt/healthcare/ui/images/pharmacist.png")));
        jlPharmacyManager.setIcon(new ImageIcon(getClass().getResource("/com/ubt/healthcare/ui/images/pharmacyManager.png")));
        jlProfile.setIcon(new ImageIcon(getClass().getResource("/com/ubt/healthcare/ui/images/profile.png")));
        jlReceptionist.setIcon(new ImageIcon(getClass().getResource("/com/ubt/healthcare/ui/images/receptionist.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPaneHandler = new javax.swing.JDesktopPane();
        jlProfile = new javax.swing.JLabel();
        jlDoctor = new javax.swing.JLabel();
        jlReceptionist = new javax.swing.JLabel();
        jlPharmacist = new javax.swing.JLabel();
        jlPharmacyManager = new javax.swing.JLabel();
        jlNurse = new javax.swing.JLabel();
        jlAdminClinic = new javax.swing.JLabel();
        jlLogout = new javax.swing.JLabel();
        jlHRManager = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdpPaneHandlerLayout = new javax.swing.GroupLayout(jdpPaneHandler);
        jdpPaneHandler.setLayout(jdpPaneHandlerLayout);
        jdpPaneHandlerLayout.setHorizontalGroup(
            jdpPaneHandlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jdpPaneHandlerLayout.setVerticalGroup(
            jdpPaneHandlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        jlProfile.setText("Profile");

        jlDoctor.setText("Doctor");

        jlReceptionist.setText("Receptionist");

        jlPharmacist.setText("Pharmacist");

        jlPharmacyManager.setText("Pharmacy Manager");

        jlNurse.setText("Nurse");

        jlAdminClinic.setText("Admin");

        jlLogout.setText("Log Out");

        jlHRManager.setText("HRManager");

        jMenu2.setText("Location");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPaneHandler)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlReceptionist, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlPharmacist, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlPharmacyManager, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlAdminClinic, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlHRManager, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jlLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlProfile)
                    .addComponent(jlDoctor)
                    .addComponent(jlReceptionist)
                    .addComponent(jlPharmacist)
                    .addComponent(jlPharmacyManager)
                    .addComponent(jlNurse)
                    .addComponent(jlAdminClinic)
                    .addComponent(jlLogout)
                    .addComponent(jlHRManager))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jdpPaneHandler))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpPaneHandler;
    private javax.swing.JLabel jlAdminClinic;
    private javax.swing.JLabel jlDoctor;
    private javax.swing.JLabel jlHRManager;
    private javax.swing.JLabel jlLogout;
    private javax.swing.JLabel jlNurse;
    private javax.swing.JLabel jlPharmacist;
    private javax.swing.JLabel jlPharmacyManager;
    private javax.swing.JLabel jlProfile;
    private javax.swing.JLabel jlReceptionist;
    // End of variables declaration//GEN-END:variables

    public void addLogOutMouseAdapter(MouseAdapter e) {
        jlLogout.addMouseListener(e);
    }

    public void addDoctorScreenMouseAdapter(MouseAdapter e) {
        jlDoctor.addMouseListener(e);
    }

    public void addAddReceptionistMouseAdapter(MouseAdapter e) {
        jlReceptionist.addMouseListener(e);
    }

    public void addViewProfileMouseAdapter(MouseAdapter e) {
        jlProfile.addMouseListener(e);
    }

    public void addNurseScreenMouseAdapter(MouseAdapter e) {
        jlNurse.addMouseListener(e);
    }

    public void addAdminClinicScreenMouseAdapter(MouseAdapter e) {
        jlAdminClinic.addMouseListener(e);
    }

    public void addPharmacistScreenMouseAdapter(MouseAdapter e) {
        jlPharmacist.addMouseListener(e);
    }

    public void addPharmacyManagerScreenMouseAdapter(MouseAdapter e) {
        jlPharmacyManager.addMouseListener(e);
    }

    public void showDoctorScreen() {

        jdpPaneHandler.remove(jifDoctorF);//withoutF
        jdpPaneHandler.add(jifDoctorF);
        jifDoctorF.show();
        /*jspPane.setViewportView(jpAddDoctor);
        jspPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);*/

    }

    public void showPharmacistScreen() {
        jdpPaneHandler.remove(jifPharmacist);
        jdpPaneHandler.add(jifPharmacist);
        jifPharmacist.show();
        /*jspPane.setViewportView(jpAddDoctor);
        jspPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);*/

    }

    public void showPharmacyManagerScreen(){
        jdpPaneHandler.remove(jifPharmacyManager);
        jdpPaneHandler.add(jifPharmacyManager);
        jifPharmacyManager.show();
    }  
    public void showReceptionistScreen() {

        jdpPaneHandler.remove(jifReceptionist);
        jdpPaneHandler.add(jifReceptionist);
        jifReceptionist.show();
    }

    public void showNurseScreen() {

        jdpPaneHandler.remove(jifNurse);//withoutF
        jdpPaneHandler.add(jifNurse);
        jifNurse.show();
        /*jspPane.setViewportView(jpAddDoctor);
        jspPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);*/

    }

    /* public void showAddDoctorInternalFrame() {
        // remove internalframe from desktop pane
        jdpPaneHandler.remove(jifDoctor.getJifAddDoctor());

        jdpPaneHandler.add(jifDoctor.getJifAddDoctor());

        jifDoctor.getJifAddDoctor().show();

        // load city combobox
        //jifDoctor.getJifAddDoctor().loadCityComboBox();
        // set the DoctorService
        //jifDoctor.getJifViewDoctor().setDoctorService(jifDoctor.getDoctorService());
        //set Doctor
        //jifDoctor.getJifViewDoctor().setDoctor(jifDoctor.getDoctor());
        // hide the View Doctor Internal Pane
        jifDoctor.hide();
    }

    public void showSearchDoctorInternalFrame() {
        // remove internalframe from desktop pane
        jdpPaneHandler.remove(jifDoctor.getJifViewDoctor());

        jdpPaneHandler.add(jifDoctor.getJifViewDoctor());

        jifDoctor.getJifViewDoctor().show();

        // load city combobox
        jifDoctor.getJifViewDoctor().loadCityComboBox();

        // set the DoctorService
        jifDoctor.getJifViewDoctor().setDoctorService(jifDoctor.getDoctorService());
        //set Doctor
        jifDoctor.getJifViewDoctor().setDoctor(jifDoctor.getDoctor());
        // hide the View Doctor Internal Pane
        jifDoctor.hide();
    }

    public void showAddCityInternalFrame() {
        jdpPaneHandler.remove(jifDoctor.getJifAddCity());
        jdpPaneHandler.add(jifDoctor.getJifAddCity());
        jifDoctor.getJifAddCity().show();
        try {
            jifDoctor.getJifAddCity().setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(JFAdminScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void showAddCountryInternalFrame() {
        jdpPaneHandler.remove(jifDoctor.getJifAddCountry());
        jdpPaneHandler.add(jifDoctor.getJifAddCountry());
        jifDoctor.getJifAddCountry().show();
        try {
            jifDoctor.getJifAddCountry().setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(JFAdminScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void showEditDoctorInternalFrame() {

        if (jifDoctor.getDoctor() == null) {
            JOptionPane.showMessageDialog(rootPane, "Choose doctor you want to edit");
        } else {
            // remove internalframe from desktop pane
            jdpPaneHandler.remove(jifDoctor.getJifEditDoctor());

            jdpPaneHandler.add(jifDoctor.getJifEditDoctor());

            jifDoctor.getJifEditDoctor().show();

            jifDoctor.getJifEditDoctor().setDoctor(jifDoctor.getDoctor());
            jifDoctor.getJifEditDoctor().updateDoctorFields(jifDoctor.getDoctor());

            // hide the View Doctor Internal Pane
            jifDoctor.hide();
        }
    }

    public JIFDoctor getJifDoctor() {
        return jifDoctor;
    }*/
    static {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());

                    /*jdpPaneHandler.setUI(new DesktopPaneUI() {
                        @Override
                        public void installUI(JComponent ui) {
                            try {
                                UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel.");

                            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
                            }
                        }
                    });*/
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            System.out.println("UI Manager not found");
        }
    }
}
