package br.com.ponto.pontoServidor.repository;

import br.com.ponto.pontoServidor.model.UsuarioModel;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.util.MultiValueMap;

public interface UsuarioDAO {
    public UsuarioModel getUsuario(MultiValueMap<String, String> header) throws DataAccessException, Exception;
    public List<UsuarioModel> getListUsuario() throws DataAccessException, Exception;
    public void setUsuario(UsuarioModel user) throws DataAccessException, Exception;
}
