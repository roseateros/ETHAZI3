
package reto3.controlador;

import java.util.Timer;
import java.util.TimerTask;

public class volverSaludo {
    
        public static int repe, aux;
        public static void volverBienvenida(){
        Timer timer = new Timer();
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                if (aux==0){
                   reto3.controlador.pasar_pagina.registrado_a_saludo();
                    aux=1;
                }
            }
        };    
         repe=5000;
         timer.schedule(tarea, 5000, repe);          
    }
}
