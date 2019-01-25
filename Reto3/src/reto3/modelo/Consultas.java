package reto3.modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consultas {

        conectar con =new conectar();
        Connection reg=con.conexion();
        
    public  cliente ObtenerCliente(String us,String pass)
    {
       try {
            String query="select * from cliente where nombre='"+us+"' AND contraseña='"+pass+"'";
           Statement sentencia= reg.createStatement();
           ResultSet resultado=sentencia.executeQuery(query);

           
           while (resultado.next())
             {
                // String DNI=resultado.getString("DNI");
               // cliente cliente =new cliente(DNI); 
                 
                 /*int id = rs.getInt("id");
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        Date dateCreated = rs.getDate("date_created");
        boolean isAdmin = rs.getBoolean("is_admin");
        int numPoints = rs.getInt("num_points");*/
             }
           
           

         /*
          cliente cliente= new cliente("marico","marico","marico" );
           return cliente;
          */ 

       } catch (Exception e) {
          System.err.println("Hubo un Error ");
            System.err.println(e.getMessage());
       }
       return null;
    }
    
     public String ObtenerBoleto()
    {
        return "hola";
    }
     
      public String ObtenerParadas()
    {
        return "hola";
    }
     
                 public lineas ObtenerLineas(String linea)
                {
                        try 
                        {
                     String query="SELECT * FROM `linea` WHERE `Cod_Linea` LIKE '"+linea+"'";
                     Statement sentencia= reg.createStatement();
                     ResultSet resultado=sentencia.executeQuery(query);
                     lineas lineas= new lineas("info","info");
                     return lineas;
                         }
                        catch (Exception e) 
                        {
                          System.err.println("Hubo un Error ");
                             System.err.println(e.getMessage());
                            }
                          return null;
                }  
      
}
//es para paradas
//"SELECT * FROM parada, linea_parada, linea WHERE parada.Cod_Parada=linea_parada.Cod_Parada and linea.Cod_Linea=linea_parada.Cod_Linea AND linea.Cod_Linea like"+"'" +linea+"'""
//
//es para clientes
//select * from cliente;
//