package ifmg.rad.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ifmg.rad.modelo.Area;
import ifmg.rad.util.Conexao;

public class AreaDAO {

private EntityManager em;
	
	public AreaDAO() {
		em = Conexao.getConnection();
	}
	
	
	public void salvar(Area obj){
		
		em.getTransaction().begin();
		em.merge(obj);
		em.getTransaction().commit();
		
	}
	
	
	public List<Area> buscarTodos(){
		
		return em
		        .createQuery("from Area")
		        .getResultList();
		
	}	
	
	
	public void excluir(Area obj) {
		
		Area aux = 
				em.find(Area.class,obj.getCodigo());
		em.getTransaction().begin();
		em.remove(aux);
		em.flush();//executa a instrução no momento
		em.getTransaction().commit();
	}
	
	public Area buscarPorId(Integer codigo){
		
		return em.find(Area.class,codigo);		
	}	
	
}
