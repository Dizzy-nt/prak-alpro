/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum5;
import javax.swing.*;
/**
 *
 * @author User
 */
public class Percobaan4 {
    public static void main(String[] args) {
        int data[]={4,6,4,2,8,4,2,11};
        int cari=Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai array"));
        for (int a=0;a<data.length;a++){
            if(data[a]==cari){
                JOptionPane.showMessageDialog(null,cari+" pada index ke-"+a);
            }
        }
    }
    
}
