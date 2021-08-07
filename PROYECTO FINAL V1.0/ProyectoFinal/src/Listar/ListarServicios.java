/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listar;
import AppPackage.AnimationClass;
import borrar.*;
import main.*;
import Buscar.*;
import Agregar.*;
import javax.swing.table.DefaultTableModel;
import metodos.*;
import Agregar.*;
import actualizar.*;

/**
 *
 * @author eduar
 */
public class ListarServicios extends javax.swing.JFrame {

    /**
     * Creates new form ListarServicios
     */
    public ListarServicios() {
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCliente = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        lblIconBuscar = new javax.swing.JLabel();
        lblPresionaPara = new javax.swing.JLabel();
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
        lblAgregar = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        TablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id sercivio", "Variante", "Fecha Fin", "Fecha Inicio", "id empleado", "id cliente", "Id proyecto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablaCliente.setGridColor(new java.awt.Color(255, 255, 255));
        TablaCliente.setRowHeight(25);
        TablaCliente.setRowMargin(5);
        TablaCliente.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(TablaCliente);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 520, 230));

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel4.setText("Listar servicios");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        lblIconBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listarchikitoxd.png"))); // NOI18N
        lblIconBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIconBuscar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblIconBuscarMouseMoved(evt);
            }
        });
        lblIconBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconBuscarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIconBuscarMouseExited(evt);
            }
        });
        jPanel2.add(lblIconBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        lblPresionaPara.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        lblPresionaPara.setText("Presiona para listar");
        jPanel2.add(lblPresionaPara, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 560, 350));

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
        jLabel9.setText("INICIO LISTAR");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 120, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 130, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblIconBuscarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconBuscarMouseMoved
        lblPresionaPara.setVisible(true);
    }//GEN-LAST:event_lblIconBuscarMouseMoved

    private void lblIconBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconBuscarMouseClicked
        /*Object [][]dtAutosPorIdCliente;
        String code;
        String[]columNames={"Nombre","Apellidos","Numero de Serie","Matricula","Marca","Modelo","Color"};
        Metodos p = new Metodos();
        code=txtCodeCl.getText();
        dtAutosPorIdCliente=p.getAutosVendidosPorCliente(code);
        DefaultTableModel Datos= new DefaultTableModel(dtAutosPorIdCliente,columNames);
        vendidos.setModel(Datos);*/
       Object [][] dtServiceByItsID;
        String code;
        String[]columNames={"ID servicio","Variante","Fecha fin","Fecha inicio","ID empleado","ID cliente","ID proyecto"};
        Metodos_Listar_sin_busqueda_personalizada p = new Metodos_Listar_sin_busqueda_personalizada();
        dtServiceByItsID=p.getServiceForPrintinTable();
        DefaultTableModel Datos= new DefaultTableModel(dtServiceByItsID,columNames);
        TablaCliente.setModel(Datos);

    }//GEN-LAST:event_lblIconBuscarMouseClicked

    private void lblIconBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconBuscarMouseExited
        lblPresionaPara.setVisible(false);
    }//GEN-LAST:event_lblIconBuscarMouseExited

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
        Actualizar_main a = new Actualizar_main();
        a.setVisible(true);
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

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        listar_main obj = new listar_main();
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
            java.util.logging.Logger.getLogger(ListarServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarServicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCliente;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblActualizar;
    private javax.swing.JLabel lblActualizarDesabilita;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblBorrar;
    private javax.swing.JLabel lblBorrarDesabilita;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblBuscar1;
    private javax.swing.JLabel lblBuscarDesabilita;
    private javax.swing.JLabel lblDesabilitarListar;
    private javax.swing.JLabel lblIconBuscar;
    private javax.swing.JLabel lblPresionaPara;
    private javax.swing.JLabel lblmenu;
    // End of variables declaration//GEN-END:variables
}
