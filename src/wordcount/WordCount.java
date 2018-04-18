/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordcount;

/**
 *
 * @author kemery
 */
public class WordCount {
    
    public static void main(String[] args) {
        
        String[] wordList = {"a", "b", "ab", "bc", "cd", "abcd", "abc", "xyz"};
                
        System.out.println("Count or words of length 1 is: " + wordCount(wordList, 1));
        System.out.println("Count or words of length 2 is: " + wordCount(wordList, 2));
        System.out.println("Count or words of length 3 is: " + wordCount(wordList, 3));
        System.out.println("Count or words of length 4 is: " + wordCount(wordList, 4));
        System.out.println("Count or words of length 5 is: " + wordCount(wordList, 5));
        
    }
    
    
    public static int wordCount(String[] words, int length) {
        
        int count = 0;
        
        for(String word : words) {
            if (word.length() == length) {
                count++;
            }            
        }        
        
        return count;
    }
    
}
