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
    }
}
