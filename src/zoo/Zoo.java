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
public class Zoo {
    
    public static void main(String[] args) {
     
        Mammal elephant = new Mammal(12, "male", 1000);
        Mammal bear = new Mammal(3, "female", 325);
        Fish fish = new Fish(1, "female", 5);
        Bird gandalf = new Bird(3, "female", 1);
        
        System.out.println("Elephant is ");
        elephant.eat();
        System.out.println("Bear is ");
        bear.sleep();
        System.out.println("Fish is ");
        fish.swim();
        System.out.println("Gandalf is ");
        gandalf.fly();
    }
}
