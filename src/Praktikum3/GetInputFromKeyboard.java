/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum3;
import java.io.*;

/**
 *
 * @author LAB.PROGRAMMING-01
 */
public class GetInputFromKeyboard {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        System.out.println("Nama anda siapa saudara?");
        try {
            name = dataIn.readLine();}
        catch( IOException e ){System.out.println("Error");}
        System.out.println("Halo "+name+", janji gak Turu? ");
    }
}
