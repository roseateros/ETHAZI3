
package reto3.modelo;

import java.util.Date;


public class cliente {
    public String DNI,nombre,apellidos,contraseña;
    public Date fecha_nac;
    
    public void cliente(String DNI,String nombre,String apellidos,String contraseña,Date fecha_nac)
    {
    this.DNI=DNI;
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.contraseña=contraseña;
    this.fecha_nac=fecha_nac;
    }
    
}
