/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Keith
 */
public class Main {
    
    public static void main(String[] args) {
        
        ITelephone kPhone;
        kPhone = new DeskPhone(555-5555);
        kPhone.powerOn();
        kPhone.callPhone(555-5555);
        kPhone.answer();
        
        kPhone = new MobilePhone(5554321);
        kPhone.callPhone(555-1234);
        kPhone.answer();
        kPhone.callPhone(5554321);
        kPhone.powerOn();
        kPhone.callPhone(5554321);
        
    }
}
