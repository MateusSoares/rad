package ifmg.rad.service;

import java.util.List;

import org.hibernate.service.spi.ServiceException;

import ifmg.rad.dao.UsuarioDAO;
import ifmg.rad.modelo.UsuarioAutenticado;

public class UsuarioService {

	private UsuarioDAO dao = new UsuarioDAO();

	public void salvar(UsuarioAutenticado obj) {

		if ((obj == null) || (obj.getNome().isEmpty()) || (obj.getSenha().length() <= 3 ) )
			throw new ServiceException("Preencha todos os campos para salvar a atividade ." + obj.getNome());

		dao.salvar(obj);
	}

	public List<UsuarioAutenticado> buscarTodos() {

		return dao.buscarTodos();

	}

	public void excluir(UsuarioAutenticado obj) {

		dao.excluir(obj);
	}

	public UsuarioAutenticado buscarPorId(Integer codigo) {

		return dao.buscarPorId(codigo);
	}

}
