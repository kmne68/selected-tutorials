/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author Keith
 */
public class Bird extends Animal{
    
    private int age;
    private String gender;
    private int weightInKg;
    
    public Bird(int age, String gender, int weightInKg) {
        
        super(age, gender, weightInKg);
    }
    
    public void fly() {
        System.out.println("Flying...");                
    }
    
}
