package controlador;

import conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Categoria;

public class Ctrl_Categoria {

    //meotodo para registrar categoria
    public boolean guardar(Categoria objeto) {
        boolean respuesta = false;
        Connection cn = conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into tb_categoria values(?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getDescripcion());
            consulta.setInt(3, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {

                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {

            System.out.println("Error al guardar la categoria: " + e);
        }

        return respuesta;
    }
    
    //metodo para consultar si ya existe esa misma categoria
    
        public boolean existeCategoria(String categoria) {
        boolean respuesta = false;
        String sql = "select descripcion from tb_categoria where descripcion = '"+ categoria  +"';";
        Statement st;

        
        try {
             Connection cn = conexion.conectar();
             st = cn.createStatement();
             ResultSet rs = st.executeQuery(sql);
             while(rs.next()){
                  respuesta = true;
             }
        } catch (SQLException e) {

            System.out.println("Error al consultar la categoria: " + e);
        }

        return respuesta;
    }
        
        
        ////Metodo para actualizar
          public boolean actualizar(Categoria objeto, int idCategoria) {
        boolean respuesta = false;
        Connection cn = conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update tb_categoria set descripcion=? where idCategoria = '"+idCategoria+"'");
            consulta.setString(1, objeto.getDescripcion());
            

            if (consulta.executeUpdate() > 0) {

                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {

            System.out.println("Error al Actualizar Categoria: " + e);
        }

        return respuesta;
    }
          
           public boolean eliminar( int idCategoria) {
        boolean respuesta = false;
        Connection cn = conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("delete from tb_categoria where idCategoria = '"+idCategoria+"'");
            consulta.executeUpdate();
            

            if (consulta.executeUpdate() > 0) {

                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {

            System.out.println("Error al Eliminar Categoria: " + e);
        }

        return respuesta;
    }
}
