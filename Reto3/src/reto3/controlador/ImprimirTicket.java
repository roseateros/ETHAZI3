
package reto3.controlador;

import java.io.FileWriter;
import java.io.PrintWriter;
import static reto3.controlador.pasar_pagina.imprimir_a_adios;
import reto3.modelo.Consultas;

public class ImprimirTicket {
    
    public ImprimirTicket(){
        
        Consultas cone =new Consultas();
        //cone.ObtenerBoleto();                  
        imprimir_a_adios(); 
    }
    public static void cargarFicheroTicket() { 
        FileWriter fw1= null;
        try {
            fw1 = new FileWriter("src\\reto3\\modelo\\Billetes.txt" );
            PrintWriter pw1 = new PrintWriter(fw1);
            escribirFicheo1(pw1);
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }finally{
            try {
                if (fw1 != null) {
                    fw1.close();
                }
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            }
        }
    }
    public static void escribirFicheo1(PrintWriter pw1) throws Exception{

        for (int i = 0; i < 5; i++) {            
                pw1.println();
            }
 
        }
    
}