/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubt.healthcare.ui.admin.eventhandling;

import com.ubt.healthcare.ui.admin.JIFSearchDoctor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author F
 */
public class MouseAdapterSearchDoctor extends MouseAdapter{
    private JIFSearchDoctor jifSearchDoctor;

    public MouseAdapterSearchDoctor(JIFSearchDoctor jifSearchDoctor) {
        this.jifSearchDoctor = jifSearchDoctor;
    }

    @Override
    public void mouseClicked(MouseEvent arg0) 
    {
        jifSearchDoctor.searchDoctorInternalPane();
    }
    
    
}