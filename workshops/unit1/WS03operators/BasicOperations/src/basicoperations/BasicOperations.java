/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

import static java.time.Clock.system;

/**
 *
 * @author HP
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum;
        int addend1;
        int addend2;
        
        int minuend;
        int subtrahend;
        int difference;
        
        int multiplication;
        int multiplicant;
        int multiplier; 
        
        int division;
        int dividend;
        int divisor;
        
        int modulus; 
        
        dividend = 20;
        divisor = 5;
        
        multiplicant =9;
        multiplier = 6;
        
        minuend = -23;
        subtrahend = -6;
        
        addend1 =5;
        addend2 = 18;
        
        //operation
     sum = addend1 + addend2;
      System.out.println( " The addition of " + addend1 + " + " + addend2 + " is equal to >> " + sum);
       
     ++sum;
      System.out.println (" Sum is equal to >> " + sum);
    
     sum++;
      System.out.println(" Sum is equal to >> " +sum);
   
      System.out.println(" addind one to sum " + (sum++));
   
      System.out.println(" adding one to sum " + (++sum));
   
     difference = minuend - subtrahend;   
      System.out.println(" The subtraction of " + minuend + " - " + subtrahend + " is equal to " + (minuend - subtrahend));
   
     multiplication = multiplicant * multiplier; 
      System.out.println( " the product of the multiplication " + multiplicant + " * " + multiplier + " is equal to >> " + multiplication);
       
     division = dividend / divisor;  
      System.out.println(" The quotient of the division " + dividend + "/" + divisor + " is equal to >> " + ( dividend / divisor ));
        
     modulus = dividend % divisor;
      System.out.println(" The residue of the division " + dividend + "/" + divisor + " is equal to >>" + (dividend %divisor));
    
   
    
}
    
}
