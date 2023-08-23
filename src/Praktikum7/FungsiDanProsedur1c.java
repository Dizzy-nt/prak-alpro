/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum7;
/**
 *
 * @author User
 */
public class FungsiDanProsedur1c {
    // Fungsi
    public double luas_lingkaran(int diameter){
        int jari2=diameter/2;
        double luas=Math.PI*Math.pow(jari2,2);
        return luas;
    }
    // Prosedur
    public void hitungLuasLingkaran(int jari2){
        double luas=Math.PI*Math.pow(jari2, 2);
        System.out.println(luas);
    }
    public static void main(String[] args) {
        FungsiDanProsedur1c mt=new FungsiDanProsedur1c();
        mt.hitungLuasLingkaran(10);
        System.out.print(mt.luas_lingkaran(20)+"\n");
        System.exit(0);
    }
}
