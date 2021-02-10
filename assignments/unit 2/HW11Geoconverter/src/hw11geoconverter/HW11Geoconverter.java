package hw11geoconverter;

import java.util.Scanner;

/**
 *
 * @author Gaby Ramos 
 */
public class HW11Geoconverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {

            printConvertionMenu();

            option = input.nextInt();

            switch (option) {

                case 1:
                    transformKmToM(input);
                    break;
                case 2:
                    transformMtoCm(input);
                    break;
                case 3:
                    transformMtoMm(input);
                    break;
                case 4:
                    transformMtoNano(input);
                    break;

                case 5:
                    transformMtoFt(input);
                    break;

                case 6:
                    transformerMtoIn(input);
                    break;

                case 7:
                    transformerCmtoMc(input);
                    break;
                case 8:
                    transformerCmtoIn(input);
                    break;

                case 9:
                    transformerMmToNano(input);
                    break;

                case 10:
                    transformerKmToCm(input);
                    break;
                case 11:
                    transformerMiToM(input);
                    break;

                case 12:
                    transformerMtoYd(input);
                    break;

                case 13:
                    transformGmToM(input);
                    break;

                case 14:
                    System.out.println(" ** GOOD BYE USER ** ");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }
        } while (option != 14);

    }

    private static void printConvertionMenu() {
        System.out.println("███████░▒*        WELCOME TO GEOCONVERTER       *░▒███████\n"
                + "█                         VERSION 1.0                             █\n"
                + "█                       20 JANUARY 2021                           █\n"
                + "████████████████████ ███████████████████████\n"
                + "                   Transformer of units of length                \n"
                + "                     _______________________         \n");
        
        System.out.println("  What would you like to do? ");
        System.out.println("▒ 1.  Kilometers to meters.");
        System.out.println("▒ 2.  Meters to centimeters.");
        System.out.println("▒ 3.  Meters to millimeters");
        System.out.println("▒ 4.  Meters to nanometers.");
        System.out.println("▒ 5.  Meters to feet.");
        System.out.println("▒ 6.  Meters to inches.");
        System.out.println("▒ 7.  Centimeters to micrometers.");
        System.out.println("▒ 8.  Centimeters to inches.");
        System.out.println("▒ 9.  Millimeters to nanometers.");
        System.out.println("▒ 10. Kilometers to centimeters.");
        System.out.println("▒ 11. Miles to meters.");
        System.out.println("▒ 12. Meters to yards.");
        System.out.println("▒ 13. Gigameters to meters.");
        System.out.println("█ 14. Exit");
        
        System.out.println("Enter your menu option >> ");
    }

    private static void transformGmToM(Scanner input) {
        double gigameters;
        double meters;
        System.out.println("enter enter the data --> ");
        gigameters = input.nextDouble();
        meters = gigameters * 1000000000;
        System.out.println(gigameters + " gigameters is equal to " + meters + " meters\n ");
    }

    private static void transformerMtoYd(Scanner input) {
        double meters;
        double yard;
        System.out.println("enter enter the data --> ");
        meters = input.nextDouble();
        yard = meters * 1.09361;
        System.out.println(meters + " meters is equal to " + yard + " yard\n ");
    }

    private static void transformerMiToM(Scanner input) {
        double miles;
        double meters;
        System.out.println("enter enter the data --> ");
        miles = input.nextDouble();
        meters = miles * 1609.344;
        System.out.println(miles + "miles is equal to " + meters + " meters\n ");
    }

    private static void transformerKmToCm(Scanner input) {
        double kilometers;
        double centimeters;
        System.out.println("enter enter the data --> ");
        kilometers = input.nextDouble();
        centimeters = kilometers * 100000;
        System.out.println(kilometers + " kilometers is equal to " + centimeters + " centimeters\n ");
    }

    private static void transformerMmToNano(Scanner input) {
        double millimeters;
        double nanometers;
        System.out.println("enter enter the data --> ");
        millimeters = input.nextDouble();
        nanometers = millimeters * 1000000;
        System.out.println(millimeters + " millimeters is equal to " + nanometers + " nanometers\n ");
    }

    private static void transformerCmtoIn(Scanner input) {
        double centimeters;
        double inches;
        System.out.println("enter enter the data --> ");
        centimeters = input.nextDouble();
        inches = centimeters * 0.3937;
        System.out.println(centimeters + " centimeters is equal to " + inches + " inches\n ");
    }

    private static void transformerCmtoMc(Scanner input) {
        double centimeters;
        double micrometers;
        System.out.println("enter enter the data --> ");
        centimeters = input.nextDouble();
        micrometers = centimeters * 10000000;
        System.out.println(centimeters + " centimeters is equal to " + micrometers + " micrometers\n ");
    }

    private static void transformerMtoIn(Scanner input) {
        double meters;
        double inches;
        System.out.println("enter enter the data --> ");
        meters = input.nextDouble();
        inches = meters * 39.37;
        System.out.println(meters + " meters is equal to " + inches + " inches\n ");
    }

    private static void transformMtoFt(Scanner input) {
        double meters;
        double feet;
        System.out.println("enter enter the data --> ");
        meters = input.nextDouble();
        feet = meters * 3.281;
        System.out.println(meters + " meters is equal to " + feet + " feet\n ");
    }

    private static void transformMtoNano(Scanner input) {
        double meters;
        double nanometers;
        System.out.println("enter enter the data --> ");
        meters = input.nextDouble();
        nanometers = meters * 1000000000;
        System.out.println(meters + " meters is equal to " + nanometers + " nanometers\n ");
    }

    private static void transformMtoMm(Scanner input) {
        double meters;
        double millimeters;
        System.out.println("enter enter the data --> ");
        meters = input.nextDouble();
        millimeters = meters * 1000;
        System.out.println(meters + " meters is equal to " + millimeters + " millimeters\n ");
    }

    private static void transformMtoCm(Scanner input) {
        double meters;
        double centimeters;
        System.out.println("enter enter the data --> ");
        meters = input.nextDouble();
        centimeters = meters * 100;
        System.out.println(meters + " meters is equal to " + centimeters + " centimeters\n ");
    }

    private static void transformKmToM(Scanner input) {
        double kilometers;
        double meters;
        System.out.println("enter enter the data --> ");
        kilometers = input.nextDouble();
        meters = kilometers * 1000;
        System.out.println(kilometers + " Kilometers is equal to " + meters + " meters\n ");
    }

}
   
