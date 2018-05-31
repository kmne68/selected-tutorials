/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scopechallenge;

import java.util.Scanner;

/**
 *
 * @author kemery
 */
public class X {
    
    private int x = 0;
    
    public X (Scanner x) {
        System.out.println("Please enter an integer: ");
        this.x = x.nextInt();
    }
    
    public void x () {   

              
        for(int x = 1; x <= this.x; x++) {
            System.out.println(this.x + " times " + x + " = " + this.x * x);
        }
        
    }
}
