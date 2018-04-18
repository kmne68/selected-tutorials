/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchingchars;

/**
 *
 * @author kemery
 */
public class MatchingChars {
    
    public static void main(String[] args) {
        
        String[] firstList = {"a", "", "ab", "bc", "cd", "addddcd", "abc", "xyz"};
        String[] secondList = {"a", "bc", "abc", "cbc", "c", "abcd", "", "x"};
        System.out.println("The number of corresponding strings starting with the same letter: " + matchingChars(firstList, secondList));
    }
    
    
    public static int matchingChars(String[] first, String[] second) {
        
        int count = 0;
        
        for(int i = 0; i < first.length; i++) {
                        
            if(!first[i].equals("") && !second[i].equals("") && first[i].charAt(0) == second[i].charAt(0)) {
                count++;
            }
        }
        
        return count;        
    }
}
