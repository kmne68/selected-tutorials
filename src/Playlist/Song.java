/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Playlist;

/**
 *
 * @author Keith
 */
public class Song {
    
    private String title;
    private int duration;

    public Song(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    
}
