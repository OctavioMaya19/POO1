package Pag_principal;

import java.util.Scanner;
import poo.Crea_juego;

public class Juego {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Crea_juego game = new Crea_juego();
        
        game.Iniciar_juego(0, 0, 0);
    }
}
