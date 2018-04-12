/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author Keith
 */
public class Main {
    
    public static void main(String[] args) {
        Dog dog = new Dog("Collie");
        dog.breathe();
        dog.eat();
        
        Bird parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
        
        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
