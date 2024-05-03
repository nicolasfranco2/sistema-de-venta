package vista;

import controlador.Ctrl_Categoria;
import javax.swing.JOptionPane;
import modelo.Categoria;

public class InterCategoria extends javax.swing.JInternalFrame {
    
    public InterCategoria() {
        initComponents();
        this.setSize(400, 200);
        this.setTitle("Nueva Categoria");
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        jButton_guardar_nueva_categoria = new javax.swing.JButton();
        jLabel_water = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nueva Categoria");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Descripcion Categoria:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        txt_descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descripcionActionPerformed(evt);
            }
        });
        getContentPane().add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 180, -1));

        jButton_guardar_nueva_categoria.setBackground(new java.awt.Color(0, 204, 204));
        jButton_guardar_nueva_categoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_guardar_nueva_categoria.setText("Guardar");
        jButton_guardar_nueva_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardar_nueva_categoriaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_guardar_nueva_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, 30));

        jLabel_water.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel_water, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 400, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_guardar_nueva_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardar_nueva_categoriaActionPerformed
   
      
        Categoria categoria = new Categoria();
        Ctrl_Categoria cotrolcategoria = new Ctrl_Categoria();
        
       

        //validamos campos vacios
        if (txt_descripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");            
        } else {
            if (!cotrolcategoria.existeCategoria(txt_descripcion.getText().trim())) {
                
                categoria.setDescripcion(txt_descripcion.getText().trim());
                categoria.setEstado(1);
                if (cotrolcategoria.guardar(categoria)) {
                
                JOptionPane.showMessageDialog(null, "Registro Guardado");     
                
                }else {
                
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                
            }
            
            } else {
                JOptionPane.showMessageDialog(null, "La categoria ya esta registrado en la base de datos");                
            
           
                
            }
        }

        //Limpiar campo de descripcion
        txt_descripcion.setText("");
        
    }//GEN-LAST:event_jButton_guardar_nueva_categoriaActionPerformed

    private void txt_descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descripcionActionPerformed
 
    }//GEN-LAST:event_txt_descripcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_guardar_nueva_categoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_water;
    private javax.swing.JTextField txt_descripcion;
    // End of variables declaration//GEN-END:variables
}
