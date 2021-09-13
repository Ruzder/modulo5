package cl.awakelab.evaluacionModulo5.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Cliente")
public class Cliente {
	
	
	@Id
	@Column(name="rutcli")
	private int rutEntity;
	
	@Column(name="dircli")
	private String dirEntity;
	
	@Column(name="comcli")
	private String comEntity;
	
	@Column(name="canempcli")
	private int canEntity;
	
	@Column(name="telcli")
	private int telEntity;
	
	@Column(name="razsoccli")
	private int razEntity;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="usuario_runuser")
	private Usuario usuario;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(int rutEntity, String dirEntity, String comEntity, int canEntity, int telEntity, int razEntity,
			Usuario usuario) {
		super();
		this.rutEntity = rutEntity;
		this.dirEntity = dirEntity;
		this.comEntity = comEntity;
		this.canEntity = canEntity;
		this.telEntity = telEntity;
		this.razEntity = razEntity;
		this.usuario = usuario;
	}

	public int getRutEntity() {
		return rutEntity;
	}

	public void setRutEntity(int rutEntity) {
		this.rutEntity = rutEntity;
	}

	public String getDirEntity() {
		return dirEntity;
	}

	public void setDirEntity(String dirEntity) {
		this.dirEntity = dirEntity;
	}

	public String getComEntity() {
		return comEntity;
	}

	public void setComEntity(String comEntity) {
		this.comEntity = comEntity;
	}

	public int getCanEntity() {
		return canEntity;
	}

	public void setCanEntity(int canEntity) {
		this.canEntity = canEntity;
	}

	public int getTelEntity() {
		return telEntity;
	}

	public void setTelEntity(int telEntity) {
		this.telEntity = telEntity;
	}

	public int getRazEntity() {
		return razEntity;
	}

	public void setRazEntity(int razEntity) {
		this.razEntity = razEntity;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
