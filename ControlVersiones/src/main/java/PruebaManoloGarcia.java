/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manolo
 */
public class PruebaManoloGarcia {

    private String nombreColaborador;
    private String detallePrueba;

    public PruebaManoloGarcia(String nombre, String detalle) {
        this.nombreColaborador = nombre;
        this.detallePrueba = detalle;
    }

    public String getNombreColaborador() {
        return nombreColaborador;
    }

    public void setNombreColaborador(String nombreColaborador) {
        this.nombreColaborador = nombreColaborador;
    }

    public String getDetallePrueba() {
        return detallePrueba;
    }

    public void setDetallePrueba(String detallePrueba) {
        this.detallePrueba = detallePrueba;
    }

    public static void main(String[] args) {
        PruebaManoloGarcia prueba = new PruebaManoloGarcia("Manolo Jose Garcia Amores", "Prueba de Commit y Push");
        System.out.println("Colaborador: " + prueba.getNombreColaborador());
        System.out.println("Estado: " + prueba.getDetallePrueba());
    }
}
