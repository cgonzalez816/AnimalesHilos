/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaleshilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesar Gonzalez Salas
 */
 
public class Animal extends Thread{
//Clase donde va el animal o hilo    
    String nombre;
    int Limite;
    JLabel Label;
    
// Constructor
    public Animal(String nombre, int Limite, JLabel Label){
// Asignacion de los parametros
    this.nombre = nombre;
    this.Limite = Limite;
    this.Label = Label;
       
    }
 // definicion de los metodos 
    
    @Override
    public void run (){
    //For que imprime el avance del animal por medio de consola 
        for (int n = 0; n < Limite; n++){
            try {
                System.out.println(nombre +" Avanza ");
                Label.setLocation(n,0);
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(Animal.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    // indica cuando termina la carrera
        JOptionPane.showMessageDialog(null, nombre + " Ha llegado A la Meta ");
    
    yield();
    
    }
    
}
