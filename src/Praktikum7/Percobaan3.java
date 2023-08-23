/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum7;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class Percobaan3 {
    public static void main(String[] args) {
        System.out.println("============================");
        int panjangPersegiPanjang=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang Persegi Panjang "));
        System.out.println("Panjang Persegi Panjang = "+panjangPersegiPanjang);
        int lebarPersegiPanjang=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar Persegi Panjang "));
        System.out.println("Lebar Persegi Panjang = "+lebarPersegiPanjang);
        System.out.println("Luas Persegi Panjang = "+persegiPanjang(panjangPersegiPanjang,lebarPersegiPanjang));
        System.out.println("============================");
        int alasSegitiga=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Alas Segitiga "));
        System.out.println("Alas Segitiga = "+alasSegitiga);
        int tinggiSegitiga=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tinggi Segitiga "));
        System.out.println("Tinggi Segitiga = "+tinggiSegitiga);
        System.out.println("Luas Segitiga = "+segitiga(alasSegitiga,tinggiSegitiga));
        System.out.println("============================");
        int jariJari=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jari-jari Lingkaran "));
        System.out.println("Jari-jari Lingkaran = "+jariJari);
        System.out.println("Luas Lingkaran = "+lingkaran(jariJari));
        System.out.println("============================");
    }
    static int persegiPanjang(int panjang,int lebar){
        int luas=panjang*lebar;
        return luas;
    }
    static float segitiga(int alas, int tinggi){
        float luas=1/2f*alas*tinggi;
        return luas;
    }
    static float lingkaran(int jari2){
        float pi=3.14f;
        float luas=pi*jari2*jari2;
        return luas;
    }
}
