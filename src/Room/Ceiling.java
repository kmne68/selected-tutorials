/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Room;

/**
 *
 * @author Keith
 */
public class Ceiling {
    
    private int height;
    private int paintedColor;
    
    public Ceiling(int height, int paintedColor) {
        
        this.height = height;
        this.paintedColor = paintedColor;
    }
    
    
    public int getHeight() {
        
        return height;
    }
    
    
    public int getPaintedColor() {
        
        return paintedColor;
    }
}
