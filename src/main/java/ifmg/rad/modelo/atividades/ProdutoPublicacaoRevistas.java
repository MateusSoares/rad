package ifmg.rad.modelo.atividades;

import ifmg.rad.modelo.Atividade;

import java.util.Date;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ProdutoPublicacaoRevistas extends Atividade{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public ProdutoPublicacaoRevistas() {}
	
	public ProdutoPublicacaoRevistas(Integer id, HashSet<String> autores, String tituloTrabalho, String nomeRevista,
			Integer volume, Integer numero, Integer paginas, Date dataPublicacao, String iSSN, String dOI,
			String classificacao) {
		super();
		this.id = id;
		this.autores = autores;
		this.tituloTrabalho = tituloTrabalho;
		this.nomeRevista = nomeRevista;
		this.volume = volume;
		this.numero = numero;
		this.paginas = paginas;
		this.dataPublicacao = dataPublicacao;
		ISSN = iSSN;
		DOI = dOI;
		this.classificacao = classificacao;
	}
	
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private HashSet<String> autores;

	private String tituloTrabalho;
	private String nomeRevista;
	private Integer volume;
	private Integer numero;
	private Integer paginas;
	private Date dataPublicacao;
	private String ISSN;
	private String DOI;
	
	private String classificacao;
	
	public HashSet<String> getAutores() {
		return autores;
	}
	public void setAutores(HashSet<String> autores) {
		this.autores = autores;
	}
	
	
	public String getTituloTrabalho() {
		return tituloTrabalho;
	}
	public void setTituloTrabalho(String tituloTrabalho) {
		this.tituloTrabalho = tituloTrabalho;
	}
	
	public String getNomeRevista() {
		return nomeRevista;
	}
	public void setNomeRevista(String nomeRevista) {
		this.nomeRevista = nomeRevista;
	}
	
	public Integer getVolume() {
		return volume;
	}
	public void setVolume(Integer volume) {
		this.volume = volume;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getPaginas() {
		return paginas;
	}
	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}
	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public String getISSN() {
		return ISSN;
	}
	public void setISSN(String iSSN) {
		ISSN = iSSN;
	}
	public String getDOI() {
		return DOI;
	}
	public void setDOI(String dOI) {
		DOI = dOI;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
}
