/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 *
 * @author Keith
 */
public class ModelT extends Car {
    
    public ModelT() {
        
        super("Blackie", 4, 4, true);
    }
        
    /**
     * Apply brakes for this model
     */
    @Override
    public String brake() {
        
        return "Model T brakes engaged";
    }
}
