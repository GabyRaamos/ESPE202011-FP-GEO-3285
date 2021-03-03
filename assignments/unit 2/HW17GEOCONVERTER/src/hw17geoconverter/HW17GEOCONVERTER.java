package hw17geoconverter;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author GROUP 8 
 */
public class HW17GEOCONVERTER {

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

                    System.out.println("enter the data in Kilometers : ");
                    double[] Kilometers = new double[1];
                    double meters;
                    for (int i = 0; i < 1; i++) {
                        Kilometers[i] = input.nextDouble();
                    }
                    System.out.println(Arrays.toString(Kilometers) + "kilometers is equal to " + transformKmToM(Kilometers) + " meters\n ");

                    break;

                case 2:

                    System.out.println("enter the data in Meters : ");
                    double[] Meters = new double[1];
                    double centimeters;
                    for (int i = 0; i < 1; i++) {
                        Meters[i] = input.nextDouble();
                    }
                    System.out.println(Arrays.toString(Meters) + "meters is equal to " + transformMToCm(Meters) + " centimeters\n ");

                    break;

                case 3:

                    System.out.println("enter the data in Meters : ");
                    double[] Meters2 = new double[1];
                    double millimeters;
                    for (int i = 0; i < 1; i++) {
                        Meters2[i] = input.nextDouble();
                    }

                    System.out.println(Arrays.toString(Meters2) + "meters is equal to " + transformMToMm(Meters2) + " millimeters\n ");

                    break;

                case 4:
                    System.out.println("enter  the data in Nanometers");
                    double[] Nanometers = new double[1];
                    double meters2;
                    for (int i = 0; i < 1; i++) {
                        Nanometers[i] = input.nextDouble();
                    }
                    System.out.println(Arrays.toString(Nanometers) + "nanometers is equal to " + transformMtoNano(Nanometers) + " meters\n");

                    break;

                case 5:
                    System.out.println("enter  the data in Feet");
                    double[] Feet = new double[1];
                    double meters3;
                    for (int i = 0; i < 1; i++) {
                        Feet[i] = input.nextDouble();
                    }
                    System.out.println(Arrays.toString(Feet) + "feet is equal to " + transformMtoFeed(Feet) + " meters\n");

                    break;

                case 6:
                    System.out.println("enter the data in Inches");
                    double[] Inches = new double[1];
                    double meters4;
                    for (int i = 0; i < 1; i++) {
                        Inches[i] = input.nextDouble();
                    }
                    System.out.println(Arrays.toString(Inches) + "inches is equal to " + transformMtoInches(Inches) + " meters\n");

                    break;

                case 7:

                    System.out.println("enter the data in Centimeters2 : ");
                    double[] Centimeters2 = new double[1];
                    double micrometers;
                    for (int i = 0; i < 1; i++) {
                        Centimeters2[i] = input.nextDouble();
                    }

                    System.out.println(Arrays.toString(Centimeters2) + "centimeters is equal to " + transformCmtoMc(Centimeters2) + " micrometers\n ");

                    break;

                case 8:

                    System.out.println("enter the data in Centimeters : ");
                    double[] Centimeters = new double[1];
                    double inches2;
                    for (int i = 0; i < 1; i++) {
                        Centimeters[i] = input.nextDouble();
                    }

                    System.out.println(Arrays.toString(Centimeters) + "centimeters is equal to " + transformCmtoIn(Centimeters) + " inches\n ");

                    break;

                case 9:

                    System.out.println("enter the data in Millimeters : ");
                    double[] Millimeters = new double[1];
                    double nanometers2;
                    for (int i = 0; i < 1; i++) {
                        Millimeters[i] = input.nextDouble();
                    }

                    System.out.println(Arrays.toString(Millimeters) + "millimeters is equal to " + transformMmToNano(Millimeters) + " nanometers\n ");

                    break;

                case 10:

                    System.out.println("enter the data in Kilometers : ");
                    double[] Kilometers2 = new double[1];
                    double centimeters2;
                    for (int i = 0; i < 1; i++) {
                        Kilometers2[i] = input.nextDouble();
                    }

                    System.out.println(Arrays.toString(Kilometers2) + "kilometers is equal to " + transformKmToCm(Kilometers2) + " centimeters\n ");

                    break;

                case 11:

                    System.out.println("enter the data in Miles : ");
                    double[] Miles = new double[1];
                    double meters5;
                    for (int i = 0; i < 1; i++) {
                        Miles[i] = input.nextDouble();
                    }

                    System.out.println(Arrays.toString(Miles) + "miles is equal to " + transformMiToM(Miles) + " meters\n ");

