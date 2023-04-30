package poo;

import java.util.Scanner;

public class Oper {

    Scanner leer = new Scanner(System.in);

    private int num1;
    private int num2;

    public Oper() {
    }

    public Oper(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void crearOperacion() {
        System.out.println("ingrese el primer nuemero: ");
        num1 = leer.nextInt();
        System.out.println("ingrese el segundo nuemero: ");
        num2 = leer.nextInt();
    }

    public int sumar(int suma) {
        suma = num1 + num2;
        return suma;
    }

    public int restar(int resta) {
        resta = num1 - num2;
        return resta;
    }

    public int multiplicar(int mult) {
        if (num1 != 0 || num2 != 0) {
            mult = num1 * num2;
        } else {
            System.out.println("ERROR: si se multiplica por 0 el resultado es 0");
        }
        return mult;
    }

    public double dividir(double div) {
        if (num1 != 0 || num2 != 0) {
            div = num1 / num2;
        } else {
            System.out.println("ERROR: unos de los numeros es 0");
        }
        return div;
    }

}
