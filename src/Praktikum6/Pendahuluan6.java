/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;
/**
 *
 * @author User
 */
public class Pendahuluan6 {
    public static void main(String[] args) {
        int data2[][]={{4,6,4,7,8,3,2,10},{4,6,4,2,8,8,2,10}};
        int x,y;
        float rata2;
        float total=0;
        for(x=0;x<data2.length;x++){
            for(y=0;y<data2[0].length;y++){
                System.out.print(data2[x][y]+" ");
                total+=data2[x][y];
            }
            System.out.println("");
        }
        System.out.println("================");
        rata2=total/(data2.length*data2[0].length);
        System.out.println("Rata-rata Array :");
        System.out.println(total+" :("+data2.length+"x"+data2[0].length+") ="+rata2);
    }
}
