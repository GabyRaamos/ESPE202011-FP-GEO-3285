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
        System.out.println("Welcome");
        System.out.println("1.- Review the products in stock");
        System.out.println("0.-Exit");
        option = input.nextInt();
        do {

            String[] nameOfProducts = {"hammer", "drill", "nails", "tacks"};
            float[] pricesOfProducts = {59.6F, 34.7F, 23.5F, 12.5f};
            int[] product;
            System.out.println("1.-hammer");
            System.out.println("2.-drill");
            System.out.println("3.-nails");
            System.out.println("4.-tacks");
            int n;
            
            n = input.nextInt();

            nameOfProducts = new String[n];
            product = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the name of product " + (i + 1) + " -> ");
                nameOfProducts[i] = scanner.nextLine();
                System.out.println("Enter the number of product -> ");
                product[i] = input.nextInt();
            }
            for (String name : nameOfProducts) {
                System.out.println("product of hardware is " + name);
            }

            for (int i = 0; i < n; i++) {
                System.out.println("product of hardware " + (i + 1) + " -> " + nameOfProducts[i]);
            }

            for (float prices : pricesOfProducts) {
                System.out.println("price of product is -> " + prices);
            }
        } while (option != 0);

    }
}
