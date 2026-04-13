/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.adso39.vistas;

import com.adso39.controladores.ControlUsuarios;
import com.adso39.modelos.Usuarios;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SENA
 */
public class pantallaprincipal extends javax.swing.JFrame {

   private static final java.util.logging.Logger logger= java.util.logging.Logger.getLogger(pantallaprincipal.class.getName());
   private ControlUsuarios elControlUsuarios;
    public pantallaprincipal() {
        this.elControlUsuarios = new ControlUsuarios();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Identificacion = new javax.swing.JLabel();
        Nombres = new javax.swing.JLabel();
        Apellidos = new javax.swing.JLabel();
        Cargos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        cmbCargo = new javax.swing.JComboBox<>();
        chbEsAdministrador = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreal = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        btmCapturarInformacion2 = new javax.swing.JButton();
        bntCapturarInformacion3 = new javax.swing.JButton();
        btnCapturarInformacion4 = new javax.swing.JButton();
        btnCapturarInformacion5 = new javax.swing.JButton();
        btnAgregarUsuario = new javax.swing.JButton();
        btnListarUsuarios = new javax.swing.JButton();
        btnConsultarUsuarios = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Gestion de Usuarios");

        Identificacion.setText("Identificacion:");

        Nombres.setText("Nombres:");

        Apellidos.setText("Apellidos:");

        Cargos.setText("Cargo:");

        jLabel2.setText("Es Administrador:");

        txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionActionPerformed(evt);
            }
        });

        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        chbEsAdministrador.setText("jCheckBox1");

        jTextAreal.setColumns(20);
        jTextAreal.setRows(5);
        jScrollPane1.setViewportView(jTextAreal);

        jButton1.setText("Capturar Informacion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btmCapturarInformacion2.setText("Capturar Informacion Objetos");
        btmCapturarInformacion2.setActionCommand("");
        btmCapturarInformacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmCapturarInformacion2ActionPerformed(evt);
            }
        });

        bntCapturarInformacion3.setText("Capturar Informacion Obj-Constructor");
        bntCapturarInformacion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCapturarInformacion3ActionPerformed(evt);
            }
        });

        btnCapturarInformacion4.setText("Capturar informacion Obj - Control");
        btnCapturarInformacion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapturarInformacion4ActionPerformed(evt);
            }
        });

        btnCapturarInformacion5.setText("Capturar Informacion Obj - Control Estático");
        btnCapturarInformacion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapturarInformacion5ActionPerformed(evt);
            }
        });

        btnAgregarUsuario.setText("Agregar Usuario");
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });

        btnListarUsuarios.setText("Listar Usuario");
        btnListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarUsuariosActionPerformed(evt);
            }
        });

        btnConsultarUsuarios.setText("Consultar Usuario");
        btnConsultarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarUsuariosActionPerformed(evt);
            }
        });

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Apellidos)
                                    .addComponent(Cargos))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Identificacion)
                                    .addComponent(Nombres))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCapturarInformacion4)
                            .addComponent(bntCapturarInformacion3)
                            .addComponent(btnCapturarInformacion5)
                            .addComponent(btmCapturarInformacion2)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregarUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnListarUsuarios))
                            .addComponent(btnConsultarUsuarios)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33)
                                .addComponent(chbEsAdministrador))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(63, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btmCapturarInformacion2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntCapturarInformacion3)
                        .addGap(8, 8, 8)
                        .addComponent(btnCapturarInformacion4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCapturarInformacion5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Identificacion)
                            .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nombres)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarUsuario)
                            .addComponent(btnListarUsuarios))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultarUsuarios))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Apellidos)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cargos)
                            .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(chbEsAdministrador))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                String identificacion = txtIdentificacion.getText();
        String nombres = txtNombres.getText();
        String apellidos = txtApellidos.getText();
        int indiceCargo = cmbCargo.getSelectedIndex();
        String textoCargo = cmbCargo.getSelectedItem().toString();
        boolean esAdministrador = chbEsAdministrador.isSelected();
        
        String textoMostrar = "Identificacion: " + identificacion + "\n" +
                "Nombre Completo: " + nombres + " " + apellidos + "\n" +
                "Cargo: (" + indiceCargo + ") " + textoCargo + "\n";

if (esAdministrador) {
        textoMostrar += "El usuario es Administrador";
}
else {
    textoMostrar += "El usuario no es Administrador";
}       

