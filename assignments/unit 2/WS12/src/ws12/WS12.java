/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws12;

/**
 *
 * @author Gaby Ramos
 */
public class WS12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = -5;
        int fact = 0;
        fact = factorial(number);
        System.out.println("Factorial of the " + number + " is equal to " + fact);
    }

    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else {
            if (n == 0) {
                return 1;
            } else {
                return (n * factorial(n - 1));
            }

        }
    }
}
