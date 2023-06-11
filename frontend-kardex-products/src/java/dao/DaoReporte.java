package dao;

/**
 *
 * @author josueemilian
 */
public class DaoReporte {
    
    public java.util.List<service.ModelProducto> getReporteProductos() {
        service.WSProducto_Service serviceProduct = new service.WSProducto_Service();
        service.WSProducto portProducto = serviceProduct.getWSProductoPort();
        return portProducto.listarReporte();
    }
    
        
    public java.util.List<service.ModelUsuario> getReporteUsuarios() {
        service.WSUsuario_Service serviceUsr = new service.WSUsuario_Service();
        service.WSUsuario portUsuario = serviceUsr.getWSUsuarioPort();
        return portUsuario.listarUsuarios();
    }
    
}
