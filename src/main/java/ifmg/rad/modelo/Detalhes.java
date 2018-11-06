package ifmg.rad.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Detalhes implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo ;
	@OneToOne
	@JoinColumn(name="codAtividade")
	private Atividade atividade ;
	
	//@OneToOne
	//@JoinColumn(name="codDisciplina")
	//private UsuarioAutenticado disciplina;
	
	public Detalhes() {
		
	}

	public Detalhes(Atividade atividade) {
		this.atividade = atividade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
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
		Detalhes other = (Detalhes) obj;
		if (codigo != other.codigo) {
			return false;
		}
		return true;
	}
	
	
}
