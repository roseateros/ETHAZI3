
package reto3.modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consultas {
   public  int vari=5;
        conectar con =new conectar();
        Connection reg=con.conexion();
        
    public String ObtenerCliente(String us,String pass)
    {
       try {
            String query="select * from cliente where nombre='"+us+"' AND contraseña='"+pass+"'";
           Statement sentencia= reg.createStatement();
           ResultSet resultado=sentencia.executeQuery(query);
           
           
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
//es para paradas
//"SELECT * FROM parada, linea_parada, linea WHERE parada.Cod_Parada=linea_parada.Cod_Parada and linea.Cod_Linea=linea_parada.Cod_Linea AND linea.Cod_Linea like"+"'" +linea+"'""
//
//es para clientes
//select * from cliente;
//