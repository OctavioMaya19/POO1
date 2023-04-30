package poo;

import java.util.Scanner;

public class CrearPunto {
    Scanner leer = new Scanner (System.in);
    
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private int punto1;
    private int punto2;
    

    public CrearPunto() {
    }

    public int getPunto1() {
        return punto1;
    }

    public void setPunto1(int punto1) {
        this.punto1 = punto1;
    }

    public int getPunto2() {
        return punto2;
    }

    public void setPunto2(int punto2) {
        this.punto2 = punto2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    public void crearPuntos(){
        System.out.println("ingrese el primer punto: ");
        System.out.println("x1");
        x1=leer.nextInt();
        System.out.println("y1");
        y1=leer.nextInt();
        
        System.out.println("ingrse el segundo punto: ");
        System.out.println("x2");
        x2=leer.nextInt();
        System.out.println("y2");
        y2=leer.nextInt();
    }
    
    public double calcular(double hipotenusa, double C1, double C2){
        
        C1= Math.pow((x1-x2),2);
        C2= Math.pow((y1-y2),2);
        hipotenusa= Math.sqrt((C1+C2));
        
        return hipotenusa;
    }
    
    
}
