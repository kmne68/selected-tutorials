/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longeststring;

/**
 *
 * @author kemery
 */
public class LongestString {
    
    public static void main(String[] args) {
        
        System.out.println("Longest string of like characters in --> abcaabbccaaaabc is " + longestString("abcaabbccaaaabc"));
        System.out.println("Longest string of like characters in --> abcaabbccaaabc is " + longestString("abcaabbccaaabc"));
        System.out.println("Longest string of like characters in --> abcAAAaabbccaaabc is " + longestString("abcAAAaabbccaaabc"));
        System.out.println("Longest string of like characters in --> abcaabbccaaabcccccc is " + longestString("abcaabbccaaabcccccc"));
        System.out.println("Longest string of like characters in --> abcaabbcCcaAaAAAabc is " + longestString("abcaabbcCcaAaAAAabc"));
        System.out.println("Longest string of like characters in --> abcaa bbccaaabc is " + longestString("abcaa bbccaaabc"));
    }
    
    
    public static int longestString(String string) {
        
        int count = 0;
        int hiCount = 0;
        
        for(int i = 1; i < string.length(); i++) {

            if(string.charAt(i) == string.charAt(i - 1)) {
//                System.out.println("character at " + i + " = " + string.charAt(i));
//                System.out.println("character at " + i + " - 1 = " + string.charAt(i - 1));
//                System.out.println("count = " + count);
                count++;
                if (count > hiCount) {
                    hiCount = count;
                } 
            } else {
                    count = 0;
            }
        }     
        
        return hiCount + 1;        
    }
}
