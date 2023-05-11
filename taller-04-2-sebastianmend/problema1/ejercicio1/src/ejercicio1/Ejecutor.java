/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author sebas
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estudiantes estudiante1=new Estudiantes();
        Universidad universidad1 = new Universidad();
        
        estudiante1.establecerUniversidad(universidad1);
        estudiante1.calcularPromedio();
        System.out.printf("%s\n", estudiante1);
        
         Universidad universidad2 = new Universidad("UNL", "Loja");
        Estudiantes estudiante2 = new Estudiantes("Lionel Messi", 7, 6.5, 10, universidad2);
        estudiante2.calcularPromedio();
        System.out.printf("%s", estudiante2);
        
        
        
        
        // TODO code application logic here
    }
    
}
