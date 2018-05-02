/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author kemery
 */
public class Sparrow extends Bird implements Flyable {

    public Sparrow(int age, String gender, int weightInKg) {
        super(age, gender, weightInKg);
    }
    
    
    public void fly() {
        System.out.println(" flying.");
    }
    
}
