/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractList;

/**
 *
 * @author Keith
 */
public class Node extends ListItem {
    
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem getNext() {

        return this.nextItem;
    }

    @Override
    ListItem setNext(ListItem item) {

        this.nextItem = item;
        return this.nextItem;
    }

    @Override
    ListItem getPrevious() {

        return this.previousItem;
    }
    
    
    @Override
    ListItem setPrevous(ListItem item) {

        this.previousItem = item;
        return this.previousItem;
    }

    @Override
    int compareTo(ListItem item) {

        if(item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
            
        } else {
            return -1;
        }
    }
    
}