jTextAreal.setText (textoMostrar);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btmCapturarInformacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmCapturarInformacion2ActionPerformed
        // TODO add your handling code here:
        Usuarios elUsuario = new Usuarios();
        String identificacion = txtIdentificacion.getText();
        String nombres = txtNombres.getText();
        String apellidos = txtApellidos.getText();
        int indiceCargo = cmbCargo.getSelectedIndex();
        String textoCargo = cmbCargo.getSelectedItem().toString();
        boolean esAdministrador = chbEsAdministrador.isSelected();
        
        elUsuario.setIdentificacion(identificacion);
        elUsuario.setNombres(nombres);
        elUsuario.setApellidos(apellidos);
        elUsuario.setIndiceCargo(indiceCargo);
        elUsuario.setTextoCargo(textoCargo);
        elUsuario.setEsAdministrador(esAdministrador);
        
        jTextAreal.setText (elUsuario.toString());
    }//GEN-LAST:event_btmCapturarInformacion2ActionPerformed

    private void txtIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificacionActionPerformed

    private void bntCapturarInformacion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCapturarInformacion3ActionPerformed
        // TODO add your handling code here:
    Usuarios elUsuario = new Usuarios(txtIdentificacion.getText(),
     txtNombres.getText(),
     txtApellidos.getText(),
     cmbCargo.getSelectedIndex(),
     cmbCargo.getSelectedItem().toString(),
     chbEsAdministrador.isSelected() );
     
     jTextAreal.setText (elUsuario.toString());
    }//GEN-LAST:event_bntCapturarInformacion3ActionPerformed

    private void btnCapturarInformacion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarInformacion4ActionPerformed
     this.elControlUsuarios.RegistrarUsuario(txtIdentificacion.getText(),
     txtNombres.getText(),
     txtApellidos.getText(),
     cmbCargo.getSelectedIndex(),
     cmbCargo.getSelectedItem().toString(),
     chbEsAdministrador.isSelected() );
     
     jTextAreal.setText(this.elControlUsuarios.ImprimirUsuario());
    }//GEN-LAST:event_btnCapturarInformacion4ActionPerformed

    private void btnCapturarInformacion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarInformacion5ActionPerformed
     ControlUsuarios.RegistrarUsuario(txtIdentificacion.getText(),
     txtNombres.getText(),
     txtApellidos.getText(),
     cmbCargo.getSelectedIndex(),
     cmbCargo.getSelectedItem().toString(),
     chbEsAdministrador.isSelected() );
     
     jTextAreal.setText(this.elControlUsuarios.ImprimirUsuario());
    }//GEN-LAST:event_btnCapturarInformacion5ActionPerformed

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
       ControlUsuarios.AgregarUsuario(txtIdentificacion.getText(),
       txtNombres.getText(), 
       txtApellidos.getText(), 
       cmbCargo.getSelectedIndex(),
       cmbCargo.getSelectedItem().toString(),
       chbEsAdministrador.isSelected());
       
       jTextAreal.setText("Agregado:\n"+
               txtNombres.getText()+
               " " +
               txtApellidos.getText());
       
    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    private void btnListarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarUsuariosActionPerformed
        // TODO add your handling code here:
        jTextAreal.setText(ControlUsuarios.ListarUsuarios());
    }//GEN-LAST:event_btnListarUsuariosActionPerformed

    private void btnConsultarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarUsuariosActionPerformed
    
    ArrayList<Usuarios> losUsuarios= ControlUsuarios.MostrarUsuarios();
    DefaultTableModel modeloUsuarios = new DefaultTableModel();
    modeloUsuarios.addColumn("Identificación");
    modeloUsuarios.addColumn("Nombre Completo");
    modeloUsuarios.addColumn("Es Administrador");
        for (int index = 0; index < losUsuarios.size(); index++) {
            losUsuarios.get(index).toString();
            Object[] fila = new Object[3];
            fila[0] = losUsuarios.get(index).getIdentificacion();
            fila[1] = losUsuarios.get(index).getNombres() + " " +
                        losUsuarios.get(index).getApellidos();
            if (losUsuarios.get(index).isEsAdministrador()){
                fila[2] = "Si";
            } else {
                fila[2] = "No";
            }
            modeloUsuarios.addRow(fila);
       }
        tblUsuarios.setModel(modeloUsuarios);
    }//GEN-LAST:event_btnConsultarUsuariosActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellidos;
    private javax.swing.JLabel Cargos;
    private javax.swing.JLabel Identificacion;
    private javax.swing.JLabel Nombres;
    private javax.swing.JButton bntCapturarInformacion3;
    private javax.swing.JButton btmCapturarInformacion2;
    private javax.swing.JButton btnAgregarUsuario;
    private javax.swing.JButton btnCapturarInformacion4;
    private javax.swing.JButton btnCapturarInformacion5;
    private javax.swing.JButton btnConsultarUsuarios;
    private javax.swing.JButton btnListarUsuarios;
    private javax.swing.JCheckBox chbEsAdministrador;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreal;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
