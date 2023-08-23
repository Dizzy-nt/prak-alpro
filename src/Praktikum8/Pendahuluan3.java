/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum8;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Pendahuluan3{
    //deklarasi
    JFrame frame= new JFrame();
    JLabel label_1=new JLabel();
    JLabel label_2=new JLabel();
    JLabel label_3=new JLabel();
    JTextField kolom1=new JTextField();
    JTextField kolom2=new JTextField();
    JTextField kolom3=new JTextField();
    JButton tombol1=new JButton();
    JButton tombol2=new JButton();
    JButton tombol3=new JButton();
    JButton tombol4=new JButton();
    void obb(){
        // Frame
        frame.setVisible(true);
        frame.setTitle("Design kalkulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(250,300);        
        //Objek
        frame.setLayout(null);
        label_1.setText("Masukkan Angka Pertama :");
        label_2.setText("Masukkan Angka Kedua :");
        label_3.setText("Masukkan Angka Ketiga :");
        tombol1.setText("+");
        tombol2.setText("-");
        tombol3.setText("/");
        tombol4.setText("*");
        label_1.setBounds(40, 10, 200, 20);
        label_2.setBounds(40, 60, 200, 20);
        label_3.setBounds(40, 110, 200, 20);
        kolom1.setBounds(60, 30, 100, 20);
        kolom2.setBounds(60, 80, 100, 20);
        kolom3.setBounds(60, 130, 100, 20);
        tombol1.setBounds(40, 160, 45, 20);
        tombol2.setBounds(90, 160, 45, 20);
        tombol3.setBounds(140, 160, 45, 20);
        tombol4.setBounds(90, 185, 45, 20);
        frame.add(label_1);
        frame.add(label_2);
        frame.add(label_3);
        frame.add(kolom1);
        frame.add(kolom2);
        frame.add(kolom3);
        frame.add(tombol1);
        frame.add(tombol2);
        frame.add(tombol3);
        frame.add(tombol4);
    }
    public static void main(String[] args) {
        Pendahuluan3 turu= new Pendahuluan3();
        turu.obb();
    }
}
