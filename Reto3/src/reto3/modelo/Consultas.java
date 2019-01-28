package reto3.modelo;

import java.sql.*;
import javax.swing.JOptionPane;


public class Consultas { /*ESTE ES EL CONSTRUCTOR DE LA CLASE CONSULTAS, ES DECIR, AL INSTANCIAR UN 
    OBJETO EN LA CLASE CONSULTAS SOLO SE EJECUTARÀ ESTO conectar con =new conectar() Connection reg=con.conexion();*/
public String us;
public String pass;
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
                     
                     String query="select * from cliente where Nombre='"+us+"'";//SENTENCIA SQL
                      Statement sentencia= reg.createStatement();// CREAR VARIABLE PARA HACER LA SENTENCIA (ES NECESARIO)
                         ResultSet resultado=sentencia.executeQuery(query);// LA VARIABLE DONDE SE VA A ALOJAR EL RESULTADO (ES NECESARIO)
                         
                             while (resultado.next())//ESTO SE REPETIRÀ EL NUMERO DE FILAS QUE SE SELECCIONEN DE LA BASES DE DATOS
                                  {
                                 
                                      String dni=resultado.getString("DNI");
                                      String nombre=resultado.getString("Nombre");
                                      String fecha_nac=resultado.getString("Fecha_nac");
                                      String contrasena=resultado.getString("contraseña");
                                      String apellidos=resultado.getString("Apellidos");
                                      String sexo=resultado.getString("Sexo");
                                      cliente cliente= new cliente(dni,nombre,apellidos,contrasena,fecha_nac,sexo);// SE DEBE CREAR EL OBJETO CLIENTE CON LOS VALORES OBTENIDOS DE LA CONSULTA
                                  return cliente;// DEVOLVEMOS EL OBJETO 
                             }
                     
                    
          

                 }
                 catch (Exception e) // SI SE PRODUCE UN ERROR
                 {
                     System.err.println("Hubo un Error ");
                     System.err.println(e.getMessage());
                     JOptionPane.showMessageDialog(null,"Hubo un error");
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
                      while (resultado.next())//ESTO SE REPETIRÀ EL NUMERO DE FILAS QUE SE SELECCIONEN DE LA BASES DE DATOS
                                  {
                          lineas lineas= new lineas(resultado.getString("Cod_Linea"),resultado.getString("Nombre"));
                        return lineas; 
                                 }
                    
                         }
                        catch (Exception e) 
                        {
                          System.err.println("Hubo un Error ");
                             System.err.println(e.getMessage());
                            }
                          return null;
                }  

    public cliente ObtenerCliente(String dni, String nombre, String apellidos, String contraseña, String gruposexo, Date fecha_nac) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
}

//este de las paradas y eso!
//SELECT * FROM (linea-parada join parada on linea-parada.Cod_Parada=parada.Cod_Parada) join linea on Cod_linea = Cod_linea 