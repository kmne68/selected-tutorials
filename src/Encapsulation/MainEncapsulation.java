/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author Keith
 */
public class MainEncapsulation {
    
    public static void main(String[] args) {
        
        PlayerUnencapsulated player = new PlayerUnencapsulated();
        player.name = "Keith";
        player.health = 20;
        player.weapon = "Sword";
        
        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
    }
}
