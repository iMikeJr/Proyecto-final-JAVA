/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actualizar;
import Listar.*;
import AppPackage.AnimationClass;
import borrar.*;
import main.*;
import Buscar.*;
import Agregar.*;
import javax.swing.table.DefaultTableModel;
import metodos.*;
import Agregar.*;
import actualizar.*;
import javax.swing.JOptionPane;

/**
 *
 * @author eduar
 */
public class actualizar_proyecto extends javax.swing.JFrame {

    /**
     * Creates new form actualizar_proyecto
     */
    public actualizar_proyecto() {
        initComponents();
          this.setLocationRelativeTo(null);
        lblListarDesabilita.setVisible(false);
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
      lblListarDesabilita.setVisible(true);
        lblBorrarDesabilita.setVisible(true);
        lblBuscarDesabilita.setVisible(true);
        lblDesabilitarListar.setVisible(true);
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblmenu = new javax.swing.JLabel();
        lblListarDesabilita = new javax.swing.JLabel();
        lblBuscarDesabilita = new javax.swing.JLabel();
        lblBorrarDesabilita = new javax.swing.JLabel();
        lblActualizar = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        lblBorrar = new javax.swing.JLabel();
        lblBuscar1 = new javax.swing.JLabel();
        lblDesabilitarListar = new javax.swing.JLabel();
        lblAgregar = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIDProyecto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTiempProyec = new javax.swing.JTextField();
        txtFechaProyec = new javax.swing.JTextField();
        txtVarProyec = new javax.swing.JTextField();
        txtDescProyec = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        lblListarDesabilita.setText("Listar");
        jPanel3.add(lblListarDesabilita, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        lblBuscarDesabilita.setText("Buscar");
        jPanel3.add(lblBuscarDesabilita, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        lblBorrarDesabilita.setText("Borrar");
        jPanel3.add(lblBorrarDesabilita, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        lblActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listarchikitoxd.png"))); // NOI18N
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

        lblDesabilitarListar.setText("Agregar");
        jPanel3.add(lblDesabilitarListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        lblAgregar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas (1).png"))); // NOI18N
        lblAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarMouseClicked(evt);
            }
        });
        jPanel3.add(lblAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 160, 30, 30));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casa.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 70, -1));

        jLabel9.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("INICIO ACTUALIZAR");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 120, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 130, 370));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel2.setText("Actualizar Proyecto");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jLabel3.setText("ID del proyecto");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, 20));
        jPanel2.add(txtIDProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 100, -1));

        jLabel4.setText("Tiempo");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel5.setText("Fecha Inicio");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 20));

        jLabel6.setText("Variante");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel7.setText("Descripcion");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        txtTiempProyec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiempProyecActionPerformed(evt);
            }
        });
        jPanel2.add(txtTiempProyec, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 100, -1));
        jPanel2.add(txtFechaProyec, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 100, -1));
        jPanel2.add(txtVarProyec, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 100, -1));
        jPanel2.add(txtDescProyec, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 100, -1));

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 90, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/d53a1dc4d5d66d83822acc888d7e9ff1.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 330, 360));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 290, 90, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 560, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

        //animacion item Agregar
        AnimationClass listar = new AnimationClass();
        actualizar.jLabelXRight(-30,10,10,5,lblAgregar);

        AnimationClass listarr = new AnimationClass();
        actualizarr.jLabelXLeft(10,-30,10,5,lblAgregar);
        Habilita();
    }//GEN-LAST:event_lblmenuMouseClicked

    private void lblActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseClicked
        listar_main obj = new listar_main();
        obj.setVisible(true);
    }//GEN-LAST:event_lblActualizarMouseClicked

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

    private void lblAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseClicked
        Agregar_Main obj = new Agregar_Main();
        obj.setVisible(true);
    }//GEN-LAST:event_lblAgregarMouseClicked

    private void txtTiempProyecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiempProyecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTiempProyecActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        metodos p = new metodos();
        String idpr,tiemp,fecha,variante,desc;
        idpr=txtIDProyecto.getText();
        tiemp=txtTiempProyec.getText();
        fecha=txtFechaProyec.getText();
        variante=txtVarProyec.getText();
        desc=txtDescProyec.getText();
       
        int i= JOptionPane.showConfirmDialog(rootPane,"¿Deseas actualizar el registro?","Mensaje",JOptionPane.YES_NO_OPTION);
        if(i==JOptionPane.YES_OPTION){
          
            
            p.ActualizaProyectos(idpr, tiemp, fecha, desc, variante, desc);
            
          

        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String datos[];
        datos = new String[5];
        String code;
        code=txtIDProyecto.getText();
        metodos consulta = new metodos();
        datos=consulta.getBuscarProyecto(code);

        txtTiempProyec.setText(datos[1]);
        txtFechaProyec.setText(datos[2]);
        txtVarProyec.setText(datos[3]);
        txtDescProyec.setText(datos[4]);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        Actualizar_main obj = new Actualizar_main();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(actualizar_proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(actualizar_proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(actualizar_proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(actualizar_proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new actualizar_proyecto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblActualizar;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblBorrar;
    private javax.swing.JLabel lblBorrarDesabilita;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblBuscar1;
    private javax.swing.JLabel lblBuscarDesabilita;
    private javax.swing.JLabel lblDesabilitarListar;
    private javax.swing.JLabel lblListarDesabilita;
    private javax.swing.JLabel lblmenu;
    private javax.swing.JTextField txtDescProyec;
    private javax.swing.JTextField txtFechaProyec;
    private javax.swing.JTextField txtIDProyecto;
    private javax.swing.JTextField txtTiempProyec;
    private javax.swing.JTextField txtVarProyec;
    // End of variables declaration//GEN-END:variables
}
