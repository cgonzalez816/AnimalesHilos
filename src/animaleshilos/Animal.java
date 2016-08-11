/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaleshilos;

/**
 *
 * @author Cesar Gonzalez Salas
 */



//Clase donde va el animal o hilo
 
public class Animal extends Thread{
    
    String nombre;
    int Limite;
    
    
// Constructor
    public Animal(String nombre, int Limite){
    this.nombre = nombre;
    this.Limite = Limite;
    
       
    }
        
    
    // definicion de los metodos 
    
    @Override
    public void run (){
    
        for (int n = 0; n < Limite; n++){
        System.out.println(nombre +" Avanza ");
        
                
        }
    
    
    yield();
    
    }
    
    
    
    
    
}
