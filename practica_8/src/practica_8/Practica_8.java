/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_8;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class Practica_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //leer que es el Heap Memory y Regular Expressions en Java
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Nombre del archivo en el que se escribira:");
        String archivo = scan.nextLine();
        String FileName = "/C://Users//Juan Carlos//Desktop//"+ archivo +".txt/";
        File file = new File(FileName);
        Utils f = new Utils();
        
        System.out.println("Ingrese el texto que quiere incluir en el archivo:");
        String text = scan.nextLine();
        
        
        if(file.exists()){
            f.writeFile(file, text);
        
            f.readFile(file);
        }else{
            System.out.println("No existe el archivo.");
        }
        //file.exists();
    }
    
}
