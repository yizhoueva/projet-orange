/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               JFrame f = new JFrame("Mon Calendrier");
        Container c = f.getContentPane();
        c.setLayout(new FlowLayout());

        // and beside it, the current month.
        c.add(new Cal());

        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
}
