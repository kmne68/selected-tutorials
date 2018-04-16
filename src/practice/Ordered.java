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
public class Ordered {
    
    public static void main(String[] args) {
        
        System.out.println("1, 2, 3, false: " + isOrdered(1, 2, 3, false));
        System.out.println("1, 1, 2, true: " + isOrdered(1, 1, 2, true));
        System.out.println("2, 8, 4, true: " + isOrdered(2, 8, 4, true));
        System.out.println("3, 5, 7, false: " + isOrdered(3, 5, 7, false));
        System.out.println("3, 2, 4, true: " + isOrdered(3, 2, 4, true));
    }
    
    public static boolean isOrdered(int x, int y, int z, boolean isOk) {
        
        return (isOk ? (y < z) : (x < y && y < z));
        
    }
}
