package reto3.modelo;

public class cliente {
    
    public String dni,nombre,apellidos,contraseña, sexo, fecha;

    public cliente(String dni,String nombre,String apellidos,String contraseña, String fecha, String sexo)
    {
    this.dni=dni;
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.contraseña=contraseña;
    this.fecha=fecha;
    this.sexo=sexo;
    }
}
