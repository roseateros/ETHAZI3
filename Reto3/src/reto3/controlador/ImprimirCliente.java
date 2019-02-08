
package reto3.controlador;

import reto3.modelo.Consultas;
import reto3.modelo.cliente;

public class ImprimirCliente {
    
    public ImprimirCliente(String dni,String nombre,String apellidos, String fecha, String sexo, String contraseña, String password){
        
                     Consultas cone =new Consultas();
                     cliente cliente;
                     cliente = cone.ObtenerCliente(nombre,contraseña);
    }
}
