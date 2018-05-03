/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;

/**
 *
 * @author kemery
 */
public class Counter {
    
    private int countValue = 0;
    private String name = null;
    
    public Counter(String str) {
        this.name = str;
    }
    
    public void increment() {
        this.countValue++;
    }
    
    public int getCurrentValue() {
        
        return this.countValue;
    }
            
    public String toString() {
        
        int countString = getCurrentValue();
        
        return name + ": " + countValue;
    }
}
