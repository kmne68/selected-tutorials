/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Keith
 */
public class Dog extends Animal {
    
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        
        super(name, 1, 1, size, weight);
        
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
                

        
    }
        private void chew() {
                
                System.out.println("Dog.chew() called.");
        }
            
            
        public void eat() {
            System.out.println("Dog.eat() called");
            chew();
            super.eat();
        }    
            
        public void walk() {
            super.move(5);
        }
        
        
        public void run() {
            super.move(10);
        }
        
        
        public void moveLegs(int speed) {
            
            System.out.println("Dog.moveLegs() called");
        }
        
        
        
        public void move(int speed) {
            
            System.out.println("Dog.move() called.");
            moveLegs(speed);
            super.move(speed);
        }
}
