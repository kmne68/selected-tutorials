/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Keith
 */
public class MobilePhone implements ITelephone {
    
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;
    
    public MobilePhone(int myNumber) {
        
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up.");
    }

    @Override
    public void dial(int phoneNumber) {
    
        if(isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone");

        }
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        
        if(phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Ring! Ring!");
        }
        else {
            isRinging = false;
            System.out.println("Mobile phone not on or number is different");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        
        return isRinging;
    }
    
}
