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
    private boolean pickles;*/
    private double price = 0.0;  
    
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
    
    public void addItem1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }
    
    public void addItem2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }
        
    public void addItem3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }
            
    public void addItem4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }
               
    
    public double calculatePrice() {
        double totalPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.bun + " bun " +
                " price is " + this.price);
        if(this.addition1Name != null) {
            totalPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if(this.addition2Name != null) {
            totalPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if(this.addition3Name != null) {
            totalPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if(this.addition4Name != null) {
            totalPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }
        
        return totalPrice;
    }
    
}
