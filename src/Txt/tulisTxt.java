/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Txt;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author User
 */
public class tulisTxt {
    public static void main(String[] args) {

        String fileName = "src/puisi.txt";
        String fileContent = "The quick brown fox jumps over the lazy dog";
        
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(fileContent);
            fileWriter.close();
            
            System.out.println("File sudah ditulis ulang!");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan karena: " + e.getMessage());
        }
    }
}
