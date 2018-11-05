package ifmg.rad.modelo.atividades;

import ifmg.rad.modelo.Atividade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EnsinoOrientacaoMonitoria extends Atividade{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nomeAluno;
	private String disciplina;
	
	public EnsinoOrientacaoMonitoria() {}
	
	public EnsinoOrientacaoMonitoria(Integer id, String nomeAluno, String disciplina) {
		super();
		this.id = id;
		this.nomeAluno = nomeAluno;
		this.disciplina = disciplina;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	
}
