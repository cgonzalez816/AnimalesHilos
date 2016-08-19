/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaleshilos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Cesar Gonzalez Salas
 */
public class AnimalesHilos {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args)throws IOException {
     verProcesos();
     Carrera carrera = new Carrera();
     
     }
     
      private static void verProcesos() throws IOException {
  // LLAMAMOS LA VARIABLE DE ENTORNO WINDOWS Y EL PROGRAMA Q GESTIONA
  // LOS PROCESOS
  String consola = System.getenv("windir")+"\\System32\\"+"tasklist.exe";
  // Ejecutamos el comando
  Process proceso=Runtime.getRuntime().exec(consola);
  //OBTENEMOS EL BUFFER DE SALIDA
  BufferedReader entrada = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
  String tmp;
  while((tmp=entrada.readLine())!=null){
   System.out.println(tmp);
   
  }
  entrada.close();
  
 }
     
     
}