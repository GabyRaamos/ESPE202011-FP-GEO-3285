/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.gps.controller;

import Utils.FileManager;
import ec.edu.espe.Gps.model.Gps;



/**
 *
 * @author Usuario
 */
public class GpsController {
     public void save(Gps gps){
        
        String data = gps.getAge()+ "; " + gps.getModel() + "; " + gps.getVersion() + "; " + gps.getTouchscreen()+ "; " + gps.getPrice();
        FileManager.save(data, "gps");
    }
   public String[] read(){
        String[] data= new String[FileManager.returnSize("gps.csv")];
        data = FileManager.read("gps.csv");
        return data;
    }
    
}