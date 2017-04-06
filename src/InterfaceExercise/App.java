/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceExercise;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Keith
 */
public class App {
    
    public static void main(String[] args) {
        
        Player me = new Player("Keith", 10, 15);
        System.out.println(me.toString());

        me.setHitPoints(10);
        System.out.println(me);
        me.setWeapon("Orcrist");
        saveObject(me);
        loadObject(me);
        System.out.println(me);
    }
    
    public void saveValues(Savable entity) {
          
        
    }
    
    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" + "1 to enter a string\n" + "0 to quit.");
        
        while(!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
    
    public static void saveObject(Savable objectToSave) {
        
        for(int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
            
        }
    }
    
    public static void loadObject(Savable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
