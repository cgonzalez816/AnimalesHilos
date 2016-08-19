/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaleshilos;

//Importaciones
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author treznor
 */
public class conexion {
    public String bd = "Juego";
    public String login = "sa";
    public String password = "sa";
    private String url = "jdbc:sqlserver://TREZNOR-PC\\SQLEXPRESS:1433;databaseName=Juego";
    Connection conex = null;
    
    public conexion(){
    try{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    conex = DriverManager.getConnection(url,login,password);
    if (conex != null){
    JOptionPane.showMessageDialog(null,"conexxion a base de datos "+ bd +". listo");
    
    }
    }catch(SQLException e){
    System.out.println(e);
    }catch(ClassNotFoundException e){
    System.out.println(e);    
    }
    }
    
    public Connection getConnection(){
    return this.conex;
    }
    
    
    
    
}
