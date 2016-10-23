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

    boolean gameOver = true;
    int score = 5000;
    int levelCompleted = 5;
    int bonus = 300;
    
    if(score == 4000)
        System.out.println("Your score was 5000.");
    System.out.println("Your score was 4000.");
    
    if(score <= 5000 && score > 1000) {
        System.out.println("Your score was less than 5000.");
    }
    else if(score < 1000) {
        System.out.println("Your score was less than 1000.");
    }else {
        System.out.println("Got here with no score");
    }
       
    if(gameOver == true) {
        int finalScore = score + (levelCompleted * bonus);
        System.out.println("Your final scroe was " + finalScore);
    }
                
    int newScore = 10000;
    int newLevelCompleted = 8;
    boolean newGameOver = true;
    int newBonus = 200;
    
    if(newGameOver) {
        int finalScore = newScore + (newLevelCompleted * bonus);
        System.out.println("Your final score was " + finalScore);
    }
    
    }
}
