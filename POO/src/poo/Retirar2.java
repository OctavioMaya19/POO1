package poo;

import java.util.Scanner;

public class Retirar2 {

    Scanner leer = new Scanner(System.in);

    private int saldo;
    private String titular;
    private String salir;

    public Retirar2() {
    }

    public Retirar2(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getSalir() {
        return salir;
    }

    public void setSalir(String salir) {
        this.salir = salir;
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

    public void ingresarUsuario() {
        System.out.print("nombre del titular: ");
        titular = leer.nextLine();
        
    }
    
    public void retiro_ingreso(int retirar, int opcion, int resto) {
            
        do{

            System.out.println("1.Ingresar dinero");
            System.out.println("2.Retirar dinero");
            System.out.println("3.Salir");
            opcion = leer.nextInt();

            switch (opcion){

                case 1:
                    System.out.print("cantidad de dinero que desea ingresar a la cuenta: $");
                    saldo = leer.nextInt();
                    System.out.println("titular: "+titular);
                    System.out.println("saldo actual: "+saldo);
                    break;

                case 2:
                    System.out.print(titular+" cuanto dinero desea retirar?: $");
                    retirar = leer.nextInt();

                    if (retirar > saldo) {
                        System.out.println("ERROR, su saldo es menor a lo que intenta retirar, intente nuevamente");
                        System.out.println("saldo: " + saldo);
                        retirar = leer.nextInt();

                    }
                    saldo = saldo - retirar;
                    System.out.println("titular: "+titular);
                    System.out.println("has retirado $"+retirar+" de tu cuenta");
                    System.out.println("saldo actual: "+saldo);
                    break;

                case 3:
                    break;
            }
        }while(opcion!=3);
    }
}