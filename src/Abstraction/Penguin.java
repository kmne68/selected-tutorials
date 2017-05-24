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
public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        super.breathe(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eat() {
        super.eat(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I can't fly.");
    }
    
    
    
}
