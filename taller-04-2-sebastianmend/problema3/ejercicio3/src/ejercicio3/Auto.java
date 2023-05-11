/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author sebas
 */
public class Auto {
     private String cedula;
    private Fabricante fabricante;
    private int anio;
    private double valorV;
    private double valorM;
    
    public Auto() {
        cedula = "11050042974";
        anio = 2018;
        valorV = 19000;
    }

    public Auto(String c, Fabricante f, int a, double vV) {
        cedula = c;
        fabricante = f;
        anio = a;
        valorV = vV;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerFabricante(Fabricante c) {
        fabricante = c;
    }

    public void establecerAnio(int c) {
        anio = c;
    }

    public void establecerVVehiculo(double c) {
        valorV = c;
    }

    public void calcularVMatricula() {
        valorM = 0.00002 * valorV * (2023 - anio);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public Fabricante obtenerFabricante() {
        return fabricante;
    }

    public int obtenerAnio() {
        return anio;
    }

    public double obtenerVVehiculo() {
        return valorV;
    }

    public double obtenerVMatricula() {
        return valorM;
    }

    @Override
    public String toString() {
        String mensaje = String.format("""
                                       Cedula: %s
                                       Nombre de Fabricante: %s
                                       Ciudad de Origen: %s
                                       Año de Fabricaci0n: %d
                                       Valor del Vehiculo: %.2f
                                       Valor de la Matricula: %.2f
                                       """,
                cedula,
                obtenerFabricante().obtenerNombre(),
                obtenerFabricante().obtenerCiudad(),
                anio,
                valorV,
                valorM);
        return mensaje;
    } 
}
