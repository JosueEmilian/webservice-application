package interfaces;

import java.util.List;
import model.ModelKardex;

/**
 *
 * @author josueemilian
 */
public interface InterfaceKardex {

    List<ModelKardex> listar();

    List<ModelKardex> listarUltimoRegistroDeSuCategoria();

    public ModelKardex list(int id);

    public boolean Register(ModelKardex kardex);

    public boolean Update(ModelKardex kardex);

    public boolean Delete(ModelKardex kardex);
}
