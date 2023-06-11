package dao;

import config.ConnectionDB;
import interfaces.InterfaceProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.ModelProducto;

/**
 *
 * @author josueemilian
 */
public class DaoProducto implements InterfaceProducto {

    ConnectionDB conexion = new ConnectionDB();
    ResultSet rs = null;
    String strSQL = "";

    @Override
    public List<ModelProducto> listar() {
        ArrayList<ModelProducto> lstProducto = new ArrayList<>();
        try {
            strSQL = "SELECT * FROM PRODUCTO";
            conexion.open();
            rs = conexion.executeQuery(strSQL);

            while (rs.next()) {
                ModelProducto producto = new ModelProducto();
                producto.setId(rs.getInt("ID_PRODUCTO"));
                producto.setDescripcion(rs.getString("DESCRIPCION"));
                producto.setPrecio(rs.getDouble("PRECIO"));
                producto.setExistencia(rs.getInt("EXISTENCIA"));
                producto.setIdTipoProducto(rs.getInt("ID_TIPO_PRODUCTO"));
                lstProducto.add(producto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return lstProducto;
    }

    @Override
    public List<ModelProducto> listarReporte() {
        ArrayList<ModelProducto> lstProducto = new ArrayList<>();
        try {
            strSQL = "SELECT\n"
                    + "    P.ID_PRODUCTO,\n"
                    + "    P.DESCRIPCION,\n"
                    + "    P.PRECIO,\n"
                    + "    P.EXISTENCIA,\n"
                    + "    TP.DESCRIPCION AS TIPO_PRODUCTO\n"
                    + "FROM\n"
                    + "    PRODUCTO P\n"
                    + "    INNER JOIN TIPO_PRODUCTO TP ON P.ID_TIPO_PRODUCTO = TP.ID_TIPO_PRODUCTO\n"
                    + "ORDER BY\n"
                    + "    P.ID_PRODUCTO;";
            conexion.open();
            rs = conexion.executeQuery(strSQL);

            while (rs.next()) {
                ModelProducto producto = new ModelProducto();
                producto.setId(rs.getInt("ID_PRODUCTO"));
                producto.setDescripcion(rs.getString("DESCRIPCION"));
                producto.setPrecio(rs.getDouble("PRECIO"));
                producto.setExistencia(rs.getInt("EXISTENCIA"));
                producto.setStrTipoProducto(rs.getString("TIPO_PRODUCTO"));
                lstProducto.add(producto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return lstProducto;
    }

    @Override
    public ModelProducto list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Register(ModelProducto producto) {
        boolean res = false;
        Connection con = null;
        PreparedStatement pst = null;

        try {
            strSQL = "INSERT INTO PRODUCTO (ID_PRODUCTO, DESCRIPCION, PRECIO, EXISTENCIA, ID_TIPO_PRODUCTO) "
                    + "VALUES ((SELECT ISNULL(MAX(ID_PRODUCTO), 0) + 1 FROM PRODUCTO), ?, ?, ?, ?)";
            con = conexion.open();
            pst = con.prepareStatement(strSQL);

            pst.setString(1, producto.getDescripcion());
            pst.setDouble(2, producto.getPrecio());
            pst.setInt(3, producto.getExistencia());
            pst.setInt(4, producto.getIdTipoProducto());

            int result = pst.executeUpdate();

            if (result > 0) {
                res = true;
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoProducto.class.getName()).log(Level.SEVERE, null, ex);
            res = false;
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DaoProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DaoProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return res;
    }

    @Override
    public boolean Update(ModelProducto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Delete(ModelProducto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
