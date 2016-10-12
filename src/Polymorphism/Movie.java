/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author Keith
 */
public class Movie {
    
    private String name;
    
    public Movie(String name) {
        
        this.name = name;
    }
    
    
    public String plot() {
        
        return "No plot here.";
    }
    
    
    public String getName() {
        return name;
    }
}
    

class Jaws extends Movie {
        
    public Jaws() {
        super("Jaws");
    }
    
    public String plot() {
        
        return "A shark eats lots of people.";
    }
}
    
    
class IndependenceDay extends Movie {
    
    public IndependenceDay() {
        super("Independence Day");
    }
    
    @Override
    public String plot() {
        return "Aliens attempt to take over planet Earth.";
    }
}    
    

class MazeRunner extends Movie {
    
    public MazeRunner() {
        
        super("Maze Runner");
    }
    
    @Override
    public String plot() {
        return "Kids try to escape a maze.";
    }
}


class StarWars extends Movie {
    
    public StarWars() {
        
        super("Star Wars");
    }
    
    @Override
    public String plot() {
        return "Rebels try to save galaxy from evil empire.";
    }
}


class Forgetable extends Movie {
    
    public Forgetable() {
        super("Forgetable");
    }
    
    // No plot method
}