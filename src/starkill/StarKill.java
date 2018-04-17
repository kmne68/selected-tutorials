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
        System.out.println("*123*456 --> " + starKill("*123*456"));
        System.out.println("*123**456 --> " + starKill("123**456"));
        System.out.println("wacy*xko --> " + starKill("wacy*xko"));
        System.out.println("*str*in*gy --> " + starKill("*str*in*gy"));
        System.out.println("a*b --> " + starKill("a*b"));        
        System.out.println("******aabbc*** --> " + starKill("******aabbc***"));

        
        // need to add code to deal with asterisk in first position
    }
    
    
    public static String starKill(String start) {
        
        String result = "";
        
        for(int i = 0; i < start.length(); i++) {
            
            if(i == 0 && start.charAt(i) != '*') {
                result += start.charAt(i);
            } 
            if (i > 0 && start.charAt(i) != '*' && start.charAt(i - 1) != '*') {                
                result += start.charAt(i);
            }
            if (i > 0 && start.charAt(i) == '*' && start.charAt(i - 1) != '*') {
                result = result.substring(0, result.length() - 1);
            }        
            
        }
        
        return result;
    }
    
}
