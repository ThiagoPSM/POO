/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_Entidades;

/**
 *
 * @author Thiago
 */
public class Medico extends Persona {
    private String especialidad;

    public Medico(Persona obj, String cont) {
        super(obj);
        this.especialidad=cont;
    }

    public Medico() {
    }
}
