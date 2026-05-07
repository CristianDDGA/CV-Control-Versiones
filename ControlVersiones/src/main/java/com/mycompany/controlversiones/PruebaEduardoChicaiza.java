
package com.mycompany.controlversiones;

public class PruebaEduardoChicaiza {
   private double nota1; 
   private double nota2;

    public PruebaEduardoChicaiza(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
   
    public double calcularPromedio(){
        double promedio = (this.nota1 + this.nota2)/2;
        return promedio;
    }
    
    public String verificarEstado(){
        if(calcularPromedio() >= 7){
            return "Aprobado";
        }else{
            return "Reprobado";
        }
    }
    
    public static void main(String[] args) {
        PruebaEduardoChicaiza obj = new PruebaEduardoChicaiza(9.5, 7.5);
        System.out.println("El promedio es: " + obj.calcularPromedio());
        System.out.println("Estado: " + obj.verificarEstado());
        System.out.println("Nota 1: " + obj.getNota1());
    }
}
