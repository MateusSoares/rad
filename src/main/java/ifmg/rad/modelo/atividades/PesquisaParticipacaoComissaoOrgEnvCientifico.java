package ifmg.rad.modelo.atividades;

import ifmg.rad.modelo.Atividade;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PesquisaParticipacaoComissaoOrgEnvCientifico extends Atividade {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PesquisaParticipacaoComissaoOrgEnvCientifico() {}
	
	public PesquisaParticipacaoComissaoOrgEnvCientifico(Integer id, String nomeEvento, String classificacao, Date data,
			String local) {
		super();
		this.id = id;
		this.nomeEvento = nomeEvento;
		this.classificacao = classificacao;
		this.data = data;
		this.local = local;
	}
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nomeEvento;
	private String classificacao;
	private Date data;
	private String local;
	
	public String getNomeEvento() {
		return nomeEvento;
	}
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}

}
