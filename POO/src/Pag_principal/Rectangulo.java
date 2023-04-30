package Pag_principal;

import poo.Rec;

public class Rectangulo {

    public static void main(String[] args) {

        Rec obj1 = new Rec();
        obj1.crearResctangulo();
        System.out.println("Superficie: " + obj1.superficie(0));
        System.out.println("Perimetro: " + obj1.perimetro(0));
        obj1.dibujaRectangulo();
    }
}

