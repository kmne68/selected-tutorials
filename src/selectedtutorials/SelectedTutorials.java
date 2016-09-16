/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package selectedtutorials;

import inheritance.Animal;
import inheritance.Dog;


/**
 *
 * @author Keith
 */
public class SelectedTutorials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount();
        
        account.setAccountNumber("12345");
        account.setBalance(538.97);
        account.setLastName("John");
        account.setFirstName("John");
        account.setPhone("555-555-5555");
        
        account.addFunds(37.04);
        account.withdrawFunds(598.02);
        System.out.println("Your account balance is $" + account.getBalance());
        
        account.withdrawFunds(17.31);
        System.out.println("Your account balance is $" + account.printBalance());
        account.withdrawFunds(558.69);
        System.out.println("Your account balance is $" + account.printBalance());
        
        BankAccount newAccount = new BankAccount(54321, 400.45, "Sally", "Petersen", "555-777-9999");
        
        BankAccount myAccount = new BankAccount("Keith", "Emery", "No phone");
        System.out.println("My info " + myAccount.printBalance());
        
        // Test VIP Customer
        
        VIPCustomer vip1 = new VIPCustomer();
        VIPCustomer vip2 = new VIPCustomer("John", "jdoe@test.com");
        VIPCustomer vip3 = new VIPCustomer("George", 12000.00, "georgie@test.com");
        System.out.println("VIP #1: " + vip1.getCustomerEmail() + ", " + vip1.getCustomerName() + ", " + vip1.getCreditLimit());
        
        System.out.println("VIP #2: " + vip2.getCustomerEmail() + ", " + vip2.getCustomerName() + ", " + vip2.getCreditLimit());
        
        System.out.println("VIP #2: " + vip3.getCustomerEmail() + ", " + vip3.getCustomerName() + ", " + vip3.getCreditLimit());
        
        
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 28, 2, 4, 1, 20, "long silky");
        dog.eat();
        
        dog.walk();
        dog.run();
        dog.move(15);
        dog.moveLegs(25);
    }
}
