/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Entidades.Clientes;
import Entidades.ControladorEntidades;
import Entidades.Licencia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Tramites extends javax.swing.JFrame {

    /**
     * Creates new form Tramites
     */
    ControladorEntidades control = new ControladorEntidades();

    public Tramites() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLicencia = new javax.swing.JButton();
        btnPlacas = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnAgregarMasivo = new javax.swing.JButton();
        btnReporte1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seleccionar trámite");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Tramites");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        btnLicencia.setBackground(new java.awt.Color(189, 74, 54));
        btnLicencia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLicencia.setText("Licencia");
        btnLicencia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLicenciaActionPerformed(evt);
            }
        });
        jPanel1.add(btnLicencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 165, 50));

        btnPlacas.setBackground(new java.awt.Color(189, 74, 54));
        btnPlacas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPlacas.setText("Placas");
        btnPlacas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlacasActionPerformed(evt);
            }
        });
        jPanel1.add(btnPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 165, 50));

        btnConsultar.setBackground(new java.awt.Color(189, 74, 54));
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 165, 50));

        btnAgregarMasivo.setBackground(new java.awt.Color(189, 74, 54));
        btnAgregarMasivo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregarMasivo.setText("Agregar Masivo");
        btnAgregarMasivo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAgregarMasivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMasivoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarMasivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 165, 50));

        btnReporte1.setBackground(new java.awt.Color(189, 74, 54));
        btnReporte1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReporte1.setText("Reporte");
        btnReporte1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnReporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnReporte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 165, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 0, 330, 460));

        jPanel2.setBackground(new java.awt.Color(189, 74, 54));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtras.setBackground(new java.awt.Color(189, 74, 54));
        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("Cerrar Sesión");
        btnAtras.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel2.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 140, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/documento (1).png"))); // NOI18N
        jLabel2.setText("+");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 180, 220));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        new IniciarSesion().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLicenciaActionPerformed
        new TramiteLicencia().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLicenciaActionPerformed

    private void btnPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlacasActionPerformed
        new TramitePlaca().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPlacasActionPerformed

    private void btnAgregarMasivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMasivoActionPerformed

        Clientes p1 = new Clientes("AES-324", "Juan", "Toledo", "Navarro", "6442327211", new Date(103, 6, 23));
        Clientes p2 = new Clientes("AEM-777", "Andres", "Ezqueiel", "Montaño", "6441578355", new Date(67, 7, 12));
        Clientes p3 = new Clientes("MAN-324", "Salvador", "Cruz", "Murillo", "6442327211", new Date(56, 5, 14));
        Clientes p4 = new Clientes("ERT-456", "Luis", "Enrique", "Contreras", "6442327211", new Date(57, 3, 15));
        Clientes p21 = new Clientes("BRG-345", "Brayan", "García", "Picos", "6442327211", new Date(87, 8, 13));
        Clientes p5 = new Clientes("SAD-879", "Raul", "Luna", "Bringas", "6442327211", new Date(65, 7, 23));
        Clientes p6 = new Clientes("FDF-345", "Andrea", "Valenzuela", "Campas", "6442327211", new Date(78, 6, 24));
        Clientes p7 = new Clientes("SAS-678", "Samantha", "Zazueta", "Montero", "6442327211", new Date(90, 2, 25));
        Clientes p8 = new Clientes("SAF-123", "Martin", "Hernando", "Lopez", "6442327211", new Date(100, 4, 14));
        Clientes p9 = new Clientes("ZSD-556", "Travis", "J", "Scoott", "6442327211", new Date(98, 5, 12));
        Clientes p10 = new Clientes("ASE-789", "Lionel", "Andres", "Messi", "6442327211", new Date(65, 3, 11));
        Clientes p11 = new Clientes("AZD-432", "Cristiano", "Ronaldo", "Dos Santos", "6442327211", new Date(45, 2, 9));
        Clientes p12 = new Clientes("SDR-123", "Homer", "J", "Simpson", "6442327211", new Date(34, 1, 23));
        Clientes p13 = new Clientes("FGY-567", "Jorge", "García", "Romero", "6371019988", new Date(34, 11, 15));
        Clientes p14 = new Clientes("YUH-213", "Duki", "SS", "J", "6542298722", new Date(45, 9, 3));
        Clientes p15 = new Clientes("IJK-213", "Silvia", "Pinal", "Lóez", "6202213433", new Date(34, 6, 4));
        Clientes p16 = new Clientes("FGH-232", "Jesus", "Jorge", "Rodriguez", "6153471122", new Date(56, 6, 7));
        Clientes p17 = new Clientes("TGY-124", "Omar", "Contreras", "Peraza", "6442327211", new Date(65, 7, 8));
        Clientes p18 = new Clientes("DAE-567", "Santiago", "Gimenez", "Gonzalez", "6220918583", new Date(76, 6, 12));
        Clientes p19 = new Clientes("XSA-323", "Andres", "Lopez", "Obrador", "6892048982", new Date(87, 5, 22));
        Clientes p20 = new Clientes("SAD-467", "Samuel", "Garcia", "Castro", "6365083221", new Date(88, 4, 30));

        Licencia l1 = new Licencia(new Date(), new Date(new Date().getYear() + 1, new Date().getMonth(), new Date().getDate()), "1", "Si", "200.00", p1);
        Licencia l2 = new Licencia(new Date(), new Date(new Date().getYear() + 2, new Date().getMonth(), new Date().getDate()), "2", "No", "900.00", p2);
        Licencia l3 = new Licencia(new Date(), new Date(new Date().getYear() + 2, new Date().getMonth(), new Date().getDate()), "2", "Si", "500.00", p3);
        Licencia l4 = new Licencia(new Date(), new Date(new Date().getYear() + 1, new Date().getMonth(), new Date().getDate()), "1", "No", "600.00", p4);
        Licencia l5 = new Licencia(new Date(), new Date(new Date().getYear() + 3, new Date().getMonth(), new Date().getDate()), "3", "Si", "700.00", p5);
        Licencia l6 = new Licencia(new Date(), new Date(new Date().getYear() + 3, new Date().getMonth(), new Date().getDate()), "3", "No", "1100.00", p6);
        Licencia l7 = new Licencia(new Date(), new Date(new Date().getYear() + 2, new Date().getMonth(), new Date().getDate()), "2", "No", "900.00", p7);
        Licencia l8 = new Licencia(new Date(), new Date(new Date().getYear() + 2, new Date().getMonth(), new Date().getDate()), "2", "Si", "500.00", p8);
        Licencia l9 = new Licencia(new Date(), new Date(new Date().getYear() + 3, new Date().getMonth(), new Date().getDate()), "3", "No", "1100.00", p9);
        Licencia l10 = new Licencia(new Date(), new Date(new Date().getYear() + 2, new Date().getMonth(), new Date().getDate()), "2", "No", "900.00", p10);
        Licencia l11 = new Licencia(new Date(), new Date(new Date().getYear() + 3, new Date().getMonth(), new Date().getDate()), "3", "No", "1100.00", p11);
        Licencia l12 = new Licencia(new Date(), new Date(new Date().getYear() + 2, new Date().getMonth(), new Date().getDate()), "2", "No", "900.00", p12);
        Licencia l13 = new Licencia(new Date(), new Date(new Date().getYear() + 2, new Date().getMonth(), new Date().getDate()), "2", "No", "900.00", p13);
        Licencia l14 = new Licencia(new Date(), new Date(new Date().getYear() + 2, new Date().getMonth(), new Date().getDate()), "2", "No", "900.00", p14);
        Licencia l15 = new Licencia(new Date(), new Date(new Date().getYear() + 2, new Date().getMonth(), new Date().getDate()), "2", "No", "900.00", p15);
        Licencia l16 = new Licencia(new Date(), new Date(new Date().getYear() + 2, new Date().getMonth(), new Date().getDate()), "2", "No", "900.00", p16);
        Licencia l17 = new Licencia(new Date(), new Date(new Date().getYear() + 1, new Date().getMonth(), new Date().getDate()), "1", "No", "600.00", p17);
        Licencia l18 = new Licencia(new Date(), new Date(new Date().getYear() + 3, new Date().getMonth(), new Date().getDate()), "3", "No", "1100.00", p18);
        Licencia l19 = new Licencia(new Date(), new Date(new Date().getYear() + 3, new Date().getMonth(), new Date().getDate()), "3", "No", "1100.00", p19);
        Licencia l20 = new Licencia(new Date(), new Date(new Date().getYear() + 1, new Date().getMonth(), new Date().getDate()), "1", "Si", "200.00", p20);
        List<Clientes> personas = new ArrayList<>(Arrays.asList(p1,
                p2,
                p3,
                p4,
                p5,
                p6,
                p7,
                p8,
                p9,
                p10,
                p11,
                p12,
                p13,
                p14,
                p15,
                p16,
                p17,
                p18,
                p19,
                p20));
        List<Licencia> licencia = new ArrayList<>(Arrays.asList(l1,
                l2,
                l3,
                l4,
                l5,
                l6,
                l7,
                l8,
                l9,
                l10,
                l11,
                l12,
                l13,
                l14,
                l15,
                l16,
                l17,
                l18,
                l19,
                l20));
        try {
            Collections.shuffle(personas);
            for (int i = 0; i < personas.size(); i++) {

                control.guardarCliente(personas.get(i).getRFC(),
                        personas.get(i).getNombres(),
                        personas.get(i).getApellidoP(),
                        personas.get(i).getApellidoM(),
                        personas.get(i).getFechaNacimiento(),
                        personas.get(i).getNumTelefono(),
                        licencia.get(i).getDiscapacitado(),
                        licencia.get(i).getFechaExpedicion(),
                        licencia.get(i).getVigencia(),
                        licencia.get(i).getAnios(),
                        licencia.get(i).getPrecio()
                );

            }
            JOptionPane.showMessageDialog(null, "Se añadieron 20 registros de forma exitosa");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al procesar su solicitud");
        }


    }//GEN-LAST:event_btnAgregarMasivoActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String respuesta = JOptionPane.showInputDialog(this, "Ingresa si quieres consultar 'Licencias' o 'Placas'");

        if ((!respuesta.isEmpty() && respuesta.equalsIgnoreCase("Licencias")) || (!respuesta.isEmpty() && respuesta.equalsIgnoreCase("Placas"))) {
            if (respuesta.equalsIgnoreCase("Licencias")) {
                new ConsultarLicencia().setVisible(true);
                this.setVisible(false);
            } else if (respuesta.equalsIgnoreCase("Placas")) {
                new ConsultarPlaca().setVisible(true);
                this.setVisible(false);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Favor de ingresar el tramite a consultar correctamente...");

        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnReporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte1ActionPerformed
        new ModuloReportes().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReporte1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarMasivo;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnLicencia;
    private javax.swing.JButton btnPlacas;
    private javax.swing.JButton btnReporte1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
