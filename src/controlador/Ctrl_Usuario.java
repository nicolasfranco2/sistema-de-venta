/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Usuario;

/**
 *
 * @author Lenovo
 */
public class Ctrl_Usuario {
    
    //metodo para iniciar sesion
    public boolean loginUser(Usuario objeto){
        
      boolean respuesta = false;
      
     Connection cn = conexion.conectar();
     String sql ="select usuario, password from tb_usuario tu  where usuario = '"+ objeto.getUsuario() +"' and password = '"+ objeto.getPassword() +"'";
     Statement st;
      try {
         st = cn.createStatement();
         ResultSet rs = st.executeQuery(sql);
         
         while(rs.next()){
            respuesta = true;
         }
         
        }catch (SQLException e){
            System.out.println("Error al iniciar sesion");
            JOptionPane.showMessageDialog(null,"Error al iniciar Sesion");
        
        }
      return respuesta;
    }
      /*
    **************************************
    * Metodo para guardar Usuario
    **************************************
     */
    public boolean guardar(Usuario objeto) {

        boolean respuesta = false;
        Connection cn = conexion.conectar();

        try {

            PreparedStatement consulta = cn.prepareStatement("insert into tb_usuario values(?,?,?,?,?,?,?);");
            consulta.setInt(1, 0); //id
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido());
            consulta.setString(4, objeto.getUsuario());
            consulta.setString(5, objeto.getPassword());
            consulta.setString(6, objeto.getTelefono());
            consulta.setInt(7, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {

                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {

            System.out.println("Error al guardar el Usuario : " + e);
        }

        return respuesta;
    }

    //metodo para consultar si ya existe el mismo usuario
    public boolean existeUsuario(String usuario) {
        boolean respuesta = false;
        String sql = "select usuario from tb_usuario where usuario = '" + usuario + "';";
        Statement st;

        try {
            Connection cn = conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {

            System.out.println("Error al consultar el usuario: " + e);
        }

        return respuesta;
    }
    
      /*
    *****************************************
    * Metodo para actualizar el Usuario
    ******************************************
    
    */
    
       public boolean actualizar(Usuario objeto, int idUsuario) {
        boolean respuesta = false;
        Connection cn = conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update tb_usuario set nombre= ?, apellido= ?, usuario= ?, password= ?, telefono= ?, estado= ? where idUsuario = '"+idUsuario+"'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido());
            consulta.setString(3, objeto.getUsuario());
            consulta.setString(4, objeto.getPassword());
            consulta.setString(5, objeto.getTelefono());
            consulta.setInt(6 ,objeto.getEstado());
           
            
            

            if (consulta.executeUpdate() > 0) {

                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {

            System.out.println("Error al Actualizar el Usuario: " + e);
        }

        return respuesta;
    }
       
        /*
    *****************************************
    * Metodo para eliminar el Usuario
    ******************************************
    
    */
          
           public boolean eliminar( int idUsuario) {
        boolean respuesta = false;
        Connection cn = conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("delete from tb_usuario where idUsuario = '"+idUsuario+"'");
            consulta.executeUpdate();
            

            if (consulta.executeUpdate() > 0) {

                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {

            System.out.println("Error al Eliminar el Usuario: " + e);
        }

        return respuesta;
    }
}
