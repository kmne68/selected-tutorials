/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author Keith
 */
public class PlayerUnencapsulated {
    
    public String name;
    public int health;
    public String weapon;
    
    public void loseHealth(int damage) {
        
        this.health = this.health - damage;
        if(this.health <= 0)
            System.out.println("Player knocked out.");
        // Reduce number of lives remaining
    } // end loseHealth
    
    public int healthRemaining() {
        
        return this.health;
    }
} // end class
