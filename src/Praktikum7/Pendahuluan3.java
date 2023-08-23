/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum7;

/**
 *
 * @author User
 */
public class Pendahuluan3 {
    public static void main(String[] args) {
        try{
            String []ikan = {"lele","mujaer","pindang"};
            System.out.println(ikan[3]);
        }catch(Exception er){
            System.err.println("Ikan tidak ada dalam daftar");
        }finally{
            System.err.println("Blok 'Try-catch' telah selesai");
        }
    }
}
