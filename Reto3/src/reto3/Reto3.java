package reto3;
import reto3.vista.Saludo;  
import reto3.controlador.pasar_pagina;

public class Reto3 {

    public static void main(String[] args){
       //Se crea El objeto saludo1 Instanciandolo en la clase saludo (VISTA) 
       Saludo saludo1 = new Saludo(); 
       //Se crea el objeto pasar de la clase Pasar_pagina (CONTROLADOR)
       pasar_pagina pasar=new pasar_pagina();
       saludo1.setTitle("¡BIENVENID@S!");
       saludo1.setVisible(true); // SE HACE VISIBLE LA VENTANA SALUDO
    }   
}
