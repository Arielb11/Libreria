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
    
    public FormVentas() {
        initComponents();
        Calendar calendar = new GregorianCalendar();
        txtFecha.setText(""+calendar.get(Calendar.YEAR)+"-"+calendar.get(Calendar.MONTH)+"-"+calendar.get(Calendar.DAY_OF_MONTH));
        //Areglar fecha (mes)
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBuscarProd = new javax.swing.JLabel();
        txtBuscarProd = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtNombreProd = new javax.swing.JTextField();
        txtCantProd = new javax.swing.JTextField();
        txtPrecioProd = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        txtCantidad = new javax.swing.JSpinner();
        lblCant = new javax.swing.JLabel();
        btnVenta = new javax.swing.JButton();
        txtFecha = new javax.swing.JTextField();
        txtTotalAPagar = new javax.swing.JTextField();
        lblTotalAPagar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(964, 549));
        setMinimumSize(new java.awt.Dimension(963, 549));
        setPreferredSize(new java.awt.Dimension(918, 476));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(963, 549));

        lblBuscarProd.setText("Cod Producto");

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        lblNombre.setText("Nombre:");

        lblStock.setText("Stock:");

        lblPrecio.setText("Precio:");

        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
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

        lblTotalAPagar.setText("Total a pagar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNombre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(btnVenta)
                        .addGap(115, 115, 115)
                        .addComponent(lblTotalAPagar)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblBuscarProd)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnBuscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(lblStock)
                                .addGap(18, 18, 18)
                                .addComponent(txtCantProd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(lblPrecio)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecioProd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblCant)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarProd)
                    .addComponent(txtBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblStock)
                        .addComponent(txtCantProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPrecio)
                        .addComponent(txtPrecioProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCant)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVenta)
                    .addComponent(lblTotalAPagar)
                    .addComponent(txtTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        buscarProducto();
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        agregarProducto();
        calcularTotal();
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseClicked
        guardarVenta();
        guardarDetalle();
    }//GEN-LAST:event_btnVentaMouseClicked
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
    public void agregarProducto(){
        int item = 0; //Si se inicializa aca siempre cada vez que se agrega un producto vuelve a 0
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel)tablaDetalle.getModel();
        item = item+1;
        idp = p.getCodigo();
        String nomp = txtNombreProd.getText();
        float pre = Float.parseFloat(txtPrecioProd.getText());
        int stock = Integer.parseInt(txtCantProd.getText());
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
        int id = Integer.parseInt(txtBuscarProd.getText());
        if(txtBuscarProd.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Debe ingresar el codigo del producto");
        } else {
            CProductos objProd = new CProductos();
            p = objProd.listarID(id);
            if (p.getCodigo()!=0){
                txtNombreProd.setText(p.getNombreProducto());
                txtCantProd.setText(""+p.getCant());
                txtPrecioProd.setText(""+p.getPrecio());
            } else {
                JOptionPane.showMessageDialog(null, "Producto no registrado");
                txtBuscarProd.requestFocus(); //Para que el mouse vaya directo al txt
            }
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscarProd;
    private javax.swing.JLabel lblCant;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblTotalAPagar;
    private javax.swing.JTable tablaDetalle;
    private javax.swing.JTextField txtBuscarProd;
    private javax.swing.JTextField txtCantProd;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombreProd;
    private javax.swing.JTextField txtPrecioProd;
    private javax.swing.JTextField txtTotalAPagar;
    // End of variables declaration//GEN-END:variables
}
