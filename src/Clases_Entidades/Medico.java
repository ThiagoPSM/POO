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
    private String matricula;

    public Medico(String matricula) {
        this.matricula = matricula;
    }

    public Medico(String matricula, Persona obj) {
        super(obj);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Medico() {
    }
}
