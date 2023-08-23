/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum3;
import javax.swing.JOptionPane;
/**
 *
 * @author fathu
 */
public class Percobaan3 {
    public static void main(String[] args) {
        String msg1="Masukkan jumlah pendapatan Anda : ";
        JOptionPane.showMessageDialog(null, msg1);
        double pendapatan = 0.0;
        double komisi = 0.0;
        pendapatan = Double.parseDouble(JOptionPane.showInputDialog("Nilai hasil penjualan"));
        if (pendapatan<=2000000.0){
            komisi=100000.0+(pendapatan*0.1);} 
        else if(pendapatan>2000000.0){
            komisi=200000.0+(pendapatan*0.15);}
        else if(pendapatan>5000000.0){
            komisi=300000.0+(pendapatan*0.2);}
        JOptionPane.showMessageDialog(null,"pendapatan salesman = Rp "+komisi);
    }
    /*
    
    */
    
}
