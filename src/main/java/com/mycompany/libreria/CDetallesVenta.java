package com.mycompany.libreria;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class CDetallesVenta {
    int id;
    int id_producto;
    int cant_producto;
    float subtotal;
    int id_venta;

    CallableStatement cs;
    PreparedStatement st;
    ResultSet rs;
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
            cs = objetoConexion.getInstancia().estableceConeccion().prepareCall(sql);
            cs.setInt(1, dv.getId_producto());
            cs.setInt(2, dv.getCant_producto());
            cs.setFloat(3, dv.getSubtotal());
            cs.setInt(4, dv.getId_venta());
            
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo ingresar el detalle de la venta, error: "+ e.toString());
        } finally {
            objetoConexion.CloseConnections(cs);
            objetoConexion.getInstancia().releaseConn();
        }
    }
    
    public void BuscarVenta (JTable paramTablaDetalles, JTextField id){
        CConexion objetoConexion = new CConexion();
        st = null;
        rs = null;
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        
        paramTablaDetalles.setRowSorter(OrdenarTabla);
        
        modelo.addColumn("ID Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Subtotal");
        
        paramTablaDetalles.setModel(modelo);
        
        String sql = "SELECT productos.nombres, detalle_venta.cant_producto, detalle_venta.subtotal FROM detalle_venta "
                + "INNER JOIN productos ON (productos.id = detalle_venta.id_producto) "
                + "WHERE detalle_venta.id_venta = ?";
        
        String[] datos = new String[3];
        
        try {
            st = objetoConexion.getInstancia().estableceConeccion().prepareStatement(sql);
            st.setInt(1, Integer.parseInt(id.getText()));
            rs = st.executeQuery();
            
            if (rs != null){
                while (rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                
                modelo.addRow(datos);
                }
                paramTablaDetalles.setModel(modelo);
            }
            
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            objetoConexion.CloseConnections(rs, st);
            objetoConexion.getInstancia().releaseConn();
        }
    }
}
