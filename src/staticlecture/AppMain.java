/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticlecture;

/**
 *
 * @author kemery
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    
    public static int multiplier = 7;
    
    
    public static void main(String[] args) {
        
        // All instances share one copy of a static variable
        
//        StaticTest firstInstance = new StaticTest("First instance");
//        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstances());
//        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//        
//        StaticTest secondInstance = new StaticTest("Second instance");
//        System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstances());
//        
//        StaticTest thirdInstance = new StaticTest("Third instance");
//        System.out.println(thirdInstance.getName() + " is instance number " + thirdInstance.getNumInstances());
        
//        System.out.println(firstInstance.getName());
        
        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is  " + multiplier);
        
    }
        
        
        public static int multiply(int number) {
            
            return number * multiplier;
        }
    
    
}
