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
public class Bank {
    
    String name;
    private ArrayList<Branch> branchesList;
    
    public Bank(String name) {

        this.name = name;
        this.branchesList = new ArrayList<>();
    }
    
    public boolean addBranch(String branchName) {
        
        if(findBranch(branchName) == null) {
            this.branchesList.add(new Branch(branchName));
        }
        return false;
    }
    
    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }
    
    
    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }
    
    public Branch findBranch(String branchName) {
        for(int i = 0; i < this.branchesList.size(); i++) {
            Branch checkedBranch = this.branchesList.get(i);
       
            if(checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }
    
    public boolean listCustomers(String branchName, boolean showTransaction) {
        
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("Customer details for branch " + branch.getName);
        }
    }
    
    
}
