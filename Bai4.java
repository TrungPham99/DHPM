/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tuan2;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bai4 extends JFrame{

    private static int NORTH;
    private static int SOUTH;
    private static int WEST;
    private static int EAST;
    private static int CENTER;
    private Object color;
    public Bai4(String title){
        setTitle(title);
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel pnBorder = new JPanel();
            pnBorder.setLayout(new BorderLayout());

        JPanel pnNorth = new JPanel();
            pnNorth.setBackground(Color.RED);
            pnBorder.add(pnNorth,BorderLayout.NORTH);

        JPanel pnSouth = new JPanel();
            pnSouth.setBackground(Color.RED); 
            pnBorder.add(pnSouth,BorderLayout.SOUTH);

        JPanel pnWest = new JPanel();
            pnWest.setBackground(Color.BLUE);
            pnBorder.add(pnWest,BorderLayout.WEST);

        JPanel pnEast = new JPanel();
            pnEast.setBackground(Color.BLUE);
            pnBorder.add(pnEast,BorderLayout.EAST);
        JPanel pnCenter = new JPanel();
            pnCenter.setBackground(Color.YELLOW);
            pnBorder.add(pnCenter,BorderLayout.CENTER);
            getContentPane().add(pnBorder);

    }
    public static void main(String[] args) {
        Bai4 Bai4 = new Bai4("BorderLayout");
    }

}
