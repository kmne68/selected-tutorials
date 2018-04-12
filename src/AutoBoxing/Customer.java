/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoBoxing;

import java.util.ArrayList;

/**
 *
 * @author Keith
 */
public class Customer {
    
    private String name;
    private ArrayList<Double> transactions;
    
    public Customer(String name, double initialDeposit) {
        
       this.name = name;
       this.transactions = new ArrayList<Double>();
       addTransaction(initialDeposit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }
    
    
    public void addTransaction(double amount) {
        
        this.transactions.add(amount);
    }
}
