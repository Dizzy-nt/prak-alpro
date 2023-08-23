package Praktikum5;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
/**
 *
 * @author LAB.VISION-1
 */
public class ArrayDinamis1C {
    public static void main(String[] args) {
        //Array Dinamis Elemen dimasukkan
        int data[]=new int[10];
        int max,min,indexMax,indexMin;
        for(int a=0;a<data.length;a++){
            data[a]=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Elemen Index ke "+a));
            System.out.println("Index Ke "+a+" adalah "+data[a]);
        }
        //Mencari min dan max
        min=data[0];
        max=data[0];
        indexMax=1;
        indexMin=1;
        for(int i=0;i<data.length;i++){
            if(data[i]>max){
                max=data[i];
                indexMax=i;
            }else if(data[i]<min){
                min=data[i];
                indexMin=i;
            }
        }
        System.out.println("=====================================================");
        System.out.println("Nilai maksimal dari index adalah  : "+max+" Yaitu index ke : "+indexMax);
        System.out.println("Nilai minimal dari index adalah : "+min+" Yaitu index ke : "+indexMin);
    }
}
