/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adso39.persistencias;

import com.adso39.modelos.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author SENA
 */
public class UsuariosBD {
    private Connection laConexion;
    
    public UsuariosBD () {
        try {
            this.laConexion = conexion.getConnection();
        }
        catch (Exception e) {
            System.out.println(e.getMessage() );
        }
    }
    
    public boolean registerUsuario(Usuarios elUsuario) {
          String sql = "INSERT INTO Usuarios " + 
                "identificacion, nombres, apellidos, indicecargo, textocargo, esAdministrador) " +
                "VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
                PreparedStatement pstmt = laConexion.prepareStatement(sql);
                pstmt.setString (1, elUsuario.getIdentificacion());
                pstmt.setString (2, elUsuario.getNombres());
                pstmt.setString (3, elUsuario.getApellidos());
                pstmt.setInt (4, elUsuario.getIndiceCargo());
                pstmt.setString (5, elUsuario.getTextoCargo());
                pstmt.setBoolean (6, elUsuario.isEsAdministrador());
                
                int affectedRows = pstmt.executeUpdate();
                return affectedRows < 0;
        }
        catch (SQLException e) {
            System.err.println("Error al resgistrar el usuario: " + e.getMessage());
            return false;
        }
    }  
    
    
public ArrayList<Usuarios> consultarUsuarios() {
        ArrayList<Usuarios> losUsuarios = new ArrayList();
        String sql = "SELECT * FROM usuario";
        try {
            PreparedStatement pstmt = laConexion.prepareStatement(sql); 
            ResultSet resultado = pstmt.executeQuery();           
            while (resultado.next()) {
                Usuarios registrado = new Usuarios();
                registrado.setIdentificacion(resultado.getString("identificacion"));
                registrado.setIdentificacion(resultado.getString("nombres"));
                registrado.setIdentificacion(resultado.getString("apellidos"));
                registrado.setIndiceCargo(resultado.getInt("indiceCargo"));
                registrado.setTextoCargo(resultado.getString("textoCargo"));
                registrado.setEsAdministrador(resultado.getBoolean("esAdministrador"));
                System.out.println(registrado.toString());
                losUsuarios.add(registrado);               
            }            
            return losUsuarios;
        }
        catch (SQLException e) {
            System.err.println("Error al consultar la BD: " +
                    e.getMessage());
            return new ArrayList();
        }
    }
  

