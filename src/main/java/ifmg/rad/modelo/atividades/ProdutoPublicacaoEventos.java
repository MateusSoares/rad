package ifmg.rad.modelo.atividades;

import ifmg.rad.modelo.Atividade;
import java.util.Date;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProdutoPublicacaoEventos extends Atividade{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ProdutoPublicacaoEventos() {}
	
	public ProdutoPublicacaoEventos(Integer id, HashSet<String> autores, String nomeEvento, String local,
			Date dataRealizacao, String issn, String doi, String tipoEvento) {
		super();
		this.id = id;
		this.autores = autores;
		this.nomeEvento = nomeEvento;
		this.local = local;
		this.dataRealizacao = dataRealizacao;
		this.issn = issn;
		this.doi = doi;
		this.tipoEvento = tipoEvento;
	}

	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private HashSet<String> autores;
	private String nomeEvento;
	private String local;
	private Date dataRealizacao;
	private String issn;
	private String doi;
	
	private String tipoEvento;

	public HashSet<String> getAutores() {
		return autores;
	}

	public void setAutores(HashSet<String> autores) {
		this.autores = autores;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Date getDataRealizacao() {
		return dataRealizacao;
	}

	public void setDataRealizacao(Date dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}	
}
