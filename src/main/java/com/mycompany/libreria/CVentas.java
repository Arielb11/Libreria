package com.mycompany.libreria;

import java.awt.List;
import java.sql.CallableStatement;
import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class CVentas {
    int id;
    String fecha;
    String numeroSerie;
    float total;

    CallableStatement cs;
    ResultSet rs;
    int r = 0;
    
    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
    public int getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    public int IdVentas(){
        int id = 0;
        CConexion objetoConexion = new CConexion();
        String sql = "SELECT MAX(id) FROM ventas";
        
        try {
            Connection con;
            con = objetoConexion.estableceConeccion();
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if (rs.next()){
                id = rs.getInt(1);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar el maximo ID, error: "+ e.toString());
        }
        return id;
    }
    
    public int GuardarVentas (CVentas v){
        CVentas ventas = new CVentas();
        CConexion objetoConexion = new CConexion();
        String sql = "INSERT INTO Ventas (fecha, numeroSerie, monto) VALUES (?,?,?)";
        
        try {
            cs = objetoConexion.estableceConeccion().prepareCall(sql);
            cs.setString(1, v.getFecha());
            cs.setString(2, v.getNumeroSerie());
            cs.setFloat(3, v.getTotal());
            
            r=cs.executeUpdate();
        } catch (Exception e) {
 
        }
        return r;
    }
    
    public boolean ActualizarStock(int cant, int cod){
        CConexion objetoConexion = new CConexion();
        String sql = "UPDATE productos SET cant = ? WHERE id = ?";
        
        try {
            CallableStatement cs = objetoConexion.estableceConeccion().prepareCall(sql);
            
            cs.setInt(1,cant);
            cs.setInt(2, cod);
            cs.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el stock, error:"+ e.toString());
            return false;
        }
    }
    
    public CVentas buscarPorFecha (String fecha){
        CVentas cv = null;
        CConexion objetoConexion = new CConexion();
        PreparedStatement st;
        ResultSet rs;
        String sql = "SELECT ventas.id, ventas.fecha, ventas.monto FROM ventas WHERE ventas.fecha = \"2023/12/29\";";
        
        try {
            st = objetoConexion.estableceConeccion().prepareStatement(sql);
            st.setString(1, fecha);
            rs = st.executeQuery();
            
            if (rs != null && rs.next()){
                cv = new CVentas();
                cv.setId(rs.getInt("id"));
                cv.setFecha(rs.getString("fecha"));
                cv.setTotal(rs.getFloat("monto"));
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return cv;
    }
}
