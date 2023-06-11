package dao;

/**
 *
 * @author josueemilian
 */
public class DaoKardex {

    public java.util.List<service.ModelKardex> getKardex() {
        service.WSKardex_Service serviceKardex = new service.WSKardex_Service();
        service.WSKardex portKardex = serviceKardex.getWSKardexPort();
        return portKardex.listarKardex();
    }
    
     public java.util.List<service.ModelKardex> getUltimoRegistroDeSuCategoria() {
        service.WSKardex_Service serviceKardex = new service.WSKardex_Service();
        service.WSKardex portKardex = serviceKardex.getWSKardexPort();
        return portKardex.listarUltimoRegistroDeSuCategoria();
    }
    
}
