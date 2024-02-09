/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package projecto1;

import java.util.Scanner;

/*
import java.util.Scanner;
public class entradaYsalida {
    public static void main(String[] args) {
       Scanner Entrada = new Scanner (System.in);
       int a; 
       int b;
       
       System.out.println("Digite un numero: ");
       a = Entrada.nextInt();
       
       System.out.println("Digite otro numero: ");
       b = Entrada.nextInt();
       
       System.out.println("La suma total es: "+(a+b));
    }
    
}
*/

public class entradaYsalida{
 public static void main (String [] args){
    Scanner Entrada = new Scanner(System.in);
    int a;
    
    System.out.println("Digite un numero: ");
    a = Entrada.nextInt();
    
    System.out.println("El numero es: "+a);
 }
}