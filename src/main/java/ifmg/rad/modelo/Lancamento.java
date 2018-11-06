package ifmg.rad.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Lancamento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo ;
	@OneToOne
	@JoinColumn(name="codSemestre")
	private Semestre semestre ;
	
	@OneToOne
	@JoinColumn(name="codUsuarioAutenticado")
	private Pessoa professor;
	@ManyToMany
	@JoinTable(
			name="LancamentoDetalhes",
			joinColumns=@JoinColumn(name="CodLancamento"),
			inverseJoinColumns=@JoinColumn(name="codDetalhe")
			)
	private List<Detalhes> detalhes = new ArrayList<Detalhes>() ;
	
	public Lancamento () {
		
	}

	public Lancamento(Semestre semestre, List<Detalhes> detalhes) {
		this.semestre = semestre;
		this.detalhes = detalhes;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Semestre getSemestre() {
		return semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

	public List<Detalhes> getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(List<Detalhes> detalhes) {
		this.detalhes = detalhes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Lancamento other = (Lancamento) obj;
		if (codigo != other.codigo) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Lancamento [semestre=" + semestre + ", detalhes=" + detalhes + "]";
	}
	
	
	
	
}
