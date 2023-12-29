package com.mycompany.libreria;

import java.sql.CallableStatement;
import java.sql.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


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
            
            
            JOptionPane.showMessageDialog(null, "Se guardo correctamente la venta");
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No se pudo guardar la venta error:"+ e.toString());
 
        }
        return r;
    }
    
    public int GuardarDetalleVentas (CDetallesVenta dv){
        CConexion objetoConexion = new CConexion();
        String sql = "INSERT INTO detalle_venta(id_producto, cant_producto, subtotal, id_venta) VALUES (?,?,?,?)";
        
        try {
            cs = objetoConexion.estableceConeccion().prepareCall(sql);
            cs.setInt(1, dv.getId_producto());
            cs.setInt(2, dv.getCant_producto());
            cs.setFloat(3, dv.getSubtotal());
            cs.setInt(4, dv.getId_venta());
            
            r=cs.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo ingresar los detalles de la venta, error: "+ e.toString());
        }
        return r;
    }
    
}
