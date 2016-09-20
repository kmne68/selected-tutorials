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
    
    
    public void accelerate(int rate) {
        
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0) {
            stop();
            changeGear(1);
        }
        else if (newVelocity > 0 && newVelocity <= 10) {
            
            changeGear(1);
        }
        else if(newVelocity >10 && newVelocity <= 20) {
            changeGear(2);
        }
        else if(newVelocity >20 && newVelocity <=30) {
            changeGear(3);
        }
        else {
            changeGear(4);
        }
        
        if(newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
    
}
