package dao;

import config.ConnectionDB;
import interfaces.InterfaceKardex;
import java.util.*;
import model.ModelKardex;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;

/**
 *
 * @author josueemilian
 */
public class DaoKardex implements InterfaceKardex {

    ConnectionDB conexion = new ConnectionDB();
    String strSQL = "";
    ResultSet rs = null;

    @Override
    public List<ModelKardex> listar() {
        ArrayList<ModelKardex> lstKardex = new ArrayList<>();

        try {
            strSQL = "SELECT K.ID_KARDEX, U.USUARIO, P.DESCRIPCION AS PRODUCTO, P.ID_TIPO_PRODUCTO, TM.DESCRIPCION AS TIPO_MOVIMIENTO, K.CANTIDAD, K.EXISTENCIA, K.SALDO, K.DESCRIPCION, K.FECHA\n"
                    + "FROM KARDEX K\n"
                    + "JOIN USUARIO U ON K.ID_USUARIO = U.ID_USUARIO\n"
                    + "JOIN PRODUCTO P ON K.ID_PRODUCTO = P.ID_PRODUCTO\n"
                    + "JOIN TIPO_MOVIMIENTO TM ON K.ID_TIPO_MOVIMIENTO = TM.ID_TIPO_MOVIMIENTO;";
            conexion.open();
            rs = conexion.executeQuery(strSQL);

            while (rs.next()) {
                ModelKardex kardex = new ModelKardex();
                kardex.setId(rs.getInt("ID_KARDEX"));
                kardex.setStrUsuario(rs.getString("USUARIO"));
                kardex.setStrProducto(rs.getString("PRODUCTO"));
                kardex.setIdTipoProducto(rs.getInt("ID_TIPO_PRODUCTO"));
                kardex.setStrTipoMovimiento(rs.getString("TIPO_MOVIMIENTO"));
                kardex.setCantidad(rs.getInt("CANTIDAD"));
                kardex.setExistencia(rs.getInt("EXISTENCIA"));
                kardex.setSaldo(rs.getInt("SALDO"));
                kardex.setDescripcion(rs.getString("DESCRIPCION"));

                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Timestamp fecha = rs.getTimestamp("FECHA");
                String fechaFormateada = dateFormat.format(fecha);
                kardex.setStrFecha(fechaFormateada);

                lstKardex.add(kardex);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();;
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
        return lstKardex;
    }

    @Override
    public ModelKardex list(int id) {
        ModelKardex kardex = new ModelKardex();

        try {
            strSQL = "SELECT K.ID_KARDEX, U.USUARIO, P.DESCRIPCION AS PRODUCTO, TM.DESCRIPCION AS TIPO_MOVIMIENTO, K.CANTIDAD, K.EXISTENCIA, K.SALDO, K.DESCRIPCION, K.FECHA\n"
                    + "FROM KARDEX K\n"
                    + "JOIN USUARIO U ON K.ID_USUARIO = U.ID_USUARIO\n"
                    + "JOIN PRODUCTO P ON K.ID_PRODUCTO = P.ID_PRODUCTO\n"
                    + "JOIN TIPO_MOVIMIENTO TM ON K.ID_TIPO_MOVIMIENTO = TM.ID_TIPO_MOVIMIENTO\n"
                    + "WHERE ID_KARDEX = ?;";

            Connection con = conexion.open();
            PreparedStatement pst = con.prepareStatement(strSQL);
            pst.setInt(1, id);
            rs = pst.executeQuery();

            while (rs.next()) {
                kardex.setId(rs.getInt("ID_KARDEX"));
                kardex.setStrUsuario(rs.getString("USUARIO"));
                kardex.setStrProducto(rs.getString("PRODUCTO"));
                kardex.setStrTipoMovimiento(rs.getString("TIPO_MOVIMIENTO"));
                kardex.setCantidad(rs.getInt("CANTIDAD"));
                kardex.setExistencia(rs.getInt("EXISTENCIA"));
                kardex.setSaldo(rs.getInt("SALDO"));
                kardex.setDescripcion(rs.getString("DESCRIPCION"));
            }
            rs.close();
            pst.close();
            conexion.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoKardex.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoKardex.class.getName()).log(Level.SEVERE, null, ex);
        }

        return kardex;
    }

    @Override
    public boolean Register(ModelKardex kardex) {
        boolean success = false;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        try {
            try {
                connection = conexion.open();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DaoKardex.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.setConfirmacion(false);

            // Variables para el registro en el KARDEX
            int ID_KARDEX;
            int ID_USUARIO = kardex.getIdUsuario();
            int ID_PRODUCTO = kardex.getIdProducto();
            int ID_TIPO_MOVIMIENTO = kardex.getIdTipoMovimiento();
            int CANTIDAD = kardex.getCantidad();
            String DESCRIPCION = kardex.getDescripcion();
            Timestamp FECHA = kardex.getFecha();

            // Obtener la existencia inicial del producto
            int EXISTENCIA_INICIAL = 0;

            String selectExistencia = "SELECT EXISTENCIA FROM PRODUCTO WHERE ID_PRODUCTO = ?";
            statement = connection.prepareStatement(selectExistencia);
            statement.setInt(1, ID_PRODUCTO);
            rs = statement.executeQuery();
            if (rs.next()) {
                EXISTENCIA_INICIAL = rs.getInt("EXISTENCIA");
            }
            rs.close();
            statement.close();

            // Iniciar la transacción
            connection.setAutoCommit(false);

            // Insertar el registro en la tabla KARDEX
            String insertKardex = "INSERT INTO KARDEX (ID_KARDEX, ID_USUARIO, ID_PRODUCTO, ID_TIPO_MOVIMIENTO, CANTIDAD, DESCRIPCION, FECHA, EXISTENCIA) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareStatement(insertKardex);
            ID_KARDEX = obtenerNuevoIdKardex(connection);
            statement.setInt(1, ID_KARDEX);
            statement.setInt(2, ID_USUARIO);
            statement.setInt(3, ID_PRODUCTO);
            statement.setInt(4, ID_TIPO_MOVIMIENTO);
            statement.setInt(5, CANTIDAD);
            statement.setString(6, DESCRIPCION);
            statement.setTimestamp(7, FECHA);
            statement.setInt(8, EXISTENCIA_INICIAL);
            statement.executeUpdate();
            statement.close();

            // Actualizar la existencia en la tabla PRODUCTO
            int EXISTENCIA_ACTUAL = EXISTENCIA_INICIAL;

            // Calcular el nuevo valor de la existencia y el saldo
            if (ID_TIPO_MOVIMIENTO == 1) { // Movimiento de entrada
                EXISTENCIA_ACTUAL = EXISTENCIA_ACTUAL + CANTIDAD;
            } else if (ID_TIPO_MOVIMIENTO == 2) { // Movimiento de salida
                EXISTENCIA_ACTUAL = EXISTENCIA_ACTUAL - CANTIDAD;
            }

            // Verificar si la existencia actual es menor que 0
            if (EXISTENCIA_ACTUAL < 0) {
                throw new SQLException("La existencia del producto es menor que 0. Se realizará rollback de la transacción.");
            }

            // Actualizar la existencia en la tabla PRODUCTO
            String updateExistencia = "UPDATE PRODUCTO SET EXISTENCIA = ? WHERE ID_PRODUCTO = ?";
            statement = connection.prepareStatement(updateExistencia);
            statement.setInt(1, EXISTENCIA_ACTUAL);
            statement.setInt(2, ID_PRODUCTO);
            statement.executeUpdate();
            statement.close();

            // Actualizar el saldo en la tabla KARDEX
            int SALDO_ACTUAL = EXISTENCIA_ACTUAL;

            String updateSaldo = "UPDATE KARDEX SET SALDO = ? WHERE ID_KARDEX = ?";
            statement = connection.prepareStatement(updateSaldo);
            statement.setInt(1, SALDO_ACTUAL);
            statement.setInt(2, ID_KARDEX);
            statement.executeUpdate();
            statement.close();

            connection.commit();
            success = true;
        } catch (SQLException e) {
            e.printStackTrace();
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } finally {
            try {
                if (connection != null) {
                    connection.setAutoCommit(true);
                    connection.close();
                }
                if (rs != null) {
                    rs.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return success;
    }

    private int obtenerNuevoIdKardex(Connection connection) throws SQLException {
        int nuevoId = 0;
        String selectMaxId = "SELECT ISNULL(MAX(ID_KARDEX), 0) + 1 AS NUEVO_ID FROM KARDEX";
        PreparedStatement statement = connection.prepareStatement(selectMaxId);
        ResultSet rs = statement.executeQuery();
        if (rs.next()) {
            nuevoId = rs.getInt("NUEVO_ID");
        }
        rs.close();
        statement.close();
        return nuevoId;
    }

    @Override
    public boolean Update(ModelKardex kardex) {
        Connection con = null;
        PreparedStatement pst = null;

        try {
            con = conexion.open();

            conexion.setConfirmacion(false);

            // Variables para el registro en el KARDEX
            int ID_KARDEX = kardex.getId();
            int ID_USUARIO = kardex.getIdUsuario();
            int ID_PRODUCTO = kardex.getIdProducto();
            int ID_TIPO_MOVIMIENTO = kardex.getIdTipoMovimiento();
            int CANTIDAD = kardex.getCantidad();

            // Obtener el registro actual en la tabla KARDEX
            int EXISTENCIA_ANTERIOR = 0;
            int SALDO_ANTERIOR = 0;

            String selectQuery = "SELECT EXISTENCIA, SALDO FROM KARDEX WHERE ID_KARDEX = ?";
            pst = con.prepareStatement(selectQuery);
            pst.setInt(1, ID_KARDEX);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                EXISTENCIA_ANTERIOR = rs.getInt("EXISTENCIA");
                SALDO_ANTERIOR = rs.getInt("SALDO");
            }

            // Actualizar el registro en la tabla KARDEX
            String updateQuery = "UPDATE KARDEX SET ID_USUARIO = ?, ID_PRODUCTO = ?, ID_TIPO_MOVIMIENTO = ?, CANTIDAD = ? WHERE ID_KARDEX = ?";
            pst = con.prepareStatement(updateQuery);
            pst.setInt(1, ID_USUARIO);
            pst.setInt(2, ID_PRODUCTO);
            pst.setInt(3, ID_TIPO_MOVIMIENTO);
            pst.setInt(4, CANTIDAD);
            pst.setInt(5, ID_KARDEX);
            pst.executeUpdate();

            // Actualizar la existencia y el saldo en la tabla PRODUCTO
            int EXISTENCIA_ACTUAL = EXISTENCIA_ANTERIOR;

            if (ID_TIPO_MOVIMIENTO == 1) { // Movimiento de entrada
                EXISTENCIA_ACTUAL = EXISTENCIA_ANTERIOR + CANTIDAD;
            } else if (ID_TIPO_MOVIMIENTO == 2) { // Movimiento de salida
                EXISTENCIA_ACTUAL = EXISTENCIA_ANTERIOR - CANTIDAD;
            }

            // Verificar si la existencia actual es menor que 0
            if (EXISTENCIA_ACTUAL < 0) {
                throw new Exception("La existencia del producto es menor que 0. Se realizará rollback de la transacción.");
            }

            // Actualizar la existencia en la tabla PRODUCTO
            String updateExistenciaQuery = "UPDATE PRODUCTO SET EXISTENCIA = ? WHERE ID_PRODUCTO = ?";
            pst = con.prepareStatement(updateExistenciaQuery);
            pst.setInt(1, EXISTENCIA_ACTUAL);
            pst.setInt(2, ID_PRODUCTO);
            pst.executeUpdate();

            // Actualizar el saldo en la tabla KARDEX
            int SALDO_ACTUAL = EXISTENCIA_ACTUAL;

            String updateSaldoQuery = "UPDATE KARDEX SET SALDO = ? WHERE ID_KARDEX = ?";
            pst = con.prepareStatement(updateSaldoQuery);
            pst.setInt(1, SALDO_ACTUAL);
            pst.setInt(2, ID_KARDEX);
            pst.executeUpdate();

            conexion.setCommit();
            conexion.setConfirmacion(true);

            return true;
        } catch (Exception e) {
            if (con != null) {
                try {
                    con.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

            e.printStackTrace();
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public boolean Delete(ModelKardex kardex) {
        Connection con = null;
        PreparedStatement pst = null;
        boolean success = false;

        try {
            con = conexion.open();

            conexion.setConfirmacion(false);

            int ID_KARDEX = kardex.getId();

            // 
            int ID_PRODUCTO = 0;
            int SALDO_ANTERIOR = 0;
            int CANTIDAD = 0;

            String selectQuery = "SELECT ID_PRODUCTO, SALDO, CANTIDAD FROM KARDEX WHERE ID_KARDEX = ?";
            pst = con.prepareStatement(selectQuery);
            pst.setInt(1, ID_KARDEX);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                ID_PRODUCTO = rs.getInt("ID_PRODUCTO");
                SALDO_ANTERIOR = rs.getInt("SALDO");
                CANTIDAD = rs.getInt("CANTIDAD");
            }

            // Eliminar el registro de la tabla KARDEX
            String deleteQuery = "DELETE FROM KARDEX WHERE ID_KARDEX = ?";
            pst = con.prepareStatement(deleteQuery);
            pst.setInt(1, ID_KARDEX);
            pst.executeUpdate();

            // Obtener el último saldo registrado antes del registro eliminado
            int ULTIMO_SALDO = 0;

            String ultimoSaldoQuery = "SELECT TOP 1 SALDO FROM KARDEX WHERE ID_PRODUCTO = ? AND ID_KARDEX < ? ORDER BY ID_KARDEX DESC";
            pst = con.prepareStatement(ultimoSaldoQuery);
            pst.setInt(1, ID_PRODUCTO);
            pst.setInt(2, ID_KARDEX);
            ResultSet ultimoSaldoRS = pst.executeQuery();

            if (ultimoSaldoRS.next()) {
                ULTIMO_SALDO = ultimoSaldoRS.getInt("SALDO");
            }

            // Actualizar la existencia en la tabla PRODUCTO al último saldo registrado
            String updateExistenciaQuery = "UPDATE PRODUCTO SET EXISTENCIA = EXISTENCIA - (?) WHERE ID_PRODUCTO = ?";
            pst = con.prepareStatement(updateExistenciaQuery);
            pst.setInt(1, SALDO_ANTERIOR - (ULTIMO_SALDO != 0 ? ULTIMO_SALDO : 0));
            pst.setInt(2, ID_PRODUCTO);
            pst.executeUpdate();

            conexion.setCommit();
            success = true;
        } catch (Exception e) {
            if (con != null) {
                try {
                    conexion.setRollback();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

            e.printStackTrace();
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return success;
    }

    @Override
    public List<ModelKardex> listarUltimoRegistroDeSuCategoria() {
        ArrayList<ModelKardex> lstKardex = new ArrayList<>();

        try {
            strSQL = "-- SELECCIONA EL ULTIMO REGISTRO INGRESADO PARA ESE PRODUCTO\n"
                    + "SELECT k.*\n"
                    + "FROM KARDEX k\n"
                    + "JOIN (\n"
                    + "    SELECT ID_PRODUCTO, MAX(ID_KARDEX) AS LastKardexID\n"
                    + "    FROM KARDEX\n"
                    + "    GROUP BY ID_PRODUCTO\n"
                    + ") last ON k.ID_PRODUCTO = last.ID_PRODUCTO AND k.ID_KARDEX = last.LastKardexID";
            conexion.open();
            rs = conexion.executeQuery(strSQL);

            while (rs.next()) {
                ModelKardex kardex = new ModelKardex();
                kardex.setId(rs.getInt("ID_KARDEX"));
                kardex.setStrUsuario(rs.getString("ID_USUARIO"));
                kardex.setStrProducto(rs.getString("ID_PRODUCTO"));
                kardex.setStrTipoMovimiento(rs.getString("ID_TIPO_MOVIMIENTO"));
                kardex.setCantidad(rs.getInt("CANTIDAD"));
                kardex.setExistencia(rs.getInt("EXISTENCIA"));
                kardex.setSaldo(rs.getInt("SALDO"));
                kardex.setDescripcion(rs.getString("DESCRIPCION"));

                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Timestamp fecha = rs.getTimestamp("FECHA");
                String fechaFormateada = dateFormat.format(fecha);
                kardex.setStrFecha(fechaFormateada);

                lstKardex.add(kardex);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();;
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
        return lstKardex;
    }

}
