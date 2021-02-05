/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10funtions;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HW10Funtions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int dividend;
        int divisor;
        float quotient = 0;
        int base;
        int table;
        int expression;
        int producttable = 0;
        int power = 0;
        int resultant = 0;

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter the dividend --> ");
        dividend = input.nextInt();
        System.out.println(" Enter the divisor --> ");
        divisor = input.nextInt();
        System.out.println(" Enter the base --> ");
        base = input.nextInt();
        System.out.println(" Enter the multiplicate table --> ");
        table = input.nextInt();
        System.out.println(" Enter the value of expression --> ");
        expression = input.nextInt();
        //f(x)
        quotient = divideTwoNumbers(dividend, divisor);
        System.out.println(" Quotient of " + dividend + " and " + divisor + " is-> " + quotient);

        power = funtion(base);
        System.out.println("The square of ->" + base + "is equal to " + power);
        //g(x)
        resultant = according(expression);
        System.out.println("The polynomial is equal to " + resultant);

        producttable = according2(table);
        System.out.println("The multiplication table of" + table + " is " + producttable);

    }

    public static float divideTwoNumbers(int dividend, int divisor) {

        float quotient = 0.0F;

        quotient = (float) dividend / (float) divisor;
        return quotient;
    }

    public static int funtion(int base) {
        int power = 0;
        power = base * base ;
        return power;

    }

    public static int according(int expression) {
        int resultant = 0;
        resultant = (expression * expression) +  expression + 5;
        return 0;
    }
    

    public static int according2(int table) {
        int producttable = 0;

        for (int n = 1; n <= 12; n++) {

            producttable = table * n;
            System.out.println(table + " * " + n +  " = " + producttable);
            producttable++;
        }

        return producttable;
    }
}
    
    
    

