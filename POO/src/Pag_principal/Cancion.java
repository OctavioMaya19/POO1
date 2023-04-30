package Pag_principal;

import java.util.Scanner;
import poo.Music;

public class Cancion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese el titulo y luego el autor:");
        Music obj1 = new Music(leer.nextLine(), leer.nextLine());
        obj1.mostrarDatos();
    }
}
