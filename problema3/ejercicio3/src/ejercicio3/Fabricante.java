/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author sebas
 */
public class Fabricante {
 private String nombre;
    private String ciudad;

    public Fabricante() {
        nombre = "Hyundai ";
        ciudad = "Corea";
    }

    public Fabricante(String n, String c) {
        nombre = n;
        ciudad = c;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCiudad(String c) {
        ciudad = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCiudad() {
        return ciudad;
    }   
}
