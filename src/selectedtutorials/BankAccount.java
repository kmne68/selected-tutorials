/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package selectedtutorials;

import java.text.DecimalFormat;

/**
 *
 * @author Keith
 */
public class BankAccount {
    
    private int accountNumber;
    private double accountBalance;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    
    private static DecimalFormat df2 = new DecimalFormat(".##");
    
    
    public BankAccount() {
        
        System.out.println("Empty constructor called.");
    }
    
    public BankAccount(int accountNumber, double acountBalance, String firstName, String lastName, String phoneNumber) {
        
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
    
    
    public double addFunds(double deposit) {
        
        System.out.println("Your account balance is $" + df2.format(accountBalance));
        return accountBalance += deposit;
    }
    
    
    public double withdrawFunds(double withdrawalAmount) {
        
        if (accountBalance >= withdrawalAmount)
            accountBalance -= withdrawalAmount;
        else 
            System.out.println("Insufficient funds.");
        return accountBalance;
    }
    
    
    public void setAccountNumber(String account) {
        
        this.accountNumber = accountNumber;
    }
    
    
    public String printBalance() {
        
        return df2.format(accountBalance);
    }
    
    
    public void setBalance (double balance) {
        
        this.accountBalance = balance;
    }
    
    
    public void setFirstName (String nameFirst) {
        
        this.firstName = nameFirst;
    }
    
    
    public void setLastName (String nameLast) {
        
        this.lastName = nameLast;
    }
    
    
    public void setPhone (String phone) {
        
        this.phoneNumber = phone;
    }
    
    
    public int getAccountNumber() {
        
        return accountNumber;
    }
    
    
    public double getBalance() {
        
        return accountBalance;
    }
    
    
    public String getFirstName() {
        
        return firstName;
    }
    
    
    public String getLastName() {
        
        return lastName;
    }
    
    
    public String getPhone() {
        
        return phoneNumber;
    }
}
