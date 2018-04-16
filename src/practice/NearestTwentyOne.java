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
public class NearestTwentyOne {
    
    public static void main(String[] args) {
        
        int target = 21;
        
        System.out.println("Nearest 19, 21 :" + nearestTwentyOne(target, 19, 21));
        System.out.println("Nearest 21, 19 :" + nearestTwentyOne(target, 21, 19));
        System.out.println("Nearest 19, 22 :" + nearestTwentyOne(target, 19, 22));
        System.out.println("Nearest 32, 22 :" + nearestTwentyOne(target, 32, 22));
        System.out.println("Nearest  1, 21 :" + nearestTwentyOne(target, 1, 21));
        System.out.println("Nearest 18, 18 :" + nearestTwentyOne(target, 18, 18));
        System.out.println("Nearest 21, 21 :" + nearestTwentyOne(target, 21, 21));        
        
    }
    
    public static int nearestTwentyOne(int target, int a, int b) {
        
        int result = -1;
        
        /* 
        if a < 21 and b < 21
        */
        if(a == target && b == target) {
            return  1;
        }  
        
        if (a > target && b > target) {
            result = 0;
        }
        
        if (a > target && b <= target) {
            result = b;
        }
        
        if (a <= target && b > target) {
            result = a;
        }        

        if (a <= target && b <= target) {
            result = (a > b ? a : b);
        }    
        return result;
    }    
}
