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
	private int idAdm;
	
	@Column(name="nomsupadm")
	private String nomAdm;
	
	@Column(name="areaadm")
	private String areAdm;
	
	@Column(name="expadm")
	private String expAdm;
	
	@Column(name="funadm")
	private String funAdm;

	@OneToOne  
	@JoinColumn(name="usuario_runuser")
	 private Usuario usuario;
	 
	
	  

	public Administrativo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Administrativo(int idAdm, String nomAdm, String areAdm, String expAdm, String funAdm, Usuario usuario) {
		super();
		this.idAdm = idAdm;
		this.nomAdm = nomAdm;
		this.areAdm = areAdm;
		this.expAdm = expAdm;
		this.funAdm = funAdm;
		this.usuario = usuario;
	}
	public int getIdAdm() {
		return idAdm;
	}
	public void setIdAdm(int idAdm) {
		this.idAdm = idAdm;
	}
	public String getNomAdm() {
		return nomAdm;
	}
	public void setNomAdm(String nomAdm) {
		this.nomAdm = nomAdm;
	}
	public String getAreAdm() {
		return areAdm;
	}
	public void setAreAdm(String areAdm) {
		this.areAdm = areAdm;
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