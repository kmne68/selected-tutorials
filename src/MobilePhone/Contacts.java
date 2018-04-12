/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MobilePhone;

import java.util.ArrayList;

/**
 *
 * @author Keith
 */
public class Contacts {
    
    private ArrayList<String> contacts = new ArrayList<>();
    
    public void addContact(String contact) {
        
        contacts.add(contact);
    }
    
    
    public ArrayList<String> getContacts() {
        
        return contacts;
    }    

    
    public void printContactList() {
        
        System.out.println("You have " + contacts.size()+ " contacts");
        
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i+1) + ". " + contacts.get(i));
        }
    } 
    
    
    public void modifyContact(String currentContact, String newContact) {
        
        int position = findContact(currentContact);
        if(position >= 0) {
            modifyContact(position, newContact);
        }
    }
    
    
    private void modifyContact(int position, String newContact) {
        
        contacts.set(position, newContact);
        System.out.println("Contact " + (position + 1) + " has been modified.");
    }
    
    
    public void removeContact(String contact) {
        
        int position = findContact(contact);
        if (position >= 0) {
            removeContact(contact);
        }
    }
    
    
    private int findContact(String searchContact) {
        
        return contacts.indexOf(searchContact);
    } 
    
    
    public boolean onFile(String contact) {
        Boolean onFile = false;
        
        int position = findContact(contact);
        if(position >= 0) {
            return onFile;
        }
        else {
            onFile = false;
        }
        return onFile;
    }
}
