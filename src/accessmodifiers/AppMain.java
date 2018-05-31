/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accessmodifiers;

/**
 *
 * @author kemery
 */
public class AppMain {
    
    public static void main(String[] args) {
        
        Account myAccount = new Account("Keith");
        
        myAccount.deposit(1000);
        myAccount.withdraw(500);
        myAccount.withdraw(-200);
        myAccount.deposit(-20);
        myAccount.calculateBalance();
        
       // myAccount.balance = 5000;
        
        System.out.println("Balance on account is " + myAccount.getBalance());
       // myAccount.transactions.add(4500);
        myAccount.calculateBalance();
    }
}
