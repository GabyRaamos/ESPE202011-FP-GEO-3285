package graphicalarrays;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Gaby Ramos
 */
public class GraphicalArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int elements [] = new int [6];
        int n = elements.length;
        int aux;
        String data;
        
        for(int i = 0; i < n; i++){
            
            elements[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter the elements"));
        }
       for(int i=0; i< n - 1 ; i++){
           for( int j = 0; j < n - i -1 ; j++){
             if (elements[j] > elements[j + 1]){
                 aux =elements[j];
                 elements[j]=elements[j+1];
                 elements[j+1]= aux;
             }
           }
       }
       for(int i=0; i< n;i++){
           System.out.print(elements[i]+ " - ");
       }
    }
    
}
