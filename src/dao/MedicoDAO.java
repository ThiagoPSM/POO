package dao;
import Clases_Entidades.Medico;
import bd.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.sql.ResultSet;
public class MedicoDAO {
    
    private Conexion conexion = new Conexion();
    
    
    
    public boolean agregarPaciente(Medico med) throws SQLException{
        
        boolean fueAgregado = false;
        Connection  conn = conexion.conectar();
        try{
            String sql= "insert into medicos values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, med.getNombre() );
            stmt.setString(2, med.getApellido());
            stmt.setString(3, med.getFechaNacimiento());
            stmt.setString(4, med.getDomicilio());
            stmt.setString(5, med.getDni());
            stmt.setString(6, med.getTelFijo());
            stmt.setString(7, med.getTelCelular());
            stmt.setString(8, med.getEstadoCivil());
            stmt.setString(9, med.getCorreoElect());
            stmt.setString(10, med.getMatricula());
            
            
            int cantidad = stmt.executeUpdate();
            
            fueAgregado = (cantidad > 0);
                 
            
        } catch(Exception e){
            System.out.println("Error al agregar trabajador " + e.getMessage());
        } finally{
                conn.close();
        }
        
        
        return fueAgregado;
    }
    
    
    public ArrayList<Medico> listarTrabajadores() throws SQLException{
        ArrayList<Medico> medicos = new ArrayList<>();
        Connection con = conexion.conectar();
        
        try{
            String sql= "select * from medicos ";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Medico m = new Medico();
                m.setNombre(rs.getString("Nombre"));
                m.setApellido(rs.getString("Apellido"));
                m.setFechaNacimiento(rs.getString("Fecha Nacimiento"));
                m.setDomicilio(rs.getString("Domicilio"));
                m.setDni(rs.getString("DNI"));
                m.setTelFijo(rs.getString("Telefono"));
                m.setTelCelular(rs.getString("Celular"));
                m.setEstadoCivil(rs.getString("Estado Civil"));
                m.setCorreoElect(rs.getString("Correo"));
                m.setMatricula(rs.getString("Matricula"));
                medicos.add(m);                                  
          }
            
        } catch (Exception e){
            System.out.println("Error listando " + e.getMessage());
        } finally {
            con.close();
        }
        
        return medicos;
    }
    
   
    
    
     public ArrayList<Medico> buscarPorDNI(String dni) throws SQLException{
        ArrayList<Medico> medicos = new ArrayList<>();
        Connection con = conexion.conectar();
        
        try{
            String sql= "select * from medicos where DNI = ? ";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, dni);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Medico m = new Medico();
                m.setNombre(rs.getString("Nombre"));
                m.setApellido(rs.getString("Apellido"));
                m.setFechaNacimiento(rs.getString("Fecha Nacimiento"));
                m.setDomicilio(rs.getString("Domicilio"));
                m.setDni(rs.getString("DNI"));
                m.setTelFijo(rs.getString("Telefono"));
                m.setTelCelular(rs.getString("Celular"));
                m.setEstadoCivil(rs.getString("Estado Civil"));
                m.setCorreoElect(rs.getString("Correo"));
                m.setMatricula(rs.getString("Matricula"));
                medicos.add(m);                                   
          }
            
        } catch (Exception e){
            System.out.println("Error listando " + e.getMessage());
        } finally {
            con.close();
        }
        
        return medicos;
    }
    
    
    public boolean eliminarPaciente(String dni) throws SQLException{
        boolean fueEliminado = false;
        Connection conn = conexion.conectar();
        
        try{
            String sql = "delete from medicos where DNI = ? ";
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

    

