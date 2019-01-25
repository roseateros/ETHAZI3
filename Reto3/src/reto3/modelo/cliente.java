package reto3.modelo;

import java.util.Date;

public class cliente {
    public String dni,nombre,apellidos,contraseña, gruposexo;
    public Date fecha_nac;
    
    public cliente(String dni,String nombre,String apellidos,String contraseña,Date fecha_nac)
    {
    this.dni=dni;
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.contraseña=contraseña;
    this.fecha_nac=fecha_nac;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getGruposexo() {
        return gruposexo;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setGruposexo(String gruposexo) {
        this.gruposexo = gruposexo;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }
    
}
