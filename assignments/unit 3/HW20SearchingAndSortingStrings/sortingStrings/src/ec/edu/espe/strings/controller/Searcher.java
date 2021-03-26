package ec.edu.espe.strings.controller;

/**
 *
 * @author Gaby Ramos 
 */

public class Searcher {
      
    public int  findCharacter(String[] Characteres, String dataCharacteres) {
    
        int n = Characteres.length;
        for (int i = 0; i < n; i++) {
            if (Characteres[i] == null ? dataCharacteres == null : Characteres[i].equals(dataCharacteres)) {
                
                return i;
            }
        }
        return -1;
    }
}
