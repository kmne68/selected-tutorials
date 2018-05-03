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
public class AppMain {
    
    public static void main(String[] args) {
        
        Counter myCounter = new Counter("myCount");
        
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        
        System.out.println(myCounter.getCurrentValue());
        System.out.println(myCounter.toString());
    }
}
