/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoBoxing;

import Banking.Customer;
import java.util.ArrayList;

/**
 *
 * @author Keith
 */
public class Branch {
    
    private String name;
    private ArrayList<Customer> customers;
    
    
    public Branch(String name) {
        
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }
    
    
    public void addCustomer(String name) {
        
    };   

   
    public String getName() {
        return name;
    }
    
    
    public boolean newCustomer(String customerName, double initialAmount) {
        
        if(findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }
    
    
    public boolean addCustomerTransaction(String customerName, double amount) {
        
        Customer existingCustomer = findCustomer(customerName);
        
        if(existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }
    
    
    private Customer findCustomer(String name) {        
        
        for(int i = 0; i < this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(name)) {
                return checkedCustomer;
            }
        }
        return null;
    }
    
    public void openAccount(int deposit) {
        
    }
    
    
    public void showCustomer() {
        
    }
    
    
    public void showTransactions() {
        
    }    
    
    
    public void transaction(Customer customer, int debit) {
        
    }
}
