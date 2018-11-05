package ifmg.rad.service;

import java.util.List;

import org.hibernate.service.spi.ServiceException;

import ifmg.rad.dao.AtividadeDAO;
import ifmg.rad.modelo.Atividade;

public class AtividadeService {

	private AtividadeDAO dao = new AtividadeDAO();

	public void salvar(Atividade obj) {

		if ((obj == null) || (obj.getNome().isEmpty()) || (obj.getQtdHora() <= 0 ) || (obj.getValor() <= 0 )  )
			throw new ServiceException("Preencha todos os campos para salvar a atividade ." + obj.getNome());

		dao.salvar(obj);
	}

	public List<Atividade> buscarTodos() {

		return dao.buscarTodos();

	}

	public void excluir(Atividade obj) {

		dao.excluir(obj);
	}

	public Atividade buscarPorId(Integer codigo) {

		return dao.buscarPorId(codigo);
	}

}
