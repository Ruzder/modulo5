package cl.awakelab.evaluacionModulo5.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Profesionales")
public class Profesional {
	
	@Id
	@Column(name="idpro")
	private int idPro;
	
	@Column(name="exppro")
	private int expPro;
	
	@Column(name="deppro")
	private String depPro;
	
	@Column(name="titpro")
	private String titPro;
	
	@Column(name="fecpro")
	private String fecPro;
	
	@OneToOne
	@JoinColumn(name="usuario_runuser")
	private Usuario usuario;

	public Profesional() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profesional(int idPro, int expPro, String depPro, String titPro, String fecPro, Usuario usuario) {
		super();
		this.idPro = idPro;
		this.expPro = expPro;
		this.depPro = depPro;
		this.titPro = titPro;
		this.fecPro = fecPro;
		this.usuario = usuario;
	}

	public int getIdPro() {
		return idPro;
	}

	public void setIdPro(int idPro) {
		this.idPro = idPro;
	}

	public int getExpPro() {
		return expPro;
	}

	public void setExpPro(int expPro) {
		this.expPro = expPro;
	}

	public String getDepPro() {
		return depPro;
	}

	public void setDepPro(String depPro) {
		this.depPro = depPro;
	}

	public String getTitPro() {
		return titPro;
	}

	public void setTitPro(String titPro) {
		this.titPro = titPro;
	}

	public String getFecPro() {
		return fecPro;
	}

	public void setFecPro(String fecPro) {
		this.fecPro = fecPro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
