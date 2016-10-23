/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author Keith
 */
public class Main {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
                
        String[] fellowship = new String[9];
        fellowship[0] = "Frodo";
        fellowship[1] = "Sam";
        fellowship[2] = "Merry";
        fellowship[3] = "Pippin";        
        fellowship[4] = "Gandalf";
        fellowship[5] = "Aragorn";
        fellowship[6] = "Boromir";
        fellowship[7] = "Legolas";
        fellowship[8] = "Gimli";
        
        printArray(fellowship);
        
        int[] numbers = getIntegers(5);
        for(int i = 0; i < numbers.length; i++) {
            
            System.out.println("Element " + i + ", typed value was " + numbers[i]);
        }
        
        System.out.println("The average is " + getAverage(numbers));
    }
    
    public static void printArray(String[] array) {
        
                for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
    
    public static int[] getIntegers(int number) {
        
        System.out.println("Enter " + number + " integer values.\r");
        int[] numbers = new int [number];
        
        for(int i = 0; i < numbers.length; i++) {
            
            numbers[i] = scanner.nextInt();
        }
        
        return numbers;
    }
    
    public static double getAverage(int[] numbers) {
        double sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            
            sum += numbers[i];
        }
        
        return (double) sum / (double) numbers.length;
    }
    
}
