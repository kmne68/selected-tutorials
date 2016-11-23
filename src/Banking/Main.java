/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking;

/**
 *
 * @author Keith
 */
public class Main {
    
    public static void main(String[] args) {
        
        Bank bank = new Bank("National Australia Bank");
        
        bank.addBranch("Adelaide");
        
        bank.addCustomer("Adelaide", "Kellen", 100.05);
        bank.addCustomer("Adelaide", "Duncan", 99.05);
        bank.addCustomer("Adelaide", "Alexandeer", 70.05);
        
        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Emery", 44.22);
        
        bank.addCustomer("Adelaide", "Josephine", 8.07);        
        bank.addCustomer("Adelaide", "Renlie", 98.07);
        bank.addCustomer("Adelaide", "Sullivan", 9.07);
        
        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);
        
        bank.addBranch("Melbourne");
        
        if(!bank.addCustomer("Melbourne", "Kylie", 5.53)) {
            System.out.println("Error Melbourne does not exist");
        }
        
        if(!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch aleady exits.");
        }
        
        if(!bank.addCustomerTransaction("Aelaide", "Kylie", 52.33)) {
            System.out.println("Cutomer does not exist at branch");
        }
        
        if(!bank.addCustomer("Adelaide", "Kylie", 12.21)) {
            System.out.println("Customer Kylie already exists.");
        }
    }}
