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
        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//        Gearbox.Gear second = new Gearbox.Gear(2, 15.4);
  //      Gearbox.Gear third = new mcLaren.Gear(3, 17.8);
        
        System.out.println(first.driveSpeed(1000));
    }
}
