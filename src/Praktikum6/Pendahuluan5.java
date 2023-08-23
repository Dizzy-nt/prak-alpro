/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;
/**
 *
 * @author User
 */
public class Pendahuluan5 {
    public static void main(String[] args) {
        int data2[][]={{4,6,4,7,8,3,2,10},{4,6,4,2,8,8,2,10}};
        int x,y;
        System.out.println("================");
        System.out.println("Do-While loop");
        x=0;
        do{
            y=0;
            do{
                System.out.print(data2[x][y]+" ");
                y++;
            }while(y<data2[0].length);
            System.out.println("");
            x++;
        }while(x<data2.length);
        System.out.println("================");
        System.out.println("While loop");
        x=0;
        while(x<data2.length){
            y=0;
            while(y<data2[0].length){
                System.out.print(data2[x][y]+" ");
                y++;
            }
            System.out.println("");
            x++;
        }
        System.out.println("================");
        System.out.println("For loop");
        for(x=0;x<data2.length;x++){
            for(y=0;y<data2[0].length;y++){
                System.out.print(data2[x][y]+" ");
            }
            System.out.println("");
        }
        System.out.println("================");

    }
}
