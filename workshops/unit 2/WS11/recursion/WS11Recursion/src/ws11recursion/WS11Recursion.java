/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11recursion;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class WS11Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int number = 5;
        int fact = 0;
       
        fact = ShowTheFactorial(number);
        System.out.println("Factorial of the " + number + " is equal to " + fact);
    }

    public static int ShowTheFactorial(int n) {
        if (n < 0) {
            return -1;
        } else {
            if (n == 0) {
                return 1;
            } else {
                return (n * ShowTheFactorial(n - 1));
            }

        }
    }
}
   