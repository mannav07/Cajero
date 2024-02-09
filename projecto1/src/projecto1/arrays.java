                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projecto1;

import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {
           
        Scanner Entrada = new Scanner (System.in);
        
        int arreglo[] = new int [10];
        
        System.out.println("Llenar el arreglo");
        for (int i=0; i<10; i++){
            System.out.println(" Digite un numero: ");
            arreglo [i] = Entrada.nextInt();
            
        }
        
        
    }
    
}
