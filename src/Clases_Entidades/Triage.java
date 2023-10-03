/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_Entidades;


/**
 *
 * @author Thiago
 */
public class Triage {
    private String respiracion;
    private String pulso;
    private String estadoMental;
    private String conciencia;
    private String dolorPecho;
    private String lesionesGraves;
    private String edad;
    private String fiebre;
    private String vomitos;
    private String dolorAbdominal;
    private String signosShock;
    private String lesionesLeves;
    private String sangrado;
    private String color;
    private String fecha;
    private String hora;

    
    @Override
    public String toString() {
        return "PACIENTE: " + "\n *Respiracion=" + respiracion + "\n *Rulso=" + pulso + "\n *Estado Mental=" + estadoMental + "\n *Conciencia=" + conciencia + "\n *Dolor Pecho=" + dolorPecho + "\n *Lesiones Graves=" + lesionesGraves + "\n *Edad=" + edad + "\n *Fiebre=" + fiebre + "\n *Vomitos=" + vomitos + "\n *Dolor Abdominal=" + dolorAbdominal + "\n *Signos de Shock=" + signosShock + "\n *Lesiones Leves=" + lesionesLeves + "\n *Sangrado=" + sangrado;
    }

 
  
    public Triage(String respiracion, String pulso, String estadoMental, String conciencia, String dolorPecho, String lesionesGraves, String edad, String fiebre, String vomitos, String dolorAbdominal, String signosShock, String lesionesLeves, String sangrado , String color , String fecha, String hora) {
        this.respiracion = respiracion;
        this.pulso = pulso;
        this.estadoMental = estadoMental;
        this.conciencia = conciencia;
        this.dolorPecho = dolorPecho;
        this.lesionesGraves = lesionesGraves;
        this.edad = edad;
        this.fiebre = fiebre;
        this.vomitos = vomitos;
        this.dolorAbdominal = dolorAbdominal;
        this.signosShock = signosShock;
        this.lesionesLeves = lesionesLeves;
        this.sangrado = sangrado;
        this.color = color;
        this.fecha=fecha;
        this.hora=hora;
    }

    public Triage() {
        this.respiracion = "";
        this.pulso = "";
        this.estadoMental = "";
        this.conciencia = "";
        this.dolorPecho = "";
        this.lesionesGraves = "";
        this.edad = "";
        this.fiebre = "";
        this.vomitos = "";
        this.dolorAbdominal = "";
        this.signosShock = "";
        this.lesionesLeves = "";
        this.sangrado = "";
        this.color = "";
        this.fecha = "";
        this.hora = "";   
    }

    public String getRespiracion() {
        return respiracion;
    }

    public void setRespiracion(String respiracion) {
        this.respiracion = respiracion;
    }

    public String getPulso() {
        return pulso;
    }

    public void setPulso(String pulso) {
        this.pulso = pulso;
    }

    public String getEstadoMental() {
        return estadoMental;
    }

    public void setEstadoMental(String estadoMental) {
        this.estadoMental = estadoMental;
    }

    public String getConciencia() {
        return conciencia;
    }

    public void setConciencia(String conciencia) {
        this.conciencia = conciencia;
    }

    public String getDolorPecho() {
        return dolorPecho;
    }

    public void setDolorPecho(String dolorPecho) {
        this.dolorPecho = dolorPecho;
    }

    public String getLesionesGraves() {
        return lesionesGraves;
    }

    public void setLesionesGraves(String lesionesGraves) {
        this.lesionesGraves = lesionesGraves;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getFiebre() {
        return fiebre;
    }

    public void setFiebre(String fiebre) {
        this.fiebre = fiebre;
    }

    public String getVomitos() {
        return vomitos;
    }

    public void setVomitos(String vomitos) {
        this.vomitos = vomitos;
    }

    public String getDolorAbdominal() {
        return dolorAbdominal;
    }

    public void setDolorAbdominal(String dolorAbdominal) {
        this.dolorAbdominal = dolorAbdominal;
    }

    public String getSignosShock() {
        return signosShock;
    }

    public void setSignosShock(String signosShock) {
        this.signosShock = signosShock;
    }

    public String getLesionesLeves() {
        return lesionesLeves;
    }

    public void setLesionesLeves(String lesionesLeves) {
        this.lesionesLeves = lesionesLeves;
    }

    public String getSangrado() {
        return sangrado;
    }

    public void setSangrado(String sangrado) {
        this.sangrado = sangrado;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
    
}
