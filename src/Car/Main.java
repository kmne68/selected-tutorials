/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 *
 * @author Keith
 */
public class Main {
 
    public static void main(String[] args) {
        
        ModelT modelT = new ModelT();
        FordRanger fordRanger = new FordRanger();
        RollsRoyce rollsRoyce = new RollsRoyce();
        
        modelT.accelerate();
        modelT.startEngine();
        modelT.brake();
        
        fordRanger.accelerate();
        fordRanger.startEngine();
        fordRanger.brake();
        
        rollsRoyce.accelerate();
        rollsRoyce.startEngine();
        rollsRoyce.brake();
    }
}
