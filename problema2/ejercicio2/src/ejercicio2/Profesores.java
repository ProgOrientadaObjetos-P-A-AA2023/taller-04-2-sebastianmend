/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author sebas
 */
public class Profesores {
    
private String nombre;
    private String apellido;
    private String cedula;
    private double sueldoBasico;
    private double sueldoTotal;
    private Provincias provincia;

    public Profesores() {
        nombre = "Luis";
        apellido = "Morocho";
        cedula = "112325216";
        sueldoBasico = 2388;
    }

    public Profesores(String n, String a, double sB, String c, Provincias p) {
        nombre = n;
        apellido = a;
        cedula = c;
        sueldoBasico = sB;
        provincia = p;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerApellido(String c) {
        apellido = c;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establcerSueldoB(double c) {
        sueldoBasico = c;
    }

    public void calcaularSueldoT() {
        sueldoTotal = sueldoBasico+sueldoBasico * 0.2;
    }

    public void establecerProvincia(Provincias p) {
        provincia = p;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldoB() {
        return sueldoBasico;
    }

    public double obtenerSueldoT() {
        return sueldoTotal;
    }

    public Provincias obtenerProvincia() {
        return provincia;
    }

    @Override
    public String toString() {
        String mensaje = String.format("""
                                       -Nombre: %s
                                       -Apellido: %s
                                       -Sueldo Básico: %.2f
                                       -Sueldo Total: %.2f
                                       -Cédula: %s
                                       -Provincia: %s
                                       -Número de Habitantes: %d
                                       """,
                nombre,
                apellido,
                sueldoBasico,
                sueldoTotal,
                cedula,
                obtenerProvincia().obtenerNombre(),
                obtenerProvincia().obtenerNHabitantes());
        return mensaje;
    }
}
