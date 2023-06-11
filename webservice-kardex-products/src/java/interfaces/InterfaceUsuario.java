package interfaces;

import java.util.List;
import model.ModelUsuario;

/**
 *
 * @author josueemilian
 */
public interface InterfaceUsuario {

    List<ModelUsuario> listar();
    public ModelUsuario list(int id);
    public boolean Register(ModelUsuario usuario);
    public boolean Update(ModelUsuario usuario);
    public boolean Delete(ModelUsuario usuario);
}
