package com.mycompany.libreria;

import java.awt.List;
import java.sql.CallableStatement;
import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedList;
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
        } finally {
            objetoConexion.CloseConnections(rs, cs);
            objetoConexion.getInstancia().releaseConn();
        }
        return id;
    }
    
    public int GuardarVentas (CVentas v){
        CVentas ventas = new CVentas();
        CConexion objetoConexion = new CConexion();
        String sql = "INSERT INTO Ventas (fecha, numeroSerie, monto) VALUES (?,?,?)";
        
        try {
            cs = objetoConexion.getInstancia().estableceConeccion().prepareCall(sql);
            cs.setString(1, v.getFecha());
            cs.setString(2, v.getNumeroSerie());
            cs.setFloat(3, v.getTotal());
            
            r=cs.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar la venta, error:"+ e.toString());
        } finally {
            objetoConexion.CloseConnections(cs);
            objetoConexion.getInstancia().releaseConn();
        }
        return r;
    }
    
    public boolean ActualizarStock(int cant, int cod){
        CConexion objetoConexion = new CConexion();
        String sql = "UPDATE productos SET cant = ? WHERE id = ?";
        
        try {
            CallableStatement cs = objetoConexion.getInstancia().estableceConeccion().prepareCall(sql);
            
            cs.setInt(1,cant);
            cs.setInt(2, cod);
            cs.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el stock, error:"+ e.toString());
            return false;
        } finally {
            objetoConexion.CloseConnections(cs);
            objetoConexion.getInstancia().releaseConn();
        }

    }
    
    public void MostrarVentas (JTable paramTablaVentas, JTextField fecha){
        CConexion objetoConexion = new CConexion();
        PreparedStatement st = null;
        ResultSet rs = null;
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        
        paramTablaVentas.setRowSorter(OrdenarTabla);
        
        modelo.addColumn("ID");
        modelo.addColumn("Fecha");
        modelo.addColumn("Monto");
        
        paramTablaVentas.setModel(modelo);
        
        String sql = "SELECT ventas.id, ventas.fecha, ventas.monto FROM ventas WHERE ventas.fecha LIKE ?";

        String[] datos = new String[3];
        
        try {
            st = objetoConexion.getInstancia().estableceConeccion().prepareStatement(sql);
            st.setString(1, fecha.getText()+"%");
            rs = st.executeQuery();
            
            if (rs != null){
                while (rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                
                modelo.addRow(datos);
                }
                paramTablaVentas.setModel(modelo);
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            objetoConexion.CloseConnections(rs, st);
            objetoConexion.getInstancia().releaseConn();
        }
    }
 
}
