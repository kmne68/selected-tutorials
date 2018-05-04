/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.queue;

/**
 *
 * @author Keith
 */
public class AppMain {
    
    public static void main(String[] args) {
        
        Queue myQueue = new Queue(5);
        myQueue.insert(100);
        myQueue.insert(1000);
        myQueue.insert(14);
        myQueue.insert(12);
        myQueue.insert(44);
        myQueue.insert(33);
        myQueue.view();
    }
}
