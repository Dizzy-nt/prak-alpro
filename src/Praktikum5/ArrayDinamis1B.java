package Praktikum5;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LAB.VISION-1
 */
public class ArrayDinamis1B {
    public static void main(String[] args) {
        // Array Dinamis Bilangan Random
        double[]contoh=new double[30];
        for(int i=0;i<30;i++)
            contoh[i]=100.0 * Math.random();
        double rata2=0.0;
        for (int i=0;i<30;i++)
            rata2+=contoh[i];
        rata2/=30;
        System.out.println("Mean 30 bilangan random : "+rata2);
    }
}
