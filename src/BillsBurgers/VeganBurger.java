/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BillsBurgers;

/**
 *
 * @author Keith
 */
public class VeganBurger extends BasicBurger {
    
    private String healthyExtraName;
    private double healthyExtraPrice;
    
    private String healthyExtra2Name;
    private double healthyExtra2Price;
    
    
    public VeganBurger(String meat, double price) {
        
        super("Healthy", meat, "Brown rye", price ); 
        
    }
    
    public void addHealthyAddtion(String name, double price) {
        this.healthyExtraName = name;
        this.healthyExtraPrice = price;
    }
    
    
    public void addHealthyExtra2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double calculatePrice() {
        
        double hamburgerPrice = super.calculatePrice();
        if(this.healthyExtraName != null) {
            
            hamburgerPrice += this.healthyExtraPrice;
            System.out.println("Added " + this.healthyExtraName + " for an extra " + this.healthyExtraPrice);
        } 
        if(this.healthyExtra2Name != null) {
            
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        
        return hamburgerPrice;
    }
    
            
}
