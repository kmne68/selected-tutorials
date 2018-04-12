/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.ArrayList;

/**
 *
 * @author Keith
 */
public class Main {
    
    public static void main (String[] args) {
        
        Customer firstCustomer = new Customer("Keith", 77.93);
        System.out.println("Balance for firstCustomer: " + firstCustomer.getBalance());
        Customer secondCustomer = new Customer("Kelen", 47.32);
        System.out.println("Balance for secondCustomer: " + secondCustomer.getBalance());
        Customer thirdCustomer;
        thirdCustomer = secondCustomer;
        System.out.println("Balance for thirdCustomer: " + thirdCustomer.getBalance());
        
        thirdCustomer.setBalance(12.18);
        System.out.println("Balance for thirdCustomer: " + thirdCustomer.getBalance());
        
        System.out.println("Balance for secondCustomer: " + secondCustomer.getBalance());
        
        ArrayList<Integer> intList = new ArrayList<Integer>();
        
        intList.add(1);
        intList.add(3);
        intList.add(4);
        
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));            
        }
        
        intList.add(1, 2);
        
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));            
        }        
    }
    
}
