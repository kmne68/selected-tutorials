/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericsDemon;

import java.util.ArrayList;

/**
 *
 * @author Keith
 */
public class Main {
    
    public static void main (String[] args) {
        
        
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
   //     items.add("keith");
        items.add(4);
        items.add(5);
        
        printDoubled(items);
    }
    
    private static void printDoubled(ArrayList<Integer> n) {
        
        for(int i : n) {
            System.out.println(i * 2);
        }
    }
}
