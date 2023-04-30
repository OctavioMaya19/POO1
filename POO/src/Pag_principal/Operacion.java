package Pag_principal;

import java.util.Scanner;
import poo.Oper;

public class Operacion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Oper operacion = new Oper();
        operacion.crearOperacion();
        System.out.println("suma: " + operacion.sumar(0));
        System.out.println("resta: " + operacion.restar(0));
        System.out.println("multiplicacion: " + operacion.multiplicar(0));
        System.out.println("divicion: " + operacion.dividir(0));

    }

}
