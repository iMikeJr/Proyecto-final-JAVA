/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.sql.*;

/**
 *
 * @author eduar
 */
public class conexion {
     static String bd="proyecto";
    static String login="root";
    static String password="";
    static String url="jdbc:mysql://localhost:3306/"+bd;
    Connection conn = null;
    
    public conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url,login,password);
            if (conn!=null) {
                System.out.println("Conexion a la base de datos"+bd+"listo");
            }
        }
        catch(SQLException | ClassNotFoundException e)
        {
            System.out.println(e);
            System.out.println("Error en la conexion de la base de datos"+bd);
        }
    }
    public Connection getConnection(){
        return conn;
    }
    public void desconectar(){
        conn=null;
    }
    
}
