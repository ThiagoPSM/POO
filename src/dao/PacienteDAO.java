/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import Clases_Entidades.Persona;
import bd.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.sql.ResultSet;

public class PacienteDAO {
    private Conexion conexion = new Conexion();
    
    
    
    public boolean agregarPaciente(Persona pac) throws SQLException{
        
        boolean fueAgregado = false;
        Connection  conn = conexion.conectar();
        try{
            String sql= "insert into paciente values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, pac.getNombre() );
            stmt.setString(2, pac.getApellido());
            stmt.setString(3, pac.getFechaNacimiento());
            stmt.setString(4, pac.getDomicilio());
            stmt.setString(5, pac.getDni());
            stmt.setString(6, pac.getTelFijo());
            stmt.setString(7, pac.getTelCelular());
            stmt.setString(8, pac.getEstadoCivil());
            stmt.setString(9, pac.getCorreoElect());
            
            
            int cantidad = stmt.executeUpdate();
            
            fueAgregado = (cantidad > 0);
                 
            
        } catch(Exception e){
            System.out.println("Error al agregar trabajador " + e.getMessage());
        } finally{
                conn.close();
        }
        
        
        return fueAgregado;
    }
    
    
    public ArrayList<Persona> listarTrabajadores() throws SQLException{
        ArrayList<Persona> personas = new ArrayList<>();
        Connection con = conexion.conectar();
        
        try{
            String sql= "select * from paciente ";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Persona p = new Persona();
                p.setNombre(rs.getString("Nombre"));
                p.setApellido(rs.getString("Apellido"));
                p.setFechaNacimiento(rs.getString("Fecha Nacimiento"));
                p.setDomicilio(rs.getString("Domicilio"));
                p.setDni(rs.getString("DNI"));
                p.setTelFijo(rs.getString("Telefono"));
                p.setTelCelular(rs.getString("Celular"));
                p.setEstadoCivil(rs.getString("Estado Civil"));
                p.setCorreoElect(rs.getString("Correo"));
                personas.add(p);                                  
          }
            
        } catch (Exception e){
            System.out.println("Error listando " + e.getMessage());
        } finally {
            con.close();
        }
        
        return personas;
    }
    
   
    
    
     public ArrayList<Persona> buscarPorDNI(String dni) throws SQLException{
        ArrayList<Persona> personas = new ArrayList<>();
        Connection con = conexion.conectar();
        
        try{
            String sql= "select * from paciente where DNI = ? ";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, dni);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Persona p = new Persona();
                p.setNombre(rs.getString("Nombre"));
                p.setApellido(rs.getString("Apellido"));
                p.setFechaNacimiento(rs.getString("Fecha Nacimiento"));
                p.setDomicilio(rs.getString("Domicilio"));
                p.setDni(rs.getString("DNI"));
                p.setTelFijo(rs.getString("Telefono"));
                p.setTelCelular(rs.getString("Celular"));
                p.setEstadoCivil(rs.getString("Estado Civil"));
                p.setCorreoElect(rs.getString("Correo"));
                personas.add(p);                                  
          }
            
        } catch (Exception e){
            System.out.println("Error listando " + e.getMessage());
        } finally {
            con.close();
        }
        
        return personas;
    }
    
    
    public boolean eliminarPaciente(String dni) throws SQLException{
        boolean fueEliminado = false;
        Connection conn = conexion.conectar();
        
        try{
            String sql = "delete from paciente where DNI = ? ";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,dni);
            
            fueEliminado = (stmt.executeUpdate() > 0);
            
        } catch (Exception e ){
            System.out.println("Error al eliminar " + e.getMessage());
            
        } finally {
            conn.close();
        }       
        return fueEliminado;
    }
}
