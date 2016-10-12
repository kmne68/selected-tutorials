/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Keith
 */
public class Animal {
    
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;
    
    public Animal(String name, int brain, int body, int size, int weight) {
        
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    
    public void eat() {
        
        System.out.println("Animal.eat called.");

    }
    
    
    public void move(int speed) {
        System.out.println("Animal is moving at " + speed);
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the brain
     */
    public int getBrain() {
        return brain;
    }

    /**
     * @return the body
     */
    public int getBody() {
        return body;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }
    
    
}
