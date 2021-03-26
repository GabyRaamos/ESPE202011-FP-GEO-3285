package ec.edu.espe.strings.controller;

/**
 *
 * @author Gaby Ramos
 */
public class sortingString {

    public static String[] sort(String[] Characteres) {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5 - j; i++) {
                if (Characteres[i].compareTo(Characteres[i + 1]) > 0) {
                    String aux;
                    aux = Characteres[i];
                    Characteres[i] = Characteres[i + 1];
                    Characteres[i + 1] = aux;
                }
            }
        }
        return Characteres;
    }
}
