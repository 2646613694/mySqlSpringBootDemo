package com.jumpower.mysqlspringboot.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerImpl implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button clicked");
    }
}
