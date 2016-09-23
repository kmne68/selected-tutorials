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
    
    
    public void powerUp() {
        
        theCase.pressPowerButton();
        drawLogo();
    }
    
    
    private void drawLogo() {
        
        monitor.drawPixelAt(1200, 50, "yellow");
    }

}
