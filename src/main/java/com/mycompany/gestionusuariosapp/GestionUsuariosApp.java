/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionusuariosapp;

import com.adso39.vistas.pantallaprincipal;



public class GestionUsuariosApp {
    public static void main (String[] args) {
        try {
            pantallaprincipal PantallaPrincipal = new pantallaprincipal();
            
            PantallaPrincipal.setLocationRelativeTo(null);
            PantallaPrincipal.setVisible(true);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
  
