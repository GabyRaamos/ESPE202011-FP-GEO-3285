/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Gps.model;

/**
 *
 * @author Usuario
 */
public class Gps {

    private String Model;
    private String Version;
    private int Age;
    private String touchscreen;
    private int Price;

    public Gps(String Model, String Version, int Age, String touchscreen, int Price) {
        this.Model = Model;
        this.Version = Version;
        this.Age = Age;
        this.touchscreen = touchscreen;
        this.Price = Price;
    }

    /**
     * @return the Model
     */
    public String getModel() {
        return Model;
    }

    /**
     * @param Model the Model to set
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * @return the Version
     */
    public String getVersion() {
        return Version;
    }

    /**
     * @param Version the Version to set
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * @return the Age
     */
    public int getAge() {
        return Age;
    }

    /**
     * @param Age the Age to set
     */
    public void setAge(int Age) {
        this.Age = Age;
    }

    /**
     * @return the touchscreen
     */
    public String getTouchscreen() {
        return touchscreen;
    }

    /**
     * @param touchscreen the touchscreen to set
     */
    public void setTouchscreen(String touchscreen) {
        this.touchscreen = touchscreen;
    }

    /**
     * @return the Price
     */
    public int getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(int Price) {
        this.Price = Price;
    }

}