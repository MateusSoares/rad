package ifmg.rad.modelo.atividades;

import ifmg.rad.modelo.Atividade;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExtensaoOrganizacaoRealizacaoVisitaTecnica extends Atividade {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ExtensaoOrganizacaoRealizacaoVisitaTecnica() {}
	
	public ExtensaoOrganizacaoRealizacaoVisitaTecnica(Integer id, String localDaVisita, Date dataDaVisita, String turma,
			Integer numAlunos) {
		super();
		this.id = id;
		this.localDaVisita = localDaVisita;
		this.dataDaVisita = dataDaVisita;
		this.turma = turma;
		this.numAlunos = numAlunos;
	}
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String localDaVisita;
	private Date dataDaVisita;
	private String turma;
	private Integer numAlunos;
	
	public String getLocalDaVisita() {
		return localDaVisita;
	}
	public void setLocalDaVisita(String localDaVisita) {
		this.localDaVisita = localDaVisita;
	}
	public Date getDataDaVisita() {
		return dataDaVisita;
	}
	public void setDataDaVisita(Date dataDaVisita) {
		this.dataDaVisita = dataDaVisita;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public Integer getNumAlunos() {
		return numAlunos;
	}
	public void setNumAlunos(Integer numAlunos) {
		this.numAlunos = numAlunos;
	}

}
