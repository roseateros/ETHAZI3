/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3.controlador;

import reto3.modelo.Consultas;


public class Nplazas {


    
     public int Nplazasx(int Cod_bus,int numero_plazas){
         Consultas cone =new Consultas();
         int numerito= cone.NPlazas(Cod_bus);
         numerito=numero_plazas-numerito;
         return numerito;
     }
    
}
