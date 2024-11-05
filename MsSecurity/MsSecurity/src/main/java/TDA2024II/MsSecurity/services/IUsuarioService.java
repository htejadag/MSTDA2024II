package TDA2024II.MsSecurity.services;

import java.util.List;

import TDA2024II.MsSecurity.model.UsuarioModel;

public interface IUsuarioService {

    public UsuarioModel add(UsuarioModel model);

    public UsuarioModel update(UsuarioModel model);

    public boolean delete(int id);

    public List<UsuarioModel> findAll();

    public UsuarioModel findById(int id);
}
