/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanicsSystem.controller;

import ec.edu.espe.mechanicsSystem.model.Motorcicle;
import utils.FileManager;

/**
 *
 * @author Gaby Ramos
 */
public class MotorcicleController {

    public void save(Motorcicle motorcicle ) {
        
        String data = motorcicle.getBrand() + " ; " + motorcicle.getModel() + " ; " + motorcicle.getNumberOfEngines() + " ; " + motorcicle.getPrice() + " ; " + motorcicle.isTrialType();
        FileManager.save(data, "Motorcicles");
    }
    public static  String[] read(){
        
        String[] data = new String[FileManager.returnSize("m otorcicles")];
        data = FileManager.read("motorcicles.csv ");
        
        return data;
    }
}
