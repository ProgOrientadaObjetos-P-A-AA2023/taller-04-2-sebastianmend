/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author sebas
 */
public class Provincias {
    
 private String nombre;
    private int habitantes;

    public Provincias() {
        nombre = "Manabí";
        habitantes = 80000;
    }

    public Provincias(String n, int nH) {
        nombre = n;
        habitantes = nH;
    }

    public void establecerNombre(String k) {
        nombre = k;
    }

    public void establecerNHabitantes(int k) {
        habitantes = k;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNHabitantes() {
        return habitantes;
    }

}
