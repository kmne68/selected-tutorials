/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticlecture;

/**
 *
 * @author kemery
 */
public class StaticTest {
    
    private static int numInstances = 0;
    private String name;
    
    public StaticTest(String name) {
        this.name = name;
        numInstances++;        
    }
    
    public static int getNumInstances() {
        return numInstances;
    }
    
    public String getName() {
        return name;
    }
}
