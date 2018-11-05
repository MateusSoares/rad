package ifmg.rad.modelo;

import java.io.Serializable;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="UserType",discriminatorType=DiscriminatorType.STRING)
public abstract class UsuarioAutenticado implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Column(name="Nome",nullable=false,unique=true)
	private String nome;
	@Column(name="Email",nullable=false,unique=true)
	private String email;
	@Column(name="Senha",nullable=false,unique=false)
	private String senha;
	@Column(name="Login",nullable=false,unique=true)
	private String login;
	@Column(name="Codigo")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	
	private HashSet<String> cargo;
	
	public UsuarioAutenticado() {
		
	}
	public UsuarioAutenticado(String nome, String email, String senha, String login) {
		this.nome  = nome;
		this.email = email;
		this.senha = senha;
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioAutenticado other = (UsuarioAutenticado) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UsuarioAutenticado [nome=" + nome + ", email=" + email + ", senha=" + senha + ", login=" + login
				+ ", codigo=" + codigo + "]";
	}
	public HashSet<String> getCargo() {
		return cargo;
	}
	public void setCargo(HashSet<String> cargo) {
		this.cargo = cargo;
	}
}
