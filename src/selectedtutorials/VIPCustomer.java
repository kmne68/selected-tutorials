/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package selectedtutorials;

/**
 *
 * @author Keith
 */
public class VIPCustomer {
    
    private String customerName;
    private double creditLimit;
    private String customerEmail;
    
    public VIPCustomer() {
        this("default", 0.00, "default");
    }
    
    public VIPCustomer(String name, String email) {
        
        this(name, 1000.00, email);
     //   this.customerName = name;
     //   this.customerEmail = email;
    }
    
        public VIPCustomer(String name, double creditLimit, String email) {
        
            this.creditLimit = creditLimit;
            this.customerName = name;
            this.customerEmail = email;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @return the creditLimit
     */
    public double getCreditLimit() {
        return creditLimit;
    }

    /**
     * @return the customerEmail
     */
    public String getCustomerEmail() {
        return customerEmail;
    }
}
