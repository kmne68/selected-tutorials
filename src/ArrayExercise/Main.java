/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayExercise;

import java.util.Scanner;

/**
 *
 * @author Keith
 */
public class Main {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int target = 5;
        int[] initialArray = getIntegers(target);
        
        printArray(initialArray);
        printArray(sortIntegers(initialArray));
    }

    
        
    public static int[] getIntegers(int number) {
        
        System.out.println("Enter " + number + " integer values.\r");
        int[] numbers = new int [number];
        
        for(int i = 0; i < numbers.length; i++) {
            
            numbers[i] = scanner.nextInt();
        }
        
        return numbers;
    }
    
    public static void printArray(int[] arrayToPrint) {
        
        for (int i = 0; i <= arrayToPrint.length - 1; i++) {
            
            System.out.println("Array element " + i + " = " + arrayToPrint[i]);
        }            
    }
    
    
    public static int[] sortIntegers(int[] arrayToSort) {
       // int holder = 0;
        int[] sortedArray = arrayToSort;
        for(int i = 0; i < arrayToSort.length - 1; i++) {
            int holder = 0;
            if(sortedArray[i + 1] > sortedArray[i]) {
                holder = sortedArray[i];
                sortedArray[i] = sortedArray[i+1];
                sortedArray[i+1] = holder;
                
            }
        }
        
        
        return sortedArray;
    }
    
}
