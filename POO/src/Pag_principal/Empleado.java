package Pag_principal;

import poo.Calculo_empleado;

public class Empleado {

    public static void main(String[] args) {

        Calculo_empleado emp1 = new Calculo_empleado();
        emp1.ingresaDatos();
        emp1.calcularAumento();
        emp1.mostrarDato();
    }
}
