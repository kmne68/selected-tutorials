/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BillsBurgers;

/**
 *
 * @author Keith
 */
public class DeluxeBurger extends BasicBurger {
    
    public DeluxeBurger() {
        
        super("Deluxe", "Sausage & Bacon", "White", 14.54);
    }

    @Override
    public void addItem1(String name, double price) {
        System.out.println("Cannot add that.");
    }

    @Override
    public void addItem2(String name, double price) {
        System.out.println("Cannot add that.");    }

    @Override
    public void addItem3(String name, double price) {
        System.out.println("Cannot add that.");    }

    @Override
    public void addItem4(String name, double price) {
        System.out.println("Cannot add that.");    }
    
    
}
