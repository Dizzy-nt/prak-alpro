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
public class Percobaan2_2 {
    public static void main(String[] argumen) {
        int data2[][]={{4,6,4,2,8,2,10},{4,6,4,2,8,2,10}};
        int a;
        double total,rata2;
        /*
        System.out.println("Array A :");
        for(a=0;a<tabel.length;a++){
            for(int b=0;b<tabel[0].length;b++){
                System.out.print(tabel[a][b]+" ");
            }
            System.out.println("");
        }
        System.out.println("==============");
        int cari=Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai Elemen Array A yang ingin diganti"));
        System.out.println(cari+" Berada pada index ke :");
        for(a=0;a<tabel.length;a++){
            for(int b=0;b<tabel[0].length;b++){
                if(tabel[a][b]==cari){
                    System.out.println("("+a+","+b+")");
                }
            }
        }
        System.out.println("==============");
        int input=Integer.parseInt(JOptionPane.showInputDialog(cari+" Ganti dengan ?"));
        System.out.println("Array A");
        total=0;
        int indexColGenap=0;
        for(a=0;a<tabel.length;a++){
            for(int b=0;b<tabel[0].length;b++){
                if(tabel[a][b]==cari){
                    tabel[a][b]=input;
                }else if(b%2==0){
                    indexColGenap+=tabel[a][b];
                }
                System.out.print(tabel[a][b]+" ");
                total+=tabel[a][b];
                
            }
            System.out.println("");
        }
        rata2=total/(tabel.length*tabel[0].length);
        System.out.println("Rata-rata Array = "+total+" : "+tabel.length+" x "+tabel[0].length+" = "+rata2);
        System.out.println("==============");
        System.out.println("Jumlah index kolom genap = ");
        indexColGenap=0;
        for(a=0;a<tabel.length;a++){
            for(int b=0;b<tabel[0].length;b++){
                if(b%2==0){
                    indexColGenap+=tabel[a][b];
                    System.out.print(tabel[a][b]+" + ");
                }
            }
            System.out.println("");
        }
        System.out.println("Akumulasi jumlah elemen Array kolom genap = "+indexColGenap);
        */
        
        
        System.out.println("Array B :");
        for(a=0;a<data2.length;a++){
            for(int b=0;b<data2[0].length;b++){
                System.out.print(data2[a][b]+" ");
            }
            System.out.println("");
        }
        System.out.println("==============");
        int cari=Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai yang ingin diganti"));
        System.out.println(cari+" Berada pada index ke :");
        for(a=0;a<data2.length;a++){
            for(int b=0;b<data2[0].length;b++){
                if(data2[a][b]==cari){
                    System.out.println("("+a+","+b+")");
                }
            }
        }
        System.out.println("==============");
        int input=Integer.parseInt(JOptionPane.showInputDialog(cari+" Ganti dengan ?"));
        System.out.println("Array B");
        total=0;
        int indexColGenap=0;
        for(a=0;a<data2.length;a++){
            for(int b=0;b<data2[0].length;b++){
                if(data2[a][b]==cari){
                    data2[a][b]=input;
                }else if(b%2==0){
                    indexColGenap+=data2[a][b];
                }
                System.out.print(data2[a][b]+" ");
                total+=data2[a][b];
                
            }
            System.out.println("");
        }
        rata2=total/(data2.length*data2[0].length);
        System.out.println("Rata-rata Array = "+total+" : "+data2.length+" x "+data2[0].length+" = "+rata2);
        System.out.println("==============");
        System.out.println("Jumlah index kolom genap = ");
        indexColGenap=0;
        for(a=0;a<data2.length;a++){
            for(int b=0;b<data2[0].length;b++){
                if(b%2==0){
                    indexColGenap+=data2[a][b];
                    System.out.print(data2[a][b]+" + ");
                }
            }
            System.out.println("");
        }
        System.out.println("Akumulasi jumlah elemen Array kolom genap = "+indexColGenap);
    }
}
