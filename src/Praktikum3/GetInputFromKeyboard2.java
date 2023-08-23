/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum3;
import javax.swing.JOptionPane;
/**
 *
 * @author LAB.PROGRAMMING-01
 */
public class GetInputFromKeyboard2 {
    public static void main(String[] args) {
        String name="";
        name=JOptionPane.showInputDialog("Masukkan nama anda");
        if(name.equals("Rosyid"))
        {
            String msg="Halo "+name+", Semangat ya!";
            JOptionPane.showMessageDialog(null, msg);
        }
        else
        {
            String msg="Hayoo kamu siapaa, kamu siapaaa? ";
            JOptionPane.showMessageDialog(null, msg);
        }
                
    }
}
