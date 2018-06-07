/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaldemo;

/**
 *
 * @author kemery
 */
public class ExtendedPassword extends Password {
    
    private int decryptedPassword;
    
    ExtendedPassword(int password) {
        super (password);
        
        this.decryptedPassword = password;
    }
    
    // defined as final in superclass, so it cannot be overriden
/*    @Override
    public void storePassword() {
        System.out.println("Saving password as: " + this.decryptedPassword);
    }
*/
}
