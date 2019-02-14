
package reto3.modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class ArchivoTxtUsuario {
    
        public cliente clientex;
        public ArrayList<String> Insertar;
        String ruta= "src\\reto3\\modelo\\Usuarios.txt";
        
    public ArchivoTxtUsuario(cliente cliente){
       
        clientex=cliente; 
        String mensaje =         " \n"
				+"                                                             CLIENTES                        "+" \t\n"
				+" **********************************************************************************************************************"+" \t\n"
				+" -DNI:"+clientex.dni+"  \t\n"
				+" -Nombre:"+clientex.nombre+"  \t"+"-Apellidos: " +clientex.apellidos+" \n"  
				+" -Sexo: " +clientex.sexo+" \t\t"+ "-Fecha de Nacimiento: " +clientex.fecha+" \t\n"
				+" -Contraseña: "+clientex.contraseña+"  \t\n"
				+" **********************************************************************************************************************"+" \t\n";

        Insertar =new ArrayList();
        Insertar.add(mensaje);
        generarTXT();
        
    }
    	
    public void generarTXT(){
            try{
                FileWriter archivo = new FileWriter(this.ruta);
                for(int x=0;x<Insertar.size();x++){
                archivo.write(Insertar.get(x));
                }
                archivo.close();
            }catch(IOException e){
                e.getMessage();
            }
        }	
}
