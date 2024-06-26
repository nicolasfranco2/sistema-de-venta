/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import com.mysql.jdbc.Connection;
import conexion.conexion;
import controlador.Ctrl_Producto;
import java.sql.ResultSet;

import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Producto;

public class InterActualizarStock extends javax.swing.JInternalFrame {

    int idProducto = 0;
    int cantidad = 0;

    public InterActualizarStock() {
        initComponents();
        setTitle("Actualizar el stock de los productos");
        setSize(683, 447);
        this.CargarComboProdcuto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_cantidad_nuevo = new javax.swing.JTextField();
        txt_cantidad_actual1 = new javax.swing.JTextField();
        jComboBox_prodcuto = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jlabel_fondo = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Actualizar Stock del Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 390, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Stock Nuevo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Producto: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Stock Actual:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        txt_cantidad_nuevo.setBackground(new java.awt.Color(255, 255, 255));
        txt_cantidad_nuevo.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txt_cantidad_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 290, 30));

        txt_cantidad_actual1.setBackground(new java.awt.Color(255, 255, 255));
        txt_cantidad_actual1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txt_cantidad_actual1.setForeground(new java.awt.Color(0, 0, 0));
        txt_cantidad_actual1.setEnabled(false);
        getContentPane().add(txt_cantidad_actual1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 290, 30));

        jComboBox_prodcuto.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_prodcuto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox_prodcuto.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_prodcuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Producto:", "Item 2", "Item 3", "Item 4" }));
        jComboBox_prodcuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_prodcutoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_prodcuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 116, 290, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 140, 40));

        jlabel_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.jpg"))); // NOI18N
        jlabel_fondo.setText("jLabel1");
        getContentPane().add(jlabel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 660, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_prodcutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_prodcutoActionPerformed
        this.MostrarStock();
    }//GEN-LAST:event_jComboBox_prodcutoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      // Validamos seleccion de producto
        if (!jComboBox_prodcuto.getSelectedItem().equals("Seleccione Producto:")) {
            //Validamos campos vacios
            if (!txt_cantidad_nuevo.getText().isEmpty()) {
                //validamos que el usuario no ingrese otros caracteres
                if (!txt_cantidad_nuevo.getText().isEmpty()) {
                    //validamos que el usuario no ingrese otros caracteres
                    boolean validacion = validar(txt_cantidad_nuevo.getText().trim());
                    if (validacion == true) {
                        
                            //Validamos la cantidad sea mayor a 0
                            
                            if (Integer.parseInt(txt_cantidad_nuevo.getText()) > 0) {
                                
                                Producto producto = new Producto();
                                Ctrl_Producto controladorProducto = new Ctrl_Producto();
                                int stockActual = Integer.parseInt(txt_cantidad_actual1.getText().trim());
                                int stockNuevo = Integer.parseInt(txt_cantidad_nuevo.getText().trim());
                                
                                stockNuevo = stockActual + stockNuevo;
                                producto.setCantidad(stockNuevo);
                            
                                if (controladorProducto.actualizarStock(producto, idProducto)) {
                                    
                                            JOptionPane.showMessageDialog(null, "Stock Actualizado");
                                            jComboBox_prodcuto.setSelectedItem("Seleccione Producto:");
                                            txt_cantidad_actual1.setText("");
                                            txt_cantidad_nuevo.setText("");
                                            this.CargarComboProdcuto();
                                    
                                } else {
                                    
                                    JOptionPane.showMessageDialog(null, "Error al actualizar");
                                }
                                
                            
                        } else {
                                
                                 JOptionPane.showMessageDialog(null, "la cantidad no puede ser cero ni negativo");
                        }
                        
                    } else {
                        
                         JOptionPane.showMessageDialog(null, "No se admiten caracteres no numericos");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese la cantidad que desee");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Ingrese la cantidad que desee");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un  Producto");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox_prodcuto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jlabel_fondo;
    private javax.swing.JTextField txt_cantidad_actual1;
    private javax.swing.JTextField txt_cantidad_nuevo;
    // End of variables declaration//GEN-END:variables


    /*
***************************************************
* Metodo para cargar los productos en el jcombobox
****************************************************    
     */
    private void CargarComboProdcuto() {

        Connection cn = (Connection) conexion.conectar();
        String sql = "select * from tb_producto";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_prodcuto.removeAllItems();
            jComboBox_prodcuto.addItem("Seleccione Producto:");
            while (rs.next()) {
                jComboBox_prodcuto.addItem(rs.getString("nombre"));

            }

        } catch (Exception e) {
            System.out.println("Error al cargar los productos en" + e);
        }

    }

    /*
    *************************************************
    * Metodo para mostrar el stock del producto seleccionado
    *************************************************
     */

    private void MostrarStock() {
        try {

            Connection cn = (Connection) conexion.conectar();
            String sql = "select * from tb_producto where nombre = '" + this.jComboBox_prodcuto.getSelectedItem() + "'";
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                idProducto = rs.getInt("idProducto");
                cantidad = rs.getInt("cantidad");
                txt_cantidad_actual1.setText(String.valueOf(cantidad));

            } else {
                txt_cantidad_actual1.setText("");
            }

        } catch (Exception e) {

            System.out.println("Error al obtener la cantidad del producto en" + e);
        }

    }
    
    /*
    **************************************************
    * Metodo de validacion de caracteres  no numericos
    **************************************************
    */

       private boolean validar (String valor){
            int num;
            try {
               num = Integer.parseInt(valor);
               return true;
           } catch (NumberFormatException e) {
               
               return false;
           } 
       
       }
}
