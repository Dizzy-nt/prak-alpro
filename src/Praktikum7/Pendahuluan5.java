/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum7;
/**
 *
 * @author User
 */
public class Pendahuluan5 {
    public static void main(String[] args) {
        hmm();
    }
    static void hmm(){
        System.out.println("Beberapa tipe data :");
        System.out.println("String ="+apa());
        System.out.println("Int = "+umur(18));
        System.out.println("Float = "+bb(50));
        System.out.println("Double = "+pi());
        System.out.println("Char = "+alpha());
        System.out.println("Boolean = "+yes());
    }
    static String apa(){
        String iya="iya";
        return iya;
    }
    static int umur(int usia){
        return usia;
    }
    static float bb(float berat){
        return berat;
    }
    static double pi(){
        double pi=Math.PI;
        return pi;
    }
    static char alpha(){
        char chara='a';
        return chara;
    }
    static boolean yes(){
        boolean y=true;
        return y;
    }
}
