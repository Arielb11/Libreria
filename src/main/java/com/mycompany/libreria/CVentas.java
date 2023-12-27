package com.mycompany.libreria;

import java.sql.CallableStatement;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class CVentas {
    int id;
    String fecha;
    float total;

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
    
    public void InsertarVenta(JTextField fecha, JTextField total) {
        setFecha(fecha.getText());
        setTotal(Float.parseFloat(total.getText()));
        
        CConexion objetoConexion = new CConexion();
        
        String consulta = "INSERT INTO Ventas (fecha, total) VALUES (?,?)";
        
        try {
            CallableStatement cs = objetoConexion.estableceConeccion().prepareCall(consulta);
            cs.setString(1, getFecha());
            cs.setFloat(2, getTotal());
            
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se inserto correctamente la venta");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo ingresar la venta, error: "+ e.toString());
        }
    }
}
