/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awtexample;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Keith
 */
public class ExampleWindow extends Frame {
    
    public ExampleWindow(String title) {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("A test String", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("by Keith", 60, 100);
    }
}
