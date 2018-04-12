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
public abstract class ListItem {
    
    protected ListItem nextItem = null;
    protected ListItem previousItem = null;
    
    protected Object value;
    
    public ListItem(Object value) {
        this.value = value;
    }
    
    abstract ListItem getNext();
    abstract ListItem setNext(ListItem item);
    abstract ListItem getPrevious();
    abstract ListItem setPrevous(ListItem item);
    
    abstract int compareTo(ListItem item);
    
    public Object getValue() {
        return value;
    }
    
    public void setValue(Object value) {
        this.value = value;
    }
}
