/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritancePractice;

/**
 *
 * @author Keith
 */
public class StartCar {
    
    public static void main(String[] args) {
        
        FordFusion fusion = new FordFusion("black", true);
        fusion.accelerate(30);
        fusion.accelerate(50);
        fusion.steer(45);
        fusion.accelerate(-10);
        fusion.move(40, 45);
    }
    
}
