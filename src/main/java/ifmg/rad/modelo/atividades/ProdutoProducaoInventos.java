package ifmg.rad.modelo.atividades;

import ifmg.rad.modelo.Atividade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProdutoProducaoInventos extends Atividade{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ProdutoProducaoInventos() {}
	
	public ProdutoProducaoInventos(Integer id, String titulo, String instituicaoRegistro, Integer numRegistro) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.instituicaoRegistro = instituicaoRegistro;
		this.numRegistro = numRegistro;
	}
	
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String titulo;
	private String instituicaoRegistro;
	private Integer numRegistro;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getInstituicaoRegistro() {
		return instituicaoRegistro;
	}
	public void setInstituicaoRegistro(String instituicaoRegistro) {
		this.instituicaoRegistro = instituicaoRegistro;
	}
	public Integer getNumRegistro() {
		return numRegistro;
	}
	public void setNumRegistro(Integer numRegistro) {
		this.numRegistro = numRegistro;
	}
	
}
