/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClasses;

import java.util.ArrayList;

/**
 *
 * @author Keith
 */
public class Gearbox {
    
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    
    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }
    
    public class Gear {
        private int gearNumber;
        private double ratio;
        
        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }
        
        
        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
    }
}
