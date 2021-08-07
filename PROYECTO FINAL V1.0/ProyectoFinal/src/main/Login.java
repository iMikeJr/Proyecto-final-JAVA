/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import javax.swing.JOptionPane;
import Agregar.*;
import  borrar.*;
import Buscar.*;
import Listar.*;
import actualizar.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import metodos.conexion;
import registro.*;

/**
 *
 * @author eduar
 */
public class Login extends javax.swing.JFrame {

    
    //valida usuario
           
    //
    
    static int globalsession;
    
    public static int session(){
        
        int ba=0;
        if( (lbluseract.getText()=="") ){
            
            ba=1;
        }
        
        return ba;
    } 
    
    
    /**
     * Creates new form Login
     */
    conexion cc=new conexion();
     Connection con=cc.getConnection();
    
    
    public Login() {
        initComponents();
        cerrar();
        this.setLocationRelativeTo(null);
        lblAgregar.setVisible(false);
        lblBorrar.setVisible(false);
        lblActualzar.setVisible(false);
        jlbListar.setVisible(false);
        lblBuscar.setVisible(false);
        lblAgrega.setVisible(false);
        lblBorra.setVisible(false);
        lblActualiza.setVisible(false);
        lblLista.setVisible(false);
        lblBusca.setVisible(false);
        ocultaregistro.setVisible(true);
        textodereg.setVisible(true);
        lblsesionact.setVisible(false);
        
        
    }
    
    
    //metodo que cierra
    public void cerrar(){
        try{
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    confirmarSalida();
                }
        });
            this.setVisible(true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void confirmarSalida(){
        int resp= JOptionPane.showConfirmDialog(this,"¿Estas seguro de cerrar el programa?","Mensaje",JOptionPane.YES_NO_OPTION);
        if (resp==JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }
    
    //metodo que valida el acceso
    public void ValidarAcceso(){
        int resultado=0;
        
        try{
            
            //declaracion de variables
            
            String usuario= txtUsuarioLogin.getText();
           String contraseña= PasswordFieldUsuario.getText();
           String roless= txtadmin.getText();
           
            //genera consulta para validar el ingreso del usuario
            String sql = "select * from usuarios where Usuarios= '"+usuario+"' and Contraseña='"+contraseña+"' and roles='"+roless+"'";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            
            
            if(rs.next()){
                resultado=1;
                
                    
                if(resultado==1 && session()==1){
                    JOptionPane.showMessageDialog(null, "Bienvenido "+usuario+ " tu cargo es: "+roless );    
                
                
                 if(roless.equals("admin") || roless.equals("ADMIN") ){
                        lblAgregar.setVisible(true);
                        lblBorrar.setVisible(true);
                        lblActualzar.setVisible(true);
                        jlbListar.setVisible(true);
                        lblBuscar.setVisible(true);
                        lblAgrega.setVisible(true);
                        lblBorra.setVisible(true);
                        lblActualiza.setVisible(true);
                        lblLista.setVisible(true);
                        lblBusca.setVisible(true);
                        ocultaregistro.setVisible(false);
                        textodereg.setVisible(false);
                        
                        //levanta la sesion
                          lblsesionact.setVisible(true);
                          lbluseract.setText(txtUsuarioLogin.getText());
                        
                        
                        
                        
                        //Limpia los campos
                        txtUsuarioLogin.setText("");
                        txtadmin.setText("");
                        PasswordFieldUsuario.setText("");
                        
                        
                        
                 }else{
                
                    if(roless.equals("visita") || roless.equals("VISITA"))
                    {
                        jlbListar.setVisible(true);
                        lblBuscar.setVisible(true);
                        lblLista.setVisible(true);
                        lblBusca.setVisible(true);
                        
                        //oculta opciones para agregar clientes
                        ocultaregistro.setVisible(true);
                        textodereg.setVisible(true);
                        //****************************
                        
                        
                        
                        
                        lblActualiza.setVisible(false);
                        lblActualzar.setVisible(false);
                        lblAgrega.setVisible(false);
                        lblAgregar.setVisible(false);
                        lblBorra.setVisible(false);
                        lblBorrar.setVisible(false);
                        lblBusca.setVisible(true);
                        lblBuscar.setVisible(true);
                        
                        lblLista.setVisible(true);
                        jlbListar.setVisible(true);
                        
                        //levanta la sesion
                         lblsesionact.setVisible(true);
                         lbluseract.setText(txtUsuarioLogin.getText());
              
                
                        txtUsuarioLogin.setText("");
                        txtadmin.setText("");
                        PasswordFieldUsuario.setText("");
                        
                    
                   
                 }
            }
                 }else{
                     JOptionPane.showMessageDialog(rootPane,"No se puede entrar, hay una sesion activa","Advertencia",JOptionPane.WARNING_MESSAGE);
                     txtUsuarioLogin.setText("");
                        txtadmin.setText("");
                        PasswordFieldUsuario.setText("");
                }
                
                
                
                
                }else
                    if(txtUsuarioLogin.getText().equals("") || txtadmin.getText().equals("") || PasswordFieldUsuario.getText().equals("") )
                     {
                     JOptionPane.showMessageDialog(rootPane,"Campos vacios","Advertencia",JOptionPane.WARNING_MESSAGE);
                    txtUsuarioLogin.setText("");
                    PasswordFieldUsuario.setText("");
                    txtadmin.setText("");
                     }else
                        if(session()!=1){
                             JOptionPane.showMessageDialog(rootPane,"No se puede entrar, hay una sesion activa","Advertencia",JOptionPane.WARNING_MESSAGE);
                             txtUsuarioLogin.setText("");
                        txtadmin.setText("");
                        PasswordFieldUsuario.setText("");
                        }
                    
                    else
                        if(session()!=1){
                             JOptionPane.showMessageDialog(rootPane,"No se puede entrar, hay una sesion activa","Advertencia",JOptionPane.WARNING_MESSAGE);
                             txtUsuarioLogin.setText("");
                        txtadmin.setText("");
                        PasswordFieldUsuario.setText("");
                        }
                    else{
                         JOptionPane.showMessageDialog(null, "Acceso denegado, no registrado o campos incorrectos, vuelve a intentarlo");
                         txtUsuarioLogin.setText("");
                        txtadmin.setText("");
                        PasswordFieldUsuario.setText("");
                    }
            
                     
           /* 
            if(session()!=1){
                        JOptionPane.showMessageDialog(rootPane,"No se puede entrar, hay una sesion activa","Advertencia",JOptionPane.WARNING_MESSAGE);
                    }else{
                        System.out.println("entraste");
                    }
            */
            
            
            /*if(txtUsuarioLogin.equals("") && txtadmin.equals("") && PasswordFieldUsuario.equals("")){
        JOptionPane.showMessageDialog(rootPane,"No se puede ingresar en este momento","Advertencia",JOptionPane.WARNING_MESSAGE);
            
            
            
            
            JOptionPane.showMessageDialog(null, "Acceso denegado, no registrado o campos incorrectos, vuelve a intentarlo");
    }*/
            
            
           
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en el acceso, vuelve a intentarlo"+e.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        lbluseract = new javax.swing.JLabel();
        lblsesionact = new javax.swing.JLabel();
        ocultaregistro = new javax.swing.JPanel();
        textodereg = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtadmin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblLista = new javax.swing.JLabel();
        jlbListar = new javax.swing.JLabel();
        lblBusca = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        lblActualiza = new javax.swing.JLabel();
        lblActualzar = new javax.swing.JLabel();
        lblBorra = new javax.swing.JLabel();
        lblBorrar = new javax.swing.JLabel();
        lblMostrarContra = new javax.swing.JLabel();
        lblojo = new javax.swing.JLabel();
        lblAgrega = new javax.swing.JLabel();
        lblAgregar = new javax.swing.JLabel();
        txtUsuarioLogin = new javax.swing.JTextField();
        PasswordFieldUsuario = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jToggleButton1.setText("CERRAR SESION");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 100, -1));

        lbluseract.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        lbluseract.setForeground(new java.awt.Color(0, 102, 153));
        lbluseract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbluseract, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 160, 20));

        lblsesionact.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        lblsesionact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsesionact.setText("SESION ACTIVA:");
        getContentPane().add(lblsesionact, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 160, -1));

        ocultaregistro.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ocultaregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 210, 100));

        textodereg.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Registra empleados nuevos");
        textodereg.add(jLabel11);

        getContentPane().add(textodereg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 210, 40));

        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 60, 60));

        txtadmin.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        txtadmin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtadmin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 170, -1));

        jLabel9.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("INGRESE SU CARGO (admin/visita)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 210, -1));

        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 90, 30));

        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 60, 50));

        lblLista.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        lblLista.setText("Listar");
        getContentPane().add(lblLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, -1, -1));

        jlbListar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listar-el-simbolo-del-boton-cuadrado-para-la-interfaz.png"))); // NOI18N
        jlbListar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbListar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlbListarMouseMoved(evt);
            }
        });
        jlbListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbListarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbListarMouseExited(evt);
            }
        });
        getContentPane().add(jlbListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 140, 130));

        lblBusca.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        lblBusca.setText("Buscar");
        getContentPane().add(lblBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 370, -1, -1));

        lblBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda.png"))); // NOI18N
        lblBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBuscar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblBuscarMouseMoved(evt);
            }
        });
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBuscarMouseExited(evt);
            }
        });
        getContentPane().add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 370, 140, 130));

        lblActualiza.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        lblActualiza.setText("Actualizar");
        getContentPane().add(lblActualiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, -1));

        lblActualzar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblActualzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        lblActualzar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblActualzar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblActualzarMouseMoved(evt);
            }
        });
        lblActualzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblActualzarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblActualzarMouseExited(evt);
            }
        });
        getContentPane().add(lblActualzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 140, 130));

        lblBorra.setBackground(new java.awt.Color(0, 0, 0));
        lblBorra.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        lblBorra.setText("Borrar");
        getContentPane().add(lblBorra, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, -1, -1));

        lblBorrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/basura.png"))); // NOI18N
        lblBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBorrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblBorrarMouseMoved(evt);
            }
        });
        lblBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBorrarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBorrarMouseExited(evt);
            }
        });
        getContentPane().add(lblBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 140, 130));

        lblMostrarContra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblMostrarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 120, 20));

        lblojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo.png"))); // NOI18N
        lblojo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblojo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblojoMouseClicked(evt);
            }
        });
        getContentPane().add(lblojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 40, 30));

        lblAgrega.setBackground(new java.awt.Color(0, 0, 0));
        lblAgrega.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        lblAgrega.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgrega.setText("Agregar");
        getContentPane().add(lblAgrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 80, -1));

        lblAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carnet-de-identidad.png"))); // NOI18N
        lblAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgregar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblAgregarMouseMoved(evt);
            }
        });
        lblAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAgregarMouseExited(evt);
            }
        });
        getContentPane().add(lblAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 140, 130));

        txtUsuarioLogin.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        txtUsuarioLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuarioLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtUsuarioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 170, -1));

        PasswordFieldUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PasswordFieldUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(PasswordFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título-3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAgregarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseMoved
       lblAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_lblAgregarMouseMoved

    private void lblAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseExited
       lblAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));

    }//GEN-LAST:event_lblAgregarMouseExited

    private void lblojoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblojoMouseClicked
        String txt;
        txt=PasswordFieldUsuario.getText();
        lblMostrarContra.setText(txt);
    }//GEN-LAST:event_lblojoMouseClicked

    private void lblBorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBorrarMouseExited
        lblBorrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_lblBorrarMouseExited

    private void lblBorrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBorrarMouseMoved
        lblBorrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_lblBorrarMouseMoved

    private void lblActualzarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualzarMouseMoved
         lblActualzar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_lblActualzarMouseMoved

    private void lblActualzarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualzarMouseExited
         lblActualzar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_lblActualzarMouseExited

    private void lblBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseExited
         lblBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_lblBuscarMouseExited

    private void lblBuscarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseMoved
         lblBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_lblBuscarMouseMoved

    private void lblAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseClicked
        
        Agregar_Main ag = new Agregar_Main();
        ag.setVisible(true);
    }//GEN-LAST:event_lblAgregarMouseClicked

    private void jlbListarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbListarMouseExited
       jlbListar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jlbListarMouseExited

    private void jlbListarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbListarMouseMoved
        jlbListar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jlbListarMouseMoved

    private void lblBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBorrarMouseClicked
        Borrar_principal borrp = new Borrar_principal();
        borrp.setVisible(true);
    }//GEN-LAST:event_lblBorrarMouseClicked

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        Buscar_Main obj = new Buscar_Main();
        obj.setVisible(true);
    }//GEN-LAST:event_lblBuscarMouseClicked

    private void jlbListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbListarMouseClicked
        listar_main n = new listar_main();
        n.setVisible(true);
        
    }//GEN-LAST:event_jlbListarMouseClicked

    private void lblActualzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualzarMouseClicked
        Actualizar_main obj = new Actualizar_main();
        obj.setVisible(true);
    }//GEN-LAST:event_lblActualzarMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Registro obj = new Registro();
        obj.setVisible(true);
        
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
    ValidarAcceso();
    
    
    

    
    
    
    
        /* lblAgregar.setVisible(true);
                        lblBorrar.setVisible(true);
                        lblActualzar.setVisible(true);
                        jlbListar.setVisible(true);
                        lblBuscar.setVisible(true);
                        lblAgrega.setVisible(true);
                        lblBorra.setVisible(true);
                        lblActualiza.setVisible(true);
                        lblLista.setVisible(true);
                        lblBusca.setVisible(true);*/
        


    
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Hasta pronto emprendedor");
        lblAgregar.setVisible(false);
        lblBorrar.setVisible(false);
        lblActualzar.setVisible(false);
        jlbListar.setVisible(false);
        lblBuscar.setVisible(false);
        lblAgrega.setVisible(false);
        lblBorra.setVisible(false);
        lblActualiza.setVisible(false);
        lblLista.setVisible(false);
        lblBusca.setVisible(false);
        txtUsuarioLogin.setText(null);
        PasswordFieldUsuario.setText(null);
        txtadmin.setText(null);
        ocultaregistro.setVisible(true);
        textodereg.setVisible(true);
        
        
        
        //cierra la sesion
         lblsesionact.setVisible(false);
         lbluseract.setText("");
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        int resp= JOptionPane.showConfirmDialog(this,"¿Estas seguro de cerrar el programa?","Mensaje",JOptionPane.YES_NO_OPTION);
        if (resp==JOptionPane.YES_OPTION) {
            System.exit(0);
        }
        
        
        
        /**/
    }//GEN-LAST:event_jLabel10MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        JOptionPane.showMessageDialog(rootPane,"Álvarez García José Francisco\nJiménez Ramos Miguel\nGarcía Balcazar Uriel Antonio\nParra Mancilla José Ramón\nGrupo: 5IV10\n\nPROYECT:  **TECHNOLOGY COUNSELING**\nBy: Stratton Oakmont Inc.","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPasswordField PasswordFieldUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel jlbListar;
    private javax.swing.JLabel lblActualiza;
    private javax.swing.JLabel lblActualzar;
    private javax.swing.JLabel lblAgrega;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblBorra;
    private javax.swing.JLabel lblBorrar;
    private javax.swing.JLabel lblBusca;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblLista;
    private javax.swing.JLabel lblMostrarContra;
    private javax.swing.JLabel lblojo;
    private javax.swing.JLabel lblsesionact;
    public static javax.swing.JLabel lbluseract;
    private javax.swing.JPanel ocultaregistro;
    private javax.swing.JPanel textodereg;
    public static javax.swing.JTextField txtUsuarioLogin;
    public static javax.swing.JTextField txtadmin;
    // End of variables declaration//GEN-END:variables
}
