/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreria;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class CConexion {
    Connection conectar = null;
    
    // Estos datos son de MySql
    String usuario ="root";
    String contrasenia ="1234";
    String bd ="bdliberia"; //Nombre base de datos
    String ip ="localhost";
    String puerto ="3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConeccion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar, error: "+ e.toString());    
        }
        return conectar;
    }
}
