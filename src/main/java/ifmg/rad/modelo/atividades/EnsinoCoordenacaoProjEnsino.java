package ifmg.rad.modelo.atividades;

import ifmg.rad.modelo.Atividade;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EnsinoCoordenacaoProjEnsino extends Atividade {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public EnsinoCoordenacaoProjEnsino() {}
	
	public EnsinoCoordenacaoProjEnsino(Integer id, String tituloProjeto, Date vigenciaDe, Date vigenciaAte,
			String coordenador, ArrayList<String> alunos_curso) {
		super();
		this.id = id;
		this.tituloProjeto = tituloProjeto;
		this.vigenciaDe = vigenciaDe;
		this.vigenciaAte = vigenciaAte;
		this.coordenador = coordenador;
		this.alunos_curso = alunos_curso;
	}
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String tituloProjeto;
	private Date vigenciaDe;
	private Date vigenciaAte;
	
	private String coordenador;
	private ArrayList<String> alunos_curso;
	public String getTituloProjeto() {
		return tituloProjeto;
	}
	public void setTituloProjeto(String tituloProjeto) {
		this.tituloProjeto = tituloProjeto;
	}
	public Date getVigenciaDe() {
		return vigenciaDe;
	}
	public void setVigenciaDe(Date vigenciaDe) {
		this.vigenciaDe = vigenciaDe;
	}
	public Date getVigenciaAte() {
		return vigenciaAte;
	}
	public void setVigenciaAte(Date vigenciaAte) {
		this.vigenciaAte = vigenciaAte;
	}
	public String getCoordenador() {
		return coordenador;
	}
	public void setCoordenador(String coordenador) {
		this.coordenador = coordenador;
	}
	public ArrayList<String> getAlunos_curso() {
		return alunos_curso;
	}
	public void setAlunos_curso(ArrayList<String> alunos_curso) {
		this.alunos_curso = alunos_curso;
	}

}
