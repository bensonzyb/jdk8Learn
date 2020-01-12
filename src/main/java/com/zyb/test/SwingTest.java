package com.zyb.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Description TODO
 * @Date 2019/11/17
 * @Created by ben
 */
public class SwingTest {
    public static void main(String[] args) {
        JFrame jFranme =new JFrame("My JFranme");
        JButton jButton =new JButton("My JButton");
        /*jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button pressed!");
            }
        });*/
        jButton.addActionListener(i-> System.out.println("button pressed!"));
        jFranme.add(jButton);
        jFranme.pack();
        jFranme.setVisible(true);
        jFranme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
