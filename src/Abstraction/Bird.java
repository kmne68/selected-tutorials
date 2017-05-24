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
public abstract class Bird extends Animal implements CanFly {
    
    public Bird(String name) {
        super(name);
    }
    
    @Override
    public void eat() {
        System.out.println(getName() + " is squawking.");
    }
    
    @Override
    public void breathe() {
        System.out.println("Take a deep breath.");
    }
    
    // public abstract void fly();
    
    public void fly() {
        System.out.println("Soaring under my own power.");
    }
    
}
