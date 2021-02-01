/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw05;

import java.util.Scanner;

/**
 *
 * @author Gaby Ramos
 */
public class HW05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int factorial = 1;
        int num;
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter the number --> ");
        num = input.nextInt();
        if (num <= 15) {
            for (int i = 1; i<= num; i++) {
                factorial = factorial * i;
                System.out.println("The factorial of " + num + " is " + factorial);
            }
        } else {
            System.out.println("This factorial cannot be realized");
        }
    }
}
