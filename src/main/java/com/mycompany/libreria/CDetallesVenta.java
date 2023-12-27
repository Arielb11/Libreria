package com.mycompany.libreria;

import java.sql.CallableStatement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class CDetallesVenta {
    int id;
    int id_producto;
    int cant_producto;
    float subtotal;
    int id_venta;

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
    
    public void IngresarDetalles (JTextField id_producto, JTextField cant_producto, JTextField subtotal, JTextField id_venta) {
        setId_producto(Integer.parseInt(id_producto.getText()));
        setCant_producto(Integer.parseInt(cant_producto.getText()));
        setSubtotal(Float.parseFloat(subtotal.getText()));
        setId_venta(Integer.parseInt(id_venta.getText()));
        
        CConexion objetoConexion = new CConexion();
        
        String consulta = "INSERT INTO Detalle_venta (id_producto, cant_producto, subtotal, id_venta) VALUES (?,?,?,?)";
        
        try {
            CallableStatement cs = objetoConexion.estableceConeccion().prepareCall(consulta);
            cs.setInt(1, getId_producto());
            cs.setInt(2, getCant_producto());
            cs.setFloat(3, getSubtotal());
            cs.setInt(4, getId_venta());
            
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se inserto correctamente el detalle de la venta");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo ingresar la venta, error: "+ e.toString());
        }
    }
    
}
