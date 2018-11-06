package ifmg.rad.service;

import java.util.List;

import org.hibernate.service.spi.ServiceException;

import ifmg.rad.dao.AreaDAO;
import ifmg.rad.modelo.Area;

public class AreaService {

	private AreaDAO dao = new AreaDAO();

	public void salvar(Area obj) {

		if ((obj == null) || (obj.getNome() == null ))
			throw new ServiceException("Area não informada.");

		dao.salvar(obj);
	}

	public List<Area> buscarTodos() {

		return dao.buscarTodos();

	}

	public void excluir(Area obj) {

		dao.excluir(obj);
	}

	public Area buscarPorId(Integer codigo) {

		return dao.buscarPorId(codigo);
	}

}