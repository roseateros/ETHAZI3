
package reto3.modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ficheros {
    	
    public static void cargarFicheroUsuario() {
        
	String fichero = "src\\reto3\\modelo\\Usuarios.txt"; 
	String strCurrentLine; 
	BufferedReader objReader = null;

	        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {   
	            while ((strCurrentLine = objReader.readLine()) != null) {   
	                System.out.println(strCurrentLine);  
	            }  
	        } catch (IOException e) {  
	            e.printStackTrace(); 
	        }
	
}
        public static void cargarFicheroBillete() {
        
	String fichero = "src\\reto3\\modelo\\Billetes.txt"; 
	String strCurrentLine; 
	BufferedReader objReader = null;

	        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {   
	            while ((strCurrentLine = objReader.readLine()) != null) {   
	                System.out.println(strCurrentLine);  
	            }  
	        } catch (IOException e) {  
	            e.printStackTrace(); 
	        }
	
}
}
