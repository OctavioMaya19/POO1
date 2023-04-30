package Pag_principal;

import poo.Retirar;

public class Cuenta {

    public static void main(String[] args) {
        Retirar usuario = new Retirar();
        usuario.ingresarDinero();
        usuario.retirarDinero(0, 0);
        
    }
    
}
