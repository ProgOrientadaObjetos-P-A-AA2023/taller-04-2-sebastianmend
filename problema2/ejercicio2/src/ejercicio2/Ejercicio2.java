/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author sebas
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Provincias provincia1 = new Provincias();
        Profesores profesor1 = new Profesores();
        profesor1.establecerProvincia(provincia1);
        profesor1.calcaularSueldoT();
        System.out.printf("%s\n", profesor1);

        Provincias provincia2 = new Provincias("Loja", 120000);
        Profesores profesor2 = new Profesores("Juan", "Perez", 1000, 
                "1103025256", provincia2);
        profesor2.calcaularSueldoT();
        System.out.printf("%s", profesor2);
        // TODO code application logic here
    }
    
}
