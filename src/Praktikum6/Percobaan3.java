/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;
/**
 *
 * @author User
 */
public class Percobaan3 {
    public static void main(String[] args) {
        String data[][]={{"NAMA","ALAMAT\t","TELEPON"},{"ABDUL","Kediri\t","085646668991"},{"KUSNO","Trenggalek","085646668992"},{"PONIRAN","Bojonegoro","085646668999"}};
        int i=0;
        while(i<data.length){
            int j=0;
            while(j<data[0].length){
                System.out.print(data[i][j]+"\t");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
