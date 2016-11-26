/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Keith
 */
public class Demo {
    
    public static void main (String[] args) {
        
        LinkedList<String> placesToVisit = new LinkedList<String>();
        
        placesToVisit.add("Hobbiton");
        placesToVisit.add("Bywater");
        placesToVisit.add("Michel Delving");
        placesToVisit.add("Bree");
        placesToVisit.add("Staddle");
        placesToVisit.add("Rivendell");
        placesToVisit.add("Minas Tirith");
        placesToVisit.add("Frogmorton");
        placesToVisit.add("Buckland");
        
        printList(placesToVisit);
        
        placesToVisit.add(1, "Minas Ithil");
        printList(placesToVisit);
        
        placesToVisit.remove(1);
        printList(placesToVisit);
    }
    
    private static void printList(LinkedList<String>linkedList) {
        
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=====================");
    }
    
    
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        
        ListIterator<String> stringListIterator = linkedList.listIterator();
        
        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination.");
            }
            else if(comparison > 0) {
                // new City should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if(comparison < 0) {
                // move on next city
                
            }
        }
        stringListIterator.add(newCity);
        return false;
        
        
    }
}
