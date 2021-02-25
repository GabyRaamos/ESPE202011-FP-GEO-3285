/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw16matrixfunction;

import java.util.Scanner;

/**
 *
 * @author Gaby Ramos 
 */
public class HW16MatrixFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[][] a;
        float[][] b;
        float[][] c;
        int n;
        int m;
        System.out.println(" == Welcome to calcule of matrices ==");
        System.out.println("** First : Enter the dimension the matrices **");
        System.out.println("Enter the number of rows of the matrices -> ");
        m = input.nextInt();

        System.out.println("Enter the number of columns of the matrices -> ");
        n = input.nextInt();

        a = new float[m][n];
        b = new float[m][n];
        c = new float[m][n];

        System.out.println("============== * Enter the elements of the matrix * =========");
        a = readMatrixElements(m, n, "A", input);
        b = readMatrixElements(m, n, "B", input);

        for (int tab = 0; tab <= m / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println("        A");

        prettyPrinMatrix(m, n, a);
        System.out.println("");

        System.out.println("        B");

        prettyPrinMatrix(m, n, b);
        System.out.println("");

        for (int tab = 0; tab <= m / 2; tab++) {

            System.out.println("=== * The multiplication of matrices is * ===");

            c = addTwoMatrices(m, n, a, b);

            prettyPrinMatrix(m, n, c);

            System.out.println("");
        }
    }

    public static float[][] readMatrixElements(int m, int n, String matrixName, Scanner input) {
        float[][] matrix;
        matrix = new float[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println("---ROW Numbers " + (i + 1) + "---");
            for (int j = 0; j < n; j++) {
                System.out.print(matrixName + "[" + (i + 1) + "] [" + (j + 1) + "] -> ");
                matrix[i][j] = input.nextFloat();
            }
        }
        return matrix;
    }

    public static float[][] addTwoMatrices(int m, int n, float[][] a, float[][] b) {
        float[][] c;
        c = new float[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] * b[i][j];
            }
        }
        return c;
    }

    public static void prettyPrinMatrix(int m, int n, float[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.print("┌\t");
                    } else if (i == m - 1) {
                        System.out.print("└\t");
                    } else {
                        System.out.print("|\t");
                    }
                }
                System.out.print(matrix[i][j]);
                if (j > -1 && j < (n - 1)) {
                    System.out.print("\t");
                }
                if (j == (n - 1)) {
                    if (i == 0) {
                        System.out.print("\t┐");
                    } else if (i == m - 1) {
                        System.out.print("\t┘");
                    } else {
                        System.out.print(" \t|");
                    }
                }
            }
        }
        System.out.print("");
    }

    public static void prinMatrix(int m, int n, float[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.println("/ \t");
                    } else if (i == m - 1) {
                        System.out.println("\\\t");
                    } else {
                        System.out.println("| \t");
                    }
                }

                System.out.println(matrix[i][j]);
                if (j > -1 && j < (n - 1)) {
                    System.out.println("\t");
                }
                if (j == (n - 1)) {
                    if (i == 0) {
                        System.out.println("\t\\");
                    } else if (i == m - 1) {
                        System.out.println("\t/");
                    } else {
                        System.out.println("\t|");
                    }
                }
            }
        }
        System.out.println("");
    }
}

    