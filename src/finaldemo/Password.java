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
public class Password {
    
    private static final int key = 748576362;
    private final int encryptedPassword;
    
    public Password(int password) {
        
        this.encryptedPassword = encryptDecrypt(password);
    }
    
    private int encryptDecrypt(int password) {
        return password ^ key;
    }
    
    public final void storePassword() {
        System.out.println("Saving password as " + this.encryptedPassword);
    }
    
    public boolean letMeIn(int password) {
        if(encryptDecrypt(password) == this.encryptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Intruder alert!");
            return false;
        }
    }
    
}
