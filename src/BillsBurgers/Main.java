/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BillsBurgers;

/**
 *
 * @author Keith
 */
public class Main {
    
    public static void main(String[] args) {
        BasicBurger basicBurger = new BasicBurger("Basic", "White", "Sausage", 3.56);
        double price = basicBurger.calculatePrice();

        basicBurger.addItem1("Tomato", 0.27);
        price = basicBurger.calculatePrice();
        
        basicBurger.addItem2("Lettuce", 0.33);
        price = basicBurger.calculatePrice();
        
        VeganBurger veganBurger = new VeganBurger("Bacon", 5.67);
        veganBurger.addHealthyAddtion("egg", 5.43);
        veganBurger.calculatePrice();
        System.out.println("Total price is " + veganBurger.calculatePrice());
        veganBurger.addHealthyAddtion("Lentils", 3.41);
        
        System.out.println("Total vegan burger price is " + veganBurger.calculatePrice());
        
        DeluxeBurger db = new DeluxeBurger();
        db.calculatePrice();
        db.addItem3("mustard", 0.23);
        db.addItem1("don't do this", 2000.0);
    }
}
