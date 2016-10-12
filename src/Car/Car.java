/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 *
 * @author Keith
 */
public class Car {
    
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int speed;
    
    public Car(String name, int cylinders, int wheels, boolean engine ) {
        
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
    
    
    public void startEngine() {
        
        System.out.println("Car engine is running");
    }
    
    
    public void accelerate() {
        
        speed++;
        System.out.println("Car speed is increasing");
    }
    
    
    public void brake() {
        
        speed--;
        System.out.println("Car speed is decreasing");
    }
}
