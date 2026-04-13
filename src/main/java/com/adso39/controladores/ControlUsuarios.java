/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adso39.controladores;

import com.adso39.modelos.Usuarios;
import com.adso39.persistencias.UsuariosBD;
import java.util.ArrayList;

/**
 *
 * @author SENA
 */
public class ControlUsuarios {
    private static final Usuarios elUsuario = new Usuarios();
    private static ArrayList<Usuarios> listaUsuarios = new ArrayList<>();
    private static UsuariosBD   UsuariosBD = new UsuariosBD();

    /*public ControlUsuarios() {
        this.elUsuario = new Usuarios();
    }*/
    public static void RegistrarUsuario(String identificacion,
           String nombres,
           String apellidos,
           int indiceCargo,
           String textoCargo,
           boolean esAdministrador){
 
        elUsuario.setIdentificacion(identificacion);
        elUsuario.setNombres(nombres);
        elUsuario.setApellidos(apellidos);
        elUsuario.setIndiceCargo(indiceCargo);
        elUsuario.setTextoCargo(textoCargo);
        elUsuario.setEsAdministrador(esAdministrador);
    }

    public static void AgregarUsuarios(String text, String text0, String text1, int selectedIndex, String toString, boolean selected) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String ImprimirUsuario(){
        return elUsuario.toString();
    }
    
    public static void AgregarUsuario(String identificacion,
    String nombres,
           String apellidos,
           int indiceCargo,
           String textoCargo,
           boolean esAdministrador) {
        Usuarios elNuevo = new Usuarios(identificacion,
            nombres,
            apellidos,
            indiceCargo,
            textoCargo,
            esAdministrador);
        
        try {
            Usuarios losUsuarios = new Usuarios();
            
            if (UsuariosBD.registerUsuario(elUsuario)) {
                System.out.println("El usuario fue insaertado en BD");
                listaUsuarios.add(elNuevo);
            }
            else {
                System.out.println("eL uSUARIO NO FUE INSERTADO EN bd");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        listaUsuarios.add(elNuevo);
}
    public static String ListarUsuarios() { 
        String texto = "";
        for (int i=0; i<listaUsuarios.size(); i++) { 
            texto += listaUsuarios.get(i).toString() + "\n";
        }
        return texto; 
    }
    public static ArrayList<Usuarios> MostrarUsuarios() {
        ArrayList<Usuarios> Usuarios = new ArrayList();
        try {
            UsuariosBD losUsuarios = new UsuariosBD();
            Usuarios = losUsuarios.consultarUsuarios();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return Usuarios;
    }
}
