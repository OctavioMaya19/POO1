package poo;

import java.util.Scanner;

public class Crea_juego {

    Scanner leer = new Scanner(System.in);
    private int num;
    private int num2;
    private int intMax;
    private String opcion;

    public Crea_juego() {
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public Crea_juego(int num) {
        this.num = num;
    }

    public int getIntMax() {
        return intMax;
    }

    public void setIntMax(int intMax) {
        this.intMax = intMax;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void Iniciar_juego(int cont, int ganar1, int ganar2) {
        ganar1 = 0;
        ganar2 = 0;
        
        do {
            System.out.println("jugador 1, ingrese un numero");
            num = leer.nextInt();
            intMax = 0;
            System.out.println("jugador 2, intente adivinar el numero en 3 intentos");

            while (intMax < 3) {
                System.out.println("intento: " + intMax);
                num2 = leer.nextInt();
                intMax++;
                if (num2 == num) {
                    intMax--;
                    System.out.println("felicidades, HAS GANADO!");
                    System.out.println("intentos: " + intMax);
                    ganar1++;
                    break;
                } else if (num2 < num) {
                    System.out.println("el numero ingresado es mas bajo");
                } else if (num2 > num) {
                    System.out.println("el numero ingresado es mas alto");
                }
            }
            if (intMax >= 3) {
                ganar2++;
            }
            System.out.println("jugador 1 ha ganado " + ganar2 + " vece/s");
            System.out.println("jugador 2 ha ganado " + ganar1 + " vece/s");
            System.out.println("desea continuar? (si/no)");
            opcion = leer.next();

        } while (opcion.equalsIgnoreCase("si"));
    }
}
