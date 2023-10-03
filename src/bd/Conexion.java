/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private Connection con;
    private String host= "localhost";
    private String usuario = "root";
    private String password="";
    private String bd = "pacientes";
    private String url = "jdbc:mysql://"+host+"/"+bd;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            this.con = DriverManager.getConnection(this.url, this.usuario, this.password);
            System.out.println("SE PUDO CONECTAR A " +bd);
        } catch(Exception e) {
            System.out.println("Error de conexion: " + e.getMessage());
        }
        return this.con;
    }
   
    public void desconectar (){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public static void main(String[] args) {
        Conexion c = new Conexion();
        c.conectar();
        
    }

    public Conexion() {
    }
    

    
}