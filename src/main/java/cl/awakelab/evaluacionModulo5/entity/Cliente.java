package cl.awakelab.evaluacionModulo5.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="cliente")
public class Cliente {
	
	@Id
	@Column(name="rutcli")
	private int idCli;
	
	@Column(name="dircli")
	private String dirCli;
	
	@Column(name="comcli")
	private String comCli;
	
	@Column(name="canempcli")
	private int canCli;
	
	@Column(name="telcli")
	private String telCli;
	
	@Column(name="razsoccli")
	private String razCli;
	
	@OneToOne
	@JoinColumn(name="usuario_runuser")
	private Usuario usuario;

	public Cliente() {
		super();
	}

	public Cliente(int idCli, String dirCli, String comCli, int canCli, String telCli, String razCli, Usuario usuario) {
		super();
		this.idCli = idCli;
		this.dirCli = dirCli;
		this.comCli = comCli;
		this.canCli = canCli;
		this.telCli = telCli;
		this.razCli = razCli;
		this.usuario = usuario;
	}

	public int getIdCli() {
		return idCli;
	}

	public void setIdCli(int idCli) {
		this.idCli = idCli;
	}

	public String getDirCli() {
		return dirCli;
	}

	public void setDirCli(String dirCli) {
		this.dirCli = dirCli;
	}

	public String getComCli() {
		return comCli;
	}

	public void setComCli(String comCli) {
		this.comCli = comCli;
	}

	public int getCanCli() {
		return canCli;
	}

	public void setCanCli(int canCli) {
		this.canCli = canCli;
	}

	public String getTelCli() {
		return telCli;
	}

	public void setTelCli(String telCli) {
		this.telCli = telCli;
	}

	public String getRazCli() {
		return razCli;
	}

	public void setRazCli(String razCli) {
		this.razCli = razCli;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
