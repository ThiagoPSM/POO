/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Deian
 */
public class Medico extends Persona{
    private List<Triage> lista;

    public Medico() {
        super();
        this.lista = new ArrayList<>();
    }
    
    public List<Triage> getLista(){
        return lista;
    }
}
