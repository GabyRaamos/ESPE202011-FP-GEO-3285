/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11refactor;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class WS11Refactor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dividend;
        int divisor;
        float quotient = 0;
        int variableX;
        int table;
        int variableX1;
        int producttable;
        int power;
        int resultant;

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter the dividend --> ");
        dividend = input.nextInt();
        System.out.println(" Enter the divisor --> ");
        divisor = input.nextInt();
        System.out.println(" Enter the base --> ");
        variableX = input.nextInt();
        System.out.println(" Enter the multiplicate table --> ");
        table = input.nextInt();
        System.out.println(" Enter the value of expression --> ");
        variableX1 = input.nextInt();
        //f(x)
        quotient = divideTwoNumbers(dividend, divisor);
        System.out.println("Quotient of " + dividend + " and " + divisor + " is-> " + quotient);

        power = computeSquare(variableX);
        System.out.println("The square of " + variableX + " is equal to " + power);
        //g(x)
        
        resultant = computeParabola(variableX1);
        System.out.println("The polynomial is equal to " + resultant);

        producttable = showTheMultiplicationTable(table);
        
    }

    public static float divideTwoNumbers(int dividend, int divisor) {

        float quotient = 0.0F;

        quotient = (float) dividend / (float) divisor;
        return quotient;
    }

    public static int computeSquare(int base) {
        int power = 0;
        power = base * base ;
        return power;

    }

    public static int computeParabola(int expression) {
        
        int resultant = 0;
        resultant = expression * expression + 2 *  expression + 1;
        return 0;
    }
    
    public static int showTheMultiplicationTable(int table) {
        int producttable = 0;

        for (int n = 1; n <= 12; n++) {

            producttable = table * n;
            System.out.println(table + " * " + n +  " = " + producttable);
            producttable++;
        }

        return producttable;
    }
}
   
  
