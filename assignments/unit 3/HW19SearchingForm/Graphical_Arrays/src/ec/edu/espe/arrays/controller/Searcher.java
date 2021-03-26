package ec.edu.espe.arrays.controller;

/**
 *
 * @author Gaby Ramos
 */
public class Searcher {
     public int findInteger(int[] elements, int X) {
        int i;
        int n = elements.length;
        for (i = 0; i < n; i++) {
            if (elements[i] == X) {
                return i;
            }
        }
        return -1;
    }
}