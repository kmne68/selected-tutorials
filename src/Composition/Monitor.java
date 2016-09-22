/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Composition;

/**
 *
 * @author Keith
 */
public class Monitor {
    
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;
    
    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    
    public void drawPixelAt(int x, int y, String color) {
        
        System.out.println("Drawing pixel at " + x + ", " + y + " in color " + color);
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
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
}
