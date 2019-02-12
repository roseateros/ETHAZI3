/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3.controlador;

import java.util.ArrayList;
import reto3.modelo.Consultas;

/**
 *
 * @author RoboCop
 */
public class poblac {
    
    public String linea;

    
        public static ArrayList<String> poblac(String linea) {
        ArrayList<String> pobla=new ArrayList();   
      Consultas cone =new Consultas();
      pobla=cone.obtener_Poblacion(linea);
      return pobla;
    }
    
}
