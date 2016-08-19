/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaleshilos;

// Importaciones
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Cesar Gonzalez Salas
 */

public class Carrera extends JFrame {
// Crea el Frrame Botones, Labes y Coloca Los Nombres    
    JPanel[] paneles;
    JLabel[] Labels;
    String[] nombres = {"conejo","tortuga","Zorro"};
    JButton boton;
// Limita El Ancho del Fraame 
    int ancho = 900;

    /**
 *
 * Constructor De La Carrera
 */
public Carrera (){
   // se definen los paneles y los labels en el JFraame     
        setLayout(new GridLayout(0,1));
        paneles = new JPanel[3]; 
        Labels = new JLabel[3]; 
        // for que monta los paneles y los labels en el JFraame
        for (int n = 0; n < 3;n++){
             paneles[n] = new JPanel();
             add(paneles[n]);
             Labels[n] = new JLabel(nombres[n]);
           //Labels[n].setIcon(new ImageIcon(getClass().getResource(nombres[n]+ ".jpg"))); 
             paneles[n].add(Labels[n]);
             Labels[n].setLocation(0,0);
             
        }
  // se definen el boton comenzar     
        boton = new JButton("Comenzar");
        boton.addActionListener(new ActionListener() {
            // monta el nombre del animal, monta la foto y define el ancho del label
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal conejo = new Animal ("conejo", ancho -40, Labels[0]);
                Animal tortuga = new Animal ("tortuga", ancho -40, Labels[1]);
                Animal Zorro = new Animal ("Zorro", ancho -40, Labels[2]);
                // se inician los animales
                conejo.start();
                tortuga.start();
                Zorro.start();

                //System.out.println("La Carrera Va a Empezar");
                
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        // agrega el boton
        add(boton);
        
   // ubicacion en el frame y ancho     
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(200,60);
        setSize(ancho,690);
        setVisible(true);
        
    }

}