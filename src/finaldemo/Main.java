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
public class Main {
    public static void main (String[] args) {
        
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");
        
        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());
        
        // one.instanceNumber = 4;
        // Math m = new Math();  // This cannot be done because Math() is final
        
        int pw = 674312;
        Password password = new Password(pw);
        password.storePassword();
        
        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(9773);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(674312);
        
    }
}
