/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sectionone;

/**
 *
 * @author Keith
 */
public class Initial {
    
    public static void main(String args[]) {
        
        System.out.println("Hello world!");
        
        int firstNumber = 5;
        
        System.out.println("The first number is: " + firstNumber);
        
        // Variable types
        int minValue = -2_147_483_648;
        int maxValue = 2_147_483_647;
        int total = minValue / 2;
        System.out.println("Total = " + total);
        
        byte byteValue = -128;
        byte newByte = (byte)(byteValue/2); 
        System.out.println("newbyte = " + newByte);
        
        short shortValue = 32767;
        short newShortValue = (short) (shortValue / 2);
        
        long  longValue = 100L;
        System.out.println("Short = " + newShortValue + "\n" + "Long = " + longValue);
    }
    
    
}
