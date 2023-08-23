/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum7;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Percobaan1b {
    public static void main(String[] args) {
        Scanner inpt= new Scanner(System.in);
        System.out.println("Cari luas permukaan dan volume bola dengan diameter");
        System.out.print("Diameter = ");
        double userInput=inpt.nextInt();
        System.out.println("Luas permukaan bola = "+luas_permukaan_bola(userInput));
        System.out.println("Volume bola = "+volume_bola(userInput));
    }
    static double luas_permukaan_bola(double diameter){
    // Rumus luas permukaan bola = 4 x PI x r^2
        double r=diameter/2;
        double luas=4*Math.PI*(r*r);
        return luas;
    }
    static double volume_bola(double diameter){
    // Rumus volume bola V = (4/3)PI*r^3
        double r=diameter/2;
        double volume=4/3d*Math.PI*Math.pow(r, 3);
        System.out.println("jari2 = "+r);
        return volume;
    }
}
