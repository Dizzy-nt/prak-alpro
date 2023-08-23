/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class FungsiB1B2 {
     public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Jumlah baris segitiga");

        int baris;
         baris = scan.nextInt();
         System.out.println("## Printing the pattern ##");
        for (int i=1; i<=baris; i++){ 
            // Print space in decreasing order 
            for (int j=baris; j>i; j--)
            {
                System.out.print("  ");
            }
            // Print star in increasing order
            for (int k=1; k<=(i * 2) -1; k++)
            {
                System.out.print("B ");
            }
            System.out.println();
        }
        scan.close();
        System.out.println("");
        System.out.println("## Printing the pattern ##");
        for (int i=baris; i>=1; i--){
            for (int k=1; k<=(i * 2) -1; k++){ 
                System.out.print("B "); 
            } 
            System.out.println();
            for (int j=baris; j>=i; j--){
                System.out.print("  ");
            }
            
        }
        
    }
}
