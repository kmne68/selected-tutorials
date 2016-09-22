/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Composition;

/**
 *
 * @author Keith
 */
public class PC {
    
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    /**
     * @return the theCase
     */
    public Case getTheCase() {
        return theCase;
    }

    /**
     * @return the monitor
     */
    public Monitor getMonitor() {
        return monitor;
    }

    /**
     * @return the motherboard
     */
    public Motherboard getMotherboard() {
        return motherboard;
    }
    
    
    
}
