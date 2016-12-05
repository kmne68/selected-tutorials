/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Keith
 * 
 * Implement a playlist. Add a Song class with a Title and song length
 * An Album class will contain a list of songs. Albums are stored in an
 * ArrayList. Songs from different albums can be added to the playlist and 
 * will appear in the order they are added.
 * After songs are in the playlist, create a menu of options:
 * Quit
 * Skip forward
 * Skip backward
 * Replay
 * List songs
 * Remove song from list (optional)
 * Check that a song is in the list before playing it. 
 * 
 */
public class Main {
    
    private static ArrayList<Album> albums = new ArrayList<Album>();
    
    public static void main(String[] args) {
        
        
        
        Album album = new Album("Handel's Greatest Hits", "SLSO");
        album.addSong("Water Music", 4.6);
        album.addSong("Magnificat", 3.7);
        album.addSong("Royal Fireworks Music", 13.5);
        album.addSong("Zadok the Priest", 4.1);
        album.addSong("Judas Maccabaeus", 52.1);
        album.addSong("Messiah", 128.3);        
        albums.add(album);
        
        Album album2 = new Album("Rockin' with Vivaldi", "SLSO");
        album2.addSong("Four Seasons Intro", 12.0);
        album2.addSong("Winter Concerto", 8.3);
        album2.addSong("Spring Concerto", 9.5);
        album2.addSong("Giustino", 8.7);
        album2.addSong("La Sena festeggiante", 10.3);
        albums.add(album2);
        
        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Water Music", playList);
        albums.get(0).addToPlayList("Magnificat", playList);
        albums.get(0).addToPlayList("Winter Concerto", playList);
        albums.get(1).addToPlayList("2", playList);
        albums.get(1).addToPlayList("4", playList);
        albums.get(1).addToPlayList("1", playList);
        
        play(playList);
        
        
    }
    
    private static void play(ArrayList<Song> playList) {
        
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }
    }
}
