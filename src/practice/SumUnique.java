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
public class SumUnique {
    
    public static void main (String[] args) {
        
        System.out.println("Sum 3, 2, 3 = " + sumUnique(3, 2, 3));
        System.out.println("Sum 3, 2, 1 = " + sumUnique(3, 2, 1));
        System.out.println("Sum 13, 13, 13 = " + sumUnique(13, 13, 13));
        System.out.println("Sum 13, 13, 21 = " + sumUnique(13, 13, 21));
        System.out.println("Sum 13, 2, 37 = " + sumUnique(13, 2, 37));
        System.out.println("Sum 13, 2, 2 = " + sumUnique(13, 2, 2));
    }   
    
    public static int sumUnique(int x, int y, int z) {
        
        int sum = 0;
        
        if( x == y && y == z) {
            sum = 0;
        } else if (x == y) {
            sum = z;
        } else if (y == z) {
            sum = x;
        } else if (x == z) {
            sum = y;
        } else {
            sum = x + y + z;
        }
        
        
        return sum;
    }
}
