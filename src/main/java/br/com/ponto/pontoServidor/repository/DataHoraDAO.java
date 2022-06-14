package br.com.ponto.pontoServidor.repository;

import br.com.ponto.pontoServidor.model.DataHoraModel;
import br.com.ponto.pontoServidor.model.UsuarioModel;
import java.util.List;
import org.springframework.dao.DataAccessException;

public interface DataHoraDAO {
    public List<Integer> getIdUsuario() throws DataAccessException, Exception;
    public List<DataHoraModel> getDataHora(int idusuario) throws DataAccessException, Exception;
    public void setDataHora(UsuarioModel idUsuario) throws DataAccessException, Exception;
}
