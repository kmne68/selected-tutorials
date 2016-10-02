/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Printer;

/**
 *
 * @author Keith
 */
public class Printer {
    
    private int tonerLevel;
    private static int totalPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        
        if(tonerLevel > -1 && tonerLevel <= 100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = -1;
        
        this.totalPagesPrinted = 0;
        this.isDuplex = isDuplex;
    } // end Constructor Printer()
    
    
    public void fillToner(int currentToner) {
        
        if (currentToner >= 0 && currentToner <100)
        {
            this.tonerLevel = 100;
            System.out.println("Toner has been filled and is now 100%. "
                    + "The amount of toner added was " + (100 - currentToner) );
        }
        else if (currentToner == 100)
            System.out.println("No toner needed.");
        else {
            System.out.println("The correct toner level could not be determined");
        }
    } // end fillToner()
    
    
    public void printPages(int pagesPrinted) {
        
        if(pagesPrinted > 1 && this.isDuplex) {
            if(pagesPrinted % 2 == 0) {
                totalPagesPrinted += pagesPrinted / 2;
            }
            else {
                totalPagesPrinted += pagesPrinted / 2 + 1;
            }  
        }
        else
            totalPagesPrinted += pagesPrinted;
        System.out.println("This printer has printed a total of " + totalPagesPrinted + " pages.");
    }

    /**
     * @return the tonerLevel
     */
    public int getTonerLevel() {
        return tonerLevel;
    }

    /**
     * @return the totalPagesPrinted
     */
    public int getPagesPrinted() {
        return totalPagesPrinted;
    }

    /**
     * @return the isDuplex
     */
    public boolean isIsDuplex() {
        return isDuplex;
    }
    
} // end class Printer()
