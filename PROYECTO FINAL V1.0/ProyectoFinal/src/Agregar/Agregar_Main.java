/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agregar;

import java.util.Locale;
import AppPackage.AnimationClass;
import borrar.*;
import main.*;
import Buscar.*;
import Listar.*;
import Agregar.*;
import actualizar.*;

/**
 *
 * @author eduar
 */
public class Agregar_Main extends javax.swing.JFrame {

    /**
     * Creates new form Agregar_Cliente
     */
    public Agregar_Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblActualizarDesabilita.setVisible(false);
        lblBorrarDesabilita.setVisible(false);
        lblBuscarDesabilita.setVisible(false);
        lblDesabilitarListar.setVisible(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void Habilita(){
      lblActualizarDesabilita.setVisible(true);
        lblBorrarDesabilita.setVisible(true);
        lblBuscarDesabilita.setVisible(true);
        lblDesabilitarListar.setVisible(true);
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAgregarProyecto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblAgregarCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblAgregarEmpleado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblAgregarEmpleado1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblmenu = new javax.swing.JLabel();
        lblActualizarDesabilita = new javax.swing.JLabel();
        lblBuscarDesabilita = new javax.swing.JLabel();
        lblBorrarDesabilita = new javax.swing.JLabel();
        lblActualizar = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        lblBorrar = new javax.swing.JLabel();
        lblBuscar1 = new javax.swing.JLabel();
        lblDesabilitarListar = new javax.swing.JLabel();
        lblListar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAgregarProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        lblAgregarProyecto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgregarProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarProyectoMouseClicked(evt);
            }
        });
        jPanel1.add(lblAgregarProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/idea.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 12, -1, -1));

        lblAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        lblAgregarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgregarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarClienteMouseClicked(evt);
            }
        });
        jPanel1.add(lblAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 94, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carnet-de-identidad.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 104, -1, 54));

        lblAgregarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        lblAgregarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgregarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarEmpleadoMouseClicked(evt);
            }
        });
        jPanel1.add(lblAgregarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 176, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/telemarketer.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 176, -1, -1));

        jLabel7.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel7.setText("Agregar empleado");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 196, -1, -1));

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel8.setText("Agregar cliente");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 113, -1, -1));

        jLabel10.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel10.setText("Agregar Proyecto");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        lblAgregarEmpleado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        lblAgregarEmpleado1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgregarEmpleado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarEmpleado1MouseClicked(evt);
            }
        });
        jPanel1.add(lblAgregarEmpleado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        jLabel13.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel13.setText("Agregar servicio");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 570, 290));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel2.setText("Agregar");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 570, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblmenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png"))); // NOI18N
        lblmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblmenuMouseClicked(evt);
            }
        });
        jPanel3.add(lblmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 13, 43, -1));

        lblActualizarDesabilita.setText("Actualizar");
        jPanel3.add(lblActualizarDesabilita, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        lblBuscarDesabilita.setText("Buscar");
        jPanel3.add(lblBuscarDesabilita, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        lblBorrarDesabilita.setText("Borrar");
        jPanel3.add(lblBorrarDesabilita, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        lblActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recargar.png"))); // NOI18N
        lblActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblActualizarMouseClicked(evt);
            }
        });
        jPanel3.add(lblActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 123, -1, 25));

        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda (1).png"))); // NOI18N
        lblBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
        });
        jPanel3.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 93, 21, -1));

        lblBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        lblBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBorrarMouseClicked(evt);
            }
        });
        jPanel3.add(lblBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 63, -1, -1));

        lblBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda (1).png"))); // NOI18N
        lblBuscar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscar1MouseClicked(evt);
            }
        });
        jPanel3.add(lblBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 93, 21, -1));

        lblDesabilitarListar.setText("Listar");
        jPanel3.add(lblDesabilitarListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        lblListar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listarchikitoxd.png"))); // NOI18N
        lblListar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblListarMouseClicked(evt);
            }
        });
        jPanel3.add(lblListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 160, 30, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/strattonoakmont.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 90, 110));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 120, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAgregarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarClienteMouseClicked
        Agregar_Cliente agcl= new Agregar_Cliente();
        agcl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAgregarClienteMouseClicked

    private void lblAgregarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarEmpleadoMouseClicked
       Agregar_Empleado agem = new Agregar_Empleado();
       agem.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lblAgregarEmpleadoMouseClicked

    private void lblAgregarProyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarProyectoMouseClicked
        Agregar_Proyecto agp = new Agregar_Proyecto();
        agp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAgregarProyectoMouseClicked

    private void lblAgregarEmpleado1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarEmpleado1MouseClicked
        Agregar_Servicio obj =  new Agregar_Servicio();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAgregarEmpleado1MouseClicked

    private void lblmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmenuMouseClicked

        //animacion para item borrar

        AnimationClass borrar = new AnimationClass();
        borrar.jLabelXRight(-30,10,10,5,lblBorrar);

        AnimationClass borrarr = new AnimationClass();
        borrarr.jLabelXLeft(10,-30,10,5,lblBorrar);

        //animacion para item buscar
        AnimationClass buscar = new AnimationClass();
        buscar.jLabelXRight(-30,10,10,5,lblBuscar);

        AnimationClass buscarr = new AnimationClass();
        buscarr.jLabelXLeft(10,-30,10,5,lblBuscar);

        //animacion para item actualizar
        AnimationClass actualizar = new AnimationClass();
        actualizar.jLabelXRight(-30,10,10,5,lblActualizar);

        AnimationClass actualizarr = new AnimationClass();
        actualizarr.jLabelXLeft(10,-30,10,5,lblActualizar);
        Habilita();

        //animacion item listar
        AnimationClass listar = new AnimationClass();
        actualizar.jLabelXRight(-30,10,10,5,lblListar);

        AnimationClass listarr = new AnimationClass();
        actualizarr.jLabelXLeft(10,-30,10,5,lblListar);
        Habilita();

    }//GEN-LAST:event_lblmenuMouseClicked

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        Buscar_Main obj =  new Buscar_Main();
        obj.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lblBuscarMouseClicked

    private void lblBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBorrarMouseClicked
        Borrar_principal obj = new Borrar_principal();
        obj.setVisible(true);
    }//GEN-LAST:event_lblBorrarMouseClicked

    private void lblBuscar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscar1MouseClicked
        Buscar_Main obj = new Buscar_Main();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBuscar1MouseClicked

    private void lblActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseClicked
         Actualizar_main obj = new Actualizar_main();
         obj.setVisible(true);
         this.dispose();
            
    }//GEN-LAST:event_lblActualizarMouseClicked

    private void lblListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblListarMouseClicked
       listar_main ls = new listar_main();
       ls.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lblListarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agregar_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblActualizar;
    private javax.swing.JLabel lblActualizarDesabilita;
    private javax.swing.JLabel lblAgregarCliente;
    private javax.swing.JLabel lblAgregarEmpleado;
    private javax.swing.JLabel lblAgregarEmpleado1;
    private javax.swing.JLabel lblAgregarProyecto;
    private javax.swing.JLabel lblBorrar;
    private javax.swing.JLabel lblBorrarDesabilita;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblBuscar1;
    private javax.swing.JLabel lblBuscarDesabilita;
    private javax.swing.JLabel lblDesabilitarListar;
    private javax.swing.JLabel lblListar;
    private javax.swing.JLabel lblmenu;
    // End of variables declaration//GEN-END:variables
}