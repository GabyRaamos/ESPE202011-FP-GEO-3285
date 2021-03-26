package ec.edu.espe.arrays.controller;

/**
 *
 * @author Gaby Ramos 
 */
public class Arrays {
    
    public int[] sortByBubbleSort(int[] elements) {

        int n = elements.length;
        int aux;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (elements[j] > elements[j + 1]) {
                    aux = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = aux;
                }
            }
        }
        return elements;
    }

    public int[] sortBySelection(int[] elements) {
        return elements;
    }
}
