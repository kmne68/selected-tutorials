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
        
        damage = 11;
        player.health = 100;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
        
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Keith", 200, "Sword");
        System.out.println("Player " + enhancedPlayer.getName() + " has remaining health of " + enhancedPlayer.getHealth());
    }
}
