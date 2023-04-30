package poo;

import java.util.Scanner;

public class Librero {

    private String ISBN;
    private String titulo;
    private String autor;
    private int numPag;

    public Librero() {
    }

    public Librero(String ISBN, String titulo, String autor, int numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public void cargarLibro() {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese el ISBN: ");
        ISBN = leer.nextLine();

        System.out.println("ingrese el titulo del libro: ");
        titulo = leer.nextLine();

        System.out.println("ingrese el autor del libro: ");
        autor = leer.nextLine();

        System.out.println("ingrese el numero de paginas: ");
        numPag = leer.nextInt();
    }

    public void muestraLibro() {
        System.out.println(this.ISBN);
        System.out.println(this.titulo);
        System.out.println(this.autor);
        System.out.println(this.numPag);

    }

}
//set se establecer 
//get es 