/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package selectedtutorials;

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
        
    }
}
