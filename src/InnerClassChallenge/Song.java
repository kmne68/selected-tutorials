/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClassChallenge;

import Playlist.*;

/**
 *
 * @author Keith
 */
public class Song {
    
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
/*
    public double getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    */
    @Override
    public String toString() {
        return this.title + "; " + this.duration;
    }
    
    
}
