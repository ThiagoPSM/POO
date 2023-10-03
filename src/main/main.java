/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import Clases_Entidades.Persona;
import dao.PacienteDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class main {
    
    
    public static void main(String[] args) {
        //prueba para ver si funciona el agregar a base de datos por codigo
        Persona p = new Persona("Thiago", "Perez San Miguel", "28/08/2003", "casa", "45.168.592", "1234", "1234", "hola", "hola");
        PacienteDAO pDAO = new PacienteDAO();
    
        try {
            if(pDAO.agregarPaciente(p)){
                System.out.println("AGREGADO");
                
            } else{
                System.out.println("OCURRIO UN ERROR");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            
        }
        
    }
    
    
    
    
}
