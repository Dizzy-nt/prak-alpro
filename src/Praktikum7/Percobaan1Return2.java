/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum7;

/**
 *
 * @author User
 */
public class Percobaan1Return2 {
    public static void main(String[] args) {
        System.out.print("Data 1 = ");
        Percobaan1Return ic=new Percobaan1Return();
        int data1=ic.readInt();
        System.out.print("Data 2 = ");
        int data2=ic.readInt();
        int data3=data1+data2;
        System.out.print("Data 1 + Data 2 = "+data3);
        System.out.println("");
    }
}
