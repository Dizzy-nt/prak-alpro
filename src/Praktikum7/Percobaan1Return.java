/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum7;
import java.io.*;
/**
 *
 * @author User
 */
public class Percobaan1Return {
    public static String readString() {
        BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
        String string="";
        try{
            string=input.readLine();
        }catch(IOException ex){
            System.out.println(ex);
        }return string;
    }
    public static int readInt() {
        return Integer.parseInt(readString());
    }
    public static double readDouble(){
        return Double.parseDouble(readString());
    }
}
