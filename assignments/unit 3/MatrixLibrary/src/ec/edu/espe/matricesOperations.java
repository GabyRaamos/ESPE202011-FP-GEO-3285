package ec.edu.espe;

import java.util.Scanner;

/**
 *
 * @author Gaby Ramos 
 */
public class matricesOperations {
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
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static float[][] subtractTwoMatrices(int m, int n, float[][] a, float[][] b) {
        float[][] c;
        c = new float[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        return c;
    }

    public static float[][] multiplyTwoMatrices(int m, int n, float[][] a, float[][] b) {
        float[][] c;
        c = new float[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] * b[i][j];
            }
        }
        return c;
    }

    public static float[][] transpose(int n, int m, float[][] t, float[][] a) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                t[i][j] = a[j][i];
            }
        }
        return t;
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
