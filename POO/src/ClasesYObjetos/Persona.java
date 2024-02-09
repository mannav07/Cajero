
package ClasesYObjetos;
 
public class Persona {
    
    
    private final String nombre;
    private int edad;
    
    public Persona(String nombre, int edad){
    this.edad = edad;
    this.nombre = nombre;
    }
        
    public void mostrarDatos(){
        System.out.println("Hola, soy "+nombre);
        System.out.println(" y tengo "+edad);
    }
   
    
    
}
