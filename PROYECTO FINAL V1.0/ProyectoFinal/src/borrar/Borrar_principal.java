/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borrar;
import java.util.Locale;
import AppPackage.AnimationClass;
import java.util.Calendar;
import main.*;
import metodos.*;
import Agregar.*;
import Buscar.Buscar_Main;
import Listar.*;
import actualizar.*;

/**
 *
 * @author eduar
 */
public class Borrar_principal extends javax.swing.JFrame {

    /**
     * Creates new form Borrar_principal
     */
    public Borrar_principal() {
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

        jpingreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblmenu = new javax.swing.JLabel();
        lblAgregar = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        lblActualizar = new javax.swing.JLabel();
        lblBorrarDesabilita = new javax.swing.JLabel();
        lblBuscarDesabilita = new javax.swing.JLabel();
        lblActualizarDesabilita = new javax.swing.JLabel();
        lblListar = new javax.swing.JLabel();
        lblDesabilitarListar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblBorrarProyecto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblBorrarCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblBorrarEmpleado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblBorrarService = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpingreso.setBackground(new java.awt.Color(255, 255, 255));
        jpingreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jpingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jpingreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 279, 61, -1));

        lblmenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png"))); // NOI18N
        lblmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblmenuMouseClicked(evt);
            }
        });
        jpingreso.add(lblmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 13, 43, -1));

        lblAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas (1).png"))); // NOI18N
        lblAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarMouseClicked(evt);
            }
        });
        jpingreso.add(lblAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 63, -1, -1));

        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda (1).png"))); // NOI18N
        lblBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
        });
        jpingreso.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 93, 21, -1));

        lblActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recargar.png"))); // NOI18N
        lblActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblActualizarMouseClicked(evt);
            }
        });
        jpingreso.add(lblActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 123, -1, 25));

        lblBorrarDesabilita.setText("Agregar");
        jpingreso.add(lblBorrarDesabilita, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        lblBuscarDesabilita.setText("Buscar");
        jpingreso.add(lblBuscarDesabilita, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        lblActualizarDesabilita.setText("Actualizar");
        jpingreso.add(lblActualizarDesabilita, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        lblListar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listarchikitoxd.png"))); // NOI18N
        lblListar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblListarMouseClicked(evt);
            }
        });
        jpingreso.add(lblListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 160, 30, 30));

        lblDesabilitarListar.setText("Listar");
        jpingreso.add(lblDesabilitarListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/strattonoakmont.png"))); // NOI18N
        jpingreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 90, 110));

        getContentPane().add(jpingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 120, 370));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBorrarProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        lblBorrarProyecto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBorrarProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBorrarProyectoMouseClicked(evt);
            }
        });
        jPanel1.add(lblBorrarProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/idea.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 12, -1, -1));

        lblBorrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        lblBorrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBorrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBorrarClienteMouseClicked(evt);
            }
        });
        jPanel1.add(lblBorrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 94, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carnet-de-identidad.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 104, -1, 54));

        lblBorrarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        lblBorrarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBorrarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBorrarEmpleadoMouseClicked(evt);
            }
        });
        jPanel1.add(lblBorrarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 176, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/telemarketer.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 176, -1, -1));

        jLabel7.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel7.setText("Borrar empleado");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 196, -1, -1));

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel8.setText("Borrar cliente");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 113, -1, -1));

        jLabel10.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel10.setText("Borrar proyecto");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        lblBorrarService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        lblBorrarService.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBorrarService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBorrarServiceMouseClicked(evt);
            }
        });
        jPanel1.add(lblBorrarService, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jLabel13.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel13.setText("Borrar servicio");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 570, 290));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel2.setText("Borrar");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 570, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Login log = new Login();
        log.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void lblmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmenuMouseClicked

        //animacion para item borrar

        AnimationClass borrar = new AnimationClass();
        borrar.jLabelXRight(-30,10,10,5,lblAgregar);

        AnimationClass borrarr = new AnimationClass();
        borrarr.jLabelXLeft(10,-30,10,5,lblAgregar);

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
        
        //////anima listar
        AnimationClass listar = new AnimationClass();
        actualizar.jLabelXRight(-30,10,10,5,lblListar);

        AnimationClass listarr = new AnimationClass();
        actualizarr.jLabelXLeft(10,-30,10,5,lblListar);
        Habilita();
    }//GEN-LAST:event_lblmenuMouseClicked

    private void lblAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseClicked
       Agregar_Main obj = new Agregar_Main();
       obj.setVisible(true);
    }//GEN-LAST:event_lblAgregarMouseClicked

    private void lblBorrarProyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBorrarProyectoMouseClicked
      Borrar_Proyecto obj = new Borrar_Proyecto();
      obj.setVisible(true);
      this.dispose();
       
    }//GEN-LAST:event_lblBorrarProyectoMouseClicked

    private void lblBorrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBorrarClienteMouseClicked
    Borrar_cliente obj =  new Borrar_cliente();
    obj.setVisible(true);
    this.dispose(); 
    
    }//GEN-LAST:event_lblBorrarClienteMouseClicked

    private void lblBorrarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBorrarEmpleadoMouseClicked
        Borrar_Empleado obj = new Borrar_Empleado();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBorrarEmpleadoMouseClicked

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        Buscar_Main obj = new Buscar_Main();
       obj.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lblBuscarMouseClicked

    private void lblBorrarServiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBorrarServiceMouseClicked
      Borrar_servicio obj = new Borrar_servicio();
      obj.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_lblBorrarServiceMouseClicked

    private void lblActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseClicked
        Actualizar_main o =  new Actualizar_main();
        o.setVisible(true);
    }//GEN-LAST:event_lblActualizarMouseClicked

    private void lblListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblListarMouseClicked
        // TODO add your handling code here:
        listar_main a = new listar_main();
        a.setVisible(true);
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Borrar_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Borrar_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Borrar_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Borrar_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Borrar_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jpingreso;
    private javax.swing.JLabel lblActualizar;
    private javax.swing.JLabel lblActualizarDesabilita;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblBorrarCliente;
    private javax.swing.JLabel lblBorrarDesabilita;
    private javax.swing.JLabel lblBorrarEmpleado;
    private javax.swing.JLabel lblBorrarProyecto;
    private javax.swing.JLabel lblBorrarService;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblBuscarDesabilita;
    private javax.swing.JLabel lblDesabilitarListar;
    private javax.swing.JLabel lblListar;
    private javax.swing.JLabel lblmenu;
    // End of variables declaration//GEN-END:variables
}
