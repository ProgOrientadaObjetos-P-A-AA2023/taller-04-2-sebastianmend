/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author sebas
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fabricante fabricante1 = new Fabricante();
        Auto carro1 = new Auto();
        carro1.establecerFabricante(fabricante1);
        carro1.calcularVMatricula();
        System.out.printf("%s\n", carro1);

        Fabricante f2 = new Fabricante("Toyota", "Japón");
        Auto a2 = new Auto("23543123", fabricante1, 2020, 30000);
        a2.establecerFabricante(f2);
        a2.calcularVMatricula();
        System.out.printf("%s\n", a2);
        
        
        
        // TODO code application logic here
    }
    
}
