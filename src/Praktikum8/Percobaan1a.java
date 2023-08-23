/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum8;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author User
 */
public class Percobaan1a extends JFrame{
    Button cb1=new Button("Pilih A");
    Button cb2=new Button("Pilih B");
    public Percobaan1a() throws HeadlessException {
        setTitle("Program GUI Pertamaku");
        setLocation(200,100);
        setSize(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void obb(){
        getContentPane().setLayout(new FlowLayout());
        getContentPane().setBackground(Color.GREEN);
        cb1.setBackground(Color.MAGENTA);
        getContentPane().add(cb1);
        getContentPane().add(cb2);
        setVisible(true);
    }
    public static void main(String[] args) {
        Percobaan1a turu=new Percobaan1a();
        turu.obb();
    }
    
}
