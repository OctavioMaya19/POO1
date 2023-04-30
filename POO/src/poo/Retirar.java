package poo;

import java.util.Scanner;

public class Retirar {

    Scanner leer = new Scanner(System.in);

    private int saldo;
    private String titular;

    public Retirar() {
    }

    public Retirar(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void ingresarDinero() {
        System.out.print("nombre del titular: ");
        titular = leer.nextLine();
        System.out.print("cantidad de dinero que desea ingresar a la cuenta: ");
        saldo = leer.nextInt();
    }

    public void retirarDinero(int retirar, int resto) {
        System.out.println("cuanto dinero desea retirar?");
        retirar = leer.nextInt();

        if (retirar > saldo) {
            System.out.println("ERROR, su saldo es menor a lo que intenta retirar, intente nuevamente");
            System.out.println("saldo: " + saldo);
            retirar = leer.nextInt();
        }
        saldo = saldo - retirar;
        System.out.println("has retirado "+retirar+" de tu cuenta");
        System.out.println("saldo actual: "+saldo);
    }

}
