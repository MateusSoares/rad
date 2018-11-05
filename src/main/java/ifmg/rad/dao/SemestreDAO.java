package ifmg.rad.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ifmg.rad.modelo.Semestre;
import ifmg.rad.util.Conexao;


public class SemestreDAO {
	
private EntityManager em;
	
	public SemestreDAO() {
		em = Conexao.getConnection();
	}
	
	
	public void salvar(Semestre obj){
		
		em.getTransaction().begin();
		em.merge(obj);
		em.getTransaction().commit();
		
	}
	
	
	public List<Semestre> buscarTodos(){
		
		return em
		        .createQuery("from Semestre")
		        .getResultList();
		
	}	
	
	
	public void excluir(Semestre obj) {
		
		Semestre aux = 
				em.find(Semestre.class,obj.getCodigo());
		em.getTransaction().begin();
		em.remove(aux);
		em.flush();//executa a instrução no momento
		em.getTransaction().commit();
	}
	
	public Semestre buscarPorId(Integer codigo){
		
		return em.find(Semestre.class,codigo);		
	}	
	
}
