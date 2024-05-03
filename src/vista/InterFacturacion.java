/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import conexion.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JDesktopPane;
import static vista.FromMenu.JDesktopPane_menu;


public class InterFacturacion extends javax.swing.JInternalFrame {

 
    public InterFacturacion() {
        initComponents();
        this.setSize(883, 687);
        this.setTitle("Facturacion");
        //carga los cliente en la vista
        this.CargarComboCliente();
        
        //cargar los productos en la vista
        this.CargarComboProducto();     
   
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_cliente = new javax.swing.JComboBox<>();
        jComboBox_Producto = new javax.swing.JComboBox<>();
        txt_cliente_buscar = new javax.swing.JTextField();
        txt_cliente_buscar1 = new javax.swing.JTextField();
        jButton_buscar_cliente = new javax.swing.JButton();
        jButton_añadir_producto = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_productos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_cambio = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_subtotal = new javax.swing.JTextField();
        txt_descuento = new javax.swing.JTextField();
        txt_iva = new javax.swing.JTextField();
        txt_total_a_pagar = new javax.swing.JTextField();
        txt_efectivo = new javax.swing.JTextField();
        jButton_calcular_cambio = new javax.swing.JButton();
        jButton_registrar_venta = new javax.swing.JButton();
        jLabel_fondo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Facturación");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Cantidad:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 80, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cliente:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 60, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Producto:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, -1));

        jComboBox_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el Cliente:", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 200, -1));

        jComboBox_Producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Producto:", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 200, -1));
        getContentPane().add(txt_cliente_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 125, 60, -1));
        getContentPane().add(txt_cliente_buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 130, -1));

        jButton_buscar_cliente.setText("Buscar");
        getContentPane().add(jButton_buscar_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 75, 90, 30));

        jButton_añadir_producto.setText("Añadir Producto");
        getContentPane().add(jButton_añadir_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 140, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_productos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 810, 210));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 830, 230));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Cambio:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Subtotal:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Iva:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Descuento:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Total a pagar:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 115, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Efectivo:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Efectivo:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txt_cambio.setEnabled(false);
        jPanel2.add(txt_cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 170, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Cambio:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txt_subtotal.setEnabled(false);
        jPanel2.add(txt_subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, -1));

        txt_descuento.setEnabled(false);
        jPanel2.add(txt_descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 170, -1));

        txt_iva.setEnabled(false);
        jPanel2.add(txt_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 75, 170, -1));

        txt_total_a_pagar.setEnabled(false);
        jPanel2.add(txt_total_a_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 170, -1));
        jPanel2.add(txt_efectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 145, 170, -1));

        jButton_calcular_cambio.setBackground(new java.awt.Color(255, 255, 255));
        jButton_calcular_cambio.setForeground(new java.awt.Color(0, 0, 0));
        jButton_calcular_cambio.setText("Calcular cambio");
        jButton_calcular_cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_calcular_cambioActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_calcular_cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 182, -1, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 450, 230));

        jButton_registrar_venta.setBackground(new java.awt.Color(255, 255, 255));
        jButton_registrar_venta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_registrar_venta.setForeground(new java.awt.Color(0, 0, 0));
        jButton_registrar_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/venta.png"))); // NOI18N
        jButton_registrar_venta.setText("Registrar venta");
        jButton_registrar_venta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_registrar_venta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton_registrar_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 230, 120));
        getContentPane().add(jLabel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_calcular_cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_calcular_cambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_calcular_cambioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_añadir_producto;
    private javax.swing.JButton jButton_buscar_cliente;
    private javax.swing.JButton jButton_calcular_cambio;
    private javax.swing.JButton jButton_registrar_venta;
    private javax.swing.JComboBox<String> jComboBox_Producto;
    private javax.swing.JComboBox<String> jComboBox_cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_productos;
    private javax.swing.JTextField txt_cambio;
    private javax.swing.JTextField txt_cliente_buscar;
    private javax.swing.JTextField txt_cliente_buscar1;
    private javax.swing.JTextField txt_descuento;
    private javax.swing.JTextField txt_efectivo;
    private javax.swing.JTextField txt_iva;
    private javax.swing.JTextField txt_subtotal;
    private javax.swing.JTextField txt_total_a_pagar;
    // End of variables declaration//GEN-END:variables



/*
 ***********************************************
 * Metodo para cargar cliente en el jcomboBox
 ***********************************************
 */
    private void CargarComboCliente(){
    
    Connection cn = conexion.conectar();
    String sql = "Select * from tb_cliente";
    Statement st;
    
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_cliente.removeAllItems();
            jComboBox_cliente.addItem("Seleccione el Cliente:");
            
            while(rs.next()){
            jComboBox_cliente.addItem(rs.getString("nombre")+ " "+rs.getString("apellido"));
            }
            cn.close();
            
        } catch (Exception e) {
            
            System.out.println("Error al cargar cliente"+ e);
        }
    
    
    }

/*
 ***********************************************
 * Metodo para cargar Producto en el jcomboBox
 ***********************************************
 */
    
    private void CargarComboProducto(){
    
      Connection cn = conexion.conectar();
    String sql = "Select * from tb_producto";
    Statement st;
    
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_Producto.removeAllItems();
            jComboBox_Producto.addItem("Seleccione el Producto:");
            
            while(rs.next()){
            jComboBox_Producto.addItem(rs.getString("nombre"));
            }
            cn.close();
            
        } catch (Exception e) {
            
            System.out.println("Error al cargar el producto"+ e);
        }
    
    
    }

    }

