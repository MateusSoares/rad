package ifmg.rad.modelo.atividades;

import ifmg.rad.modelo.Atividade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PesquisaParticipacaoMembroRevista extends Atividade {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PesquisaParticipacaoMembroRevista() {}
	
	public PesquisaParticipacaoMembroRevista(Integer id, String nomeDaRevista, String issn) {
		super();
		this.id = id;
		this.nomeDaRevista = nomeDaRevista;
		this.issn = issn;
	}
	
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nomeDaRevista;
	private String issn;
	
	public String getNomeDaRevista() {
		return nomeDaRevista;
	}
	public void setNomeDaRevista(String nomeDaRevista) {
		this.nomeDaRevista = nomeDaRevista;
	}
	
	public String getIssn() {
		return issn;
	}
	public void setIssn(String issn) {
		this.issn = issn;
	}
	
	

}
