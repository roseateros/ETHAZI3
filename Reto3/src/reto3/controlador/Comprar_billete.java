
package reto3.controlador;

import reto3.modelo.cliente;
import reto3.modelo.lineas;

public class Comprar_billete {
    public cliente cliente;
    public lineas lineas;
    public Comprar_billete(cliente cliente,lineas lineas){
    reto3.controlador.pasar_pagina.paradas_a_lista(cliente,lineas);   
    }   
}
