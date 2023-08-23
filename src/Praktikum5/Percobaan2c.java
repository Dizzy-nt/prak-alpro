/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum5;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class Percobaan2c {
    public static void main(String[] args) {
    int data[]=new int[10];
    for (int a=0;a<data.length;a++)
    {
        data[a]=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Elemen Index ke-"+a));
        System.out.println("Index ke-"+a+" = "+data[a]);
    }
        int lokasiMax=0;
        int lokasiMin=0;
        int max=data[0];
        int min=data[0];
        for (int a=0;a<data.length;a++)
        {
            if(data[a]>max){
                max=data[a];
                lokasiMax=a;
            }else if(data[a]<min){
                min=data[a];
                lokasiMin=a;
            }
        }
        System.out.println("nilai maksimal : "+max+" pada index ke-"+lokasiMax);
        System.out.println("nilai minimal : "+min+" pada index ke-"+lokasiMin);
        
        double rata2=0.0;
        for(int a=0;a<10;a++){
            rata2+=data[a];
            rata2/=10;
        }
        System.out.println("mean 10 bilangan :"+rata2);
        
        int cari = Integer.parseInt(JOptionPane.showInputDialog("Cari nilai array"));
        System.out.println("");
        for(int a=0;a<data.length;a++){
            if (data[a]==cari){
                System.out.println(cari+" berada pada index ke-"+a);
            }
        }
        int input=Integer.parseInt(JOptionPane.showInputDialog("Nilai ganti "+cari+" dengan?"));
        System.out.println(" ");
        for (int a=0;a<data.length;a++){
            if(data[a]==cari){
                data[a]=input;
            }
            System.out.println("Index ke-"+a+" = "+data[a]);
        }

    }
}
