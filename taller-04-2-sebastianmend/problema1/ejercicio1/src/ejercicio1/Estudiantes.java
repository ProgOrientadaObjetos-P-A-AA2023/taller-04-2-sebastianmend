/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author sebas
 */
public class Estudiantes {
    private String nombre;
    private double nota1, nota2, nota3, promedio;
    private Universidad universidad;
    
    
    public Estudiantes(){
     
        nombre="Juan Pérez";
        nota1= 8.57;
        nota2= 9.05;
        nota3=8.69;
        promedio=(nota1+nota2+nota3)/3;
    }
    
     public Estudiantes(String n, double n1, double n2, double n3, Universidad u){
        nombre = n;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
        universidad = u;

    }

 public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerMateria1(double n){
        nota1 = n;
    }
    
    public void establecerMateria2(double n){
        nota2 = n;
    }
     public void establecerMateria3(double n){
        nota3 = n;
    }
      public void calcularPromedio(){
        promedio = (nota1 + nota2 + nota3) / 3;
    }
      public void establecerUniversidad(Universidad u) {
        universidad = u;
    }
      
    public String obtenerNombre(){
        return nombre;
    }
    
    public double obtenerMateria1(){
        return nota1;
    }
    
     public double obtenerMateria2(){
        return nota2;
    }
      public double obtenerMateria3(){
        return nota3;
    }
       public double obtenerPromedio(){
        return promedio;
    }
      public Universidad obtenerUniversidad() {
        return universidad;
    }     
      
      @Override
      public String toString(){
          String mensaje = String.format("""
                                       Nombre: %s
                                       Nota 1: %.2f
                                       Nota 2: %.2f
                                       Nota 3: %.2f
                                        Promedio: %.2f
                                       Universidad: %s
                                       Direccion: %s
                                       """,
                nombre,
                nota1,
                nota2,
                nota3,
                promedio,
                obtenerUniversidad().obtenerNombre(),
                obtenerUniversidad().obtenerDireccion());
        return mensaje;
    
    
    
    
}
     
    
    
}
