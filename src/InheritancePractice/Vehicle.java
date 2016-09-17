/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritancePractice;

/**
 *
 * @author Keith
 */
public class Vehicle {
    
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;
    
    
    public Vehicle(String name, String size) {
        
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;        
    }
    
    
    public void steer(int direction) {
        
        this.currentDirection = direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
   }
    
    
    public void move (int velocity, int direction) {
        
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehcile.move(): Moving at " + currentVelocity + " at " + currentDirection );

    } // end changeDirection
    
    
    public String getName() {
        
        return name;
    }
    
    
    public String getSize() {
        
        return size;
    }
    
    
    public int getCurrentSpeed() {
        
        return currentVelocity;
    }
    
    
    public int getCurrentDirection() {
        
        return currentDirection;
    }
    
    
    public void stop() {
        
        this.currentVelocity = 0;
    }
            
    
} // endClass
