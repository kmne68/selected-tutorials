/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoBoxing;

/**
 *
 * @author Keith
 */
public class AppMain {
    
    public static void main(String[] args) {
        
        Bank bank = new Bank("Bank of America");
        
        if(bank.addBranch("Fenton")) {
            System.out.println("Fenton branch created");
        }
        
        bank.addBranch("Fenton");
        bank.addCustomer("Fenton", "Feanor", 200);
        bank.addCustomer("Fenton", "Manwe", 300);
        bank.addCustomer("Fenton", "Ulmo", 1000);
        
        bank.addBranch("Arda");
        bank.addCustomer("Arda", "Melkor", 0);
        
        bank.addCustomerTransaction("Fenton", "Feanor", 75.00);
        bank.addCustomerTransaction("Fenton", "Manwe", 300);
        bank.addCustomerTransaction("Fenton", "Melkor", -456);
        
        bank.listCustomers("Fenton", true);
        bank.listCustomers("Arda", true);
        
        if(!bank.addCustomer("Fenton", "Manwe", 5.50)) {
            System.out.println("Error Fenton branch does not exist.");
        }
        
        if(!bank.addBranch("Arda")) {
            System.out.println("Arda branch already exists");
        }
        if(!bank.addCustomerTransaction("Fenton", "Joe", 3.00)) {
            System.out.println("Customer does not exist at that branch.");
        }
        
        if(!bank.addCustomer("Fenton", "Manwe", 14.00)) {
            System.out.println("Customer Manwe already exists.");
        }
    }
}
