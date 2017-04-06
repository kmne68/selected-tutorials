/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceExercise;

import java.util.List;

/**
 *
 * @author Keith
 */
public interface Savable {
    
    public List<String> write();
    public void read(List<String> values);
}
