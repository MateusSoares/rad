package ifmg.rad.service;

import java.util.List;

import org.hibernate.service.spi.ServiceException;

import ifmg.rad.dao.LancamentoDAO;
import ifmg.rad.modelo.Lancamento;

public class LancamentoService {

	private LancamentoDAO dao = new LancamentoDAO();

	public void salvar(Lancamento obj) {

		if ((obj == null) || (obj.getSemestre() == null ) || (obj.getDetalhes().isEmpty() ) )
			throw new ServiceException("Atividade ou detalhes das atividades não informados.");

		dao.salvar(obj);
	}

	public List<Lancamento> buscarTodos() {

		return dao.buscarTodos();

	}

	public void excluir(Lancamento obj) {

		dao.excluir(obj);
	}

	public Lancamento buscarPorId(Integer codigo) {

		return dao.buscarPorId(codigo);
	}

}