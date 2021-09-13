package cl.awakelab.evaluacionModulo5.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="usuario")
public class Usuario {
	
	
	@Id
	@Column(name="runuser")
	private int id;
	
	@Column(name="nomuser")
	private String nom;
	
	@Column(name="apeuser")
	private String ape;
	
	@Column(name="fecuser")
	private String fec;
	
	@Column(name="tipuser")
	private int tip;
	
	@OneToMany(mappedBy ="usuario")
	private List<Administrativo> administrativo;
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int id, String nom, String ape, String fec, int tip, List<Administrativo> administrativo) {
		super();
		this.id = id;
		this.nom = nom;
		this.ape = ape;
		this.fec = fec;
		this.tip = tip;
		this.administrativo = administrativo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getApe() {
		return ape;
	}

	public void setApe(String ape) {
		this.ape = ape;
	}

	public String getFec() {
		return fec;
	}

	public void setFec(String fec) {
		this.fec = fec;
	}

	public int getTip() {
		return tip;
	}

	public void setTip(int tip) {
		this.tip = tip;
	}

	public List<Administrativo> getAdministrativo() {
		return administrativo;
	}

	public void setAdministrativo(List<Administrativo> administrativo) {
		this.administrativo = administrativo;
	}
	
	
}