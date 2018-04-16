/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Keith
 */
public class RecursionPractice {
    
    public static void main(String[] args) {
      
        // will use charat and substring
        System.out.println(allDollars("hello"));
        System.out.println(allDollars("jones"));
    }
    
    
    public static String allDollars(String str) {
        
        if(str.length() <= 1) {
            return str;
        }
        
        return str.charAt(0) + "$" + allDollars(str.substring(1));
    }
}
