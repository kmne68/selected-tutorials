/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritancePractice;

import java.awt.Color;

/**
 *
 * @author Keith
 */
public class FordFusion extends Car {
    
    private String color = "BLACK";
    private boolean hasBackUpCamera = true;
    
    public FordFusion(String color, boolean hasBackUpCamera) {
        
        super("Fusion", "G6", 4, 4, 4, false);
        this.color = color;
        this.hasBackUpCamera = hasBackUpCamera;
    
    }        
    
}