                    break;

                case 12:

                    System.out.println("enter the data in Meters : ");
                    double[] Meters3 = new double[1];
                    double yards;
                    for (int i = 0; i < 1; i++) {
                        Meters3[i] = input.nextDouble();
                    }

                    System.out.println(Arrays.toString(Meters3) + "meters is equal to " + transformMtoYd(Meters3) + " yards\n ");

                    break;

                case 13:

                    System.out.println("enter the data in Gigameters : ");
                    double[] Gigameters = new double[1];
                    double meters6;
                    for (int i = 0; i < 1; i++) {
                        Gigameters[i] = input.nextDouble();
                    }

                    System.out.println(Arrays.toString(Gigameters) + "gigameters is equal to " + transformGmToM(Gigameters) + " meters\n ");

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
        System.out.println("███████░▒*      WELCOME TO GEOCONVERTER         *░▒███████\n"
                + "█                          VERSION 1.3                            █\n"
                + "█                        03  MARCH  2021                          █\n"
                + "████████████████████ ███████████████████████\n"
                + "                   Transformer of units of length                \n"
                + "                     _______________________         \n");

        System.out.println("  What you need to transform? ");
        System.out.println("▒ 1.  Kilometers to meters.");
        System.out.println("▒ 2.  Meters to centimeters.");
        System.out.println("▒ 3.  Meters to millimeters");
        System.out.println("▒ 4.  Nanometers to meters.");
        System.out.println("▒ 5.  Feet to meters.");
        System.out.println("▒ 6.  Inches to meters.");
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

    private static double transformKmToM(double[] Kilometers) {
        double meters = 0;
        for (int i = 0; i < Kilometers.length; i++) {
            meters = (Kilometers[i] * 1000);

        }
        return meters;
    }

    private static double transformMToCm(double[] Meters) {
        double centimeters = 0;
        for (int i = 0; i < Meters.length; i++) {
            centimeters = (Meters[i] * 100);
        }
        return centimeters;
    }

    private static double transformMToMm(double[] Meters2) {
        double millimeters = 0;
        for (int i = 0; i < Meters2.length; i++) {
            millimeters = (Meters2[i] * 1000);
        }
        return millimeters;

    }

    private static double transformMtoNano(double[] Nanometers) {
        double meters2 = 0;
        for (int i = 0; i < Nanometers.length; i++) {
            meters2 = (Nanometers[i] * 1000000);
        }
        return meters2;
    }

    private static double transformMtoFeed(double[] Feet) {
        double meters3 = 0;
        for (int i = 0; i < Feet.length; i++) {
            meters3 = (Feet[i] * 3.281);
        }
        return meters3;
    }

    private static double transformMtoInches(double[] Inches) {
        double meters4 = 0;
        for (int i = 0; i < Inches.length; i++) {
            meters4 = (Inches[i] * 39.37);
        }
        return meters4;

    }

    private static double transformCmtoMc(double[] Centimeters) {
        double micrometers = 0;
        for (int i = 0; i < Centimeters.length; i++) {
            micrometers = (Centimeters[i] * 10000000);
        }
        return micrometers;

    }

    private static double transformCmtoIn(double[] Centimeters2) {
        double inches = 0;
        for (int i = 0; i < Centimeters2.length; i++) {
            inches = (Centimeters2[i] * 0.3937);
        }
        return inches;

    }

    private static double transformMmToNano(double[] Millimeters) {
        double nanometers2 = 0;
        for (int i = 0; i < Millimeters.length; i++) {
            nanometers2 = (Millimeters[i] * 1000000);
        }
        return nanometers2;

    }

    private static double transformKmToCm(double[] Kilometers2) {
        double centimeters2 = 0;
        for (int i = 0; i < Kilometers2.length; i++) {
            centimeters2 = (Kilometers2[i] * 100000);
        }
        return centimeters2;

    }

    private static double transformMiToM(double[] Miles) {
        double meters5 = 0;
        for (int i = 0; i < Miles.length; i++) {
            meters5 = (Miles[i] * 1609.344);
        }
        return meters5;

    }

    private static double transformMtoYd(double[] Meters3) {
        double yards = 0;
        for (int i = 0; i < Meters3.length; i++) {
            yards = (Meters3[i] * 1.09361);
        }
        return yards;

    }

    private static double transformGmToM(double[] Gigameters) {
        double meters6 = 0;
        for (int i = 0; i < Gigameters.length; i++) {
            meters6 = (Gigameters[i] * 1000000000);
        }
        return meters6;

    }
}
