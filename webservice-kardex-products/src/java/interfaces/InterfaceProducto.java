package interfaces;

import java.util.List;
import model.ModelProducto;

/**
 *
 * @author josueemilian
 */
public interface InterfaceProducto {
    
        
    List<ModelProducto> listar();
    List<ModelProducto> listarReporte();
    public ModelProducto list(int id);
    public boolean Register(ModelProducto producto);
    public boolean Update(ModelProducto producto);
    public boolean Delete(ModelProducto producto);
}
