package hw12taxes;

import java.util.Scanner;

/**
 *
 * @author Gaby Ramos
 */
public class HW12Taxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        float BasicFraction;
        float DeductibleExpenses;
        float TaxBase;
        float TaxOnTheBasicFraction;
        float TaxOnTheExcessFraction;
        float TaxToTheExcessFraction;
        float IESS;
        float multiplication;
        float NetMonthlyIncome;
        float AnnualNetIncome;
        float IncomeTax;
        float price;
        float IVA = 0.12F;
        float FinalPrice;
        float rest;
        float result;
        float TaxAtTheExitOfCurrencies = 0.05F;
        float ValueToPayIncludingISD;
        float value = 0;
        char option;
        int answer;
        
        boolean mainLoop = true;
        do {

            System.out.println("========*   WELCOME TO MODERN CALCULATOR *========");
            System.out.println("1. -> IVA");
            System.out.println("2. -> INCOME TAX ");
            System.out.println("3. -> TAX AT THE EXIT OF CURRENCIES ");
            System.out.println("Enter your menu option -->");
            
            answer =input.nextInt();

            switch (answer) {
//IVA
                case 1:
                    System.out.println("=* IVA *=");
                    System.out.println(" Is the product considered within the basic basket? Yes[y] or No[n] ");
                    option = scanner.nextLine().charAt(0);

                    System.out.print("Enter the price of product : ");
                    price = scanner.nextFloat();
                    scanner.nextLine();

                    if (option == 'y') {
                        FinalPrice = price;

                        System.out.println("The final price is " + FinalPrice + "\n\n");
                    }
                    if (option == 'n') {

                        FinalPrice = (float) (price + (price * IVA));
                        System.out.println("The final price is " + FinalPrice + "\n\n");
                    }
                    break;

// Income Tax
                case 2:

                    System.out.println("=* INCOME TAX *=");
                    System.out.print("Enter the BasicFraction : ");
                    BasicFraction = scanner.nextFloat();
                    scanner.nextLine();

                    System.out.print("Enter the DeductibleExpenses : ");
                    DeductibleExpenses = scanner.nextFloat();
                    scanner.nextLine();

                    if (BasicFraction == 0) {
                        TaxOnTheBasicFraction = 0;
                        TaxOnTheExcessFraction = 0;
                        IESS = (float) (BasicFraction * 0.0945);
                        NetMonthlyIncome = BasicFraction - IESS;
                        AnnualNetIncome = NetMonthlyIncome * 12;
                        TaxBase = AnnualNetIncome - DeductibleExpenses;
                        TaxToTheExcessFraction = TaxBase - BasicFraction;
                        multiplication = TaxToTheExcessFraction * TaxOnTheExcessFraction;
                        IncomeTax = TaxOnTheBasicFraction + multiplication;

                        System.out.println(" The Income Tax of " + BasicFraction + " is " + IncomeTax + "\n\n");

                    } else if (BasicFraction <= 11212) {
                        TaxOnTheBasicFraction = 0;
                        TaxOnTheExcessFraction = 0;
                        IESS = (float) (BasicFraction * 0.0945);
                        NetMonthlyIncome = BasicFraction - IESS;
                        AnnualNetIncome = NetMonthlyIncome * 12;
                        TaxBase = AnnualNetIncome - DeductibleExpenses;
                        TaxToTheExcessFraction = TaxBase - BasicFraction;
                        multiplication = TaxToTheExcessFraction * TaxOnTheExcessFraction;
                        IncomeTax = TaxOnTheBasicFraction + multiplication;

                        System.out.println(" The Income Tax of " + BasicFraction + " is " + IncomeTax + "\n\n");

                    } else if (BasicFraction <= 14285) {
                        TaxOnTheBasicFraction = 0;
                        TaxOnTheExcessFraction = 0.05F;
                        IESS = (float) (BasicFraction * 0.0945);
                        NetMonthlyIncome = BasicFraction - IESS;
                        AnnualNetIncome = NetMonthlyIncome * 12;
                        TaxBase = AnnualNetIncome - DeductibleExpenses;
                        TaxToTheExcessFraction = TaxBase - BasicFraction;
                        multiplication = TaxToTheExcessFraction * TaxOnTheExcessFraction;
                        IncomeTax = TaxOnTheBasicFraction + multiplication;

                        System.out.println(" The Income Tax of " + BasicFraction + " is " + IncomeTax + "\n\n");

                    } else if (BasicFraction <= 17854) {
                        TaxOnTheBasicFraction = 154;
                        TaxOnTheExcessFraction = 0.1F;
                        IESS = (float) (BasicFraction * 0.0945);
                        NetMonthlyIncome = BasicFraction - IESS;
                        AnnualNetIncome = NetMonthlyIncome * 12;
                        TaxBase = AnnualNetIncome - DeductibleExpenses;
                        TaxToTheExcessFraction = TaxBase - BasicFraction;
                        multiplication = TaxToTheExcessFraction * TaxOnTheExcessFraction;
                        IncomeTax = TaxOnTheBasicFraction + multiplication;

                        System.out.println(" The Income Tax of " + BasicFraction + " is " + IncomeTax + "\n\n");

                    } else if (BasicFraction <= 21442) {
                        TaxOnTheBasicFraction = 511;
                        TaxOnTheExcessFraction = 0.12F;
                        IESS = (float) (BasicFraction * 0.0945);
                        NetMonthlyIncome = BasicFraction - IESS;
                        AnnualNetIncome = NetMonthlyIncome * 12;
                        TaxBase = AnnualNetIncome - DeductibleExpenses;
                        TaxToTheExcessFraction = TaxBase - BasicFraction;
                        multiplication = TaxToTheExcessFraction * TaxOnTheExcessFraction;
                        IncomeTax = TaxOnTheBasicFraction + multiplication;

                        System.out.println(" The Income Tax of " + BasicFraction + " is " + IncomeTax + "\n\n");

                    } else if (BasicFraction <= 42874) {
                        TaxOnTheBasicFraction = 941;
                        TaxOnTheExcessFraction = 0.15F;
                        IESS = (float) (BasicFraction * 0.0945);
                        NetMonthlyIncome = BasicFraction - IESS;
                        AnnualNetIncome = NetMonthlyIncome * 12;
                        TaxBase = AnnualNetIncome - DeductibleExpenses;
                        TaxToTheExcessFraction = TaxBase - BasicFraction;
                        multiplication = TaxToTheExcessFraction * TaxOnTheExcessFraction;
                        IncomeTax = TaxOnTheBasicFraction + multiplication;

                        System.out.println(" The Income Tax of " + BasicFraction + " is " + IncomeTax + "\n\n");

                    } else if (BasicFraction <= 64297) {
                        TaxOnTheBasicFraction = 4156;
                        TaxOnTheExcessFraction = 0.2F;
                        IESS = (float) (BasicFraction * 0.0945);
                        NetMonthlyIncome = BasicFraction - IESS;
                        AnnualNetIncome = NetMonthlyIncome * 12;
                        TaxBase = AnnualNetIncome - DeductibleExpenses;
                        TaxToTheExcessFraction = TaxBase - BasicFraction;
                        multiplication = TaxToTheExcessFraction * TaxOnTheExcessFraction;
                        IncomeTax = TaxOnTheBasicFraction + multiplication;

                        System.out.println(" The Income Tax of " + BasicFraction + " is " + IncomeTax + "\n\n");

                    } else if (BasicFraction <= 85729) {
                        TaxOnTheBasicFraction = 8440;
                        TaxOnTheExcessFraction = 0.25F;
                        IESS = (float) (BasicFraction * 0.0945);
                        NetMonthlyIncome = BasicFraction - IESS;
                        AnnualNetIncome = NetMonthlyIncome * 12;
                        TaxBase = AnnualNetIncome - DeductibleExpenses;
                        TaxToTheExcessFraction = TaxBase - BasicFraction;
                        multiplication = TaxToTheExcessFraction * TaxOnTheExcessFraction;
                        IncomeTax = TaxOnTheBasicFraction + multiplication;

                        System.out.println(" The Income Tax of " + BasicFraction + " is " + IncomeTax + "\n\n");

                    } else if (BasicFraction <= 114288) {
                        TaxOnTheBasicFraction = 13798;
                        TaxOnTheExcessFraction = 0.3F;
                        IESS = (float) (BasicFraction * 0.0945);
                        NetMonthlyIncome = BasicFraction - IESS;
                        AnnualNetIncome = NetMonthlyIncome * 12;
                        TaxBase = AnnualNetIncome - DeductibleExpenses;
                        TaxToTheExcessFraction = TaxBase - BasicFraction;
                        multiplication = TaxToTheExcessFraction * TaxOnTheExcessFraction;
                        IncomeTax = TaxOnTheBasicFraction + multiplication;

                        System.out.println(" The Income Tax of " + BasicFraction + " is " + IncomeTax + "\n\n");

                    } else if (BasicFraction > 114288) {
                        TaxOnTheBasicFraction = 22366;
                        TaxOnTheExcessFraction = 0.35F;
                        IESS = (float) (BasicFraction * 0.0945);
                        NetMonthlyIncome = BasicFraction - IESS;
                        AnnualNetIncome = NetMonthlyIncome * 12;
                        TaxBase = AnnualNetIncome - DeductibleExpenses;
                        TaxToTheExcessFraction = TaxBase - BasicFraction;
                        multiplication = TaxToTheExcessFraction * TaxOnTheExcessFraction;
                        IncomeTax = TaxOnTheBasicFraction + multiplication;

                        System.out.println(" The Income Tax of " + BasicFraction + " is " + IncomeTax + "\n\n");
                    }
                    break;

// TaxAtTheExitOfCurrencies
                case 3:
                    System.out.println("=* TAX AT THE EXIT OF CURRENCIES *=");
                    System.out.print("Enter the value : ");
                    value = scanner.nextFloat();
                    scanner.nextLine();

                    if (value <= 120000) {

                        System.out.println("The value to pay is " + value + "\n\n");

                    } else {
                        rest = value - 120000;
                        result = (float) (rest * TaxAtTheExitOfCurrencies);
                        ValueToPayIncludingISD = result + value;
                        System.out.println("The value to pay is " + ValueToPayIncludingISD + "\n\n");
                    }
                    break;
                case 4:
                    System.out.println(" ===== * Good Bye User * =====");
                    System.exit(0);
                    break;

                            }

        } while (answer != 4);
    }

}
