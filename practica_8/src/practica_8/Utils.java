/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class Utils {
    
    Scanner scan = new Scanner(System.in);
    
    public void writeFile(File fileName, String text){
        //scanner de lo que se va a escribir
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            
            writer.write(text);
            writer.close();
            
            System.out.println("Texto ingresado correctamente.");
            System.out.println(text);
            
        }catch (Exception ex){
            System.out.println(ex.toString());
        }
    }
    
    public void readFile(File fileName){
        try{
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String line;
    
            while((line = in.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (Exception ex){
            System.out.println(ex.toString());
        }
    }
}
