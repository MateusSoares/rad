package ifmg.rad.modelo.atividades;

import ifmg.rad.modelo.Atividade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EnsinoEstudosOrientados extends Atividade {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nomeDaDisciplina;
	
	public EnsinoEstudosOrientados() {}
	
	public EnsinoEstudosOrientados(Integer id, String nomeDaDisciplina) {
		super();
		this.id = id;
		this.nomeDaDisciplina = nomeDaDisciplina;
	}

	public String getNomeDaDisciplina() {
		return nomeDaDisciplina;
	}

	public void setNomeDaDisciplina(String nomeDaDisciplina) {
		this.nomeDaDisciplina = nomeDaDisciplina;
	}

}
