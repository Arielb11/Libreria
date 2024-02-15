/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package probando;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class FormProducto extends javax.swing.JFrame {

    public FormProducto() {
        initComponents();
        txtId.setEditable(false);
        this.mostrarProductos();
        this.setLocationRelativeTo(null);
        txtNombre.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelCarga = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCant = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtCodBarra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        panelLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTotalProductos = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtBuscarCod = new javax.swing.JTextField();
        btnBuscar2 = new javax.swing.JButton();
        lblBuscarNombre = new javax.swing.JLabel();
        lblBuscarCOd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión de productos");
        setBackground(new java.awt.Color(102, 153, 255));
        setMaximumSize(new java.awt.Dimension(963, 549));
        setMinimumSize(new java.awt.Dimension(963, 549));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCarga.setBackground(new java.awt.Color(102, 153, 255));
        panelCarga.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Producto"));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("ID");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTotalProductosMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        txtCant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantKeyPressed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(0, 204, 0));
        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Precio");

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecioKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("Código de barra");

        javax.swing.GroupLayout panelCargaLayout = new javax.swing.GroupLayout(panelCarga);
        panelCarga.setLayout(panelCargaLayout);
        panelCargaLayout.setHorizontalGroup(
            panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCargaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCargaLayout.createSequentialGroup()
                .addGroup(panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCargaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCargaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                        .addComponent(txtCant, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(23, 23, 23))
        );
        panelCargaLayout.setVerticalGroup(
            panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCargaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(22, 22, 22)
                .addGroup(panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addContainerGap(274, Short.MAX_VALUE))
        );

        jPanel1.add(panelCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 530));

        panelLista.setBackground(new java.awt.Color(102, 153, 255));
        panelLista.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Productos"));

        tbTotalProductos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbTotalProductos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tbTotalProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbTotalProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTotalProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTotalProductos);

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        btnBuscar2.setText("Buscar precio");
        btnBuscar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscar2MouseClicked(evt);
            }
        });

        lblBuscarNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblBuscarNombre.setText("Nombre del producto:");

        lblBuscarCOd.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblBuscarCOd.setText("Código de barra:");

        javax.swing.GroupLayout panelListaLayout = new javax.swing.GroupLayout(panelLista);
        panelLista.setLayout(panelListaLayout);
        panelListaLayout.setHorizontalGroup(
            panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelListaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblBuscarNombre)
                .addGap(18, 18, 18)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(43, 43, 43)
                .addComponent(lblBuscarCOd)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelListaLayout.setVerticalGroup(
            panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar2)
                    .addComponent(lblBuscarNombre)
                    .addComponent(lblBuscarCOd))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel1.add(panelLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 6, 980, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1304, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tbTotalProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTotalProductosMouseClicked
        CProductos objetoProducto = new CProductos();
        objetoProducto.SeleccionarProducto(tbTotalProductos, txtId, txtNombre, txtCant, txtPrecio, txtCodBarra);
    }//GEN-LAST:event_tbTotalProductosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        CProductos objetoProducto = new CProductos();
        int resp = JOptionPane.showConfirmDialog(null, "Realmente desea eliminar el producto?", "Confirmar elminación", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resp == JOptionPane.YES_OPTION){
            objetoProducto.EliminarProducto(txtId);
        }
        this.mostrarProductos();
        this.limpiarCampos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        CProductos objetoProducto = new CProductos();
        if (this.validacion()){
            int resp = JOptionPane.showConfirmDialog(null, "Realmente desea modificar el producto?", "Confirmar modificación", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (resp == JOptionPane.YES_OPTION){
                objetoProducto.ModificarProducto(txtId, txtNombre, txtCant, txtPrecio, txtCodBarra);
                this.limpiarCampos();
                this.mostrarProductos();
            }   
        } else {
            JOptionPane.showMessageDialog(null, "El precio y la Cantidad Deben ser numeros Positivos");
        }
        
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        CProductos objetoProducto = new CProductos();
        objetoProducto.MostrarProductosFiltrados(tbTotalProductos, txtBuscar);
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCant.requestFocus();
        }
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtCantKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPrecio.requestFocus();
        }
    }//GEN-LAST:event_txtCantKeyPressed

    private void txtPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCodBarra.requestFocus();
        }
    }//GEN-LAST:event_txtPrecioKeyPressed

    private void btnBuscar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar2MouseClicked
        CProductos objetoProducto = new CProductos();
        String cb = txtBuscarCod.getText();
        objetoProducto = objetoProducto.buscarCodBarra(cb);
        JOptionPane.showMessageDialog(null, "El precio de "+objetoProducto.getNombreProducto()+" es "+objetoProducto.getPrecio(), "Precio", JOptionPane.INFORMATION_MESSAGE);
        txtBuscarCod.setText(null);
    }//GEN-LAST:event_btnBuscar2MouseClicked
    
    public boolean validacion(){
        boolean bandera = false;
        if (Float.parseFloat(txtPrecio.getText())>0 && Integer.parseInt(txtCant.getText())>0){
            bandera = true;  
        }
     return bandera;
    }
    
    public void mostrarProductos() {
        CProductos objetoProducto = new CProductos();
        objetoProducto.MostrarProductos(tbTotalProductos);
        for (int i = 0; i < tbTotalProductos.getRowCount(); i++) {
            tbTotalProductos.setValueAt("$"+tbTotalProductos.getValueAt(i, 3),i, 3);
        }
    }
    
    public void limpiarCampos(){
        txtId.setText(null);
        txtNombre.setText(null);
        txtCant.setText(null);
        txtPrecio.setText(null);
        txtCodBarra.setText(null);
    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscarCOd;
    private javax.swing.JLabel lblBuscarNombre;
    private javax.swing.JPanel panelCarga;
    private javax.swing.JPanel panelLista;
    private javax.swing.JTable tbTotalProductos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarCod;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtCodBarra;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
