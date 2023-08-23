/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;
/**
 *
 * @author User
 */
//import javax.swing.JOptionPane;
public class Percobaan2a {
    public static void main(String[] args) {
        int [][]tabel={{1,2,3,4},{5,6,7,8}};
        float total,rata2;
        System.out.println("Jumlah baris = "+ tabel.length);
        System.out.println("Jumlah kolom = "+tabel[0].length);
        System.out.println("=====(While)=====");
        System.out.println("Array A");
        // While tabel
        int i=0;
        total=0;
        while(i<tabel.length){
            int j=0;
            while(j<tabel[0].length){
                System.out.print(tabel[i][j]+" ");
                total+=tabel[i][j];
                j++;
            }
            System.out.println("");
            i++;
        }
        rata2=total/(tabel.length*tabel[0].length);
        System.out.println("Rata-rata Array = "+rata2);
        System.out.println("~~~~~~~~~~~~~~~~");
        System.out.println("Array B");
        // While data2
        int data2[][]={{4,6,4,2,8,2,10},{4,6,4,2,8,2,10}};
        int a=0;
        total=0;
        while(a<data2.length){
            int b=0;
            while(b<data2[0].length){
                System.out.print(data2[a][b]+" ");
                total+=data2[a][b];
                b++;
            }
            System.out.println();
            a++;
        }
        rata2=total/(data2.length*data2[0].length);
        System.out.println("Rata-rata Array = "+rata2);
        System.out.println("===(Do-While)====");
        System.out.println("Array A");
        // Do-While tabel
        i=0;
        total=0;
        do{
            int j=0;
            do{
                System.out.print(tabel[i][j]+" ");
                total+=tabel[i][j];
                j++;
            }while(j<tabel[0].length);
            System.out.println("");
            i++;
        }while(i<tabel.length);
        rata2=total/(tabel.length*tabel[0].length);
        System.out.println("Rata-rata Array = "+rata2);
        System.out.println("~~~~~~~~~~~~~~~~");
        // Do-While data2
        System.out.println("Array B");
        a=0;
        total=0;
        do{
            int b=0;
            do{
                System.out.print(data2[a][b]+" ");
                total+=data2[a][b];
                b++;
            }while(b<data2[0].length);
            System.out.println("");
            a++;
        }while(a<data2.length);
        rata2=total/(data2.length*data2[0].length);
        System.out.println("Rata-rata Array = "+rata2);
        System.out.println("=================");
        /* Ganti nilai indeks dari input dengan JOptionPane
        String msg="Masukkan nilai index yang ingin diganti";
        JOptionPane.showMessageDialog(null,msg);
        */
        /*
        // Program untuk mengganti nilai array dengan posisi index sebagai input
        
        int index_ganti1=Integer.parseInt(JOptionPane.showInputDialog("Index baris ke-?"));
        int index_ganti2=Integer.parseInt(JOptionPane.showInputDialog("Index kolom ke-?"));
        int nilai_ganti=Integer.parseInt(JOptionPane.showInputDialog("Index ["+index_ganti1+"],["+index_ganti2+"] adalah "+data2[index_ganti1][index_ganti2]+", ganti dengan ? "));
        
        data2[index_ganti1][index_ganti2]=nilai_ganti;
        for(a=0;a<data2.length;a++){
            for(int b=0;b<data2[0].length;b++){
                System.out.print(data2[a][b]+" ");
                total+=data2[a][b];
            }
            System.out.println("");
        }
        rata2=total/(data2.length*data2[0].length);
        */
        /*
        int cari=Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai yang ingin diganti"));
        System.out.println(cari+" Berada pada index ke :");
        for(a=0;a<data2.length;a++){
            for(int b=0;b<data2[0].length;b++){
                if(data2[a][b]==cari){
                    System.out.println("("+a+","+b+")");
                }
            }
        }
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
        System.out.println("Jumlah index kolom genap = "+indexColGenap);
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
        System.out.println("Akumulasi jumlah elemen Array kolom genap = ");
        */
        
        /*
        int [][]tabel={{1,2,3,4},{5,6,7,8}};
        int data2[][]={{4,6,4,2,8,2,10},{4,6,4,2,8,2,10}};
        int a;
        double total,rata2;
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
        

    }
}

