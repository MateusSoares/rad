package ifmg.rad.modelo.atividades;

import ifmg.rad.modelo.Atividade;
import java.util.Date;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProdutoPublicacaoCapituloLivro extends Atividade{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ProdutoPublicacaoCapituloLivro() {}
	
	public ProdutoPublicacaoCapituloLivro(Integer id, HashSet<String> autores, HashSet<String> autores_capitulo,
			String titulo, String local, String editora, Date data, String isbn) {
		super();
		this.id = id;
		this.autores = autores;
		this.autores_capitulo = autores_capitulo;
		this.titulo = titulo;
		this.local = local;
		this.editora = editora;
		this.data = data;
		this.isbn = isbn;
	}
	
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private HashSet<String> autores;
	private HashSet<String> autores_capitulo;
	
	private String titulo;
	private String local;
	private String editora;
	private Date data;
	private String isbn;
	
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
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public HashSet<String> getAutores() {
		return autores;
	}
	public void setAutores(HashSet<String> autores) {
		this.autores = autores;
	}
	public HashSet<String> getAutores_capitulo() {
		return autores_capitulo;
	}
	public void setAutores_capitulo(HashSet<String> autores_capitulo) {
		this.autores_capitulo = autores_capitulo;
	}
	
}
