package reto3.modelo;

import java.util.Date;

public class cliente {
    public String dni,nombre,apellidos,contraseña, gruposexo;
    public Date fecha_nac;
    
    public cliente(String dni,String nombre,String apellidos,String contraseña, String gruposexo, Date fecha_nac)
    {
    this.dni=dni;
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.contraseña=contraseña;
    this.fecha_nac=fecha_nac;
    this.gruposexo=gruposexo;
    }
}
