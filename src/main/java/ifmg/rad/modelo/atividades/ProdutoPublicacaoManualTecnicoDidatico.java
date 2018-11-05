package ifmg.rad.modelo.atividades;

import ifmg.rad.modelo.Atividade;
import java.util.Date;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProdutoPublicacaoManualTecnicoDidatico extends Atividade{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ProdutoPublicacaoManualTecnicoDidatico() {}
	
	public ProdutoPublicacaoManualTecnicoDidatico(Integer id, HashSet<String> autores, String titulo, String local,
			Date data) {
		super();
		this.id = id;
		this.autores = autores;
		this.titulo = titulo;
		this.local = local;
		this.data = data;
	}
	
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private HashSet<String> autores;
	
	private String titulo;
	private String local;
	private Date data;
	
	public HashSet<String> getAutores() {
		return autores;
	}
	public void setAutores(HashSet<String> autores) {
		this.autores = autores;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
}
