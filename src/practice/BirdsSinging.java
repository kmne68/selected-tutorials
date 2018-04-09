/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Keith
 */
public class BirdsSinging {
    
    public static void main(String[] args) {
        
        System.out.println("80, summer: " + birdsSinging(80, true));
        System.out.println("80, fall: " + birdsSinging(80, false));
        System.out.println("90, summer: " + birdsSinging(90, true));
        System.out.println("90, winter: " + birdsSinging(90, false));
        System.out.println("105, summer: " + birdsSinging(105, true));
        System.out.println("100, summer: " + birdsSinging(100, true));
    }
    
    /*
        If temp is 60 - 90 (60 - 100 in summer) birds are singing.
    */
    
    public static boolean birdsSinging(int temperature, boolean isSummer) {
        
        return (isSummer ? (temperature >= 60 ) && (temperature <= 100) : (temperature >= 60) && (temperature <= 90));
        
    }
}
