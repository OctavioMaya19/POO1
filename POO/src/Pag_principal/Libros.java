package Pag_principal;

import java.util.Scanner;
import poo.Librero;

public class Libros {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Librero primerLibro = new Librero();

        System.out.println("cuantos libros desea agregar: ");
        int num = leer.nextInt();

        for (int i = 0; i < num; i++) {
            primerLibro.cargarLibro();
            primerLibro.muestraLibro();

        }

    }

}
