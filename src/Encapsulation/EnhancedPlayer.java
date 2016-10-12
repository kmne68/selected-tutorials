/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author Keith
 */
public class EnhancedPlayer {
    
    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
    //    this.health = health;
        this.weapon = weapon;
        
        if(health > 0 && health <= 100) {
            this.health = health;
        }
   //     else
     //       this.health = 103;
        
        this.weapon = weapon;
    }
    
    public void loseHealth(int damage) {
        
        this.health = this.health - damage;
        if(this.health <= 0)
            System.out.println("Player knocked out");
        // Reduce number of lives reamaining for player
    } // end loseHealth()        

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }
        
    
    
    
}
