/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_Entidades;

/**
 *
 * @author Thiago
 */
public class Paciente extends Persona {
    private String contacto;

    public Paciente(Paciente obj, String cont) {
        super(obj);
        this.contacto=cont;
    }

    public Paciente() {
    }
    

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
}
