
package reto3.modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consultas {
   public  int vari=5;
        conectar con =new conectar();
        Connection reg=con.conexion();
        
    public String ObtenerCliente()
    {
       try {
           Statement sentencia= reg.createStatement();
           ResultSet resultado;
           
       } catch (Exception e) {
          System.err.println("Hubo un Error ");
            System.err.println(e.getMessage());
       }
        return "hola";
    }
    
     public String ObtenerBoleto()
    {
        return "hola";
    }
     
      public String ObtenerParadas()
    {
        return "hola";
    }
     
      public String ObtenerLineas()
    {
        return "hola";
    }  
      
}
