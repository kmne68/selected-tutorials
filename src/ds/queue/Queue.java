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
public class Queue {

    private int maxSize; // initialize the set number of slots
    private long[] queueArray; // slots to main? the data
    private int front; // this will be the index position for the element in the front
    private int rear; // the index positoin of the element at the back of the line
    private int nItems; // counter to maintain the number of items in our queue

    public Queue(int size) {

        this.maxSize = size;
        this.queueArray = new long[size];
        front = 0; // index position of first slot in array
        rear = -1; // there is no item in the array to be considered last
        nItems = 0; // we don't have elements in the array yet
    }

    public void insert(long j) {
        
        if(rear == maxSize -1) {
            rear = -1; // go back to first location if full
        }
        rear++;
        queueArray[rear] = j;
        nItems++;
    }

    public void view() {
        System.out.print("[");
        for (int i = 0; i < queueArray.length; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println("]");
    }

    public long remove() { // remove item from the front of the queue

        long temp = queueArray[front];
        front++;
        if (front == maxSize) {
            front = 0; // we can set front back to the 0th index
        }
        nItems--;
        return temp;
    }
    
    public long peakFront() {
        return queueArray[front];
    }
    
    public boolean isEmpty() {
        return (nItems == 0);
    }
    
    public boolean isFull() {
        return (nItems == maxSize);
    }

}
