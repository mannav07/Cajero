
package paquete1;
public class clase2 {
    public static void main (String [] args){
       
        clase1 ob1 = new clase1();
        
        ob1.setNombre("manuel");
        ob1.setEdad(27);
        
        System.out.println("Mi nombre es: "+ob1.getNombre());
        System.out.println("y tengo : "+ob1.getEdad());
    }
}
