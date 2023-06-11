package interfaces;

import java.util.List;
import model.ModelTipoMovimiento;

/**
 *
 * @author josueemilian
 */
public interface InterfaceTipoMovimiento {
    
        List<ModelTipoMovimiento> listar();
    public ModelTipoMovimiento list(int id);
    public boolean Register(ModelTipoMovimiento tipoMovimiento);
    public boolean Update(ModelTipoMovimiento tipoMovimiento);
    public boolean Delete(ModelTipoMovimiento tipoMovimiento);
}
