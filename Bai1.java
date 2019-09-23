/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tuan2;
import javax.swing.*;
/**
 *
 * @author User
 */
public class Bai1 extends JFrame{
    public Bai1( String title){

        super(title);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Bai1 b1 = new Bai1("Demo Windows");
    }
}
