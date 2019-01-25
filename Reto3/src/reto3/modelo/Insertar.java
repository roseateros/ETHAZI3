package reto3.modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import reto3.vista.NoRegistrado;

public class Insertar {
    
   public  int vari=5;
        conectar con =new conectar();
        Connection reg=con.conexion();
        
    public String InsertarCliente()
    {
        try {  
            Statement st = reg.createStatement();
            st.executeUpdate("INSERT INTO `cliente` (`DNI`, `Nombre`, `Apellidos`, `Fecha_nac`, `Sexo`, `Contraseña`) VALUES ('"+NoRegistrado.+"', '', '', '', '', '')"); 
           
            reg.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
       
        return "Done!";
    }
    
     public String InsertarBillete()
    {
            try {  
            Statement st = reg.createStatement(); 
            st.executeUpdate("INSERT INTO billete ('Cod_Billete', 'NTrayecto', 'Cod_Linea', 'Cod_Bus', 'Cod_Parada_Inicio', 'Cod_Parada_Fin', 'Fecha', 'Hora', 'DNI', 'Precio') VALUES (NULL, '', '', '', '', '', '', '', '', '')"); 
            reg.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
        return "hola!";
    }
      
}
