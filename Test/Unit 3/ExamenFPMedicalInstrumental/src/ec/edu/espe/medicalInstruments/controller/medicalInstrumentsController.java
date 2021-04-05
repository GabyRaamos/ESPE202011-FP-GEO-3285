
package ec.edu.espe.medicalInstruments.controller;

import ec.edu.espe.medicalInstruments.model.MedicalInstruments;
import utils.FileManager;

/**
 *
 * @author Gaby Ramos 
 */
public class medicalInstrumentsController {
    
    public void save(MedicalInstruments medicalInstruments ) {
        
        String data = medicalInstruments.getName()+ " ; " + medicalInstruments.getType() + " ; "  + medicalInstruments.getisCategory() + " ; "  + medicalInstruments.getNumberOfAccessories()+ " ; " + medicalInstruments.getPrice();
        FileManager.save(data, "MedicalInstrumental");
    }
    public static  String[] read(){
        
        String[] data = new String[FileManager.returnSize("medicalInstruments")];
        data = FileManager.read(" medicalInstruments.csv ");
        
        return data;
    }
    
}
