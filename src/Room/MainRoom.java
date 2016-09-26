/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Room;

/**
 *
 * @author Keith
 */
public class MainRoom {
    
    public static void main(String[] args) {
        
        Wall wallNorth = new Wall("North");
        Wall wallSouth = new Wall("South");
        Wall wallEast = new Wall("East");
        Wall wallWest = new Wall("West");    
        
        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp("Classic", false, 75);
        
        Bedroom bedroom = new Bedroom("My Room", wallNorth, wallSouth, wallEast, wallWest, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
        
    }
   
}
