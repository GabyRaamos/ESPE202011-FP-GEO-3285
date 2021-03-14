package hw17matrixoperation;

import ec.edu.espe.matricesOperations;
import java.util.Scanner;

/**
 *
 * @author Gaby Ramos
 */
public class HW17MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[][] a;
        float[][] b;
        float[][] c;
        float[][] t;
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
        t = new float[m][n];

        System.out.println("============== * Enter the elements of the matrix * =========");
        a = matricesOperations.readMatrixElements(m, n, "A", input);
        b = matricesOperations.readMatrixElements(m, n, "B", input);

        for (int tab = 0; tab < m / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println("        A");

        matricesOperations.prettyPrinMatrix(m, n, a);
        System.out.println("");

        System.out.println("        B");

        matricesOperations.prettyPrinMatrix(m, n, b);
        System.out.println("");

        for (int tab = 0; tab < m / 2; tab++) {

            System.out.println("=== * The sum of matrices is * ===");

            c = matricesOperations.addTwoMatrices(m, n, a, b);

            matricesOperations.prettyPrinMatrix(m, n, c);

            System.out.println("");
        }
        for (int tab = 0; tab < m / 2; tab++) {

            System.out.println("=== * The subtraction of matrices is * ===");

            c = matricesOperations.subtractTwoMatrices(m, n, a, b);

            matricesOperations.prettyPrinMatrix(m, n, c);

            System.out.println("");
        }
        for (int tab = 0; tab < m / 2; tab++) {

            System.out.println("=== * The multiplication of matrices is * ===");

            c = matricesOperations.multiplyTwoMatrices(m, n, a, b);

            matricesOperations.prettyPrinMatrix(m, n, c);

            System.out.println("");
        }
        for (int tab = 0; tab < m / 2; tab++) {

            System.out.println("=== * The transpose of the matrix is * ===");

            c = matricesOperations.transpose(m, n, a, b);

            matricesOperations.prettyPrinMatrix(m, n, c);

            System.out.println("");
        }
    }
}
