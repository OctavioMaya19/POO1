package poo;

import java.util.Scanner;

public class Circunferencia {

    Scanner leer = new Scanner(System.in);
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void crearCircunferencia() {
        radio = leer.nextInt();
        System.out.println("Radio: " + radio);
    }

    public void area(double iArea) {
        iArea = (Math.pow((Math.PI * radio), 2));
        System.out.println("Area: " + iArea);
    }

    public void perimetro(double iPerimetro) {
        iPerimetro = (2 * Math.PI * radio);
        System.out.println("Perimetro: " + iPerimetro);
    }
}
