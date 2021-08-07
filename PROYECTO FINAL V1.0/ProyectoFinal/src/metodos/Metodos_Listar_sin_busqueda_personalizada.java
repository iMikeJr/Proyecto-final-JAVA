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
public class Metodos_Listar_sin_busqueda_personalizada {
     conexion con;
    public Metodos_Listar_sin_busqueda_personalizada(){
    con= new conexion();
    }
    
    //metodo para listar clientes en [][]
    public Object[][] getClienteForPrintinTable(){
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
            PreparedStatement pstm=con.getConnection().prepareStatement("SELECT"+"*"+" FROM cliente "+"ORDER BY idCliente");
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
    }//fin del metodo
    //metodo para listar empleado en [][]
    public Object[][] getEmpleadoForPrintinTable(){
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
            PreparedStatement pstm=con.getConnection().prepareStatement("SELECT"+"*"+" FROM empleado "+"ORDER BY IdEmpleado");
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
    //metodo para listar proyectos [][]
     public Object[][] getProyectoForPrintinTable(){
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
            PreparedStatement pstm=con.getConnection().prepareStatement("SELECT"+"*"+" FROM proyectos "+"ORDER BY IdProyectos");
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
     //metodo para listar servicios
     public Object[][] getServiceForPrintinTable(){
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
            PreparedStatement pstm=con.getConnection().prepareStatement("SELECT"+"*"+" FROM servicio "+"ORDER BY idServicio");
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
     //fin del metodo
    
}
