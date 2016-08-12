/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaleshilos;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
    JButton boton;
    int ancho = 400;
    
    // Constructor
    public Carrera (){
        
        setLayout(new GridLayout(0,1));
       
        paneles = new JPanel[3]; 
        Labels = new JLabel[3]; 
        
        for (int n = 0; n < 3;n++){
        
            paneles[n] = new JPanel();
             add(paneles[n]);
             Labels[n] = new JLabel(nombres[n]);
             Labels[n].setIcon(new ImageIcon(getClass().getResource(nombres[n]+ ".jpg"))); 
             paneles[n].add(Labels[n]);
             Labels[n].setLocation(0,0);
             
        }
    
        boton = new JButton("ccomenzar");
        boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
           System.out.println("La Carrera Va a Empezar");
                
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        add(boton);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(200,250);
        setSize(ancho,250);
        setVisible(true);
        
    }
     public static void main(String[] args) {
     
     Carrera carrera = new Carrera();
     
     
     
     }
     
    
}
