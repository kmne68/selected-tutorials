/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Keith
 */
public interface ITelephone {
    
    // access modifier is not technically necessary
    public void powerOn();
    
    public void dial(int phoneNumber);
    
    public void answer();
    
    public boolean callPhone(int phoneNumber);
    
    public boolean isRinging();
}
