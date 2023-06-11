package dao;

import config.ConnectionDB;
import interfaces.InterfaceTipoProducto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.ModelTipoProducto;

/**
 *
 * @author josueemilian
 */
public class DaoTipoProducto implements InterfaceTipoProducto {

    ConnectionDB conexion = new ConnectionDB();
    ResultSet rs = null;
    String strSQL = "";

    @Override
    public List<ModelTipoProducto> listar() {
        ArrayList<ModelTipoProducto> lstTipoProducto = new ArrayList<>();
        try {
            strSQL = "SELECT * FROM TIPO_PRODUCTO";
            conexion.open();
            rs = conexion.executeQuery(strSQL);

            while (rs.next()) {
                ModelTipoProducto tipoProducto = new ModelTipoProducto();
                tipoProducto.setId(rs.getInt("ID_TIPO_PRODUCTO"));
                tipoProducto.setDescripcion(rs.getString("DESCRIPCION"));

                lstTipoProducto.add(tipoProducto);
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

        return lstTipoProducto;
    }

    @Override
    public ModelTipoProducto list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Register(ModelTipoProducto tipoProducto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Update(ModelTipoProducto tipoProducto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Delete(ModelTipoProducto tipoProducto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
