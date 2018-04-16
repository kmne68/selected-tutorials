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
public class IsCool {
     
    public static void main(String[] args) {
        
        System.out.println("11 is cool? " + isCool(11));
        System.out.println("121 is cool? " + isCool(121));
        System.out.println("122 is cool? " + isCool(122));
        System.out.println("8 is cool? " + isCool(8));
        System.out.println("78 is cool? " + isCool(78));
    }
    
    public static boolean isCool(int n) {
        
        return (n % 11 <= 1);
    }
}
