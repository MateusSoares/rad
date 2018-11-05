package ifmg.rad.modelo.atividades;

import ifmg.rad.modelo.Atividade;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EnsinoOrientacaoTCC extends Atividade {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public EnsinoOrientacaoTCC() {}
	
	public EnsinoOrientacaoTCC(Integer id, ArrayList<String> alunos_curso) {
		super();
		this.id = id;
		this.alunos_curso = alunos_curso;
	}
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private ArrayList<String> alunos_curso;

	public ArrayList<String> getAlunos_curso() {
		return alunos_curso;
	}
	public void setAlunos_curso(ArrayList<String> alunos_curso) {
		this.alunos_curso = alunos_curso;
	}
}
