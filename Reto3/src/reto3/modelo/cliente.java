package reto3.modelo;

public class cliente {
    
    public static String dni,nombre,apellidos,contraseña, sexo, fecha_nac;

    public cliente(String dni,String nombre,String apellidos,String contraseña, String fecha_nac, String sexo)
    {
    this.dni=dni;
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.contraseña=contraseña;
    this.fecha_nac=fecha_nac;
    this.sexo=sexo;
    }
}
