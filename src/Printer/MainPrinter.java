/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor
 * 
 * Simulate a printer.
 * Fields include:
 *      Toner level
 *      Number of pages printed
 *      Duplex printer?
 * Methods include:
 *      fillToner()
 *      printPages() -- increment pagesPrinted
 * 
 */
package Printer;

/**
 *
 * @author Keith
 */
public class MainPrinter {
    
    public static void main(String[] args) {
        
        Printer printer = new Printer(5, true);
        printer.fillToner(printer.getTonerLevel());
        printer.printPages(17);
        printer.getPagesPrinted();
        
        Printer printer2 = new Printer(100, true);
        printer2.fillToner(printer.getTonerLevel());
        printer2.printPages(3);
        printer2.getPagesPrinted();    
        
        Printer printer3 = new Printer(95, false);
        printer3.fillToner(printer.getTonerLevel());
        printer3.printPages(52);
        printer3.getPagesPrinted();           
    }
}
