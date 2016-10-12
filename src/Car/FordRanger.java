/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 *
 * @author Keith
 */
public class FordRanger extends Car {
    
    public FordRanger() {
        
        super("Rick", 4, 4, true);
    }
    
    @Override
    public void accelerate() {
        
        System.out.println("The Ranger is accelerating");
    }
    
    @Override
    public String brake() {
        return super.brake();
    }
}
