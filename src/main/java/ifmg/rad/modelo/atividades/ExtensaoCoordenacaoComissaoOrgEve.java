package ifmg.rad.modelo.atividades;

import ifmg.rad.modelo.Atividade;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExtensaoCoordenacaoComissaoOrgEve extends Atividade {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ExtensaoCoordenacaoComissaoOrgEve() {}
	
	public ExtensaoCoordenacaoComissaoOrgEve(Integer id, String nomeDoEvento, Date data, String local) {
		super();
		this.id = id;
		this.nomeDoEvento = nomeDoEvento;
		this.data = data;
		this.local = local;
	}
	
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nomeDoEvento;
	private Date data;
	private String local;
	public String getNomeDoEvento() {
		return nomeDoEvento;
	}
	public void setNomeDoEvento(String nomeDoEvento) {
		this.nomeDoEvento = nomeDoEvento;
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
