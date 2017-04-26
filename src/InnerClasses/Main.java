/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClasses;

/**
 *
 * @author Keith
 */
public class Main {
    
    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6); // outer class
        mcLaren.addGear(1, 5.3);

    }
}
