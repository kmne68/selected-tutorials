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
public abstract class Animal {
    
    private int     age;
    private String  gender;
    private int     weightInKg;
    
    public Animal(int age, String gender, int weightInKg) {
        this.age = age;
        this.gender = gender;
        this.weightInKg = weightInKg;
    }
    
    public void eat() {
        System.out.println("Eating...");
    }
    
    public void sleep() {
        System.out.println("Sleeping...");
    }
    
    public abstract void move();
}
