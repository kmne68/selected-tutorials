/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodOverloading;

/**
 *
 * @author Keith
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println(calcFeetAndInchesToCentimeters(-3, 7));
        System.out.println(calcFeetAndInchesToCentimeters(0, 11));
        System.out.println(calcFeetAndInchesToCentimeters( 7));
        System.out.println(calcFeetAndInchesToCentimeters(7, 5));
        System.out.println(calcFeetAndInchesToCentimeters( -7));
        System.out.println(calcFeetAndInchesToCentimeters(13,1));
        
//        int newScore = calculateScore("Tim", 500);
//        System.out.println("New score is " + newScore);
//        
//        calculateScore(300);
//        calculateScore();
    }
    
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double cm = 0;
        if(feet < 0 || inches < 0 || inches > 12) {
            return -1;
        } else {
            cm = ((feet * 12 * 2.54) + (inches * 2.54));
        }
        return cm;        
    }
    
    public static double calcFeetAndInchesToCentimeters(double inches) {
        double cm = 0;
        double remainingInches;
        double feet;
        
        if(inches < 0) {
            return -1;
        } else {
            feet = (int) inches / 12;
            remainingInches = (int) inches % 12;
        }
        cm = calcFeetAndInchesToCentimeters(feet, remainingInches);
        return cm;
    }
    
    /**
     * Examples of method overloading
     * @param playerName
     * @param score
     * @return 
     */
//    public static int calculateScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points.");
//        return score * 1000;
//    }
//    
//    public static int calculateScore( int score) {
//        System.out.println("Unnamed player scored " + score + " points.");
//        return score * 1000;
//    }
//    
//    public static int calculateScore() {
//        System.out.println("No player name or score.");
//        return 0;
//    }    
}
