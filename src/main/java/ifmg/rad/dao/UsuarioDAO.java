package ifmg.rad.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ifmg.rad.modelo.UsuarioAutenticado;
import ifmg.rad.util.Conexao;

public class UsuarioDAO {

private EntityManager em;
	
	public UsuarioDAO() {
		em = Conexao.getConnection();
	}
	
	
	public void salvar(UsuarioAutenticado obj){
		
		em.getTransaction().begin();
		em.merge(obj);
		em.getTransaction().commit();
		
	}
	
	
	public List<UsuarioAutenticado> buscarTodos(){
		return em.createQuery("from UsuarioAutenticado").getResultList();
	}	
	
	
	public void excluir(UsuarioAutenticado obj) {
		
		UsuarioAutenticado aux = 
				em.find(UsuarioAutenticado.class,obj.getCodigo());
		em.getTransaction().begin();
		em.remove(aux);
		em.flush();//executa a instrução no momento
		em.getTransaction().commit();
	}
	
	public UsuarioAutenticado buscarPorId(Integer codigo){
		
		return em.find(UsuarioAutenticado.class,codigo);		
	}	
	
}
