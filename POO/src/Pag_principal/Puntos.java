package Pag_principal;

import poo.CrearPunto;

public class Puntos {

    public static void main(String[] args) {
        
        CrearPunto point = new CrearPunto();
        
        point.crearPuntos();
        System.out.println(point.calcular(0, 0, 0));
    }
}
