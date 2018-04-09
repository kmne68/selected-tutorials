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
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("5, 14, 19: " + twoSumOne(5, 3, 2));
        System.out.println("7, 8, 2: " + twoSumOne(7, 8, 2));
        System.out.println("1, 1, 2: " + twoSumOne(1, 1, 2));
        System.out.println("4, 8, 7: " + twoSumOne(4, 8, 7));
        System.out.println("6, 5, 10: " + twoSumOne(6, 5, 10));
    }
    
    
    public static boolean twoSumOne(int a, int b, int c) {
        
        return (a + b == c || a + c == b || b + c == a);
        
    }
    
}
