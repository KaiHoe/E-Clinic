/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubt.healthcare.ui.admin.eventhandling;

import com.ubt.healthcare.ui.admin.JIFDoctor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author F
 */
public class MouseAdapterCloseSaveNewDoctorInternalFrame extends MouseAdapter{
    private JIFDoctor jifDoctorScreen;

    public MouseAdapterCloseSaveNewDoctorInternalFrame(JIFDoctor jifDoctorScreen) {
        this.jifDoctorScreen = jifDoctorScreen;
    }

    @Override
    public void mouseClicked(MouseEvent arg0) 
    {
        jifDoctorScreen.closeAddNewDoctorInternalFrameAddDoctor();
    }
    
    
}
