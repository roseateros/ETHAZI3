package reto3.controlador;

import reto3.modelo.Consultas;
import reto3.modelo.cliente;
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
  
    public static int aux;
  
    public  Saludo saludo1;

    public pasar_pagina(Saludo saludo1) {
            
    }
    //FUNCION PARA PASAR DE SALUDO A REGISTRADO
    public static void classsaludoaregistrado(){
        //SE CREA EL OBJ DE LA CLASE REGISTRADO
        Registrado obj= new Registrado();
        obj.setVisible(true); 
    }
     
    //FUNCION PARA PASAR DE REGISTRADOR A NO REGISTRADO
    public static void registrado_a_noregistrado(){
        //SE CREA EL OBJ DE LA CLASE NOREGISTRADO
        NoRegistrado obj= new NoRegistrado ();
        obj.setVisible(true);
    }
    
    //FUNCION PARA PASAR DE NOREGISTRADO A REGISTRADO
    public static void noregistrado_a_registrado(){
        //SE CREA EL OBJ DE LA CLASE REGISTRADO
        Registrado obj= new Registrado ();
        obj.setVisible(true);
    }   
    
    //FUNCION PARA PASAR DE REGISTRADO A SALUDO
    public static void registrado_a_saludo(){
        //SE CREA EL OBJ DE LA CLASE SALUDO
        Saludo obj= new Saludo ();
        obj.setVisible(true);
    }
         
    //FUNCION PARA PASAR DE REGISTRADO A LINEASS
    public static void registrado_a_lineas(cliente cliente){
        //SE CREA EL OBJ DE LA CLASE LINEA
        Linea obj= new Linea (cliente);
        obj.setVisible(true);
    }  
    
    
        //FUNCION PARA PASAR DE LINEAS A REGISTRADO
        public static void paradas_a_lineas(cliente cliente){
        //SE CREA EL OBJ DE LA CLASE LINEA
         Linea obj= new Linea (cliente);
        obj.setVisible(true);
  
    } 
     
    //FUNCION PARA PASAR DE LINEAS A PARADAS
    public static void lineas_a_paradas(cliente cliente){
        //SE CREA EL OBJ DE LA CLASE PARADAS
        Paradas obj= new Paradas (cliente);
        obj.setVisible(true);
    }  
    
    // FUNCION PARA PASAR DE PARADAS A LISTA
    public static void paradas_a_lista(cliente cliente){
        //SE CREA EL OBJ DE LA CLASE LISTA
        lista obj= new lista (cliente);
        obj.setVisible(true);
    } 
    
    //FUNCION PARA PASAR DE LISTA A PARADAS
    public static void lista_a_paradas(cliente cliente)
    {
    //SE CREA EL OBJ DE LA CLASE PARADAS    
    Paradas obj= new Paradas (cliente);
    obj.setVisible(true);
    } 

    //FUNCION PARA PASAR DE LISTA A COBRO
    public static void lista_a_cobro(){
        //SE CREA EL OBJ DE LA CLASE COBRO
        Cobro obj = new Cobro();
        obj.setVisible(true);
    }
      
    //FUNCIÒN PARA PASAR DE COBRO A IMPRIMIR
    public static void cobro_a_imprimir(){
        //SE CREA EL OBJ DE LA CLASE IMPRIMIR
        ImprimirTicket obj = new ImprimirTicket();
        obj.setVisible(true);
    }
      
   //FUNCIÒN PARA PASAR DE IMPRIMIR A ADIOS 
    public static void imprimir_a_adios(){
        //SE CREA EL OBJ DE LA CLASE ADIOS
        Adios obj = new Adios();
        obj.setVisible(true);
    }
}
