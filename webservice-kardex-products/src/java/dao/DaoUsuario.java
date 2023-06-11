package dao;

import config.ConnectionDB;
import interfaces.InterfaceUsuario;
import java.util.*;
import java.sql.*;
import model.ModelUsuario;

/**
 *
 * @author josueemilian
 */
public class DaoUsuario implements InterfaceUsuario{
    
    ConnectionDB conexion = new ConnectionDB();
    ResultSet rs = null;
    String strSQL = "";
    

    @Override
    public List<ModelUsuario> listar() {
        ArrayList<ModelUsuario> lstUsuario = new ArrayList<>();
        try {
            strSQL = "SELECT * FROM USUARIO";
            conexion.open();
            rs = conexion.executeQuery(strSQL);
            
            while (rs.next()) {                
                ModelUsuario usuario = new ModelUsuario();
                usuario.setId(rs.getInt("ID_USUARIO"));
                usuario.setNombre(rs.getString("NOMBRE"));
                usuario.setUsuario(rs.getString("USUARIO"));
                usuario.setClave(rs.getBytes("CLAVE"));
                lstUsuario.add(usuario);
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
                if(conexion != null){
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
        
        return lstUsuario;
    }

    @Override
    public ModelUsuario list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Register(ModelUsuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Update(ModelUsuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean Delete(ModelUsuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
