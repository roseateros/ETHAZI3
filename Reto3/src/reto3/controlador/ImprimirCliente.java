
package reto3.controlador;

import java.io.FileWriter;
import java.io.PrintWriter;
import reto3.modelo.Consultas;
import reto3.modelo.cliente;

public class ImprimirCliente {

    
    public ImprimirCliente(String dni,String nombre,String apellidos, String fecha, String sexo, String contraseña, String password){
        
        Consultas cone =new Consultas();
        cliente cliente;
        cliente = cone.ObtenerCliente(nombre,contraseña);
    }
    public static void cargarFicheroUsuario() {

        FileWriter fw1= null;
        try {
            fw1 = new FileWriter("src\\reto3\\modelo\\Usuarios.txt");
            PrintWriter pw1 = new PrintWriter(fw1);
            escribirFicheo1(pw1);
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }finally{
            try {
                if (fw1 != null) {
                    fw1.close();
                }
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            }
        }
    }
    public static void escribirFicheo1(PrintWriter pw1) throws Exception{

        for (int i = 0; i < 5; i++) {        
                pw1.println();
            }
 
        }
}
