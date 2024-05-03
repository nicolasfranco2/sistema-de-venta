package vista;

import conexion.conexion;
import controlador.Ctrl_Categoria;
import controlador.Ctrl_Producto;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;
import modelo.Producto;

public class InterGestionarProducto extends javax.swing.JInternalFrame {

    private int idProducto;
    int obtenerIdCategoriaCombo = 0;

    public InterGestionarProducto() {
        initComponents();
        this.setSize(900, 586);
        this.setTitle("Gestionar Prodcuto");
        this.CargarComboCategoria();
        this.CargarTablaProducto();

        //      this.CargarTablaCategoria();
        //cargar combo categoria
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Productos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton_actualizar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox_IVA = new javax.swing.JComboBox<>();
        jComboBox_categoria = new javax.swing.JComboBox<>();
        txt_nombre = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        jLabel_fondo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Productos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_Productos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 730, 320));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_actualizar.setBackground(new java.awt.Color(51, 204, 0));
        jButton_actualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_actualizar.setText("Actualizar");
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        jButton_eliminar.setBackground(new java.awt.Color(255, 51, 51));
        jButton_eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_eliminar.setText("Eliminar");
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 130, 310));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("IVA:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cantidad:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Categoria:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Descripcion:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        jComboBox_IVA.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_IVA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox_IVA.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_IVA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione IVA:", "No grava IVA", "5%", "10%" }));
        jPanel3.add(jComboBox_IVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 180, -1));

        jComboBox_categoria.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_categoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox_categoria.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Categoria:", "Item 2", "Item 3", "Item 4" }));
        jComboBox_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_categoriaActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 180, -1));

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 180, -1));

        txt_precio.setBackground(new java.awt.Color(255, 255, 255));
        txt_precio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_precio.setForeground(new java.awt.Color(0, 0, 0));
        txt_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioActionPerformed(evt);
            }
        });
        jPanel3.add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 17, 180, -1));

        txt_cantidad.setBackground(new java.awt.Color(255, 255, 255));
        txt_cantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadActionPerformed(evt);
            }
        });
        jPanel3.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 110, -1));

        txt_descripcion.setBackground(new java.awt.Color(255, 255, 255));
        txt_descripcion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 220, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 880, 130));

        jLabel_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 900, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed

        Producto producto = new Producto();
        Ctrl_Producto controlProducto = new Ctrl_Producto();
        String iva = "";
        String categoria = "";
        iva = jComboBox_IVA.getSelectedItem().toString().trim();
        categoria = jComboBox_categoria.getSelectedItem().toString().trim();

        //validar los campos
        if (txt_nombre.getText().isEmpty() || txt_cantidad.getText().isEmpty() || txt_precio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
            txt_nombre.setBackground(Color.red);
            txt_cantidad.setBackground(Color.red);
            txt_precio.setBackground(Color.red);

        } else {
            // consulta para ver el producto ya existente

            if (iva.equalsIgnoreCase("Seleccione IVA:")) {
                JOptionPane.showMessageDialog(null, "Seleccione IVA");

            } else {

                if (categoria.equalsIgnoreCase("Seleccione Categoria:")) {
                    JOptionPane.showMessageDialog(null, "Seleccione una categoria");

                } else {

                    try {
                        producto.setNombre(txt_nombre.getText().trim());
                        producto.setCantidad(Integer.parseInt(txt_cantidad.getText().trim()));
                        String precioTXT = "";
                        double Precio = 0.0;
                        precioTXT = txt_precio.getText().trim();
                        boolean aux = false;
                        /*
                                    *
                                    *Si el usuario ingresa coma como punto decimanl lo transformamos a punto
                         */
                        for (int i = 0; i < precioTXT.length(); i++) {
                            if (precioTXT.charAt(i) == ',') {
                                String precioNuevo = precioTXT.replace(",", ".");
                                Precio = Double.parseDouble(precioNuevo);
                                aux = true;
                            }
                        }
                        //evaluar la condicion
                        if (aux == true) {
                            producto.setPrecio(Precio);

                        } else {
                            Precio = Double.parseDouble(precioTXT);
                            producto.setPrecio(Precio);
                        }
                        producto.setDescripcion(txt_descripcion.getText().trim());

                        //porcentaje IVA
                        if (iva.equalsIgnoreCase("No grava IVA")) {
                            producto.setPorcentaje(0);

                        } else if (iva.equalsIgnoreCase("5%")) {
                            producto.setPorcentaje(5);

                        } else if (iva.equalsIgnoreCase("10%")) {
                            producto.setPorcentaje(10);

                        }
                        //id de la categoria - cargar metodo que obtiene el id de la categoria
                        this.IdCategoria();
                        producto.setIdCategoria(obtenerIdCategoriaCombo);
                        producto.setEstado(1);

                        if (controlProducto.actualizar(producto, idProducto)) {
                            JOptionPane.showMessageDialog(null, "Registro Actualizado");
                            txt_nombre.setBackground(Color.green);
                            txt_cantidad.setBackground(Color.green);
                            txt_precio.setBackground(Color.green);
                            txt_descripcion.setBackground(Color.green);

                            this.CargarComboCategoria();
                            this.CargarTablaProducto();
                            this.jComboBox_IVA.setSelectedItem("Seleccione IVA:");
                            this.Limpiar();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Actualizar");

                        }

                    } catch (HeadlessException | NumberFormatException e) {
                        System.out.print("Eerror en" + e);

                    }

                }
            }

        }

    }//GEN-LAST:event_jButton_actualizarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
        Ctrl_Producto controlproducto = new Ctrl_Producto();
        if (idProducto == 0) {

            JOptionPane.showMessageDialog(null, "Seleccione un producto");

        } else {
            if (!controlproducto.eliminar(idProducto)) {
                JOptionPane.showMessageDialog(null, "Producto eliminado");
                this.CargarComboCategoria();
                this.CargarTablaProducto();
                this.Limpiar();

            } else {

                JOptionPane.showMessageDialog(null, "Error al eliminar Producto");
            }
        }


    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void jComboBox_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_categoriaActionPerformed

    private void txt_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadActionPerformed

    private void txt_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JComboBox<String> jComboBox_IVA;
    private javax.swing.JComboBox<String> jComboBox_categoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_Productos;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * Metodo para Limpiar
     */
    private void Limpiar() {
        txt_nombre.setText("");
        txt_cantidad.setText("");
        txt_precio.setText("");
        txt_descripcion.setText("");
        txt_nombre.setText("");
        jComboBox_IVA.setSelectedItem("Seleccione IVA:");
        jComboBox_categoria.setSelectedItem("Seleccione Categoria:");

    }

    /**
     *
     * Metodo para Cargar las categorias
     */

    private void CargarComboCategoria() {

        Connection cn = conexion.conectar();
        String sql = "select * from tb_categoria";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_categoria.removeAllItems();
            jComboBox_categoria.addItem("Seleccione Categoria:");
            while (rs.next()) {
                jComboBox_categoria.addItem(rs.getString("descripcion"));

            }
            cn.close();

        } catch (SQLException e) {
            System.out.print("Error al cargar categoria");
        }

    }

    /**
     *
     * Metodo para mostrar todas los productos registrados
     */
    String descripcionCategoria = "";
    double precio = 0.0;
    int porcentajeIva = 0;
    double IVA = 0;

    private void CargarTablaProducto() {
        Connection con = conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select p.idProducto, p.nombre,p.cantidad,p.precio, p.descripcion, p.porcentajeIva, c.descripcion, p.estado from tb_producto p, tb_categoria c  where  p.idCategoria = c.idCategoria; ";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            InterGestionarProducto.jTable_Productos = new JTable(model);
            InterGestionarProducto.jScrollPane1.setViewportView(InterGestionarProducto.jTable_Productos);

            model.addColumn("Numero");//ID
            model.addColumn("Nombre");
            model.addColumn("Cantidad");
            model.addColumn("Precio");
            model.addColumn("Descripcion");
            model.addColumn("Iva");
            model.addColumn("Categoria");
            model.addColumn("Estado");

            while (rs.next()) {
                precio = rs.getDouble("precio");
                porcentajeIva = rs.getInt("porcentajeIva");
                Object fila[] = new Object[8];

                for (int i = 0; i < 8; i++) {

                    if (i == 5) {

                        this.calcularIva(precio, porcentajeIva); //metodo
                        fila[i] = IVA;
                        rs.getObject(i + 1);

                    } else {
                        fila[i] = rs.getObject(i + 1);
                    }

                }
                model.addRow(fila);
            }

            con.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar la tabla producto" + e);
        }

        jTable_Productos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int fila_point = jTable_Productos.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idProducto = (int) model.getValueAt(fila_point, columna_point);
                    EviarDatosProductoSeleccionada(idProducto);
                }
            }

        });
    }

    /**
     *
     * Metodo para calcular iva
     */
    private double calcularIva(double precio, int iva) {

        int p_iva = iva;
        switch (p_iva) {
            case 0:
                IVA = 0.0;
                break;
            case 5:
                IVA = precio * 0.05;
                break;
            case 10:
                IVA = precio * 0.10;
                break;
            default:
                break;
        }
        //redondear decimales

        IVA = (double) Math.round(IVA * 100) / 100;
        return IVA;
    }

    /**
     *
     * Metodo que envia datos seleccionados
     */
    private void EviarDatosProductoSeleccionada(int idProducto) {

        try {
            Connection con = conexion.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "select * from tb_producto where idProducto ='" + idProducto + "' ");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                txt_nombre.setText(rs.getString("nombre"));
                txt_cantidad.setText(rs.getString("cantidad"));
                txt_precio.setText(rs.getString("precio"));
                txt_descripcion.setText(rs.getString("descripcion"));
                int iva = rs.getInt("porcentajeIva");
                switch (iva) {
                    case 0:
                        jComboBox_IVA.setSelectedItem("No grava IVA");
                        break;
                    case 5:
                        jComboBox_IVA.setSelectedItem("5%");
                        break;
                    case 10:
                        jComboBox_IVA.setSelectedItem("10%");
                        break;
                    default:
                        jComboBox_IVA.setSelectedItem("Seleccione IVA:");
                        break;
                }
                //redondear decimales
                int idCate = rs.getInt("idCategoria");
                jComboBox_categoria.setSelectedItem(relacionarCategorias(idCate));

            }

            con.close();

        } catch (SQLException e) {
            System.out.println("Error al seleccionar el Productto" + e);
        }

    }

    /**
     **************************************************************
     * Metodo para relacionar categorias *
     * ************************************************************
     */
    private String relacionarCategorias(int idCategoria) {

        String sql = "select descripcion from tb_categoria where idCategoria = '" + idCategoria + "'";
        Statement st;
        try {
            Connection cn = conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                descripcionCategoria = rs.getString("descripcion");

            }
            cn.close();

        } catch (SQLException e) {
            System.out.print("Error al obtener la id de la categoria");
        }
        return descripcionCategoria;
    }

    private int IdCategoria() {
        String sql = " Select * from tb_categoria where descripcion ='" + this.jComboBox_categoria.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerIdCategoriaCombo = rs.getInt("idCategoria");

            }

        } catch (SQLException e) {
            System.out.print("Error al obteer id categoria");

        }
        return obtenerIdCategoriaCombo;

    }
}
