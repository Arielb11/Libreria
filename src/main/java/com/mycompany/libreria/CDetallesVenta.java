package com.mycompany.libreria;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class CDetallesVenta {
    int id;
    int id_producto;
    int cant_producto;
    float subtotal;
    int id_venta;

    CallableStatement cs;
    int r = 0;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCant_producto() {
        return cant_producto;
    }

    public void setCant_producto(int cant_producto) {
        this.cant_producto = cant_producto;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }
    public void GuardarDetalleVentas (CDetallesVenta dv){
        CConexion objetoConexion = new CConexion();
        String sql = "INSERT INTO detalle_venta (id_producto, cant_producto, subtotal, id_venta) VALUES (?,?,?,?)";
        
        try {
            cs = objetoConexion.estableceConeccion().prepareCall(sql);
            cs.setInt(1, dv.getId_producto());
            cs.setInt(2, dv.getCant_producto());
            cs.setFloat(3, dv.getSubtotal());
            cs.setInt(4, dv.getId_venta());
            
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo ingresar el detalle de la venta, error: "+ e.toString());
        }
    }
    
}
