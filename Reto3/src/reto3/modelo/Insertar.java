package reto3.modelo;

import java.sql.*;


public class Insertar {
    
        public  int vari=5;
        conectar con =new conectar();
        Connection reg=con.conexion();
        
    public cliente InsertarCliente( String dni,String nombre,String apellidos,String contraseña, String sexo, String fecha)
    {
        try {  
            
            Statement st = reg.createStatement();
             st.executeUpdate("INSERT INTO cliente (DNI, Nombre, Apellidos, Fecha_nac, Sexo, Contraseña) VALUES ('"+dni+"', '"+nombre+"', '"+apellidos+"','"+fecha+"','"+sexo+"', '"+contraseña+"')"); 
           
            reg.close(); 
        } catch (Exception e) { 
            System.err.println("cannot insert!"+fecha); 
            System.err.println(e.getMessage()); 
        } 
       
        return null;
    }
    
     public String InsertarBillete(int cod_Billete, int NTrayecto, String dni, String fecha, String hora, String Cod_Linea, String Cod_Bus, String Cod_Parada_Inicio, String Cod_Parada_Fin, double precio)
    {
            try {  
            Statement st = reg.createStatement(); 
            st.executeUpdate("INSERT INTO `billete`(`NTrayecto`, `Cod_Linea`, `Cod_Bus`, `Cod_Parada_Inicio`, `Cod_Parada_Fin`, `Fecha`, `Hora`, `DNI`, `Precio`) VALUES ("+NTrayecto+", '"+Cod_Linea+"', '"+Cod_Bus+"', '"+Cod_Parada_Inicio+"', '"+Cod_Parada_Fin+"', '"+fecha+"', '"+hora+"', '"+dni+"', "+precio+")"); 
            reg.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
        return null;
    }    
}
