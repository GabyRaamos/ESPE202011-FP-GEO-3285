package hw14;

/**
 *
 * @author Gaby Ramos
 */
public class HW14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] ChocolateCookies = {2,5,7,9,13,16,20};
        String[] viruses = {"SIDA", "Flu", "Ebola","COVID-19"};
        float[] profits= {10.0F, 12.5F, 15.5F, 17.5F, 20.6F, 28.5F};

        for (int i = 0; i < ChocolateCookies.length; i++) {
            System.out.println("Chocolate cookies of the box " + (i + 1) + " -> " + ChocolateCookies[i]);
        }
        for (String virus : viruses) {
            System.out.println("viruses name -> " + virus);
        }
        for (int i = 0; i < profits.length; i++) {
            System.out.println("profits of bank " + (i + 1) + " -> " + profits[i]);
        }
    }
}
