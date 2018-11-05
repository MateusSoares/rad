package ifmg.rad.modelo.atividades;

import ifmg.rad.modelo.Atividade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PesquisaParecerAdHocProjetoTrabalho extends Atividade {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PesquisaParecerAdHocProjetoTrabalho() {}
	
	public PesquisaParecerAdHocProjetoTrabalho(Integer id, String numEdital, String nomeEvento, String campus,
			Integer numTrabalhosAvaliados) {
		super();
		this.id = id;
		this.numEdital = numEdital;
		this.nomeEvento = nomeEvento;
		this.campus = campus;
		this.numTrabalhosAvaliados = numTrabalhosAvaliados;
	}

	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String numEdital;
	private String nomeEvento;
	
	private String campus;
	
	private Integer numTrabalhosAvaliados;

	public String getNumEdital() {
		return numEdital;
	}

	public void setNumEdital(String numEdital) {
		this.numEdital = numEdital;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public Integer getNumTrabalhosAvaliados() {
		return numTrabalhosAvaliados;
	}

	public void setNumTrabalhosAvaliados(Integer numTrabalhosAvaliados) {
		this.numTrabalhosAvaliados = numTrabalhosAvaliados;
	}
	
	

}
