/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Keith
 */
public class PartialSum {
    
    public static void main(String[] args) {
        
        System.out.println("1, 2, 3: " + partialSum(1, 2, 3));
        System.out.println("1, 2, 13: " + partialSum(1, 2, 13));
        System.out.println("1, 13, 3: " + partialSum(1, 13, 3));
        System.out.println("13, 2, 3: " + partialSum(13, 2, 3));
        System.out.println("103, 13, 1 " + partialSum(103, 13, 1));
    }
    
    
    public static int partialSum(int a, int b, int c) {
        
        if(a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        } 
        if (c == 13) {
            return a + b;
        }      
        return a + b + c;
    }
}
