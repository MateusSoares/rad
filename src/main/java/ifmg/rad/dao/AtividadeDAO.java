package ifmg.rad.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ifmg.rad.modelo.Atividade;
import ifmg.rad.util.Conexao;

public class AtividadeDAO {

private EntityManager em;
	
	public AtividadeDAO() {
		em = Conexao.getConnection();
	}
	
	
	public void salvar(Atividade obj){
		
		em.getTransaction().begin();
		em.merge(obj);
		em.getTransaction().commit();
		
	}
	
	
	public List<Atividade> buscarTodos(){
		
		return em
		        .createQuery("from Atividade")
		        .getResultList();
		
	}	
	
	
	public void excluir(Atividade obj) {
		
		Atividade aux = 
				em.find(Atividade.class,obj.getCodigo());
		em.getTransaction().begin();
		em.remove(aux);
		em.flush();//executa a instrução no momento
		em.getTransaction().commit();
	}
	
	public Atividade buscarPorId(Integer codigo){
		
		return em.find(Atividade.class,codigo);		
	}	
	
}
