package com.mycompany.libreria;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormVentas extends javax.swing.JFrame {

    CProductos p = new CProductos();
    CVentas v = new CVentas();
    CDetallesVenta dv = new CDetallesVenta();
    int idp;
    int cant;
    float tpagar;
    float pre;
    int item;
    
    public FormVentas() {
        initComponents();
        item = 0;
        this.fecha();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBuscarProd = new javax.swing.JLabel();
        txtBuscarProd = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        txtCantidad = new javax.swing.JSpinner();
        lblCant = new javax.swing.JLabel();
        btnVenta = new javax.swing.JButton();
        txtFecha = new javax.swing.JTextField();
        lblVenta = new javax.swing.JLabel();
        txtTotalAPagar = new javax.swing.JTextField();
        lblTotalAPagar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblBuscarProd.setText("Cod Producto");

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro", "Codigo", "Nombre", "Cantidad", "Precio", "Total"
            }
        ));
        jScrollPane1.setViewportView(tablaDetalle);

        lblCant.setText("Cantidad:");

        btnVenta.setText("Generar Venta");
        btnVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentaMouseClicked(evt);
            }
        });

        lblVenta.setText("Venta");

        lblTotalAPagar.setText("Total a pagar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBuscarProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(104, 104, 104)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74)
                                        .addComponent(lblCant)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(btnBuscar)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(btnVenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotalAPagar)
                .addGap(32, 32, 32)
                .addComponent(txtTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarProd)
                    .addComponent(txtBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(lblCant)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalAPagar))
                .addGap(8, 8, 8)
                .addComponent(btnVenta)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        buscarProducto();
        calcularTotal();
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseClicked
        guardarVenta();
        guardarDetalle();
        actualizarStock();
        limpiarTabla();
    }//GEN-LAST:event_btnVentaMouseClicked
    
    public void fecha() {
        Calendar calendar = new GregorianCalendar();
        int año, mes, dia;
        año = calendar.get(Calendar.YEAR);
        mes = calendar.get(Calendar.MONTH) + 1;
        dia = calendar.get(Calendar.DATE);
        if (mes < 10) {
            txtFecha.setText(año + "/0" + mes + "/" + dia);
        }
        if (dia < 10) {
            txtFecha.setText(año + "/" + mes + "/0" + dia);
        }
        if (dia > 10 && mes > 10) {
            txtFecha.setText(año + "/" + mes + "/" + dia);
        } else if (dia < 10 && mes < 10) {
            txtFecha.setText(año + "/0" + mes + "/0" + dia);
        }
    }
    
    public void guardarVenta(){
        String fecha = txtFecha.getText();
        float monto = tpagar;
        
        v.setFecha(fecha);
        v.setTotal(monto);
        v.GuardarVentas(v);
    }
    
    public void guardarDetalle(){
        int idv = v.IdVentas();
        for (int i=0;i < tablaDetalle.getRowCount();i++){
            int idpr = Integer.parseInt(tablaDetalle.getValueAt(i, 1).toString());
            int c = Integer.parseInt(tablaDetalle.getValueAt(i, 3).toString());
            float pr = Float.parseFloat(tablaDetalle.getValueAt(i, 5).toString());
            
            dv.setId_producto(idpr);
            dv.setCant_producto(c);
            dv.setSubtotal(pr);
            dv.setId_venta(idv);
            dv.GuardarDetalleVentas(dv);
        }
    }
    
    public void agregarProducto(CProductos prod){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel)tablaDetalle.getModel();
        item = item+1;
        idp = prod.getCodigo();
        String nomp = prod.getNombreProducto();
        float pre = prod.getPrecio();
        int stock = prod.getCant();
        int cant = Integer.parseInt(txtCantidad.getValue().toString()); //Es la cantidad que se elige para la venta
        float total = cant*pre;
        ArrayList lista = new ArrayList();
        if (stock>0){
            lista.add(item);
            lista.add(idp);
            lista.add(nomp);
            lista.add(cant);
            lista.add(pre);
            lista.add(total);
            Object[] ob = new Object[6];
            ob[0]=lista.get(0);
            ob[1]=lista.get(1);
            ob[2]=lista.get(2);
            ob[3]=lista.get(3);
            ob[4]=lista.get(4);
            ob[5]=lista.get(5);
            modelo.addRow(ob);
            tablaDetalle.setModel(modelo);
        } else{
            JOptionPane.showMessageDialog(null, "No hay stock suficiente del producto");
        }     
    }
    
    public void calcularTotal(){
        tpagar=0;
        for (int i=0;i < tablaDetalle.getRowCount();i++){
            cant=Integer.parseInt(tablaDetalle.getValueAt(i, 3).toString());
            pre=Float.parseFloat(tablaDetalle.getValueAt(i, 4).toString());
            tpagar = tpagar + (cant*pre);
        }
        txtTotalAPagar.setText(""+tpagar+"0");
    }
    
    public void buscarProducto(){
        String cb = txtBuscarProd.getText();
        if(txtBuscarProd.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Debe ingresar el codigo del producto");
        } else {
            CProductos objProd = new CProductos();
            p = objProd.buscarCodBarra(cb);
            if (p.getCodigo()!=0){
                agregarProducto(p);
            } else {
                JOptionPane.showMessageDialog(null, "Producto no registrado");
                txtBuscarProd.requestFocus(); //Para que el mouse vaya directo al txt
            }
        }
    }
    
    public void actualizarStock(){
        for (int i = 0; i < tablaDetalle.getRowCount(); i++) {
            int cod = Integer.parseInt(tablaDetalle.getValueAt(i, 1).toString());
            int cant = Integer.parseInt(tablaDetalle.getValueAt(i, 3).toString());
            p = p.listarID(cod);
            int StockActual = p.getCant() - cant;
            v.ActualizarStock(StockActual, cod);
        }
    }
    
    public void limpiarTabla(){
        DefaultTableModel tmp = new DefaultTableModel();
        tmp = (DefaultTableModel) tablaDetalle.getModel();
        int fila = tablaDetalle.getRowCount();
        for (int i = 0; i < fila; i++) {
            tmp.removeRow(i);
        }
        txtBuscarProd.setText(null);
        txtTotalAPagar.setText(null);
        txtCantidad.setValue(0);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscarProd;
    private javax.swing.JLabel lblCant;
    private javax.swing.JLabel lblTotalAPagar;
    private javax.swing.JLabel lblVenta;
    private javax.swing.JTable tablaDetalle;
    private javax.swing.JTextField txtBuscarProd;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtTotalAPagar;
    // End of variables declaration//GEN-END:variables
}
