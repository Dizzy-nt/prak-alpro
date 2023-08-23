/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum4;

/**
 *
 * @author LAB.PROGRAMMING-01
 */
public class Percobaan1 {
    public static void main(String[] args) {
        //Percobaan ke 1.1
        int jml=0;
        for(int i=1;i<=10;i++){
        jml+=i;
        }
        System.out.println("======{ Jum'at, 30 September 2022 }======");
        System.out.println("Percobaan ke 1.1\n");
        System.out.println("\tJumlah Semua Bilangan : "+jml+"\n");
        System.out.println("========================================");
        //Percobaan ke 1.2
        System.out.println("Percobaan ke 1.2\n");
        for (double jari=1.0;jari<=2.0;jari+=0.2){
            System.out.println("\tRadius = "+jari+"\n\tLuas = "+jari*Math.PI*jari+"\n");}
        System.out.println("========================================");
        //Percobaan ke 1.3
        System.out.println("Percobaan ke 1.3\n");
        float r=0;
        while(r<0.99){
        r=(float) Math.random();
            System.out.println("\t"+r);}
        System.out.println("========================================");
        //Percobaan ke 1.4
        System.out.println("Percobaan ke 1.4\n");
        float R;
        do{
            R=(float)Math.random();
            System.out.println("\t"+R);
        }while(R<0.99);
        System.out.println("========================================");
        //Percobaan ke 1.5
        long batas=4;
        long faktorial=1;
        for(int i=0;i<=batas;i++){
            faktorial=1;
            for(int faktor=2;faktor<=i;faktor++)
                faktorial*=faktor;
            System.out.println(i+"!"+" adalah = "+faktorial+"\n");
        }
        
        
    }
}
