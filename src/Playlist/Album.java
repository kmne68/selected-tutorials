/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Playlist;

import java.util.ArrayList;

/**
 *
 * @author Keith
 */
public class Album {
    
    private ArrayList<String> songList = new ArrayList();
    
    public Album(String title, int duration) {
        
        songList.add(title);
    }
}
