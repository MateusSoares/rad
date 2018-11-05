package ifmg.rad.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Atividade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo ;
	private String nome ;
	private int valor ;
	private int qtdHora ;
	
	public Atividade() {
		
	}

	public Atividade(String nome, int valor, int qtdHora) {
		this.nome = nome;
		this.valor = valor;
		this.qtdHora = qtdHora;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getQtdHora() {
		return qtdHora;
	}

	public void setQtdHora(int qtdHora) {
		this.qtdHora = qtdHora;
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
		Atividade other = (Atividade) obj;
		if (codigo != other.codigo) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Atividade: " + this.nome;
	}
	
	
}
