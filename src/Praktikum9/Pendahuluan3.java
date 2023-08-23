/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum9;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    JButton tombolPlus=new JButton();
    JButton tombolMin=new JButton();
    JButton tombolBagi=new JButton();
    JButton tombolKali=new JButton();
    void obb(){
        // Frame
        frame.setVisible(true);
        frame.setTitle("Design kalkulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(250,275);        
        //Objek
        frame.setLayout(null);
        label_1.setText("Masukkan Angka Pertama :");
        label_2.setText("Masukkan Angka Kedua :");
        label_3.setText("Hasil :");
        tombolPlus.setText("+");
        tombolMin.setText("-");
        tombolBagi.setText("/");
        tombolKali.setText("*");
        label_1.setBounds(40, 10, 200, 20);
        label_2.setBounds(40, 60, 200, 20);
        label_3.setBounds(90, 110, 200, 20);
        kolom1.setBounds(60, 30, 100, 20);
        kolom2.setBounds(60, 80, 100, 20);
        kolom3.setBounds(60, 130, 100, 20);
        tombolPlus.setBounds(40, 160, 45, 20);
        tombolMin.setBounds(90, 160, 45, 20);
        tombolBagi.setBounds(140, 160, 45, 20);
        tombolKali.setBounds(90, 185, 45, 20);
        frame.add(label_1);
        frame.add(label_2);
        frame.add(label_3);
        frame.add(kolom1);
        frame.add(kolom2);
        frame.add(kolom3);
        frame.add(tombolPlus);
        frame.add(tombolMin);
        frame.add(tombolBagi);
        frame.add(tombolKali);
    }
    void reaksi(){
        
        tombolPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int kolomA=Integer.parseInt(kolom1.getText());
                int kolomB=Integer.parseInt(kolom2.getText());
                String plus=String.valueOf(kolomA+kolomB);
                kolom3.setText(plus);
            }
        });
        tombolMin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int kolomA=Integer.parseInt(kolom1.getText());
                int kolomB=Integer.parseInt(kolom2.getText());
                String min=String.valueOf(kolomA-kolomB);
                kolom3.setText(min);
            }
        });
        tombolKali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int kolomA=Integer.parseInt(kolom1.getText());
                int kolomB=Integer.parseInt(kolom2.getText());
                String kali=String.valueOf(kolomA*kolomB);
                kolom3.setText(kali);
            }
        });
        tombolBagi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int kolomA=Integer.parseInt(kolom1.getText());
                int kolomB=Integer.parseInt(kolom2.getText());
                String bagi=String.valueOf(kolomA/kolomB);
                kolom3.setText(bagi);
            }
        });
    }
    public static void main(String[] args) {
        Pendahuluan3 turu= new Pendahuluan3();
        turu.obb();
        turu.reaksi();
    }
}
