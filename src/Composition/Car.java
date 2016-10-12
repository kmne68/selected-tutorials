/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Composition;

/**
 *
 * @author Keith
 */
public class Car extends Vehicle {
    
    private int doors;
    private int engineCapacity;
    
    public Car(String name, int doors, int engineCapacity) {
        
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
