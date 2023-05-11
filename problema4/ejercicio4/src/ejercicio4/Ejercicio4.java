/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author sebas
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Clientes cliente1 = new Clientes();
        Bancos banco1 = new Bancos();
        EntidadesFinancieras entidadf = new EntidadesFinancieras();
        entidadf.establecerClientes(cliente1);
        entidadf.establecerBancos(banco1);
        entidadf.calcularComisiones();
        System.out.printf("%s", entidadf);
        System.out.println("---------------------------------------------------");
        Clientes cliente2 = new Clientes("Juan", "Perez", 
                "11457570131");
        Bancos banco2 = new Bancos("Banco de Loja", 4);
        EntidadesFinancieras entidad2 = new EntidadesFinancieras(cliente2, banco2, 50100);
        entidad2.establecerClientes(cliente2);
        entidad2.establecerBancos(banco2);
        entidad2.calcularComisiones();
        System.out.printf("%s", entidad2);
        
        
        
        
        // TODO code application logic here
    }
    
}
