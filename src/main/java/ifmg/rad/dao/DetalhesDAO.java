package ifmg.rad.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ifmg.rad.modelo.Detalhes;
import ifmg.rad.util.Conexao;

public class DetalhesDAO {

private EntityManager em;
	
	public DetalhesDAO() {
		em = Conexao.getConnection();
	}
	
	
	public void salvar(Detalhes obj){
		
		em.getTransaction().begin();
		em.merge(obj);
		em.getTransaction().commit();
		
	}
	
	
	public List<Detalhes> buscarTodos(){
		
		return em
		        .createQuery("from Detalhes")
		        .getResultList();
		
	}	
	
	
	public void excluir(Detalhes obj) {
		
		Detalhes aux = 
				em.find(Detalhes.class,obj.getCodigo());
		em.getTransaction().begin();
		em.remove(aux);
		em.flush();//executa a instrução no momento
		em.getTransaction().commit();
	}
	
	public Detalhes buscarPorId(Integer codigo){
		
		return em.find(Detalhes.class,codigo);		
	}	
	
}
