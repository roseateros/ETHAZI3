package reto3.modelo;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Consultas { /*ESTE ES EL CONSTRUCTOR DE LA CLASE CONSULTAS, ES DECIR, AL INSTANCIAR UN 
    OBJETO EN LA CLASE CONSULTAS SOLO SE EJECUTARÀ ESTO conectar con =new conectar() Connection reg=con.conexion();*/

    public String us;
    public String pass;
    public String linea;
    public String color;

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
                        return null;
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
    
    public  cliente BorrarCliente(String us,String pass){
        try {  
            
            Statement st = reg.createStatement();
             st.executeUpdate("delete from cliente where Nombre='"+us+"' AND contraseña='"+pass+"'"); 
           
            reg.close(); 
        } catch (Exception e) { 

            System.err.println(e.getMessage()); 
        } 
       
        return null;
    }
    
    public cliente ActualizarCliente( String dni,String nombre,String apellidos,String contraseña, String sexo, String fecha)
        {
        try {  
            
            Statement st = reg.createStatement();
             st.executeUpdate("UPDATE `cliente` SET `Nombre`='"+nombre+"',`Apellidos`='"+apellidos+"',`Fecha_nac`='"+fecha+"',`Sexo`='"+sexo+"',`Contraseña`='"+contraseña+"' WHERE DNI='"+dni+"'"); 
           
            reg.close(); 
        } catch (Exception e) { 

            System.err.println(e.getMessage()); 
        } 
       
        return null;
    } 
   // public String ObtenerBoleto()
   // {                    
     //   try{
     //       String query="SELECT * FROM (linea-parada join parada on linea-parada.Cod_Parada=parada.Cod_Parada) join linea on Cod_linea = Cod_linea";
      //      Statement sentencia= reg.createStatement();
      //      ResultSet resultado=sentencia.executeQuery(query);
      //      while (resultado.next())//ESTO SE REPETIRÀ EL NUMERO DE FILAS QUE SE SELECCIONEN DE LA BASES DE DATOS
      //      {                        
      //          ObtenerBoleto billete= new billete(resultado.getString(cod_Billete), resultado.getString(NTrayecto), resultado.getString(dni), resultado.getString(fecha), resultado.getString(hora), resultado.getString(Cod_Linea), resultado.getString(Cod_Bus), resultado.getString(Cod_Parada_Inicio), resultado.getString(Cod_Parada_Fin), resultado.getString(precio));
      //          
      //          return billete; 
      //      }
      //            
      //      }
      //  catch (Exception e) 
      //  {
     //       System.err.println("Hubo un Error ");
     //       System.err.println(e.getMessage());
     //       }
     //   
     //       return null;
     //   }  
     
    public ArrayList<Parada> ObtenerParadas(lineas lineas)
    {
      //SELECT         
    try{
        String query="SELECT parada.Cod_Parada,parada.Nombre,parada.Calle,parada.Latitud,parada.Longitud FROM parada join linea_parada on linea_parada.Cod_Parada=parada.Cod_Parada where linea_parada.Cod_Linea='"+lineas.Cod_Linea+"'";
        Statement sentencia = reg.createStatement(); 
        ResultSet resultado=sentencia.executeQuery(query);
        ArrayList<Parada> paradox=new ArrayList();

         while (resultado.next())
        {
              Parada parax= new Parada(resultado.getInt("Cod_Parada"),resultado.getString("Nombre"),resultado.getString("Calle"),resultado.getFloat("Latitud"),resultado.getFloat("Longitud")); 
              paradox.add(parax);
        }
         return paradox;
            
        }        
    
    catch (SQLException ex) 
    {
        System.err.println("Hubo un Error ");
    }       
       return null;
    }   

    public lineas ObtenerLineas(String linea)
    {           
        
        try{
            String query="SELECT * FROM `linea` WHERE `Cod_Linea` LIKE '"+linea+"'";
            Statement sentencia= reg.createStatement();
            ResultSet resultado=sentencia.executeQuery(query);
            while (resultado.next())
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
        
        public  ArrayList<autobus> datosAutobus(lineas lineas) {
		
	try {
            String query=(" SELECT autobus.Color, autobus.Cod_bus, autobus.N_plazas, autobus.Consumo_km, linea_autobus.Cod_bus from autobus INNER JOIN linea_autobus ON autobus.Cod_bus=linea_autobus.Cod_bus WHERE linea_autobus.Cod_linea='"+lineas.Cod_Linea+"'");
            Statement sentencia= reg.createStatement();
            ResultSet resultado=sentencia.executeQuery(query);
            ArrayList<autobus> busx=new ArrayList();
            while (resultado.next()){
                        
                autobus bus= new autobus(resultado.getString("color"), resultado.getInt("Cod_Bus"), resultado.getInt("N_Plazas"), resultado.getDouble("Consumo_km"));
                busx.add(bus);

            }
                return busx;    
            }
        catch (Exception e) 
        {
            System.err.println("Hubo un Error ");
            System.err.println(e.getMessage());
            }       
            return null;
        }
        
}

//  SELECT COUNT(*) FROM billete where color_bus = "'+azul+'"
// plazas no disponible! //and
//INSERT INTO `billete` (`Cod_Billete`, `NTrayecto`, `Cod_Linea`, `Cod_Bus`, `Cod_Parada_Inicio`, `Cod_Parada_Fin`, `Fecha`, `Hora`, `DNI`, `Precio`) VALUES (NULL, '', '', '', '', '', '', '', '', '')


//este de las paradas y eso!!
//SELECT * FROM (linea-parada join parada on linea-parada.Cod_Parada=parada.Cod_Parada) join linea on Cod_linea = Cod_linea 

//es para insert de billete
//INSERT INTO `billete` (`Cod_Billete`, `NTrayecto`, `Cod_Linea`, `Cod_Bus`, `Cod_Parada_Inicio`, `Cod_Parada_Fin`, `Fecha`, `Hora`, `DNI`, `Precio`) VALUES (NULL, '', '', '', '', '', '', '', '', '')
//este de las paradas y eso!
// 
