/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class Percobaan4 {
    public static void main(String[] args) {
        int matrik1[][]={{2,9},{1,5}};
        int matrik2[][]={{5,17},{10,4}};
        int a=0;
        do{
            int b=0;
            System.out.print(matrik1[b][a]+" ");
            a++;
        }while(a<matrik1.length);
        System.out.print("\t");
        a=0;
        do{
            int b=0;
            System.out.print(matrik2[b][a]+" ");
            a++;
        }while(a<matrik2.length);
        System.out.println("");
        a=0;
        do{
            int b=1;
            System.out.print(matrik1[b][a]+" ");
            a++;
        }while(a<matrik1[0].length);
        System.out.print("\t");
        a=0;
        do{
            int b=1;
            System.out.print(matrik2[b][a]+" ");
            a++;
        }while(a<matrik2[0].length);
        System.out.println("");
        int input=Integer.parseInt(JOptionPane.showInputDialog("Posisi index\nMasukkan angka yang ingin dicari :"));
        a=0;
        int b=0;
        while(a<matrik1.length){
            while(b<matrik1[0].length){
                if(matrik1[a][b]==input){
                    System.out.println(input+" Berada pada index ke ("+a+","+b+")");
                }
                b++;
            }
            a++;
        }
        /*
        Gimana ya caranya ngasih tau kalau inputnya tidak ada di index?
        saat ini masih gagal.
        
        if(input!=matrik1[a][b]){
            String msg="Angka yang anda inputkan tidak terdapat pada Matrik";
            JOptionPane.showMessageDialog(null, msg);
            System.out.println(input+" tidak terdapat pada Matrik");
        }
        */
        System.out.println("=============================");
        int jumlah[][]=new int[2][2];
        System.out.println("Hasil penjumlahan kedua matrik :");
        for(a=0;a<jumlah.length;a++){
            for(b=0;b<jumlah.length;b++){
                jumlah[a][b]=matrik1[a][b]+matrik2[a][b];
                System.out.print(jumlah[a][b]+" ");
            }
            System.out.println("");
        }
    }
}
