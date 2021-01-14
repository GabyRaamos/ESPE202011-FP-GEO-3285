/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import static javafx.scene.input.KeyCode.G;

/**
 *
 * @author Gaby Ramos 
 */
public class HW03 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i;
        i=0;
        
        System.out.println("==== This is a while loop from 1 to 36 ====");

        while (i < 36 ) {
            System.out.println( " i -> " + (i+1));
            //i += 1;
            i++;
            //i = i + 1;
        }
        
        System.out.println("Multiplication Tables : 36 ");
         int top = 12; 
         int product = 0;
         int table = 36;
      
         for(int j = 1 ; j <= top ; j++ ) {
           product = table * j;
             System.out.println( " 36 * " + j + " = " + product);
        }
           System.out.println("second order geometric sequence  ");
        /** elements for second order geometric sequence
         * G = the first difference between the terms
         * r =  common ratio
         * a1 = initial value
         * an = n-th term
         * n = number of terms
         
          **/
        
        int stop = 10000;
        int progression = 0;
        int a1 = 1;
        int r = 2;
        
        for(int G = 1 , H = 1 ; G <= stop && H <= stop; G = G*r , H = H*G ) {
            progression = a1 * G;
              System.out.println( " a"+(a1++)+ " = "  + H );
              
        }
       
    }
}

   
        
  
   
    
