/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.medicalInstruments.model;

/**
 *
 * @author HP
 */
public class MedicalInstruments {


    public MedicalInstruments(String Name, String Type, float price, String category, int numberOfAccessories) {
        this.Name = Name;
        this.Type = Type;
        this.category = category;
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
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
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

    private String Name;
    private String Type;
    private String category;
    private int numberOfAccessories;
    private float price;

    public String isCategory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
