/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubt.healthcare.view.eventhandling;

import com.ubt.healthcare.view.JFMain;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author F
 */
public class MouseAdapterLogOut extends MouseAdapter{
    private JFMain jfMain;

    public MouseAdapterLogOut(JFMain jfMain) {
        this.jfMain = jfMain;
    }

    @Override
    public void mouseClicked(MouseEvent arg0) 
    {
        jfMain.showLoginScreen();;
    }
    
    
}
