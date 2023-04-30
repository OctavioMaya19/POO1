package poo;

import java.util.Scanner;

public class Calculo_empleado {

    Scanner leer = new Scanner(System.in);

    private String nombre;
    private int edad;
    private double salario;
    private double salarioAumentado;

    public Calculo_empleado() {
    }

    public double getSalarioAumentado() {
        return salarioAumentado;
    }

    public void setSalarioAumentado(double salarioAumentado) {
        this.salarioAumentado = salarioAumentado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void ingresaDatos() {

        System.out.println("ingrese nombre:");
        nombre = leer.nextLine();

        System.out.println("ingrese edad:");
        edad = leer.nextInt();

        System.out.println("ingrese salario:");
        salario = leer.nextInt();
    }

    public void calcularAumento() {
        if (edad <= 30) {
            salarioAumentado = salario * 0.05;
        } else if (edad > 30) {
            salarioAumentado = salario * 0.1;
        }

    }

    public void mostrarDato() {
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        if (edad <= 30) {
            System.out.println("tu salario se aumenta un %5");
        } else if (edad > 30) {
            System.out.println("tu salario se aumenta un %10");
        }
        System.out.println("aumento salarial: $ " + salarioAumentado);
        System.out.println("aumento salarial total: $ " + (salario + salarioAumentado));
    }

}
