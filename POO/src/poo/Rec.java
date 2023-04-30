package poo;

import java.util.Scanner;

public class Rec {

    Scanner leer = new Scanner(System.in);

    private int base;
    private int altura;

    public Rec() {
    }

    public Rec(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearResctangulo() {
        System.out.println("ingrese la base del rectangulo: ");
        base = leer.nextInt();
        System.out.println("ingrese la altura del rectangulo: ");
        altura = leer.nextInt();
    }

    public int superficie(int sup) {
        sup = base * altura;
        return sup;
    }

    public int perimetro(int per) {
        per = (base + altura) * 2;
        return per;
    }

    public void dibujaRectangulo() {
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
