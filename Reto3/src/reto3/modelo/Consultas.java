package reto3.modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consultas { /*ESTE ES EL CONSTRUCTOR DE LA CLASE CONSULTAS, ES DECIR, AL INSTANCIAR UN 
    OBJETO EN LA CLASE CONSULTAS SOLO SE EJECUTARÀ ESTO conectar con =new conectar() Connection reg=con.conexion();*/

        conectar con =new conectar(); //SOLO ESTO AL INSTANCIAR, ES NECESARIA PARA HACER LA CONEXIÒN//
        Connection reg=con.conexion();// SOLO ESTO AL INSTACIAR, ES NECESARIA PARA HACER LA CONEXIÒN//
        //DEBES CREAR EL METODO DEL MISMO TIPO QUE LA CLASE DEL OBJETO QUE DEBES DEVOLVER//
    public  cliente ObtenerCliente(String us,String pass) //ESTO ES UN METODO O FUNCIÒN DE LA CLASE CONSULTAS//
            /*PARA EJECUTAR ESTO DEBES PRIMERO INSTANCIAR UN OBJETO DE LA CLASE CONSULTAS Y LUEGO HACER ESTA
            DECLARACIÒN COMPLETA: (ESTO DEBE HACERSE EN EL CONTROLADOR CUANDO QUIERAS USAR ESTA CLASE Y ESTE METODO)
            Consultas cone =new Consultas();
            cliente cliente; ES NECESARIO DECLARAR OTRO OBJETO PORQUE EL MÈTODO OBTENERCLIENTE RETORNA UN OBJETO
            cliente = cone.ObtenerCliente(us,pass);*/
            {
                 try //EN EL CASO DONDE NO EXISTA NINGÙN ERROR
                 {
                     String query="select * from cliente where nombre='"+us+"' AND contraseña='"+pass+"'";//SENTENCIA SQL
                      Statement sentencia= reg.createStatement();// CREAR VARIABLE PARA HACER LA SENTENCIA (ES NECESARIO)
                         ResultSet resultado=sentencia.executeQuery(query);// LA VARIABLE DONDE SE VA A ALOJAR EL RESULTADO (ES NECESARIO)
                             while (resultado.next())//ESTO SE REPETIRÀ EL NUMERO DE FILAS QUE SE SELECCIONEN DE LA BASES DE DATOS
                                  {
                                      
                                  }
                     cliente cliente= new cliente("dni","nombre","pass","sdsds" );// SE DEBE CREAR EL OBJETO CLIENTE CON LOS VALORES OBTENIDOS DE LA CONSULTA
                     return cliente;// DEVOLVEMOS EL OBJETO 
          

                 }
                 catch (Exception e) // SI SE PRODUCE UN ERROR
                 {
                     System.err.println("Hubo un Error ");
                     System.err.println(e.getMessage());
                 }
       return null;// SI SE PRODUCE UN ERROR SE MANDA NULL
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