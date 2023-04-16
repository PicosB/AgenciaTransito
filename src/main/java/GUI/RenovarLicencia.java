/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Entidades.ControladorEntidades;
import Entidades.Licencia;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class RenovarLicencia extends javax.swing.JFrame {
    ControladorEntidades control = null;
    int id;
    Licencia lic;
    Date fecha =  new Date();
    /**
     * Creates new form RenovarLicencia
     */
    public RenovarLicencia(int id) {
        control = new ControladorEntidades();
        initComponents();
        cargarDatos(id);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbDiscapacitado = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtFechaExpedicion = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        cmbVigencia = new javax.swing.JComboBox<>();
        txtFechaVigencia = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        txtPrecio1 = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnRenovar = new javax.swing.JButton();
        btnAceptarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Renovacion de Licencia");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Discapacitado:");

        cmbDiscapacitado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbDiscapacitado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));
        cmbDiscapacitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDiscapacitadoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Fecha Expedición:");

        this.txtFechaExpedicion.setEnabled(false);
        this.txtFechaVigencia.setEnabled(false);
        Date date = new Date();
        this.txtFechaExpedicion.setDate(date);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Vigencia:");

        cmbVigencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbVigencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1 año", "2 años", "3 años" }));
        cmbVigencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbVigenciaMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Precio de Licencia:");

        txtPrecio1.setEditable(false);
        txtPrecio1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPrecio1.setText("0.0");
        txtPrecio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecio1ActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRenovar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRenovar.setText("Renovar");
        btnRenovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenovarActionPerformed(evt);
            }
        });

        btnAceptarDatos.setText("Aceptar Datos");
        btnAceptarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbDiscapacitado, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbVigencia, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFechaExpedicion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(btnCancelar)
                        .addGap(74, 74, 74)
                        .addComponent(btnRenovar)))
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFechaVigencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAceptarDatos)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmbDiscapacitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addComponent(txtFechaExpedicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFechaVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptarDatos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPrecio1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnRenovar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDiscapacitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDiscapacitadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDiscapacitadoActionPerformed

    private void cmbVigenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbVigenciaMouseClicked

    }//GEN-LAST:event_cmbVigenciaMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        new RenovacionLicencia().setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRenovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenovarActionPerformed
        String discapacitado = (String) cmbDiscapacitado.getSelectedItem();
        Date fechaExp = txtFechaExpedicion.getDate();
        Date fechaVig = txtFechaVigencia.getDate();
        String anios = (String) cmbVigencia.getSelectedItem();
        String precio = txtPrecio1.getText();
        
        control.RenovarLicencia(lic, discapacitado,fechaExp, fechaVig, anios,precio);
        
        mostrarMensaje("Renovacion realizada correctamente", "Info", "Renovacion Correcta");
        
        this.setVisible(false);
        new RenovacionLicencia().setVisible(true);
    }//GEN-LAST:event_btnRenovarActionPerformed

    private void txtPrecio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecio1ActionPerformed

    private void btnAceptarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarDatosActionPerformed
        // TODO add your handling code here:
                int discapacitado = cmbDiscapacitado.getSelectedIndex();
        int vigencia = cmbVigencia.getSelectedIndex();

        if((discapacitado == 1) && (vigencia == 1)){
            txtPrecio1.setText("$200");
            Date fecha = this.txtFechaExpedicion.getDate();

            fecha.setYear(fecha.getYear() + 1);

            this.txtFechaVigencia.setDate(fecha);
        }

        if((discapacitado == 1) && (vigencia == 2)){
            txtPrecio1.setText("$500");
            Date fecha = this.txtFechaExpedicion.getDate();

            fecha.setYear(fecha.getYear() + 2);

            this.txtFechaVigencia.setDate(fecha);
        }

        if((discapacitado == 1) && (vigencia == 3)){
            txtPrecio1.setText("$700");
            Date fecha = this.txtFechaExpedicion.getDate();

            fecha.setYear(fecha.getYear() + 3);

            this.txtFechaVigencia.setDate(fecha);
        }

        if((discapacitado == 2) && (vigencia == 1)){
            txtPrecio1.setText("$600");
            Date fecha = this.txtFechaExpedicion.getDate();

            fecha.setYear(fecha.getYear() + 1);

            this.txtFechaVigencia.setDate(fecha);
        }

        if((discapacitado == 2) && (vigencia == 2)){
            txtPrecio1.setText("$900");
            Date fecha = this.txtFechaExpedicion.getDate();

            fecha.setYear(fecha.getYear() + 2);

            this.txtFechaVigencia.setDate(fecha);
             System.out.println("");
        }

        if((discapacitado == 2) && (vigencia == 3)){
            txtPrecio1.setText("$1,100");
            Date fecha = this.txtFechaExpedicion.getDate();

            fecha.setYear(fecha.getYear() + 3);

            this.txtFechaVigencia.setDate(fecha);
        }

    }//GEN-LAST:event_btnAceptarDatosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarDatos;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRenovar;
    private javax.swing.JComboBox<String> cmbDiscapacitado;
    private javax.swing.JComboBox<String> cmbVigencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser txtFechaExpedicion;
    private com.toedter.calendar.JDateChooser txtFechaVigencia;
    private javax.swing.JTextField txtPrecio1;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int id) {
        this.lic = control.traerLicencia(id);
        
        cmbDiscapacitado.setSelectedItem(lic.getDiscapacitado());
        txtFechaExpedicion.setDate(lic.getFechaExpedicion());
        cmbVigencia.setSelectedItem(lic.getAnios());
        txtFechaVigencia.setDate(lic.getVigencia());
        txtPrecio1.setText(lic.getPrecio());
        
    }
    
    public void mostrarMensaje (String mensaje, String tipo, String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if(tipo.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if(tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);      
    }

}

