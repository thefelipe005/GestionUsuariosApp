/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adso39.modelos;

public class Usuarios {
    private String identificacion;
    private String nombres;
    private String apellidos;
    private int indiceCargo;
    private String textoCargo;
    private boolean esAdministrador;

    public Usuarios() {
    }
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getIndiceCargo() {
        return indiceCargo;
    }

    public void setIndiceCargo(int indiceCargo) {
        this.indiceCargo = indiceCargo;
    }

    public String getTextoCargo() {
        return textoCargo;
    }

    public void setTextoCargo(String textoCargo) {
        this.textoCargo = textoCargo;
    }

    public boolean isEsAdministrador() {
        return esAdministrador;
    }

    public void setEsAdministrador(boolean esAdministrador) {
        this.esAdministrador = esAdministrador;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "\n" + " identificacion=" + identificacion +  "\n" +  ", nombres=" + nombres + "\n" + ", apellidos=" + apellidos + "\n" + ", indiceCargo=" + indiceCargo + "\n" + ", textoCargo=" + textoCargo + "\n" + ", esAdministrador=" + esAdministrador + '}';
    }

    public Usuarios(String identificacion, String nombres, String apellidos, int indiceCargo, String textoCargo, boolean esAdministrador) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.indiceCargo = indiceCargo;
        this.textoCargo = textoCargo;
        this.esAdministrador = esAdministrador;
    }
    
}
