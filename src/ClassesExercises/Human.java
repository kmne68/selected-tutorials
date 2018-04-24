/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesExercises;

/**
 *
 * @author kemery
 */
public class Human {
    
    String name;
    int age;
    int heightInInches;
    String eyeColor;
    
    public Human() {
        
        this.age = 23;
        this.eyeColor = "purple";
        this.heightInInches = 76;
        this.name = "Joe";
    }
    
    public Human(String name, int age, int height, String eyes) {
        
        this.age = age;
        this.eyeColor = eyes;
        this.heightInInches = height;
        this.name = name;
    }
 
    public void speak() {
        System.out.println("Howdy, my name is " + name + ".");
        System.out.println("I am " + heightInInches + " inches tall.");
        System.out.println("I am " + age + " years old.");
        System.out.println("My eyes are " + eyeColor + ".");
    }
    
    public void speak(String phrase) {
        
        System.out.println(phrase);
    }
    
    public void eat() {
        
        System.out.println("I'm eating...");
    }
    
    public void walk() {
        
        System.out.println("I'm walking...");
    }
    
    public void work() {
        
        System.out.println("I'm working...");
    }
}
