/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MobilePhone;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Keith
 */
public class MobilePhone {
    
    private static Scanner scanner = new Scanner(System.in);
    private static Contacts contacts = new Contacts();
            
    public static void main(String[] args) {
        
        boolean quit = false;
        int choice = 0;
        printInstructions();
        
        while(!quit) {
            
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    contacts.printContactList();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;     
            }    
        }
    }
    
    public static void addNewContact() {
        
    }
    
    public static void updateContact() {
        
    }
    
    public static void removeContact() {
        
    }
    
    public static void searchForContact() {
        
    }
    
    public static void processArrayList() {
    
    }        
    
    public static void printContactList() {
        
    }
    
    
    public static void printInstructions() {
            System.out.println("");
    } 
}
