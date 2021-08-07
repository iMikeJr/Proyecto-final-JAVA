/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RootPaneContainer;

/**
 *
 * @author eduar
 */
public class metodos {
    conexion con;
    public metodos(){
    con= new conexion();
    }
    
    public void nuevocliente(String idCliente,String Nom, String Telefono, String Email, String edad){
             String SQL=" INSERT INTO " + " cliente(idCliente,Nombre,Telefono,E_Mail,edad)"+" values(?,?,?,?,?)";
        
            try{
                PreparedStatement pstm1=con.getConnection().prepareStatement(SQL);
                pstm1.setString(1, idCliente);
                pstm1.setString(2, Nom);
                pstm1.setString(3, Telefono);
                pstm1.setString(4, Email);
                pstm1.setString(5, edad);
                pstm1.execute();
                
                JOptionPane.showMessageDialog(null,"Se agrego con exito el registro");
                
            }
            catch(SQLException e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null,"Error al agregar registro");
                
            }   
    }
    //metodo para agregar un servicio
    public void nuevoServicio(String idSerivce,String variante, String FechaFinal , String FechaInicio, String ID_Empleado,String Id_cliente, String Id_proyecto){
             String SQL=" INSERT INTO " + " servicio(idServicio,Variante,Fecha_Fin,Fecha_Inicio,Empleado_idEmpleado,Cliente_idCliente,Proyectos_IdProyectos)"+" values(?,?,?,?,?,?,?)";
        
            try{
                PreparedStatement pstm1=con.getConnection().prepareStatement(SQL);
                pstm1.setString(1, idSerivce);
                pstm1.setString(2, variante);
                pstm1.setString(3, FechaFinal);
                pstm1.setString(4, FechaInicio);
                pstm1.setString(5, ID_Empleado);
                pstm1.setString(6, Id_cliente);
                pstm1.setString(7, Id_proyecto);
                pstm1.execute();
                
                JOptionPane.showMessageDialog(null,"Se agrego con exito el registro");
                
            }
            catch(SQLException e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null,"Error al agregar registro");
                
            }   
    }
    //fin del metodo
    
    //metodo para agregar un nuevo empleado
    public void nuevoEmpleado(String idEmpleado,String Nom, String edad, String rfc, String Direccion,String Telefono, String e_mail){
             String SQL=" INSERT INTO " + " empleado(idEmpleado,Nombre,Edad,Rfc,Direccion,Telefono,E_mail)"+" values(?,?,?,?,?,?,?)";
        
            try{
                PreparedStatement pstm1=con.getConnection().prepareStatement(SQL);
                pstm1.setString(1, idEmpleado);
                pstm1.setString(2, Nom);
                pstm1.setString(3, edad);
                pstm1.setString(4, rfc);
                pstm1.setString(5, Direccion);
                pstm1.setString(6, Telefono);
                pstm1.setString(7, e_mail);
                pstm1.execute();
                
                JOptionPane.showMessageDialog(null,"Se agrego con exito el registro");
                
            }
            catch(SQLException e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null,"Error al agregar registro");
                
            }   
    }
    
    //este es el metodo para agregar un proyecto
    public void nuevoProyecto(String idProyectos,String Tiempo, String Fecha,String Variante,String proyectodesc){
             String SQL=" INSERT INTO " + " proyectos(idProyectos,Tiempo,Fecha_Inicio,Variante,ProyectoDesc)"+" values(?,?,?,?,?)";
        
            try{
                PreparedStatement pstm1=con.getConnection().prepareStatement(SQL);
                pstm1.setString(1, idProyectos);
                pstm1.setString(2, Tiempo);
                pstm1.setString(3, Fecha);
                pstm1.setString(4, Variante);
                pstm1.setString(5, proyectodesc);
                pstm1.execute();
                
                JOptionPane.showMessageDialog(null,"Se agrego con exito el registro");
                
            }
            catch(SQLException e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null,"Error al agregar registro");
                
            }   
    }
   ////
   //Metodo para buscar cliente sin imprimir en la tabla
    public String[] getBuscarCliente(String idCliente)
    {
        String datos[];
        datos = new String[5];
        String SQL ="SELECT * FROM cliente WHERE idCliente like "+idCliente;
        metodos p=new metodos();
        try
        {
            PreparedStatement pstm=p.con.getConnection().prepareStatement(SQL);
            ResultSet res = pstm.executeQuery();
            try
            {
                if(res.next()==true)
                {
                    datos[0]=res.getString("idCliente");
                    datos[1]=res.getString("Nombre");
                    datos[2]=res.getString("Telefono");
                    datos[3]=res.getString("E_Mail");
                    datos[4]=res.getString("Edad");
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"El registro no se encuentra...");
                }
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error...");
                Logger.getLogger(metodos.class.getName()).log(Level.SEVERE,null,ex);
            } 
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return datos;
    }
    
    //Metodo para buscar Empleado sin imprimir en la tabla
    public String[] getBuscarEmpleado(String idEmpleado)
    {
         String datos[];
        datos = new String[7];
        String SQL ="SELECT * FROM empleado WHERE idEmpleado like "+idEmpleado;
        metodos p=new metodos();
        try
        {
            PreparedStatement pstm=p.con.getConnection().prepareStatement(SQL);
            ResultSet res = pstm.executeQuery();
            try
            {
                if(res.next()==true)
                {
                    datos[0]=res.getString("idEmpleado");
                    datos[1]=res.getString("Nombre");
                    datos[2]=res.getString("Edad");
                    datos[3]=res.getString("Rfc");
                    datos[4]=res.getString("Direccion");
                    datos[5]=res.getString("Telefono");
                    datos[6]=res.getString("E_mail");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"El registro no se encuentra...");
                }
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error...");
                Logger.getLogger(metodos.class.getName()).log(Level.SEVERE,null,ex);
            } 
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return datos;
    }
    //metodos para buscar (en una dimension para imprimirlo en un txt)
     public String[] getBuscarProyecto(String idProyec)
    {
         String datos[];
        datos = new String[5];
        String SQL ="SELECT * FROM proyectos WHERE idProyectos like "+idProyec;
        metodos p=new metodos();
        try
        {
            PreparedStatement pstm=p.con.getConnection().prepareStatement(SQL);
            ResultSet res = pstm.executeQuery();
            try
            {
                if(res.next()==true)
                {
                    datos[0]=res.getString("idProyectos");
                    datos[1]=res.getString("Tiempo");
                    datos[2]=res.getString("Fecha_Inicio");
                    datos[3]=res.getString("Variante");
                    datos[4]=res.getString("ProyectoDesc");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"El registro no se encuentra...");
                }
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error...");
                Logger.getLogger(metodos.class.getName()).log(Level.SEVERE,null,ex);
            } 
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return datos;
    }
    //metodo para buscar servicios en un arreglo 1D
      public String[] getBuscarServicio(String idService)
    {
         String datos[];
        datos = new String[7];
        String SQL ="SELECT * FROM servicio WHERE idServicio like "+idService;
        metodos p=new metodos();
        try
        {
            PreparedStatement pstm=p.con.getConnection().prepareStatement(SQL);
            ResultSet res = pstm.executeQuery();
            try
            {
                if(res.next()==true)
                {
                    datos[0]=res.getString("idServicio");
                    datos[1]=res.getString("Variante");
                    datos[2]=res.getString("Fecha_Fin");
                    datos[3]=res.getString("Fecha_Inicio");
                    datos[4]=res.getString("Empleado_idEmpleado");
                    datos[5]=res.getString("Cliente_idCliente");
                    datos[6]=res.getString("Proyectos_idProyectos");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"El registro no se encuentra...");
                }
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error...");
                Logger.getLogger(metodos.class.getName()).log(Level.SEVERE,null,ex);
            } 
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return datos;
    }
    /**
     
     
     
     
     
     
     
     
     */
    
    //metodo para buscar clientes para imprimirlos en la matriz
     public Object[][] getClienteForPrintinTable(String cod){
        int registros=0;
        try{
            PreparedStatement pstm=con.getConnection().prepareStatement("SELECT count(1) as total FROM cliente");
            ResultSet res=pstm.executeQuery();
            res.next();
            registros=res.getInt("total");
            res.close();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        Object[][] data = new Object[registros][5];
        try{
            PreparedStatement pstm=con.getConnection().prepareStatement("SELECT"+"*"+" FROM cliente "+"WHERE IdCliente like "+cod);
            ResultSet res = pstm.executeQuery();
            int i=0;
            String a,b,c,d,e;
            while(res.next()==true){
                a=res.getString("IdCliente");
                b=res.getString("Nombre");
                c=res.getString("Telefono");
                d=res.getString("E_Mail");
                e=res.getString("Edad");
          
                data[i][0]=a;
                data[i][1]=b;
                data[i][2]=c;
                data[i][3]=d;
                data[i][4]=e;
                i++; 
            }
            res.close();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return data;
    }
    //fin del metodo
     //metodo para buscar empleado para que se usarlo en la tabla
      public Object[][] getEmpleadoForPrintinTable(String codEmployer){
        int registros=0;
        try{
            PreparedStatement pstm=con.getConnection().prepareStatement("SELECT count(1) as total FROM empleado");
            ResultSet res=pstm.executeQuery();
            res.next();
            registros=res.getInt("total");
            res.close();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        Object[][] data = new Object[registros][7];
        try{
            PreparedStatement pstm=con.getConnection().prepareStatement("SELECT"+"*"+" FROM empleado "+"WHERE IdEmpleado like "+codEmployer);
            ResultSet res = pstm.executeQuery();
            int i=0;
            String a,b,c,d,e,f,g;
            while(res.next()==true){
                a=res.getString("IdEmpleado");
                b=res.getString("Nombre");
                c=res.getString("Edad");
                d=res.getString("Rfc");
                e=res.getString("Direccion");
                f=res.getString("Telefono");
                g=res.getString("E_Mail");
                
                
          
                data[i][0]=a;
                data[i][1]=b;
                data[i][2]=c;
                data[i][3]=d;
                data[i][4]=e;
                data[i][5]=f;
                data[i][6]=g;
                i++; 
            }
            res.close();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return data;
    }
     //fin del metodo
      //metodo para agregar proyecto en tabla 
      public Object[][] getProyectoForPrintinTable(String codProyect){
        int registros=0;
        try{
            PreparedStatement pstm=con.getConnection().prepareStatement("SELECT count(1) as total FROM proyectos");
            ResultSet res=pstm.executeQuery();
            res.next();
            registros=res.getInt("total");
            res.close();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        Object[][] data = new Object[registros][5];
        try{
            PreparedStatement pstm=con.getConnection().prepareStatement("SELECT"+"*"+" FROM proyectos "+"WHERE idProyectos like "+codProyect);
            ResultSet res = pstm.executeQuery();
            int i=0;
            String a,b,c,d,e,f,g;
            while(res.next()==true){
                a=res.getString("IdProyectos");
                b=res.getString("Tiempo");
                c=res.getString("Fecha_Inicio");
                d=res.getString("Variante");
                e=res.getString("ProyectoDesc");
                          
                data[i][0]=a;
                data[i][1]=b;
                data[i][2]=c;
                data[i][3]=d;
                data[i][4]=e;
                i++; 
            }
            res.close();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return data;
    }
      //fin del metodo
      //metodo para buscar un servicio e imprimirlo en la tabla
       public Object[][] getServiceForPrintinTable(String codServicio){
        int registros=0;
        try{
            PreparedStatement pstm=con.getConnection().prepareStatement("SELECT count(1) as total FROM servicio");
            ResultSet res=pstm.executeQuery();
            res.next();
            registros=res.getInt("total");
            res.close();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        Object[][] data = new Object[registros][7];
        try{
            PreparedStatement pstm=con.getConnection().prepareStatement("SELECT"+"*"+" FROM servicio "+"WHERE idServicio like "+codServicio);
            ResultSet res = pstm.executeQuery(); 
            int i=0;
            String a,b,c,d,e,f,g;
            while(res.next()==true){
                a=res.getString("idServicio");
                b=res.getString("Variante");
                c=res.getString("Fecha_Fin");
                d=res.getString("Fecha_Inicio");
                e=res.getString("Empleado_idEmpleado");
                f=res.getString("Cliente_idCliente");
                g=res.getString("Proyectos_idProyectos");
                          
                data[i][0]=a;
                data[i][1]=b;
                data[i][2]=c;
                data[i][3]=d;
                data[i][4]=e;
                data[i][5]=f;
                data[i][6]=g;
                i++; 
            }
            res.close();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return data;
    }
     //metodo borrar cliente;
    public void BorrarCliente(String idCliente)
    {
        try
        {
           
            PreparedStatement pstm1 = con.getConnection().prepareStatement("DELETE FROM cliente"+" WHERE idCliente='"+idCliente+"'");
            pstm1.execute();
            JOptionPane.showMessageDialog(null,"El registro se borró con éxito!");
        }
        catch(SQLException e)
        {
           System.out.println(e);
           JOptionPane.showMessageDialog(null,"No se logró borrar el registro con éxito");
        }
    }
    
    //Metodo para borrar un empleado
    public void BorrarEmpleado(String idEmpleado)
    {
      try
      {
        
          PreparedStatement pstm2 = con.getConnection().prepareStatement("DELETE FROM empleado"+" WHERE idEmpleado='"+"'");
          pstm2.execute();
          JOptionPane.showMessageDialog(null,"El registro se borró con éxito");
      }
      catch(SQLException e)
      {
          System.out.println(e);
          JOptionPane.showMessageDialog(null,"No se logró borrar el registro con éxito");
      }
    }
    
    //Metodo para borrar un proyecto
    public void BorrarProyecto(String idProyectos)
    {
        try
        {
            PreparedStatement pstm2 = con.getConnection().prepareStatement("DELETE FROM proyectos"+" WHERE idProyectos='"+idProyectos+"'");
            pstm2.execute();
            JOptionPane.showMessageDialog(null,"se logró borrar el registro con éxito");
        }
        catch(SQLException e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"No se logró borrar el registro con éxito");
        }
    }
    
    //Metodo para borrar servicio
    public void BorrarServicio(String idService)
    {
        try
        {
            PreparedStatement pstm2 = con.getConnection().prepareStatement("DELETE FROM servicio"+" WHERE idServicio='"+idService+"'");
            pstm2.execute();
            JOptionPane.showMessageDialog(null,"se logró borrar el registro con éxito");
        }
        catch(SQLException e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"No se logró borrar el registro con éxito"); 
        }
    }
    
    
    
    
    
    
    ///////////////////////////////////////////////////////////actualizar/////////////////////////////////////////////////////////////////////////////////////7
     public void ActualizaProyectos( String idPro,String Tiemp,String Fecha_ini,String emplead,String Variant,String ProyectoDes)
     {
            String SQL="UPDATE proyectos set"+" IdProyectos='"+ idPro + 
            "',Tiempo='"+ Tiemp +"',Fecha_Inicio='"+Fecha_ini+"',Variante='"+Variant+"',ProyectoDesc='"+ProyectoDes+"'"+"WHERE IdProyectos='"+idPro+"'";


        try{
            PreparedStatement pstm1=con.getConnection().prepareStatement(SQL);
            pstm1.execute();
            JOptionPane.showMessageDialog(null, "Se actualizó el registro proyectos con éxito.");
        }
        catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al actualizar datos del proyecto");
        }
    }
     
     
    //metodo para actualizar clientes
      public void ActualizaClientes( String idcliente,String Nombre,String Telefono,String email,String edad)
     {
            String SQL="UPDATE cliente set"+" idCliente='"+ idcliente + 
            "',Nombre='"+ Nombre +"',Telefono='"+Telefono+"',E_Mail='"+email+"',Edad='"+edad+"'"+"WHERE idCliente='"+idcliente+"'";


        try{
            PreparedStatement pstm1=con.getConnection().prepareStatement(SQL);
            pstm1.execute();
            JOptionPane.showMessageDialog(null, "Se actualizó el registro de clientes con éxito.");
        }
        catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al actualizar datos de los clientes");
        }
    }
    
      
   
     //metodo para actualizar empleados
      
      public void ActualizaEmpleados( String idEmpleado,String Nombre,String Edad,String RFC,String Direccion, String telefono, String E_Mail)
     {
            String SQL="UPDATE empleado set"+" idEmpleado='"+ idEmpleado + 
            "',Nombre='"+ Nombre +"',Edad='"+Edad+"',Rfc='"+RFC+"',Direccion='"+Direccion+"',Telefono='"+telefono+"',E_Mail='"+E_Mail+"'"+"WHERE IdEmpleado='"+idEmpleado+"'";


        try{
            PreparedStatement pstm1=con.getConnection().prepareStatement(SQL);
            pstm1.execute();
            JOptionPane.showMessageDialog(null, "Se actualizó el registro de empleados con éxito.");
        }
        catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al actualizar datos de los empleados");
        }
    }
      
      
      
      //metodo para actualizar servicios
      
      
       public void ActualizaServicios( String idservicio,String Variante,String Fecha_Fin,String Fecha_ini,String id_empleado, String id_cliente, String id_proyecto)
     {
            String SQL="UPDATE servicio set"+" idServicio='"+ idservicio + 
            "',Variante='"+ Variante +"',Fecha_Fin='"+Fecha_Fin+"',Fecha_Inicio='"+Fecha_ini+"',Empleado_idEmpleado='"+id_empleado+"',Cliente_idCliente='"+id_cliente+"',Proyectos_idProyectos='"+id_proyecto+"'"+"WHERE idServicio='"+idservicio+"'";


        try{
            PreparedStatement pstm1=con.getConnection().prepareStatement(SQL);
            pstm1.execute();
            JOptionPane.showMessageDialog(null, "Se actualizó el registro de los servicios con éxito.");
        }
        catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al actualizar datos de servicios");
        }
    }
      
     




    }
