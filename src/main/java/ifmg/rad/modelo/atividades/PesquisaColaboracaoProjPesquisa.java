package ifmg.rad.modelo.atividades;

import ifmg.rad.modelo.Atividade;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PesquisaColaboracaoProjPesquisa extends Atividade {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PesquisaColaboracaoProjPesquisa() {}
	
	public PesquisaColaboracaoProjPesquisa(Integer id, String tituloProjeto, Date vigenciaDe, Date vigenciaAte,
			String instituicaoFomento, String coordenador, ArrayList<String> alunos_curso) {
		super();
		this.id = id;
		this.tituloProjeto = tituloProjeto;
		this.vigenciaDe = vigenciaDe;
		this.vigenciaAte = vigenciaAte;
		this.instituicaoFomento = instituicaoFomento;
		this.coordenador = coordenador;
		this.alunos_curso = alunos_curso;
	}
	
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String tituloProjeto;
	private Date vigenciaDe;
	private Date vigenciaAte;
	
	private String instituicaoFomento;
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
	public String getInstituicaoFomento() {
		return instituicaoFomento;
	}
	public void setInstituicaoFomento(String instituicaoFomento) {
		this.instituicaoFomento = instituicaoFomento;
	}
	public ArrayList<String> getAlunos_curso() {
		return alunos_curso;
	}
	public void setAlunos_curso(ArrayList<String> alunos_curso) {
		this.alunos_curso = alunos_curso;
	}
	public String getCoordenador() {
		return coordenador;
	}
	public void setCoordenador(String coordenador) {
		this.coordenador = coordenador;
	}

}
