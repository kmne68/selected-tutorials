/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 *
 * @author Keith
 */
public class RollsRoyce extends Car {
    
        public RollsRoyce() {
        
        super("Rollie", 8, 4, true);
    }
        
        @Override
        public void startEngine() {
            
            System.out.println("The Rolls Royce engine is running");
        }
}
