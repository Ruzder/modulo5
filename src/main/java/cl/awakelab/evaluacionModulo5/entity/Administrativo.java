package cl.awakelab.evaluacionModulo5.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name ="administrativos")
public class Administrativo {

	
	@Id
	@Column(name="idadm")
	private int id;
	
	@Column(name="nomsupadm")
	private String nomSup;
	
	@Column(name="areaadm")
	private String area;
	
	@Column(name="expadm")
	private String expAdm;
	
	@Column(name="funadm")
	private String funAdm;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="usuario_runuser")
	private Usuario usuario;
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="usuario_runuser", referencedColumnName = "usuario_runuser")
	 * Usuario usuario; // tiene que ser declarado como objeto
	 */

	public Administrativo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrativo(int id, String nomSup, String area, String expAdm, String funAdm, Usuario usuario) {
		super();
		this.id = id;
		this.nomSup = nomSup;
		this.area = area;
		this.expAdm = expAdm;
		this.funAdm = funAdm;
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomSup() {
		return nomSup;
	}

	public void setNomSup(String nomSup) {
		this.nomSup = nomSup;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExpAdm() {
		return expAdm;
	}

	public void setExpAdm(String expAdm) {
		this.expAdm = expAdm;
	}

	public String getFunAdm() {
		return funAdm;
	}

	public void setFunAdm(String funAdm) {
		this.funAdm = funAdm;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}	 
	
}
