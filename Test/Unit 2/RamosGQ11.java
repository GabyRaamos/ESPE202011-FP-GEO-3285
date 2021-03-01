/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramosgq11;

import java.util.Scanner;

/**
 *
 * @author Gaby Ramos
 */
public class RamosGQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println(" exercise 1:Sum ");
        System.out.println("enter the five whole numbers from the first arrangement : ");
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = t.nextInt();
        }
        System.out.println("enter the five whole numbers from the second arrangement : ");
        int[] b = new int[5];
        for (int i = 0; i < 5; i++) {
            b[i] = t.nextInt();
        }
        int[] result = new int[5];
        result = calculateSumOfTheWholeNumbers(a, b);
        System.out.println("sum " + print(result));

        System.out.println("exercise 2 :Average");
        System.out.println("enter the three elements of the average : ");
        float[] c = new float[3];
        for (int i = 0; i < 3; i++) {
            c[i] = t.nextFloat();
        }
        System.out.println("the average is " + calculateAverage(c));

        System.out.println("exercise 3 : Whole number of a Matrix ");
        System.out.println("enter the data to search : ");
        int l = t.nextInt();

        System.out.println("the number is in the arrangement " + find(l));

    }

    public static boolean find(int a) {
        int[] b = new int[7];
        b[0] = 12;
        b[1] = 23;
        b[2] = 34;
        b[3] = 98;
        b[4] = 87;
        b[5] = 65;
        b[6] = 0;

        boolean flag = false;

        for (int i = 0; i < b.length; i++) {
            if (a == b[i]) {
                return true;

            }
        }
        return flag;
    }

    public static float calculateAverage(float[] a) {
        float c = 0;

        for (int i = 0; i < a.length; i++) {
            c += a[i];
        }

        return (c / 3);
    }

    public static int[] calculateSumOfTheWholeNumbers(int[] a, int[] b) {

        int[] c = new int[5];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        return c;
    }

    public static String print(int[] a) {
        String c = "";
        for (int i = 0; i < a.length; i++) {
            c += " " + a[i];
        }
        return c;
    }

}
