/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author LAB.PROGRAMMING-01
 */
public class Gaji_Bersih {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int gaji_kotor = 4000000;
       int potongan=gaji_kotor*10/100;
       int gaji_bersih=gaji_kotor-potongan;
        System.out.println("Gaji Bersih = "+gaji_bersih);
       
    }
    
    
} 