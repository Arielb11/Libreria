/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreria;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class CConexion {
    Connection conectar = null;
    private static CConexion instancia;
    private int conectados=0;
    
    // Estos datos son de MySql
    String usuario ="root";
    String contrasenia ="1234";
    String bd ="bdliberia"; //Nombre base de datos
    String ip ="localhost";
    String puerto ="3306";
    
	
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public CConexion getInstancia() {
	if (instancia == null) {
            instancia = new CConexion();
	}
	return instancia;
    }
    public Connection estableceConeccion(){
        try {
            if (conectar==null || conectar.isClosed()){
                Class.forName("com.mysql.jdbc.Driver");
                conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
                conectados=0;
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar, error: "+ e.toString());    
        }
        conectados++;
        return conectar;
    }
    public void releaseConn() {
	conectados--;
	try {
            if (conectados<=0) {
		conectar.close();
            }
	} catch (SQLException e) {
            e.printStackTrace();
	}
    }    
    public void CloseConnections(CallableStatement stmt) {
        try {
            if(stmt != null) {
		stmt.close();
            }
	} catch(SQLException e) {
            e.printStackTrace();
        }
    }
    public void CloseConnections(ResultSet rs, Statement stmt) {
	try {
            if(stmt != null) {
                stmt.close();
            }
            if(rs != null) {
		rs.close();
            }
	}catch(SQLException e) {
            e.printStackTrace();
	}
    }
}
