/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12recursion;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HW12Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float term;
        float progression = 0;
       
        System.out.print(" /*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/ \n"
                + " /*                                                        */ \n"
                + " /*                       Welcome user                     */ \n"
                + " /*       Please Enter the initial term :");
        term = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("              The Geometric sequence is \n              ___________________________");
        progression = showGeometricProgression(term);

    }

    private static float showGeometricProgression(float term) {
        float progression = 0;
        while (term <= 1000) {
            term = term * 3;
            progression = (float) (term * (0.5));
            System.out.println( " /*            " + progression   + "                                        */");
            
        }
        return (progression);
        
    }
    
}
