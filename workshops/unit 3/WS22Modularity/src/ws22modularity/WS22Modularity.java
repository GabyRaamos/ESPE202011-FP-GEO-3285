/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws22modularity;

import java.util.Scanner;
import utils.BasicOperation;

/**
 *
 * @author Gaby Ramos
 */
public class WS22Modularity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float operand1;
        float operand2;
        float result;

        Scanner input = new Scanner(System.in);
        System.out.println("=== WELCOME USER ==");
        System.out.println("Enter two numbers -> ");
        operand1 = input.nextFloat();
        operand2 = input.nextFloat();
        
        System.out.println("==== ADDITION ===");
        result=BasicOperation.addTwoNumbers(operand1, operand2);
        System.out.println( operand1 + " + " + operand2 + " = " + result);
        
        System.out.println("=== SUBSTRACTION ===");
        result = BasicOperation.subtractTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " - " + operand2 + " = " + result);
        
        System.out.println("=== MULTIPLICATION ===");
        result = BasicOperation.multiplyTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " * " + operand2 + " = " + result);
        
        System.out.println("==== DIVISION ====");
        result = BasicOperation.divideTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " / " + operand2 + " = " + result);
        
    }

}
