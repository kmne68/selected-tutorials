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
public class Earth {
    
    public static void main(String[] args) {
        
        Human Joe = new Human();
        Joe.speak();
        
        Joe.age = 23;
        Joe.eyeColor = "purple";
        Joe.heightInInches = 76;
        Joe.name = "Joe";
        System.out.println();
        Joe.speak();
        
        Human Tom = new Human("Tom", 72, 63, "chartruese");
        System.out.println();
        Tom.speak();
        
        Human Mary = new Human("Mary", 13, 4, "orange");
        System.out.println();
        Mary.speak();
        
        System.out.println();
        Joe.speak("Hi Mary. Hi Joe. ");
        Tom.speak("Hey Joe. ");
        Mary.speak("Get lost creep. ");
    }
}
