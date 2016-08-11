/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaleshilos;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author treznor
 */
public class Carrera extends JFrame {
    
    JPanel[] paneles;
    JLabel[] Labels;
    String[] nombres = {"conejo","tortuga","Zorro"};
    
    
    // Constructor
    public Carrera (){
        
        setLayout(new GridLayout(0,1));
       
        paneles = new JPanel[3]; 
        Labels = new JLabel[3]; 
        
        for (int n = 0; n < 3;n++){
        
            paneles[n] = new JPanel();
             add(paneles[n]);
             Labels[n] = new JLabel(nombres[n]);
             paneles[n].add(Labels[n]);
             
             
        }
    
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(200,250);
        setSize(400,250);
        setVisible(true);
        
    }
     public static void main(String[] args) {
     
     Carrera carrera = new Carrera();
     
     
     
     }
     
    
}
