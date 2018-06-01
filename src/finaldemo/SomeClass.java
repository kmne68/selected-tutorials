/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaldemo;

/**
 *
 * @author kemery
 */
public class SomeClass {
    
    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;
    
    
    public SomeClass(String name) {
        
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }
    
    public int getInstanceNumber() {
        
        return instanceNumber;
    }
}
