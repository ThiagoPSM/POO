/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import java.sql.Connection;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class RegistroDAO {
    private Conexion conexion = new Conexion();
    
    public boolean Registrarse(JTextField usuario, JPasswordField contraseña, JPasswordField repContra) throws SQLException
    {
         boolean fueAgregado = false;
         Connection  conn = conexion.conectar();
        try{
            String sql= "insert into usuarios values(?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            String a = String.valueOf(contraseña.getPassword());
            String b = String.valueOf(repContra.getPassword());
            
            if(a.equals(b))
            {
                stmt.setString(1, usuario.getText());
                stmt.setString(2, b);
            }else{
                JOptionPane.showMessageDialog(null, "Las contraseñas no son iguales");
            }
            int cantidad = stmt.executeUpdate();
            
            fueAgregado = (cantidad > 0);
                 
            
        } catch(Exception e){
            System.out.println("Error al agregar trabajador " + e.getMessage());
        } finally{
                conn.close();
        }
        
        
        return fueAgregado;
    }
    
}
