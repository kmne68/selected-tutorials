/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriesfunctions;

/**
 *
 * @author kemery
 */
public class Main {
    
    public static void main (String[] args) {
        
        for(int i = 0; i <= 10; i++) {
            System.out.println("Sum first " + i + " digits is: " + Series.nSum(i));
            
            System.out.println("Factorial first " + i + " digits is: " + Series.factorial(i));
            
            System.out.println("Fibonacci first " + i + " digits is: " + Series.fibonacci(i));
        }
    }
    
}
