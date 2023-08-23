/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum5;
import java.util.*;
/**
 *
 * @author User
 */
public class Percobaan3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N;
        int[] ar;
        
        System.out.println("Masukkan jumlah elemen array: ");
        N=sc.nextInt();
        ar=new int[N];
        for(int i=0;i<N;i++){
            System.out.println("Masukkan elemen index ke-"+i+" : ");
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            System.out.println("index ke-"+i+" adalah: "+ar[i]);
        }
            int lokasiMax=0;
            int lokasiMin=0;
            int max=0;
            int min=0;
            for(int i=0;i<ar.length;i++){
                if(ar[i]<max){
                    max=ar[i];
                    lokasiMax=i;
                }else if(ar[i]>min){
                    min=ar[i];
                    lokasiMin=i;
                }
            }
            System.out.println("Nilai max = "+max+" berada pada index ke-"+lokasiMax);
            System.out.println("Nilai min= "+min+" berada pada index ke-"+lokasiMin);
            double rata2=0.0;
            for(int i=0;i<ar.length;i++)
                rata2 += ar[i];
            System.out.println("Jumlah : "+rata2);
                rata2 /=N;
            System.out.println("Rata-rata : "+rata2);
            System.out.println("Index genap");
                int indexGn;
                int nilaiIndex;
                int jml=0;
                for(int i=0;i<ar.length;i++){
                    if(i % 2==0){
                        indexGn=i;
                        nilaiIndex=ar[i];
                        jml+=ar[i];
                        System.out.println("index ke-"+indexGn+" = "+nilaiIndex);
                    }
                }
                    System.out.println("jumlah nilai dari index genap = "+jml);
                    if(jml%2==0){
                        System.out.println("Jumlah nilai dari index genap adalah GENAP");
                    }else{
                        System.out.println("Jumlah nilai dari index genap adalah GANJIL");
                    }
                    System.out.println("Urutkan Nilai Index dari yang Terkecil : ");
                    for(int i=0;i<ar.length;i++){
                        Arrays.sort(ar);
                        System.out.println("Index ke-"+i+" adalah "+ar[i]);
                    }  
    }
}
