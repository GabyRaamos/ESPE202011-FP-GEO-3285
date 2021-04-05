/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.medicalInstruments.model;

/**
 *
 * @author Gaby Ramos 
 */
public class MedicalInstruments {

    private String Name;
    private String Type;
    private float price;
    private String isCategory;
    private int numberOfAccessories;


    public MedicalInstruments(String Name, String Type, float price, String isCategory, int numberOfAccessories) {
        this.Name = Name;
        this.Type = Type;
        this.isCategory = isCategory;
        this.numberOfAccessories = numberOfAccessories;
        this.price = price;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * @return the category
     */
    public String getisCategory() {
        return isCategory;
    }

    /**
     * @param category the category to set
     */
    public void setisCategory(String category) {
        this.isCategory = isCategory;
    }

    /**
     * @return the numberOfAccessories
     */
    public int getNumberOfAccessories() {
        return numberOfAccessories;
    }

    /**
     * @param numberOfAccessories the numberOfAccessories to set
     */
    public void setNumberOfAccessories(int numberOfAccessories) {
        this.numberOfAccessories = numberOfAccessories;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

}
