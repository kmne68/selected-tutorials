/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scopecheck;

/**
 *
 * @author Keith
 */
public class Main {
    
    public static void main(String[] args) {
        
        String privateVar = "This is private to main.";
        
        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance privateVar is " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);
        
        scopeInstance.timesTwo();
        
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        
        innerClass.timesTwo();
    }
}
