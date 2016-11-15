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
        
        System.out.print("Please enter the contact's information: ");
        contacts.addContact(scanner.nextLine());
    }
    
    public static void updateContact() {
        
        System.out.print("Contact name: ");
        String contactName = scanner.nextLine();
        System.out.print("Enter new number: ");
        String newNumber = scanner.nextLine();
    }
    
    public static void removeContact() {
        
        System.out.print("Enter contact name: ");
        String contactName = scanner.nextLine();
        contacts.removeContact(contactName);
    }
    
    public static void searchForContact() {
        
        System.out.println("Contact to search for: ");
        String searchItem = scanner.nextLine();
        if(contacts.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in list.");
        }
        else {
            System.out.println(searchItem + " not found.");
        }
    }
    
    public static void processArrayList() {
    
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(contacts.getContacts());
        
        ArrayList<String> nextArray = new ArrayList<String>(contacts.getContacts());
        
        String[] myArray = new String[contacts.getContacts().size()];
        myArray = contacts.getContacts().toArray(myArray);
    }        
    
    public static void printContactList() {
        
    }
    
    
    public static void printInstructions() {
            System.out.println("");
    } 
}
