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
public class SIBTest {
    
    public static final String owner;
    
    static {
        owner = "Keith";
        System.out.println("SIBTest static initialization block called.");
    }
    
    public SIBTest() {
        System.out.println("SIB constructor called.");
    }
    
    static {
        System.out.println("2nd initialization block called.");
    }
    
    public void someMethod() {
        System.out.println("someMethod called.");
    }
}
