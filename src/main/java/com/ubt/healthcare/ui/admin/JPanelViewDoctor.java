/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubt.healthcare.ui.admin;

import com.ubt.healthcare.business.DoctorService;
import com.ubt.healthcare.dto.Doctor;
import com.ubt.healthcare.ui.admin.model.DoctorTableModelViewDoctor;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author F
 */
public class JPanelViewDoctor extends javax.swing.JPanel {
    
    private Doctor doctor;
    private DoctorService doctorService;
    private DoctorTableModelViewDoctor doctorTableModelViewDoctor;

    /**
     * Creates new form JPanelViewDoctor
     */
    public JPanelViewDoctor() {
        doctorTableModelViewDoctor = new DoctorTableModelViewDoctor();
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

        jlSelect = new javax.swing.JLabel();
        jcpDoctor = new javax.swing.JScrollPane();
        jtDoctorTable = new javax.swing.JTable();
        jlSearchByName = new javax.swing.JLabel();
        jtfSearchByName = new javax.swing.JTextField();
        jlSearchBySurName = new javax.swing.JLabel();
        jtfSearchBySurName = new javax.swing.JTextField();
        jlSearchByCity = new javax.swing.JLabel();
        jcbSearchByCity = new javax.swing.JComboBox<>();
        jbSearchDoctor = new javax.swing.JButton();
        jlClose = new javax.swing.JLabel();

        jlSelect.setText("Select");

        jtDoctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jcpDoctor.setViewportView(jtDoctorTable);

        jlSearchByName.setText("Name");

        jtfSearchByName.setText("jTextField1");

        jlSearchBySurName.setText("Surname");

        jtfSearchBySurName.setText("jTextField2");

        jlSearchByCity.setText("City");

        jcbSearchByCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbSearchDoctor.setText("Search");

        jlClose.setText("Close");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jcpDoctor)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(271, 271, 271)
                                .addComponent(jlSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(82, 82, 82)
                                .addComponent(jlClose, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                .addGap(282, 282, 282))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfSearchByName)
                                .addGap(83, 83, 83))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlSearchByName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfSearchBySurName)
                                .addGap(21, 21, 21))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlSearchBySurName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(122, 122, 122)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlSearchByCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(165, 165, 165))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbSearchByCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(38, 38, 38)))
                        .addGap(20, 20, 20)
                        .addComponent(jbSearchDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSearchByName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlSearchBySurName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlSearchByCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jtfSearchByName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbSearchDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbSearchByCity)
                        .addComponent(jtfSearchBySurName)))
                .addGap(39, 39, 39)
                .addComponent(jcpDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jlClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbSearchDoctor;
    private javax.swing.JComboBox<String> jcbSearchByCity;
    private javax.swing.JScrollPane jcpDoctor;
    private javax.swing.JLabel jlClose;
    private javax.swing.JLabel jlSearchByCity;
    private javax.swing.JLabel jlSearchByName;
    private javax.swing.JLabel jlSearchBySurName;
    private javax.swing.JLabel jlSelect;
    private javax.swing.JTable jtDoctorTable;
    private javax.swing.JTextField jtfSearchByName;
    private javax.swing.JTextField jtfSearchBySurName;
    // End of variables declaration//GEN-END:variables
 
    public void addBackToAdminScreenMouseAdapter(MouseAdapter e) {
        jlSelect.addMouseListener(e);
    }
    
    public void addSearchDoctorPanelMouseAdapter(MouseAdapter e) {
        jbSearchDoctor.addMouseListener(e);
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setDoctorService(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    public JComboBox<String> getJcbSearchByCity() {
        return jcbSearchByCity;
    }

    public JTextField getJtfSearchByName() {
        return jtfSearchByName;
    }

    public JTextField getJtfSearchBySurName() {
        return jtfSearchBySurName;
    }
    
    public void loadDoctorListTable()
    {
        List<Doctor> list = doctorService.findDoctorsByParameters(jtfSearchByName.getText(),jtfSearchBySurName.getText(),
                                                jcbSearchByCity.getSelectedItem().toString());
        doctorTableModelViewDoctor.add(list);
        jtDoctorTable.setModel(doctorTableModelViewDoctor);
        doctorTableModelViewDoctor.fireTableDataChanged();
        //selectindexchanges... todo
    }
}