/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author sebas
 */
public class Universidad {
    private String nombre;
    private String dir;
    
    public Universidad(){
      nombre="UTPL";  
      dir="San cayetano alto, calle París";  
        
        
    }
         public Universidad(String n, String d) {
        nombre = n;
        dir = d;
    } 
      


    public void establecerNombre(String n) {
        nombre = n;
    } 

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerDireccion(String d) {
        dir = d;
    }

    public String obtenerDireccion() {
        return dir;
    }
   
             
}
