package hw15;

import java.util.Scanner;

/**
 *
 * @author Gaby Ramos
 */
public class HW15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[][];
        int b[][];
        int c[][];

        Scanner input = new Scanner(System.in);
        System.out.println(" == Welcome to calcule of matrices ==");
        System.out.println("** First : Enter the dimension the matrices **");
        System.out.println("Enter the number of rows of the matrices -> ");
        int n ;
        n =input.nextInt();
        System.out.println("Enter the number of columns of the matrices -> ");
        int m ;
        m =input.nextInt();
        
        a = new int[n][m];
        b = new int[n][m];
        c = new int[n][m];
        System.out.println("=== Enter the elemnts of matrix A====");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("a[" + (i + 1) + "][" + (j + 1) + "] -->");
                a[i][j] = input.nextInt();
            }
        }

        System.out.println("=== Enter the elemnts of matrix B====");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("b[" + (i + 1) + "][" + (j + 1) + "] -->");
                b[i][j] = input.nextInt();
            }
        }

        System.out.println("The multiplication of matrix A -> ");
       
        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < m; j++) {
                System.out.println("\t "+ a[i][j]);

            }
        }
        System.out.println("\nAnd Matrix B -> ");
        
        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < m; j++) {
                System.out.println("\t "+b[i][j] );

            }
        }
        System.out.println("\nequals to -> ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = a[i][j] * b[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < m; j++) {
                System.out.print("\t " + c[i][j]);
            }
        }
    }
}
