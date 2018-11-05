package ifmg.rad.modelo.atividades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import ifmg.rad.modelo.Atividade;

@Entity
public class EnsinoAula extends Atividade{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public EnsinoAula() {}
	
	public EnsinoAula(Integer id, String nomeDisciplina, Integer cargaHorariaSemanal) {
		super();
		this.id = id;
		this.nomeDisciplina = nomeDisciplina;
		this.cargaHorariaSemanal = cargaHorariaSemanal;
	}

	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nomeDisciplina;
	private Integer cargaHorariaSemanal;
	

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public Integer getCargaHorariaSemanal() {
		return cargaHorariaSemanal;
	}

	public void setCargaHorariaSemanal(Integer cargaHorariaSemanal) {
		this.cargaHorariaSemanal = cargaHorariaSemanal;
	}
	
}
