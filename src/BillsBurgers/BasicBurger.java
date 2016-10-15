/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BillsBurgers;

/**
 *
 * @author Keith
 */
public class BasicBurger {
    
    private String name;
    private String bun;
    private String meat;
 /*   private boolean lettuce;
    private boolean tomato;
    private boolean cheese;
    private boolean pickles;
    private double price = 0.0;  */
    
    private String addition1Name;
    private double addition1Price;
    
    private String addition2Name;
    private double addition2Price;
    
    private String addition3Name;
    private double addition3Price;
    
    private String addition4Name;
    private double addition4Price;
    
    public BasicBurger(String name, String bun, String meat, double price ) {
        
        int addons = 0;
        this.name = name;
        this.bun = bun;
        this.meat = meat;
        this.price = price;
    }
    
}
