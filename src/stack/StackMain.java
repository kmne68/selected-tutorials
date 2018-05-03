/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author kemery
 */
public class StackMain {
    
    public static void main(String[] args) {
        
        Stack myStack = new Stack(3);
        
//        myStack.push(20);
//        myStack.push(40);
//        myStack.push(60);
//        myStack.push(80);
//        myStack.push(100);
        
//        while (!myStack.isEmpty()) {
//            char value = myStack.pop();
//            System.out.println(value);
//        }
        
        System.out.println(reverseString("HELLO"));
        
    }   
    
            
        public static String reverseString(String str) {
            int stackSize = str.length();
            
            Stack myStack = new Stack(stackSize);
            for(int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j); // getting a char from the input string
                myStack.push(ch);
            }
            
            String result = "";
            while(!myStack.isEmpty()) {
                char ch = myStack.pop();
                result = result + ch + "\n"; // appending to the output
            }
            return result;
        }
        
}
