package reto3;
import reto3.vista.Saludo;  
import reto3.controlador.pasar_pagina;

public class Reto3 {

    public static void main(String[] args)
    {
       Saludo saludo1 = new Saludo();
       pasar_pagina pasar=new pasar_pagina(saludo1);
        saludo1.setTitle("¡BIENVENID@S!");
        saludo1.setVisible(true);
    }
    
}
