/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author sebas
 */
public class Clientes {
    
 private String nombres;
    private String apellidos;
    private String cedula;

    public Clientes() {
        nombres = "Manuel";
        apellidos = "Picoita";
        cedula = "11052355016";
    }

    public Clientes(String n, String a, String c) {
        nombres = n;
        apellidos = a;
        cedula = c;
    }

    public void establecerNombres(String n) {
        nombres = n;
    }

    public void establecerApellidos(String a) {
        apellidos = a;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    public String obtenerCedula() {
        return cedula;
    }
}
