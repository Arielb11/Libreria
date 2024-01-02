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
        this.setLocationRelativeTo(null);
        txtFecha.setEditable(false);
        txtBuscarProd.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        txtFecha = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtTotalAPagar = new javax.swing.JTextField();
        lblTotalAPagar = new javax.swing.JLabel();
        btnVenta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblBuscarProd = new javax.swing.JLabel();
        txtBuscarProd = new javax.swing.JTextField();
        lblCant = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JSpinner();
        btnBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ventas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro", "Codigo", "Nombre", "Cantidad", "Precio", "Total"
            }
        ));
        jScrollPane1.setViewportView(tablaDetalle);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 118, 1261, 342));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 87, -1));

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        lblTotalAPagar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblTotalAPagar.setText("Total a pagar:");

        btnVenta.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnVenta.setText("Generar Venta");
        btnVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(645, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTotalAPagar)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVenta)
                        .addGap(500, 500, 500))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(368, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalAPagar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVenta))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1290, 430));

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        lblBuscarProd.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblBuscarProd.setText("Cod Producto");

        lblCant.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblCant.setText("Cantidad:");

        btnBuscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton1.setText("Buscar Por Nombre");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblBuscarProd)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblCant)
                .addGap(18, 18, 18)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnBuscar)
                .addGap(88, 88, 88)
                .addComponent(jButton1)
                .addContainerGap(449, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarProd)
                    .addComponent(txtBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCant)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(jButton1))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1290, 50));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("Fecha");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -4, 1310, 560));

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

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        FormBusqNombre objProducto = new FormBusqNombre();
        objProducto.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked
    
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
    
    public void agregarProducto(CProductos prod, int cantidad){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel)tablaDetalle.getModel();
        item = item+1;
        idp = prod.getCodigo();
        String nomp = prod.getNombreProducto();
        float pre = prod.getPrecio();
        int stock = prod.getCant();
        int cant = cantidad;
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
        int cant = Integer.parseInt(txtCantidad.getValue().toString());
        if(txtBuscarProd.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Debe ingresar el codigo del producto");
        } else {
            CProductos objProd = new CProductos();
            p = objProd.buscarCodBarra(cb);
            if (p.getCodigo()!=0){
                agregarProducto(p, cant);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscarProd;
    private javax.swing.JLabel lblCant;
    private javax.swing.JLabel lblTotalAPagar;
    private javax.swing.JTable tablaDetalle;
    private javax.swing.JTextField txtBuscarProd;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtTotalAPagar;
    // End of variables declaration//GEN-END:variables
}
