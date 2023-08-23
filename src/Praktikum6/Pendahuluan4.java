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
public class Pendahuluan4 {
    public static void main(String[] args) {
        int data2[][]={{4,6,4,7,8,3,2,10},{4,6,4,2,8,8,2,10}};
        int x,y;
        int cari=Integer.parseInt(JOptionPane.showInputDialog("Cari posisi Index\n"
                + "Masukkan angka yang ingin dicari :"));
        System.out.println(cari+" Ada di index ke :");
        x=0;
        while(x<data2.length){
            y=0;
            while(y<data2[0].length){
                if(data2[x][y]==cari){
                    System.out.print("("+x+","+y+") ");
                }
                y++;
            }
            x++;
        }
    }
    
}
