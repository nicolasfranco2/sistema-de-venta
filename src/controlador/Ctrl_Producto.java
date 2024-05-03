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
import modelo.Categoria;
import modelo.Producto;

public class Ctrl_Producto {
    //meotodo para Guardar un Nuevo producto

    public boolean guardar(Producto objeto) {

        boolean respuesta = false;
        Connection cn = conexion.conectar();

        try {

            PreparedStatement consulta = cn.prepareStatement("insert into tb_producto values(?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0); //id
            consulta.setString(2, objeto.getNombre());
            consulta.setInt(3, objeto.getCantidad());
            consulta.setDouble(4, objeto.getPrecio());
            consulta.setString(5, objeto.getDescripcion());
            consulta.setInt(6, objeto.getPorcentaje());
            consulta.setInt(7, objeto.getIdCategoria());
            consulta.setInt(8, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {

                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {

            System.out.println("Error al guardar la Categoria: " + e);
        }

        return respuesta;
    }

    //metodo para consultar si ya existe el mismo Producto
    public boolean existeProdcuto(String producto) {
        boolean respuesta = false;
        String sql = "select descripcion from tb_producto where nombre = '" + producto + "';";
        Statement st;

        try {
            Connection cn = conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {

            System.out.println("Error al consultar el Producto: " + e);
        }

        return respuesta;
    }

    public boolean actualizar(Producto objeto, int idProducto) {
        boolean respuesta = false;
        Connection cn = conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update tb_producto set nombre =?, cantidad =?, precio =?, descripcion=?, porcentajeIva =?, idCategoria =?, estado =? where idProducto = '" + idProducto + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setInt(2, objeto.getCantidad());
            consulta.setDouble(3, objeto.getPrecio());
            consulta.setString(4, objeto.getDescripcion());
            consulta.setInt(5, objeto.getPorcentaje());
            consulta.setInt(6, objeto.getIdCategoria());
            consulta.setInt(7, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {

                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {

            System.out.println("Error al Actualizar Producto: " + e);
        }

        return respuesta;
    }

    public boolean eliminar(int idProducto) {
        boolean respuesta = false;
        Connection cn = conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("delete from tb_producto where idProducto = '" + idProducto + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {

                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {

            System.out.println("Error al Eliminar Producto: " + e);
        }

        return respuesta;
    }

    /*
  *******************************************
  * Metodo para actualizar Stock de producto
  *******************************************
     */
    public boolean actualizarStock(Producto objeto, int idProducto) {

        boolean respuesta = false;
        Connection cn = conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update tb_producto set cantidad =? where idProducto ='" + idProducto + "'");
            consulta.setInt(1, objeto.getCantidad());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;

            }
            cn.close();

        } catch (Exception e) {
            System.out.println("Error al actualizar el stock del  producto" + e);
        }

        return respuesta;
    }
}
