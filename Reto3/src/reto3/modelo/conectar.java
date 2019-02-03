
package reto3.modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectar {
String  maquina,  usuario,  clave, servidor;
int puerto= 3306;
Connection conectar=null;

public Connection conexion(){
    	String fichero = "src\\reto3\\modelo\\conectar.txt";
    	int cont =0;
        String server="jdbc:mysql://";
        
            try {
    		      FileReader fr = new FileReader(fichero);
    		      BufferedReader br = new BufferedReader(fr);
    		 
    		      String linea;
    		      while((linea = br.readLine()) != null) {
    		    	  System.out.println(linea);
    		        if(cont==0) {
    		        	this.maquina=linea;}
    		      	if (cont==1) {
    		      		this.usuario=linea;}
    		      	if (cont==2) {
    		      		this.clave=linea;}
    		      	cont++;
    		      	linea="";
    		      	}
    		      
    		        if (cont==3) {
                                this.servidor="";  		    	  
    		    }  		 
    		        fr.close();
    		    }
            catch(Exception e) {
    		      System.out.println("Excepcion leyendo fichero "+ fichero + ": " + e);
    		    }
    	
    	this.servidor="jdbc:mysql://"+this.maquina+":"+ this.puerto+"/";

        //Registrar el driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("ERROR AL REGISTRAR EL DRIVER");
            System.exit(0); //parar la ejecución
        }
 
        //Establecer la conexión con el servidor
        try {
            conectar = DriverManager.getConnection("jdbc:mysql://"+this.maquina,this.usuario, this.clave);
        } catch (SQLException e) {
            System.err.println("ERROR AL CONECTAR CON EL SERVIDOR");
            System.exit(0); //parar la ejecución
        }
        System.out.println("Conectado a BBDD");
        
    return conectar;
}
       public static void main(String[] args) {
       conectar conexion = new conectar();

    }
}