package sorting;

/**
 *
 * @author Gaby Ramos
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] integersToSort = {9, 7, 1, 6, 2, 3};
        System.out.println("Unsorted integers");
        printArray(integersToSort);
        BubbleSort.sort(integersToSort);
        System.out.println("");
        printArray(integersToSort);
        SelectionSort selectionSort =new SelectionSort();
        
        int [] integersToSort2 ={42,30,-5,7,1,50};
        System.out.println("\nUnsorted integers");
        printArray(integersToSort2);
        selectionSort.sort(integersToSort2);
        System.out.println("");
        printArray(integersToSort2);
       

    }


    public static void printArray(int[] integers) {
        int n = integers.length;
        for (int i = 0; i < n; i++) {

            System.out.print(integers[i]+",");
        }
        System.out.println("");
    }
}
