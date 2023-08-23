/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum3;
import java.util.Scanner;
/**
 *
 * @author LAB.PROGRAMMING-01
 */
public class Coba_If_Else {
    public static void main(String[] args) {
        int nilai;
        Scanner input = new Scanner(System.in);
        System.out.println("Nilaimu berapa Saudara?");
        nilai = input.nextInt();
        
        if(nilai>=75)
        {
            System.out.println("Wah sip kamu jos");
        }
        else
        {
            System.out.println("Wah fix remidi sih kamu");
        }
        
        
    }
    
}
