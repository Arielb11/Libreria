package com.mycompany.libreria;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.CallableStatement;


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
    
}
