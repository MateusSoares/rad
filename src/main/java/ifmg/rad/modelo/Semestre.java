package ifmg.rad.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Semestre implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo ;
	private int ano ;
	@Temporal(TemporalType.DATE)
	private Date inicio ;
	@Temporal(TemporalType.DATE)
	private Date fim ;
	
	public Semestre() {
		
	}

	public Semestre(int ano, Date inicio, Date fim) {
		this.ano = ano;
		this.inicio = inicio;
		this.fim = fim;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
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
		Semestre other = (Semestre) obj;
		if (codigo != other.codigo) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Semestre :" + this.ano + ". Início: " + this.inicio + ", final: " + this.fim ; 
	}
	
	
	
	
}
