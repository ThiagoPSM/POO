/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_Entidades;

/**
 *
 * @author Thiago
 */
public class Persona {
    private String Nombre;
    private String Apellido;
    private String fechaNacimiento;
    private String domicilio;
    private String dni;
    private String telFijo;
    private String telCelular;
    private String estadoCivil;
    private String correoElect;

    public Persona() {
        this.Nombre = "";
        this.Apellido = "";
        this.fechaNacimiento = "";
        this.domicilio = "";
        this.dni = "";
        this.telFijo = "";
        this.telCelular = "";
        this.estadoCivil = "";
        this.correoElect = "";
    }

    

    public Persona(String Nombre, String Apellido, String fechaNacimiento, String domicilio, String dni, String telFijo, String telCelular, String estadoCivil, String correoElect) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
        this.dni = dni;
        this.telFijo = telFijo;
        this.telCelular = telCelular;
        this.estadoCivil = estadoCivil;
        this.correoElect = correoElect;
    }

    
    public Persona( Persona obj) {
        this.Nombre = obj.Nombre;
        this.Apellido = obj.Apellido;
        this.fechaNacimiento = obj.fechaNacimiento;
        this.domicilio = obj.domicilio;
        this.dni = obj.dni;
        this.telFijo = obj.telFijo;
        this.telCelular = obj.telCelular;
        this.estadoCivil = obj.estadoCivil;
        this.correoElect = obj.correoElect;
    }
    
    
    
    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", fechaNacimiento=" + fechaNacimiento + ", domicilio=" + domicilio + ", dni=" + dni + ", telFijo=" + telFijo + ", telCelular=" + telCelular + ", estadoCivil=" + estadoCivil + ", correoElect=" + correoElect + '}';
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelFijo() {
        return telFijo;
    }

    public void setTelFijo(String telFijo) {
        this.telFijo = telFijo;
    }

    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCorreoElect() {
        return correoElect;
    }

    public void setCorreoElect(String correoElect) {
        this.correoElect = correoElect;
    }
    
}
