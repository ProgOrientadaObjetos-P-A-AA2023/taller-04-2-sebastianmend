/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author sebas
 */
public class EntidadesFinancieras {
    private Clientes cliente;
    private Bancos banco;
    private double valorC;
    private double comision;

    public EntidadesFinancieras() {
        valorC = 74000;
    }

    public EntidadesFinancieras(Clientes c, Bancos b, double vC) {
        cliente = c;
        banco = b;
        valorC = vC;
    }

    public void establecerClientes(Clientes c) {
        cliente = c;
    }

    public void establecerBancos(Bancos c) {
        banco = c;
    }

    public void calcularVCheques(double c) {
        valorC = c;
    }

    public void calcularComisiones() {
        comision = 0.00003 * valorC;
    }

    public Clientes obtenerClientes() {
        return cliente;
    }

    public Bancos obtenerBancos() {
        return banco;
    }

    public double obtenerVCheques() {
        return valorC;
    }

    public double obtenerComisiones() {
        return comision;
    }

    @Override
    public String toString() {
        String mensaje = String.format("""
                                       -Nombres: %s
                                       -Apellidos: %s
                                       -Cédula: %s
                                       -Nombre del Banco: %s
                                       -Numero de Sucursales: %d
                                       -Valor del Cheque: %.2f
                                       -Comision: %.2f
                                       """,
                obtenerClientes().obtenerNombres(),
                obtenerClientes().obtenerApellidos(),
                obtenerClientes().obtenerCedula(),
                obtenerBancos().obtenerNombre(),
                obtenerBancos().obtenerNSucursales(),
                valorC,
                comision);
        return mensaje;
    }
}

