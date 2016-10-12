/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Room;

/**
 *
 * @author Keith
 */
public class Bedroom {
    
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }  
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the wall1
     */
    public Wall getWall1() {
        return wall1;
    }

    /**
     * @return the wall2
     */
    public Wall getWall2() {
        return wall2;
    }

    /**
     * @return the wall3
     */
    public Wall getWall3() {
        return wall3;
    }

    /**
     * @return the wall4
     */
    public Wall getWall4() {
        return wall4;
    }

    /**
     * @return the ceiling
     */
    public Ceiling getCeiling() {
        return ceiling;
    }

    /**
     * @return the bed
     */
    public Bed getBed() {
        return bed;
    }

    /**
     * @return the lamp
     */
    public Lamp getLamp() {
        return lamp;
    }

    /**
     * @param lamp the lamp to set
     */
    public void setLamp(Lamp lamp) {
        this.lamp = lamp;
    }
    
    
    public void makeBed() {
        
        System.out.println("Bedroom --> Making bed");
        bed.make();
    }
    
}
