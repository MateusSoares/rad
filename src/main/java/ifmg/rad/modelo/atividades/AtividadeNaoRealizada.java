package ifmg.rad.modelo.atividades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import ifmg.rad.modelo.Atividade;

@Entity
public class AtividadeNaoRealizada extends Atividade {

    public AtividadeNaoRealizada() {}
	
	public AtividadeNaoRealizada(Integer id, String justificativa) {
		super();
		this.id = id;
		this.justificativa = justificativa;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String justificativa;

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	
}
