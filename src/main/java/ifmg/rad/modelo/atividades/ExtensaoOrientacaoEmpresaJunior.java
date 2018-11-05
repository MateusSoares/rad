package ifmg.rad.modelo.atividades;

import ifmg.rad.modelo.Atividade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExtensaoOrientacaoEmpresaJunior extends Atividade {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ExtensaoOrientacaoEmpresaJunior() {}
	
	public ExtensaoOrientacaoEmpresaJunior(Integer id, String nomeDaEmpresa, String campus) {
		super();
		this.id = id;
		this.nomeDaEmpresa = nomeDaEmpresa;
		this.campus = campus;
	}
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nomeDaEmpresa;
	private String campus;
	public String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}
	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		this.nomeDaEmpresa = nomeDaEmpresa;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}

}
