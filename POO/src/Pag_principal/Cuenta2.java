package Pag_principal;

import java.util.Scanner;
import poo.Retirar2;

public class Cuenta2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Retirar2 usuario = new Retirar2();
        usuario.ingresarUsuario();
        
        String salir;
        while(true){
            usuario.retiro_ingreso(0, 0, 0);
            System.out.println(usuario.getTitular()+" está seguro que desea salir? (si/no)");
            salir=leer.nextLine();
            if(salir.equalsIgnoreCase("no")){
                continue;
            }else if (salir.equalsIgnoreCase("si")){
                break;
            }
        }
        
    }
    
}
