/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11createfuntions;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class WS11CreateFuntions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int Operator1;
        int Operator2;
        char option;

        do {
            System.out.print("Enter the operator 1: ");
            Operator1 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the operator 2: ");
            Operator2 = scanner.nextInt();
            scanner.nextLine();

            if (Operator1 % 2 == 0 && Operator2 % 2 == 0) {
                showMultiplication(Operator1, Operator2);
            } else if (Operator1 % 3 == 0 && Operator2 % 3 == 0) {
                showAddition(Operator1, Operator2);
            } else if (Operator1 % 7 == 0 && Operator2 % 7 == 0) {
                showModulus(Operator1, Operator2);
            } else if (Operator1 % 11 == 0 && Operator2 % 11 == 0) {
                showMultiplicationTables(Operator1, Operator2);
            } else if (Operator1 % 13 == 0 && Operator2 % 13 == 0) {
                showDivision(Operator1, Operator2);
            } else {
                System.out.println("This operation does not exist");
            }

            System.out.println("Do you want to try again? Yes[y] or No[n] ");
            option = scanner.nextLine().charAt(0);
        } while (option != 'n');
        System.out.println("====* Good Bye User *====");
    }

    private static void showDivision(int Operator1, int Operator2) {
        float division;
        division = Operator1 / Operator2;
        System.out.println("The division of " + Operator1 + " / " + Operator2 + " = " + division);
    }

    private static void showModulus(int Operator1, int Operator2) {
        int module;
        module = Operator1 % Operator2;
        System.out.println("The module of " + Operator1 + " % " + Operator2 + " = " + module);
    }

    private static void showAddition(int Operator1, int Operator2) {
        int sum;
        sum = Operator1 + Operator2;
        System.out.println("The sum of " + Operator1 + " + " + Operator2 + " = " + sum);
    }

    private static void showMultiplication(int Operator1, int Operator2) {
        int multiplication;
        multiplication = Operator1 * Operator2;
        System.out.println("The multiplication of " + Operator1 + " * " + Operator2 + " = " + multiplication);
    }

    public static void showMultiplicationTables(int paramOperation1, int paramOperator2) {
        int table1;
        int table2;
        for (int i = 1; i <= 12; i++) {
            table1 = paramOperation1 * i;
            System.out.println(paramOperation1 + " * " + i + " = " + table1 + "\n");
        }
        for (int j = 1; j <= 12; j++) {
            table2 = paramOperation1 * j;
            System.out.println(paramOperator2 + " * " + j + " = " + table2 + "\n");
        }
    }
}