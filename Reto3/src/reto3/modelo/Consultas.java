package reto3.modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Consultas { /*ESTE ES EL CONSTRUCTOR DE LA CLASE CONSULTAS, ES DECIR, AL INSTANCIAR UN 
    OBJETO EN LA CLASE CONSULTAS SOLO SE EJECUTARÀ ESTO conectar con =new conectar() Connection reg=con.conexion();*/

    public String us;
    public String pass;
    public String linea;
    public String Autobus;
    public int Cod_bus;

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
                     int count=0;
                     String query="select * from cliente where Nombre='"+us+"' AND contraseña='"+pass+"'";//SENTENCIA SQL
                      Statement sentencia= reg.createStatement();// CREAR VARIABLE PARA HACER LA SENTENCIA (ES NECESARIO)
                         ResultSet resultado=sentencia.executeQuery(query);// LA VARIABLE DONDE SE VA A ALOJAR EL RESULTADO (ES NECESARIO)
                         
                             while (resultado.next())//ESTO SE REPETIRÀ EL NUMERO DE FILAS QUE SE SELECCIONEN DE LA BASES DE DATOS
                                  {
                                  count++;
                                      String dni=resultado.getString("DNI");
                                      String nombre=resultado.getString("Nombre");
                                      String fecha_nac=resultado.getString("Fecha_nac");
                                      String contrasena=resultado.getString("contraseña");
                                      String apellidos=resultado.getString("Apellidos");
                                      String sexo=resultado.getString("Sexo");
                                      cliente cliente= new cliente(dni,nombre,apellidos,contrasena,fecha_nac,sexo);// SE DEBE CREAR EL OBJETO CLIENTE CON LOS VALORES OBTENIDOS DE LA CONSULTA
                                  return cliente;// DEVOLVEMOS EL OBJETO 
                             }
                       if(count==0)
                    {
                        JOptionPane.showMessageDialog(null,"El usuario "+us+" No existe o as introducido mal la contraseña");
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
     
    public void ObtenerParadas(lineas lineas)
    {
              
    try {
        String query="SELECT parada.Cod_Parada,parada.Nombre,parada.Calle,parada.Latitud,parada.Longitud FROM parada join linea_parada on linea_parada.Cod_Parada=parada.Cod_Parada where linea_parada.Cod_Linea='"+linea+"'";
        Statement sentencia = reg.createStatement(); 
        ResultSet resultado=sentencia.executeQuery(query);
        ArrayList<Parada> paradox = null;
         while (resultado.next())
        {
              Parada parax= new Parada(resultado.getInt("Cod_Parada"),resultado.getString("Nombre"),resultado.getString("Calle"),resultado.getFloat("Latitud"),resultado.getFloat("Longitud")); 
              paradox.add(parax);
        }
        for(int i =0;i<paradox.size();i++)
        {
           System.out.println(paradox.get(i)); 
        }
         
    } 
    catch (SQLException ex) 
    {
        Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
    }
        
       
    }   

    public lineas ObtenerLineas(String linea)
    {                    
        try{
            String query="SELECT * FROM `linea` WHERE `Cod_Linea` LIKE '"+linea+"'";
            Statement sentencia= reg.createStatement();
            ResultSet resultado=sentencia.executeQuery(query);
            while (resultado.next())//ESTO SE REPETIRÀ EL NUMERO DE FILAS QUE SE SELECCIONEN DE LA BASES DE DATOS
            {                        
                lineas lineas= new lineas(resultado.getString("Cod_Linea"),resultado.getString("Nombre"));
                System.out.println(lineas.nombre);
                
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
        
        public autobus datosAutobus(String linea,int Cod_bus) {
		
	try {
            String query=("SELECT * FROM autobus, linea_autobus, linea WHERE autobus.Cod_bus=linea_autobus.Cod_bus AND linea_autobus.Cod_Linea=linea.Cod_Linea AND linea.Cod_Linea LIKE"+"'" +linea+"' AND autobus.Cod_bus ='"+Cod_bus+"'");
            Statement sentencia= reg.createStatement();
            ResultSet resultado=sentencia.executeQuery(query);
            while (resultado.next()){
                        
                autobus bus= new autobus(resultado.getString("color"), resultado.getInt("Cod_Bus"), resultado.getInt("N_Plazas"), resultado.getDouble("Consumo_km"));
                
                return bus;
            }
                  
            }
        catch (Exception e) 
        {
            System.err.println("Hubo un Error ");
            System.err.println(e.getMessage());
            }
        
            return null;
        }  
}

//este de las paradas y eso!
// 