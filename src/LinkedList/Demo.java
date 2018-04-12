/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Keith
 */
public class Demo {
    
    public static void main (String[] args) {
        
        System.out.println("============+++============");
        LinkedList<String> placesToVisit = new LinkedList<String>();
        
        addInOrder(placesToVisit, "Hobbitton");
        addInOrder(placesToVisit, "Bywater");
        addInOrder(placesToVisit, "Michel Delving");
        addInOrder(placesToVisit, "Bree");
        addInOrder(placesToVisit, "Staddle");
        addInOrder(placesToVisit, "Rivendell");
        addInOrder(placesToVisit, "Minas Tirith");
        addInOrder(placesToVisit, "Frogmorton");
        addInOrder(placesToVisit, "Buckland");
        System.out.println("============+++============");
        printList(placesToVisit);
        
        addInOrder(placesToVisit, "Minas Ithil");
        
        /* Initial add statements
        placesToVisit.add("Hobbiton");
        placesToVisit.add("Bywater");
        placesToVisit.add("Michel Delving");
        placesToVisit.add("Bree");
        placesToVisit.add("Staddle");
        placesToVisit.add("Rivendell");
        placesToVisit.add("Minas Tirith");
        placesToVisit.add("Frogmorton");
        placesToVisit.add("Buckland"); */
        
        printList(placesToVisit);
        
        placesToVisit.add(1, "Minas Ithil");
        printList(placesToVisit);
        
        placesToVisit.remove(1);
        printList(placesToVisit);
        visit(placesToVisit);
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
        return true;
    } // end addInOrder
    
    
    private static void visit(LinkedList cities) {
        
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        
        if(cities.isEmpty()) {
            System.out.println("No cities in the itinerary.");
            return;
        }
        else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        
        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Holiday over.");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visitin " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list.");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list.");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }
    
    
    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city \n" +
                "3 - print menu options");
    }
}
