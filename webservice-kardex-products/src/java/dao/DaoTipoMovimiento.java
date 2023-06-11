package dao;

import config.ConnectionDB;
import interfaces.InterfaceTipoMovimiento;
import java.util.*;
import java.sql.ResultSet;
import model.ModelTipoMovimiento;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josueemilian
 */
public class DaoTipoMovimiento implements InterfaceTipoMovimiento {

    ConnectionDB conexion = new ConnectionDB();
    ResultSet rs = null;
    String strSQL = "";

    @Override
    public List<ModelTipoMovimiento> listar() {
        ArrayList<ModelTipoMovimiento> lstTipoMovimiento = new ArrayList<>();

        try {
            strSQL = "SELECT * FROM TIPO_MOVIMIENTO";
            conexion.open();
            rs = conexion.executeQuery(strSQL);

            while (rs.next()) {
                ModelTipoMovimiento tipoMovmiento = new ModelTipoMovimiento();
                tipoMovmiento.setId(rs.getInt("ID_TIPO_MOVIMIENTO"));
                tipoMovmiento.setDescripcion(rs.getString("DESCRIPCION"));
                lstTipoMovimiento.add(tipoMovmiento);
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
        return lstTipoMovimiento;
    }

    @Override
    public ModelTipoMovimiento list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Register(ModelTipoMovimiento tipoMovimiento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Update(ModelTipoMovimiento tipoMovimiento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Delete(ModelTipoMovimiento tipoMovimiento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
