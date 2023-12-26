package com.mycompany.libreria;


import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;



public class CProductos {
    int codigo; //Creo que es el ID
    String nombreProducto;
    int cant;
    float precio;
    
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
    
    public void InsertarProducto(JTextField paramNombre, JTextField paramCant, JTextField paramPrecio) {
        setNombreProducto(paramNombre.getText());
        String cantCadena = paramCant.getText(); //Acordarse que el getText() solo trae String
        int cantInt = Integer.parseInt(cantCadena);
        setCant(cantInt);
        String precioCadena = paramPrecio.getText();
        float precioFloat = Float.parseFloat(precioCadena);
        setPrecio(precioFloat);
        
        CConexion objetoConexion = new CConexion();
        
        String consulta = "insert into Productos (nombres, cant, precio) values (?,?,?)";
        
        try {
            CallableStatement cs = objetoConexion.estableceConeccion().prepareCall(consulta);
            cs.setString(1, getNombreProducto());
            cs.setInt(2, getCant());
            cs.setFloat(3, getPrecio());
            
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
        
        paramTablaProductos.setModel(modelo);
        
        sql = "select * from Productos;";
        
        String[] datos = new String[4];
        Statement st;
        
        try {
            st = objetoConexion.estableceConeccion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                
                modelo.addRow(datos);
            }
            paramTablaProductos.setModel(modelo);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar, error: "+ e.toString());
        }
    }
    
    public void SeleccionarProducto (JTable paramTablaProductos, JTextField paramId, JTextField paramNombre, JTextField paramCant, JTextField paramPrecio){
        try{
            int fila = paramTablaProductos.getSelectedRow();
            if (fila >=0) {
                paramId.setText((paramTablaProductos.getValueAt(fila, 0).toString()));
                paramNombre.setText((paramTablaProductos.getValueAt(fila, 1).toString()));
                paramCant.setText((paramTablaProductos.getValueAt(fila, 2).toString()));
                paramPrecio.setText((paramTablaProductos.getValueAt(fila, 3).toString()));
        }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error de seleccion, error:"+ e.toString());
        }    
    }
    
    public void ModificarProducto (JTextField paramId,JTextField paramNombre, JTextField paramCant, JTextField paramPrecio) {
        setCodigo(Integer.parseInt(paramId.getText()));
        setNombreProducto(paramNombre.getText());
        String cantCadena = paramCant.getText();
        int cantInt = Integer.parseInt(cantCadena);
        setCant(cantInt);
        String precioCadena = paramPrecio.getText();
        float precioFloat = Float.parseFloat(precioCadena);
        setPrecio(precioFloat);   
        
        CConexion objetoConexion = new CConexion();
        
        String consulta = "update productos set productos.nombre = ?, productos.cant = ?, productos.precio = ? where productos.id = ?;";
        
        try {
            CallableStatement cs = objetoConexion.estableceConeccion().prepareCall(consulta);
            
            cs.setInt(1, getCodigo());
            cs.setString(2, getNombreProducto());
            cs.setInt(3, getCant());
            cs.setFloat(4, getPrecio());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se Actualizo correctamente el producto");

            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el producto error:"+ e.toString());

            
        }
    }
}
