/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class WS13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        float area;
        float radio = 0;
        float majorDiagonal = 0;
        float minorDiagonal = 0;
        float base = 0;
        float topSide = 0;
        float height = 0;
        float finalSpeed = 0;
        float initialVelocity = 0;
        float gravity = 9.8F;
        float weather = 0;
        float acceleration = 0;
        float distance;

        do {
            option = printMenu(input);

            switch (option) {

                case 1:
                    area = showTheAreaOfTheCircle(radio);
                    System.out.println("The area of the circle is " + area);
                    break;
                case 2:
                    area = showtheAreaOfTheKite(majorDiagonal, minorDiagonal);
                    System.out.println("The area of the rhombus is " + area);
                    break;
                case 3:
                    area = showTheAreaOfTheTrapezium(base, topSide, height);
                    System.out.println("The area of the Trapezium is " + area);
                    break;
                case 4:
                    finalSpeed = showTheFinalSpeed(initialVelocity, acceleration, weather);
                    System.out.println("The final speed is " + finalSpeed);
                    break;

                case 5:
                    distance = showTheDistance(initialVelocity, finalSpeed, weather);
                    System.out.println("The distance is " + distance);
                    break;

                case 6:
                    acceleration = showTheAcceleration(initialVelocity, finalSpeed, weather);
                    System.out.println("The acceleration is " + acceleration);
                    break;

                case 7:
                    System.out.println(" ** GOOD BYE USER ** ");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }
        } while (option != 7);

    }

    private static int printMenu(Scanner input) {
        int option;
        System.out.println("███████░▒*        WELCOME TO CALCULATOR       *░▒███████\n"
                + "█                         VERSION 1.0                             █\n"
                + "████████████████████ ███████████████████████\n"
                + " \n");
        System.out.println("  What would you like to do? ");
        System.out.println("▒ 1.  The area of the circle .");
        System.out.println("▒ 2.  The area of the rhombus.");
        System.out.println("▒ 3.  The area of the Trapezium");
        System.out.println("▒ 4.  The final speed.");
        System.out.println("▒ 5.  The distance.");
        System.out.println("▒ 6.  The acceletarion.");
        System.out.println("█ 7. Exit");
        System.out.println("Enter your menu option >> ");
        option = input.nextInt();
        return option;
    }

    private static float showTheAreaOfTheCircle(float radio) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of radio : ");
        radio = scanner.nextFloat();
        scanner.nextLine();
        float pi = (float) 3.14;
        float exponent = 2;
        float area;
        return (area = (float) (Math.pow(radio, exponent) * pi));

    }

    private static float showtheAreaOfTheKite(float majorDiagonal, float minorDiagonal) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the major diagonal : ");
        majorDiagonal = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter the value of the minor diagonal : ");
        minorDiagonal = scanner.nextFloat();
        scanner.nextLine();
        float area;
        return (area = (majorDiagonal * minorDiagonal) / 2);
    }

    private static float showTheAreaOfTheTrapezium(float base, float topSide, float height) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the base : ");
        base = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter the value of the top side : ");
        topSide = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter the value of the height : ");
        height = scanner.nextFloat();
        scanner.nextLine();
        float area;
        float result;
        result = (base + topSide) / 2;
        return (area = result * height);

    }

    private static float showTheFinalSpeed(float initialVelocity, float acceleration, float weather) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the initialVelocity : ");
        initialVelocity = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter the value of the weather : ");
        weather = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter the value of the acceleration : ");
        acceleration = scanner.nextFloat();
        scanner.nextLine();
        float finalSpeed;
        return (finalSpeed = initialVelocity + (acceleration * weather));
    }

    private static float showTheDistance(float initialVelocity, float finalSpeed, float weather) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the initialVelocity : ");
        initialVelocity = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter the value of the weather : ");
        weather = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter the value of the final speed : ");
        finalSpeed = scanner.nextFloat();
        scanner.nextLine();
        float distance;
        return (distance = ((initialVelocity + finalSpeed) / 2) * weather);

    }

    private static float showTheAcceleration(float initialVelocity, float finalSpeed, float weather) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the initialVelocity : ");
        initialVelocity = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter the value of the final speed : ");
        finalSpeed = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter the value of the weather : ");
        weather = scanner.nextFloat();
        scanner.nextLine();
        float acceleration;
        return (acceleration = (finalSpeed - initialVelocity) / weather);

    }

}
