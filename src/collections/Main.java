/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

/**
 *
 * @author kemery
 */
public class Main {
    
    public static void main(String[] args) {
        
        Theatre theatre = new Theatre("Tivoli", 8, 12);
    //    theatre.getSeats();
        
        if(theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry seat is taken.");
        }
        
        if(theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry seat is taken.");
        }
    }
}
