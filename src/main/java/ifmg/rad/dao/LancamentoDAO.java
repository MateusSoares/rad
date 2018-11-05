package ifmg.rad.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ifmg.rad.modelo.Lancamento;
import ifmg.rad.util.Conexao;

public class LancamentoDAO {

private EntityManager em;
	
	public LancamentoDAO() {
		em = Conexao.getConnection();
	}
	
	
	public void salvar(Lancamento obj){
		
		em.getTransaction().begin();
		em.merge(obj);
		em.getTransaction().commit();
		
	}
	
	
	public List<Lancamento> buscarTodos(){
		
		return em
		        .createQuery("from Lancamento")
		        .getResultList();
		
	}	
	
	
	public void excluir(Lancamento obj) {
		
		Lancamento aux = 
				em.find(Lancamento.class,obj.getCodigo());
		em.getTransaction().begin();
		em.remove(aux);
		em.flush();//executa a instrução no momento
		em.getTransaction().commit();
	}
	
	public Lancamento buscarPorId(Integer codigo){
		
		return em.find(Lancamento.class,codigo);		
	}	
	
}
