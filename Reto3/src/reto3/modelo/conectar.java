package reto3.modelo;

import java.sql.Connection;
import java.beans.Statement;
import java.sql.DriverManager;

public class conectar {
Connection conectar=null;
public Connection conexion(){
try{
Class.forName("com.mysql.jdbc.Driver");
      conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/maquina","root","");
      System.out.println("Conexion establecida");

        }
catch(Exception e){
    System.out.println(e.getMessage());}

return conectar;
        }
    Statement createStatement() {
        throw new UnsupportedOperationException("Not yet implemented");

    }
       public static void main(String[] args) {
       conectar conexion = new conectar();

    }
}