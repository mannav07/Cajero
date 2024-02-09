
import javax.swing.JOptionPane;

/* package projecto1;
import javax.swing.JOptionPane;
public class matriz {

    public static void main(String[] args) {

        int matriz [][],nFilas,nCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
    
        matriz = new int [nFilas] [nCol];
        
        System.out.println("Digite la matriz: ");
        for (int i=0; i<nFilas; i++){
            for (int j=0; j<nCol; j++){
            System.out.println("Matriz ["+i+"]["+j+"]: ");
        }
    }
        System.out.println("\nLa Matriz es: ");
        for (int i=0; i<nFilas; i++){
            for (int j=0; j<nCol; j++){
                System.out.println(matriz [i] [j]);
            }
            System.out.println("");
        }
    }
}
*/

public class matriz{
    public static void main (String[]args){
        
        int matriz [] [], nFilas,nCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas"));
        
         //int matriz [nFilas],[nCol]; 
        
        System.out.println("La matriz es:: ");
        for (int i=0; i<nFilas; i++){
            for (int j=0; j<nCol; i++){
                System.out.println("Matriz ["+i+"] ["+j+"]");
           
                while(nFilas == nCol){
                    
                    
                }
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}