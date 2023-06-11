package interfaces;

import java.util.List;
import model.ModelTipoProducto;

/**
 *
 * @author josueemilian
 */
public interface InterfaceTipoProducto {
    
    List<ModelTipoProducto> listar();
    public ModelTipoProducto list(int id);
    public boolean Register(ModelTipoProducto tipoProducto);
    public boolean Update(ModelTipoProducto tipoProducto);
    public boolean Delete(ModelTipoProducto tipoProducto);
}
