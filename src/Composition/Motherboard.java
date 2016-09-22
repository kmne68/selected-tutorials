/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Composition;

/**
 *
 * @author Keith
 */
public class Motherboard {
    
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
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
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return the ramSlots
     */
    public int getRamSlots() {
        return ramSlots;
    }

    /**
     * @param ramSlots the ramSlots to set
     */
    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    /**
     * @return the cardSlots
     */
    public int getCardSlots() {
        return cardSlots;
    }

    /**
     * @param cardSlots the cardSlots to set
     */
    public void setCardSlots(int cardSlots) {
        this.cardSlots = cardSlots;
    }

    /**
     * @return the bios
     */
    public String getBios() {
        return bios;
    }

    /**
     * @param bios the bios to set
     */
    public void setBios(String bios) {
        this.bios = bios;
    }
   
    
    
    
}
