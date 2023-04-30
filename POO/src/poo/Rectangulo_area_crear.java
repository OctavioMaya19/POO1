package poo;

public class Rectangulo_area_crear {
    private int lado1;
    private int lado2;

    public Rectangulo_area_crear(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public int calcula_area (int area){
        area=lado1*lado2;
        return area;
    }
}
