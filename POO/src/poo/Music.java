package poo;

public class Music {

    private String titulo;
    private String autor;

    public Music() {
    }

    public Music(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void mostrarDatos() {
        System.out.println("titulo: " + titulo);
        System.out.println("autor: " + autor);
    }
}
