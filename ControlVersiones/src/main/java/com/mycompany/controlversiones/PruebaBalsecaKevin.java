
package com.mycompany.controlversiones;


public class PruebaBalsecaKevin {

    private String tituloVideojuego;
    private double horasJugadas;
    private boolean completadoAl100;

    // Constructor
    public PruebaBalsecaKevin(String tituloVideojuego, double horasJugadas, boolean completadoAl100) {
        this.tituloVideojuego = tituloVideojuego;
        this.horasJugadas = horasJugadas;
        this.completadoAl100 = completadoAl100;
    }

    // Getters y Setters
    public String getTituloVideojuego() {
        return tituloVideojuego;
    }

    public void setTituloVideojuego(String tituloVideojuego) {
        this.tituloVideojuego = tituloVideojuego;
    }

    public double getHorasJugadas() {
        return horasJugadas;
    }

    public void setHorasJugadas(double horasJugadas) {
        this.horasJugadas = horasJugadas;
    }

    public boolean isCompletadoAl100() {
        return completadoAl100;
    }

    public void setCompletadoAl100(boolean completadoAl100) {
        this.completadoAl100 = completadoAl100;
    }

    public String evaluarEstado() {
        if (completadoAl100) {
            return "Juego completado en su totalidad!";
        } else if (horasJugadas > 40) {
            return "Buen progreso en la campaña, pero aun faltan objetivos.";
        } else {
            return "Apenas comienza.";
        }
    }
    public static void main(String[] args) {
        PruebaBalsecaKevin miPrueba = new PruebaBalsecaKevin("Assassin's Creed IV", 90.75, true);
        System.out.println("Titulo: " + miPrueba.getTituloVideojuego());
        System.out.println("Tiempo de juego: " + miPrueba.getHorasJugadas() + " horas");
        System.out.println("Diagnostico: " + miPrueba.evaluarEstado());
    }
}
    

