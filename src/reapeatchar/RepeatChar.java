/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reapeatchar;

/**
 *
 * @author kemery
 */
public class RepeatChar {
 
    public static void main(String[] args) {
        
        System.out.println("ABCDEFG --> " + repeatChar("ABCDEFG"));
        System.out.println("!@#$%^&*() --> " + repeatChar("!@#$%^&*()"));
        
    }
    
    
    public static String repeatChar(String start) {
        
        String end = "";
        
        for(int character = 0; character < start.length(); character++ ) {
            char aChar = start.charAt(character);
            
            end += "" + aChar + aChar;
 //           end += Character.toString(start.charAt(character)) + Character.toString(start.charAt(character));            
        }        
        
        return end;
        
    }
    
    
}
