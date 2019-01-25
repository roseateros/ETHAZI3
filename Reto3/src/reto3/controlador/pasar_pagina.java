package reto3.controlador;

import reto3.modelo.Consultas;
import reto3.vista.Linea;
import reto3.vista.NoRegistrado;
import reto3.vista.Paradas;
import reto3.vista.Registrado;
import reto3.vista.Saludo;
import reto3.vista.Cobro;
import reto3.vista.Adios;
import reto3.vista.ImprimirTicket;
import reto3.vista.lista;

public class pasar_pagina{
    
  
    
    public  Saludo saludo1;

    public pasar_pagina(Saludo saludo1) {
            
    }
    
    public static void classsaludoaregistrado(){
        Registrado obj= new Registrado();
        obj.setVisible(true); 
    }
     
    public static void registrado_a_noregistrado(){
        NoRegistrado obj= new NoRegistrado ();
        obj.setVisible(true);
    }
    public static void noregistrado_a_registrado(){
        Registrado obj= new Registrado ();
        obj.setVisible(true);
    }      
    public static void registrado_a_saludo(){
        Saludo obj= new Saludo ();
        obj.setVisible(true);
    }
         
    public static void registrado_a_lineas(){
        Linea obj= new Linea ();
        obj.setVisible(true);
    }    
           
    public static void lineas_a_paradas(){
        Paradas obj= new Paradas ();
        obj.setVisible(true);
    }  
     
    public static void paradas_a_lista(){
        lista obj= new lista ();
        obj.setVisible(true);
    } 
    
    public static void lista_a_paradas(){
    Consultas cone =new Consultas();
    
    Paradas obj= new Paradas ();
    obj.setVisible(true);
    } 

    public static void lista_a_cobro(){
        Cobro obj = new Cobro();
        obj.setVisible(true);
    }
      
    public static void cobro_a_imprimir(){
        ImprimirTicket obj = new ImprimirTicket();
        obj.setVisible(true);
    }
      
    public static void imprimir_a_adios(){
        Adios obj = new Adios();
        obj.setVisible(true);
    }
}
