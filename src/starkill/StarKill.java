/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starkill;

/**
 *
 * @author kemery
 */
public class StarKill {
    
    public static void main(String[] args) {
        
        System.out.println("123*456 --> " + starKill("123*456"));
  //      System.out.println("*123*456 --> " + starKill("*123*456"));
        System.out.println("*123**456 --> " + starKill("123**456"));
        System.out.println("wacy*xko --> " + starKill("wacy*xko"));
        
        // need to add code to deal with asterisk in first position
    }
    
    
    public static String starKill(String start) {
        
        String result = "";
        
        for(int character = 0; character < start.length(); character++) {
            
            if(start.charAt(character) != '*') {
                result += start.charAt(character);
            } else {
                
                result = result.substring(0, character - 1);
                character++;
            }
            
            
        }
        
        return result;
    }
    
}
