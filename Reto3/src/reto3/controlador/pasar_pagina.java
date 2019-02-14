package reto3.controlador;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import reto3.modelo.billete;
import reto3.modelo.cliente;
import reto3.modelo.lineas;
import reto3.vista.Actualizar;
import reto3.vista.Linea;
import reto3.vista.NoRegistrado;
import reto3.vista.Paradas;
import reto3.vista.Registrado;
import reto3.vista.Saludo;
import reto3.vista.Cobro;
import reto3.vista.Adios;
import reto3.vista.ImprimirTicket;
import reto3.vista.Lista;

public class pasar_pagina{
  
    public static int aux;
  
     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE SALUDO A REGISTRADO
    public static void classsaludoaregistrado(){
        //SE CREA EL OBJ DE LA CLASE REGISTRADO
        Registrado obj= new Registrado();
        obj.setVisible(true); 
    } ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE REGISTRADOR A NO REGISTRADO
    public static void registrado_a_noregistrado(){
        //SE CREA EL OBJ DE LA CLASE NOREGISTRADO
        NoRegistrado obj= new NoRegistrado ();
        obj.setVisible(true);
    } ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE NOREGISTRADO A REGISTRADO
    public static void noregistrado_a_registrado(){
        //SE CREA EL OBJ DE LA CLASE REGISTRADO
        Registrado obj= new Registrado ();
        obj.setVisible(true);
    }    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE REGISTRADO A SALUDO
    public static void registrado_a_saludo(){
        //SE CREA EL OBJ DE LA CLASE SALUDO
        Saludo obj= new Saludo ();
        obj.setVisible(true);
    } ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
    //FUNCIONES PARA PASAR DE REGISTRADO A LINEASS
    //Se debe pasar El objeto CLiente con la case Cliente
     public static void registrado_a_lineas(cliente cliente){
        //SE CREA EL OBJ DE LA CLASE LINEA
        Linea obj= new Linea (cliente);
        obj.setVisible(true);
    }///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     //Se debe pasar El objeto CLiente con la case Cliente y Lineas 
    public static void registrado_a_lineas(cliente cliente,lineas lineas){
        //SE CREA EL OBJ DE LA CLASE LINEA
        Linea obj= new Linea (cliente,lineas);
        obj.setVisible(true);
    }///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE PARADAS A LINEAS
    public static void paradas_a_lineas(cliente cliente,lineas lineas){
        //SE CREA EL OBJ DE LA CLASE LINEA
        Linea obj= new Linea (cliente,lineas);
        obj.setVisible(true);  
    }

 public static void paradas_a_lineas(cliente cliente,lineas lineas,ArrayList<billete> billete){
        //SE CREA EL OBJ DE LA CLASE LINEA
        Linea obj= new Linea (cliente,lineas,billete);
        obj.setVisible(true);  
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE LINEAS A PARADAS
    //Se debe pasar El objeto Cliente y el Objeto lineas DE SUS RESPECTIVAS CLASES
    public static void lineas_a_paradas(cliente cliente, lineas lineas,ArrayList<billete> billete){
        //SE CREA EL OBJ DE LA CLASE PARADAS
        Paradas obj= new Paradas (cliente,lineas,billete);
        obj.setVisible(true);
    }  
    public static void lineas_a_paradas(cliente cliente, lineas lineas){
        //SE CREA EL OBJ DE LA CLASE PARADAS
        Paradas obj= new Paradas (cliente,lineas);
        obj.setVisible(true);
    }///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // FUNCION PARA PASAR DE PARADAS A LISTA
    public static void paradas_a_lista(cliente cliente,lineas lineas,ArrayList<billete> billete){
        //SE CREA EL OBJ DE LA CLASE LISTA
        Lista obj= new Lista (cliente,lineas,billete);
        obj.setVisible(true);
    }///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE LISTA A PARADAS
    public static void lista_a_paradas(cliente cliente,lineas lineas){
        //SE CREA EL OBJ DE LA CLASE PARADAS    
        Paradas obj= new Paradas (cliente,lineas);
        obj.setVisible(true);
    }///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCION PARA PASAR DE LISTA A COBRO
    public static void lista_a_cobro(cliente cliente,lineas lineas, ArrayList<billete> billete){
        //SE CREA EL OBJ DE LA CLASE COBRO
        Cobro obj = new Cobro(cliente,lineas,billete);
        obj.setVisible(true);
    }///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     //FUNCION PARA PASAR DE LISTA A LINEAS
    public static void lista_a_lineas(cliente cliente,lineas lineas,ArrayList<billete> billete){
        //SE CREA EL OBJ DE LA CLASE LINEA
         Linea obj= new Linea (cliente,lineas,billete);
        obj.setVisible(true);  
    }///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCIÒN PARA PASAR DE COBRO A COBRO
    public static void cobro_a_cobro(cliente cliente,lineas lineas, ArrayList<billete> billete){
        //SE CREA EL OBJ DE LA CLASE IMPRIMIR
        Cobro obj = new Cobro(cliente, lineas,billete);
        obj.setVisible(true);
    }///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCIÒN PARA PASAR DE COBRO A IMPRIMIR
    public static void cobro_a_imprimir(cliente cliente,ArrayList<billete> billete){
        //SE CREA EL OBJ DE LA CLASE IMPRIMIR
        ImprimirTicket obj = new ImprimirTicket(cliente,billete);
        obj.setVisible(true);
    }///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //FUNCIÒN PARA PASAR DE IMPRIMIR A ADIOS 
    public static void imprimir_a_adios(){
        //SE CREA EL OBJ DE LA CLASE ADIOS
        Adios obj = new Adios();
        obj.setVisible(true);
    }///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     //FUNCIÒN PARA PASAR DE ADIOS A IMPRIMIR
    public static void adios_a_saludo(){
        //SE CREA EL OBJ DE LA CLASE ADIOS
        Saludo obj = new Saludo();
        obj.setVisible(true);
    }///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     //FUNCIÒN PARA PASAR DE REGISTRO A ACTUALIZAR
    public static void registro_a_actualizar(cliente clientex){
         //SE CREA EL OBJ DE LA CLASE ACTUALIZAR
         Actualizar obj = new Actualizar(clientex);
         obj.setVisible(true);
     }
}


