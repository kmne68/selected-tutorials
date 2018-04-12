/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking;

import java.util.ArrayList;

/**
 *
 * @author Keith
 */
public class Customer {
    
    private String name;
    private ArrayList<Double> transactions;
    
    public Customer(String name, double initialAmount) {
        
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }
    
    public void addTransaction(double amount) {
        
        this.transactions.add(amount);
    }
    
    public String getName() {
        
        return name;
    }
    
    
    public ArrayList<Double> getTransactions() {
        
        return transactions;
    }
}
