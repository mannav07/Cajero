package projecto1;

import java.util.Scanner;

public class cajero {

    public static void main(String[] args) {
        
        int saldo = 1000;
        int opc;
        int dep;
        int ext;
        
        Scanner Entrada = new Scanner (System.in);
        
        System.out.println("*****BIENVENIDO AL CAJERO ITAU*****");
        System.out.println("1.Depositar");
        System.out.println("2.Extraer");
        System.out.println("3.Saldo");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.print("Digite un numero: ");
        System.out.print("");
            
        opc = Entrada.nextInt();
        
       switch (opc){
           case 1:
               System.out.println("Cuanto dinero desea depositar? ");
               dep = Entrada.nextInt();
               if (dep > 0){
                   System.out.println("Deposito "+(dep+saldo)+" Dolares");
                   break;
                   }
           case 2:
                   System.out.println("Cuanto dinero desea extraer: ");
                   ext = Entrada.nextInt();
                   if (ext>saldo){
                       System.out.println("El saldo a retirar es incorrecto");
                   } else{
                       System.out.println("");
                       System.out.println("Su extraccion es de: "+ext+" Dolares");
                       System.out.println("");
                       System.out.println("Monto total: "+(saldo-ext)+"Dolares");
                       System.out.println("");
                       break;
                      }
           case 3:
                     System.out.println("");
                     System.out.println("Su saldo es: "+saldo);
                     break;
                     
           default:
               System.out.println("Error. Digito un numero incorrecto");
               break;
   
                 
       }
                 
    }
}


