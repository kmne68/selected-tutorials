/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListExercise;

/**
 *
 * @author Keith
 */
public class CustomLinkedList implements NodeList {
    
    private ListItem root = null;
    
    public CustomLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {

        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {

        if(this.root == null) {
            // The list was emply so this item becomes the head of the list
            this.root = newItem;
            return true;
        }
        
        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0) {
                // newItem is greater, move right if possible
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next, so insert at end of the list
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } else if(comparison > 0) {
                // newItem is less, insert before current item
                if(currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                } else {
                    // the node with a previous is the root
                    newItem.setNext(this.root);
                    this.root.setPrevious((newItem));
                    this.root = newItem;
                }
                return true;
            } else {
                // equal
                System.out.println(newItem.getValue() + " is already present.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {

        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
