package Pag_principal;

import java.util.Scanner;
import poo.Circunferencia;

public class Circ {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Circunferencia circ = new Circunferencia(0);
        circ.crearCircunferencia();
        circ.area(0);
        circ.perimetro(0);
    }
}
