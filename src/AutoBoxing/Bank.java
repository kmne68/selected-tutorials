/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoBoxing;

import java.util.ArrayList;
import Banking.Customer;

/**
 *
 * @author Keith
 */
public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {

        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {

        if (findBranch(name) == null) {
            this.branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String customerName, String branchName, double initialDeposit) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialDeposit);
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, String branchName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customers for this branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");
                if(showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                    }
                }
                
            }
            return true;
        } else {
            return false;
        }
    }

    public void printTransactions() {

    }

    private Branch findBranch(String name) {

        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getName().equals(name)) {
                return checkedBranch;
            }
        }
        return null;
    }
}
