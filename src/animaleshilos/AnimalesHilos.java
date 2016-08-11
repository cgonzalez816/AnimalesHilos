/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaleshilos;

/**
 *
 * @author treznor
 */
public class AnimalesHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal conejo = new Animal("conejo", 100);
        Animal tortuga = new Animal("tortuga", 100);
        Animal Zorro = new Animal("Zorro", 100);
        
        conejo.start();
        tortuga.start();
        Zorro.start();
        
    }
    
}
