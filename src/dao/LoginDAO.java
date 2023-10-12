/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import visual.Login;
import visual.Principal;

/**
 *
 * @author Thiago
 */
public class LoginDAO {
    
    public void ValidarUsuario(JTextField usuario , JPasswordField contraseña)
    {
        try
        {
            ResultSet rs = null;
            PreparedStatement stmt = null;
            bd.Conexion con = new bd.Conexion();
            String sql= "select * from usuarios where usuarios.Usuario=(?) and usuarios.Contraseña=(?)";
            stmt = con.conectar().prepareStatement(sql);
            
            String contra = String.valueOf(contraseña.getPassword());
            
            stmt.setString(1, usuario.getText());
            stmt.setString(2,contra);
            
            rs=stmt.executeQuery();
            
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null, "El usuario es correcto ");
                Principal a = new Principal();
                a.setVisible(true); 
            }else{
                JOptionPane.showMessageDialog(null, "El usuario es incorrecto ");
            }
                 
            
            
            
            
        }catch(Exception e)
        {
            System.out.println("Ocurrio un error " + e.getMessage());
        }
        
        
        
    }
    
}
