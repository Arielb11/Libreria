package com.mycompany.libreria;


import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;



public class CProductos {
    int codigo; //Creo que es el ID
    String nombreProducto;
    int cant;
    float precio;
    String codBarra;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }
    
    public void InsertarProducto(JTextField paramNombre, JTextField paramCant, JTextField paramPrecio, JTextField paramCodBarra) {
        setNombreProducto(paramNombre.getText());
        setCant(Integer.parseInt(paramCant.getText()));
        setPrecio(Float.parseFloat(paramPrecio.getText()));
        setCodBarra(paramCodBarra.getText());
        
        CConexion objetoConexion = new CConexion();
        
        String consulta = "INSERT INTO Productos (nombres, cant, precio, codBarra) VALUES (?,?,?,?)";
        
        try {
            CallableStatement cs = objetoConexion.estableceConeccion().prepareCall(consulta);
            cs.setString(1, getNombreProducto());
            cs.setInt(2, getCant());
            cs.setFloat(3, getPrecio());
            cs.setString(4, getCodBarra());

            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se inserto correctamente el producto");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo ingresar el producto, error: "+ e.toString());
        }
    }
    
    public void MostrarProductos (JTable paramTablaProductos){
        CConexion objetoConexion = new CConexion();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        
        paramTablaProductos.setRowSorter(OrdenarTabla);
        
        String sql = "";
        
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        modelo.addColumn("codBarra");
        

        
        paramTablaProductos.setModel(modelo);
        
        sql = "select * from Productos;";
        
        String[] datos = new String[5];
        Statement st;
        
        try {
            st = objetoConexion.estableceConeccion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                
                modelo.addRow(datos);
            }
            paramTablaProductos.setModel(modelo);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar, error: "+ e.toString());
        }
    }
    
    public void SeleccionarProducto (JTable paramTablaProductos, JTextField paramId, JTextField paramNombre, JTextField paramCant, JTextField paramPrecio, JTextField paramCodBarra){
        try{
            int fila = paramTablaProductos.getSelectedRow();
            if (fila >=0) {
                paramId.setText((paramTablaProductos.getValueAt(fila, 0).toString()));
                paramNombre.setText((paramTablaProductos.getValueAt(fila, 1).toString()));
                paramCant.setText((paramTablaProductos.getValueAt(fila, 2).toString()));
                paramPrecio.setText((paramTablaProductos.getValueAt(fila, 3).toString()));
                paramCodBarra.setText((paramTablaProductos.getValueAt(fila, 4).toString()));
        }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error de seleccion, error:"+ e.toString());
        }    
    }
    
    public void ModificarProducto (JTextField paramId, JTextField paramNombre, JTextField paramCant, JTextField paramPrecio, JTextField paramCodBarra) {
        setCodigo(Integer.parseInt(paramId.getText()));
        setNombreProducto(paramNombre.getText());
        setCant(Integer.parseInt(paramCant.getText()));
        setPrecio(Float.parseFloat(paramPrecio.getText())); 
        setCodBarra(paramCodBarra.getText());
        
        CConexion objetoConexion = new CConexion();
        
        String consulta = "UPDATE productos SET productos.nombres = ?, productos.cant = ?, productos.precio = ?, productos.codBarra = ? WHERE productos.id = ?;";
        
        try {
            CallableStatement cs = objetoConexion.estableceConeccion().prepareCall(consulta);
            
            cs.setString(1, getNombreProducto());
            cs.setInt(2, getCant());
            cs.setFloat(3, getPrecio());
            cs.setString(4, getCodBarra());
            cs.setInt(5, getCodigo());
            
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se Actualizo correctamente el producto");

            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el producto error:"+ e.toString());
        }
    }
    
    public void EliminarProducto(JTextField paramCodigo){
        
        setCodigo(Integer.parseInt(paramCodigo.getText()));
        
        CConexion objetoConexion = new CConexion();
        
        String consulta = "DELETE FROM productos WHERE productos.id = ?;";
        
        try {
            CallableStatement cs = objetoConexion.estableceConeccion().prepareCall(consulta);
            cs.setInt(1, getCodigo());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se Elimino correctamente el producto");

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el producto, error:"+ e.toString());

        }
    }
    
    public CProductos listarID(int id){
        CProductos p = new CProductos();
        CConexion objetoConexion = new CConexion();
        
        String consulta = "SELECT * FROM productos WHERE productos.id=?";
        try {
            CallableStatement cs = objetoConexion.estableceConeccion().prepareCall(consulta);
            cs.setInt(1, id);
            ResultSet rs = cs.executeQuery();
            while (rs.next()){
                p.setCodigo(rs.getInt(1));
                p.setNombreProducto(rs.getString(2));
                p.setCant(rs.getInt(3));
                p.setPrecio(rs.getFloat(4));
            }
        } catch (Exception e) {
            
        }
        return p;
    }
}
