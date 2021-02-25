package pkg22.pkg02.pkg2021.quiz;

import java.util.Scanner;

/**
 *
 * @author Gaby Ramos
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Hardware Store Products and Prices
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.println("== Welcome User ==");
        System.out.println("1.- Review the products in stock");
        System.out.println("0.-Exit");
        option = input.nextInt();
        String[] nameOfProducts;
        float[] pricesOfProducts;
        int products = 0;

        nameOfProducts = new String[products];
        pricesOfProducts = new float[products];
        do {
            System.out.println("Enter the number of product -> ");
            products = input.nextInt();
            for (int i = 0; i < products; i++) {
                
                System.out.print("Enter the name of product " + (i + 1) + " -> ");
                nameOfProducts[i] = scanner.nextLine();
                System.out.println("Enter the price of the product ->" + nameOfProducts[i]);
                pricesOfProducts[i] = scanner.nextFloat();

            }

            for (int i = 0; i < products; i++) {
                System.out.println(nameOfProducts[i] + "-> \t " + pricesOfProducts[i]);
            }

        } while (option != 0);

    }
}
