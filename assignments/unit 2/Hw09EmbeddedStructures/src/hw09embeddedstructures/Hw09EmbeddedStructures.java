package hw09embeddedstructures;

import java.util.Scanner;

/**
 *
 * @authors Ramos,Rodriguez,Rosales,Sanchez.
 */
public class Hw09EmbeddedStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Operator1;
        int Operator2;
        int multiplication;
        int sum;
        float division;
        int module;
        int table1;
        int table2;
        char option;

        do {
            System.out.print("Enter the operator 1: ");
            Operator1 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the operator 2: ");
            Operator2 = scanner.nextInt();
            scanner.nextLine();

            if (Operator1 % 2 == 0 && Operator2 % 2 == 0) {
                multiplication = Operator1 * Operator2;
                System.out.println("The multiplication of " + Operator1 + " * " + Operator2 + " = " + multiplication);

            } else if (Operator1 % 3 == 0 && Operator2 % 3 == 0) {
                sum = Operator1 + Operator2;
                System.out.println("The sum of " + Operator1 + " + " + Operator2 + " = " + sum);

            } else if (Operator1 % 7 == 0 && Operator2 % 7 == 0) {
                module = Operator1 % Operator2;
                System.out.println("The module of " + Operator1 + " % " + Operator2 + " = " + module);

            } else if (Operator1 % 11 == 0 && Operator2 % 11 == 0) {
                for (int i = 1; i <= 12; i++) {
                    table1 = Operator1 * i;
                    System.out.println(Operator1 + " * " + i + " = " + table1 + "\n");
                }
                for (int j = 1; j <= 12; j++) {
                    table2 = Operator1 * j;
                    System.out.println(Operator2 + " * " + j + " = " + table2 + "\n");
                }
            } else if (Operator1 % 13 == 0 && Operator2 % 13 == 0) {
                division = Operator1 / Operator2;
                System.out.println("The division of " + Operator1 + " / " + Operator2 + " = " + division);

            } else {
                System.out.println("This operation does not exist");
            }

            System.out.println("Do you want to try again? Yes[y] or No[n] ");
            option = scanner.nextLine().charAt(0);
        } while (option != 'n');
        System.out.println("====* Good Bye User *====");
    }
}
