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
    private int matricula;

    public Medico(Persona obj, String cont, int matricula) {
        super(obj);
        this.especialidad=cont;
        this.matricula = matricula;
    }

    public Medico() {
    }
}
