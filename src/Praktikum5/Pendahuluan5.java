/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum5;
/**
 *
 * @author User
 */
public class Pendahuluan5 {
    public static void main(String[] args) {
        int data[]={4,6,4,2,8,4,2,11};
        System.out.println("Menggunakan while\n");
        int i=0;
        while(i<data.length){
            System.out.println("Index ke-"+i+" : "+data[i]);
            i++;
        }
        System.out.println("______________________");
        System.out.println("Menggunakan do-while\n");
        int a=0;
        do{
            System.out.println("Index ke-"+a+" : "+data[a]);
            a++;
        }while(a<data.length);
        System.out.println("_______________________");
        System.out.println("Menggunakan for\n");
        for(int u=0;u<data.length;u++){
            System.out.println("Index ke-"+u+" : "+data[u]);
        }
    }
    
}
