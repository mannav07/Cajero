package com.mycompany.cajero;

import java.util.Scanner;

public class Cajero {

    public static void main(String[] args) {
        
        System.out.println("***BIENVENIDO AL CAJERO AUTOMATICO EVIE***");
        System.out.println("");
       
       
        System.out.println("1. Extracciones");
        System.out.println("2. Depositos");
        System.out.println("3. Datos de la cuenta");
        System.out.println("4. Saldo actual");
        System.out.println("5. Salir");
        System.out.println("");
        System.out.print("Digite una opcion: ");
        
        Scanner Entrada = new Scanner(System.in);
        
        int saldo = 1000;
        int ext;
        int dep;
        int est;
        int opcion = 0;
       
        opcion = Entrada.nextInt();
       switch (opcion){
          case 1 -> {
              System.out.print("Digite cuanto dinero desea extraer: ");
              ext = Entrada.nextInt();
              if(ext>saldo){
                  System.out.println("No posee el monto disponible");
              }else if(ext == 0){
                  System.out.println("Monto incorrecto");
              }else
                  System.out.println("Usted extrajo: "+(saldo-ext)+"");
              System.out.println(""); //el valor de la cuenta es tanta plata
            }
              
          case 2 -> {
              System.out.print("Cuanto dinero desea depositar?:  ");
              dep = Entrada.nextInt();
              if(dep<=0){
                  System.out.println("El monto no puede ser menor");
                  System.out.println("");
              } else
                  System.out.println("");
              System.out.println("Usted deposito: "+(dep)+" usd");
              System.out.println("");
              System.out.println("El total en la cuenta es: "+(saldo+dep)+"");
            }
                  
          case 3 -> {
              System.out.println("");
              System.out.println("Nombre: Manuel Alberto Navarro");
              System.out.println("");
              System.out.println("DNI: 39.374.852");
              System.out.println("");
              System.out.println("Cliente activo");
              System.out.println("");
              System.out.println("");
            }
              
          case 4 -> {
              System.out.println("Su saldo actual es: "+saldo+"");
          }
          
                  
          default -> System.out.println("Opcion Incorrecta!");
              
      }
      
    }
}   
    
       
        
        

