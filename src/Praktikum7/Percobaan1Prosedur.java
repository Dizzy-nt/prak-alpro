/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum7;
/**
 *
 * @author User
 */
public class Percobaan1Prosedur {
    public void segiempat(int panjang, int lebar) {
        double luas;
        double keliling;
        luas=panjang*lebar;
        System.out.println("Panjang segi empat = "+panjang);
        System.out.println("Lebar segi empat = "+lebar);
        System.out.println("Luas segi empat = "+luas);
    }
    public static void main (String args[]){
        Percobaan1Prosedur s4= new Percobaan1Prosedur();
        s4.segiempat(10,5);
    }
}
