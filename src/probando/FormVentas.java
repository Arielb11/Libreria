package probando;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
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
        //setIconImage(new ImageIcon(getClass().getResource("/img/iconVentas.png")).getImage());
        item = 0;
        this.fecha();
        this.setLocationRelativeTo(null);
        txtFecha.setEditable(false);
        txtBuscarProd.requestFocus();
        txtTotalAPagar.setText("0");
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
        txtExtra = new javax.swing.JTextField();
        btnExtra = new javax.swing.JButton();
        lblTotalAPagar1 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnBuscar2 = new javax.swing.JButton();
        lblCant1 = new javax.swing.JLabel();
        txtCantidad1 = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        txtBuscarProd = new javax.swing.JTextField();
        lblCant = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JSpinner();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblBuscarProd1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ventas");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro", "Codigo", "Nombre", "Cantidad", "Precio ($)", "Total"
            }
        ));
        jScrollPane1.setViewportView(tablaDetalle);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 118, 1261, 330));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 87, -1));

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtTotalAPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 90, -1));

        lblTotalAPagar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblTotalAPagar.setText("Monto Extra");
        jPanel2.add(lblTotalAPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        btnVenta.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnVenta.setText("Generar Venta");
        btnVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentaMouseClicked(evt);
            }
        });
        jPanel2.add(btnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1125, 393, -1, -1));
        jPanel2.add(txtExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 90, -1));

        btnExtra.setText("Añadir");
        btnExtra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExtraMouseClicked(evt);
            }
        });
        jPanel2.add(btnExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 80, 20));

        lblTotalAPagar1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblTotalAPagar1.setText("Total a pagar ($)");
        jPanel2.add(lblTotalAPagar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 140, -1));

        lblID.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblID.setText("ID Producto");
        jPanel2.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDKeyPressed(evt);
            }
        });
        jPanel2.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 96, -1));

        btnBuscar2.setText("Buscar");
        btnBuscar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscar2MouseClicked(evt);
            }
        });
        jPanel2.add(btnBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 360, 100, 20));

        lblCant1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblCant1.setText("Cantidad");
        jPanel2.add(lblCant1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, -1, -1));
        jPanel2.add(txtCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 88, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1290, 430));

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        txtBuscarProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarProdKeyPressed(evt);
            }
        });

        lblCant.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblCant.setText("Cantidad");

        btnBuscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        lblBuscarProd1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblBuscarProd1.setText("Cod Producto");

        jButton1.setText("Buscar productos");
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
                .addGap(39, 39, 39)
                .addComponent(lblBuscarProd1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblCant)
                .addGap(18, 18, 18)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 464, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCant)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnLimpiar)
                    .addComponent(lblBuscarProd1)
                    .addComponent(jButton1))
                .addContainerGap(10, Short.MAX_VALUE))
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
        txtBuscarProd.setText(null);
        txtCantidad.setValue(0);
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseClicked
        guardarVenta();
        guardarDetalle();
        actualizarStock();
        limpiarTabla();
        JOptionPane.showMessageDialog(null, "Venta generada");
    }//GEN-LAST:event_btnVentaMouseClicked

    private void btnExtraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExtraMouseClicked
        float suma = 0;
        suma = Float.parseFloat(txtTotalAPagar.getText()) + Float.parseFloat(txtExtra.getText());
        txtTotalAPagar.setText(""+suma);   
        p = p.buscarPorID(9);
        agregarProducto(p,23232323);
        txtExtra.setText(null);
    }//GEN-LAST:event_btnExtraMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiarTabla();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        FormBusqNombre fbn = new FormBusqNombre();
        fbn.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnBuscar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar2MouseClicked
        buscarProductoPorID();
        calcularTotal();
        txtID.setText(null);
        txtCantidad1.setValue(0);
    }//GEN-LAST:event_btnBuscar2MouseClicked

    private void txtBuscarProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProdKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            JSpinner.NumberEditor editor = (JSpinner.NumberEditor) txtCantidad.getEditor();
            editor.getTextField().requestFocus();
        }
    }//GEN-LAST:event_txtBuscarProdKeyPressed

    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            JSpinner.NumberEditor editor = (JSpinner.NumberEditor) txtCantidad1.getEditor();
            editor.getTextField().requestFocus();
        }
    }//GEN-LAST:event_txtIDKeyPressed

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
        float monto = Float.parseFloat(txtTotalAPagar.getText());
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
            if (cantidad != 23232323 ){
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
            } else {
                lista.add(item);
                lista.add(idp);
                lista.add(nomp);
                lista.add(1);
                lista.add(txtExtra.getText());
                lista.add(txtExtra.getText());
                Object[] ob = new Object[6];
                ob[0]=lista.get(0);
                ob[1]=lista.get(1);
                ob[2]=lista.get(2);
                ob[3]=lista.get(3);
                ob[4]=lista.get(4);
                ob[5]=lista.get(5);
                modelo.addRow(ob);
                tablaDetalle.setModel(modelo);
            }
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
        txtTotalAPagar.setText(""+tpagar);
    }
    
    public void buscarProducto(){
        String cb = txtBuscarProd.getText();
        int cant = Integer.parseInt(txtCantidad.getValue().toString());
        if (cant > 0) {
            if(txtBuscarProd.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debe ingresar el codigo del producto");
            } else {
                CProductos objProd = new CProductos();
                p = objProd.buscarCodBarra(cb);
                if (p.getCodigo()!=0){
                    agregarProducto(p, cant);
                } else {
                    txtBuscarProd.requestFocus(); //Para que el mouse vaya directo al txt
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar una cantidad");
        }
    }
    
    public void buscarProductoPorID(){
        int id = Integer.parseInt(txtID.getText());
        int cant = Integer.parseInt(txtCantidad1.getValue().toString());
        if (cant > 0){
            if (txtID.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debe ingrear el ID del producto");
            } else {
                CProductos objProd = new CProductos();
                p = objProd.buscarPorID(id);
                if (p.getCodigo() != 0) {
                    agregarProducto(p, cant);
                } else {
                    txtID.requestFocus();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar una cantidad");
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
        tmp.setRowCount(0);
        txtBuscarProd.setText(null);
        txtTotalAPagar.setText("0");
        txtCantidad.setValue(0);
        txtID.setText(null);
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
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JButton btnExtra;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVenta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscarProd1;
    private javax.swing.JLabel lblCant;
    private javax.swing.JLabel lblCant1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblTotalAPagar;
    private javax.swing.JLabel lblTotalAPagar1;
    private javax.swing.JTable tablaDetalle;
    private javax.swing.JTextField txtBuscarProd;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JSpinner txtCantidad1;
    private javax.swing.JTextField txtExtra;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTotalAPagar;
    // End of variables declaration//GEN-END:variables
}
