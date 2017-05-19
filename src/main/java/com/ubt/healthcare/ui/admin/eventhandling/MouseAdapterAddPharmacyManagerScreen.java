/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubt.healthcare.ui.admin.eventhandling;

import com.ubt.healthcare.ui.admin.JFAdmin;
import com.ubt.healthcare.ui.admin.JPanelAddDoctor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author F
 */
public class MouseAdapterAddPharmacyManagerScreen extends MouseAdapter{
    private JFAdmin jfAdmin;

    public MouseAdapterAddPharmacyManagerScreen(JFAdmin jfAdmin) {
        this.jfAdmin = jfAdmin;
    }

    @Override
    public void mouseClicked(MouseEvent arg0) 
    {
        jfAdmin.showAddPharmacyManagerScreen();
    }
    
    
}