package ec.edu.espe.mechanicsSystem.model;

/**
 *
 * @author Gaby Ramos 
 */
public class Motorcicle {
    
    private String brand;
    private String model;
    private float price;
    private int numberOfEngines;
    private boolean trialType;

    public Motorcicle(String brand, String model, float price, int numberOfEngines, boolean trialType) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.numberOfEngines = numberOfEngines;
        this.trialType = trialType;
    }

    
    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
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

    /**
     * @return the numberOfEngines
     */
    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    /**
     * @param numberOfEngines the numberOfEngines to set
     */
    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    /**
     * @return the trialType
     */
    public boolean isTrialType() {
        return trialType;
    }

    /**
     * @param trialType the trialType to set
     */
    public void setTrialType(boolean trialType) {
        this.trialType = trialType;
    }

    

}
