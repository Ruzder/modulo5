package cl.awakelab.evaluacionModulo5.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="usuario")
public class Usuario {
	
	@Id
	@Column(name="runUser")
	private int runUserEntity;
	
	@Column(name="nomUser")
	private String nomUserEntity;
	
	@Column(name="apeUser")
	private String apeUserEntity;
	
	@Column(name="fecUser")
	private String fecUserEntity;
	
	@Column(name="tipUser")
	private int tipUserEntity;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int runUserEntity, String nomUserEntity, String apeUserEntity, String fecUserEntity,
			int tipUserEntity) {
		super();
		this.runUserEntity = runUserEntity;
		this.nomUserEntity = nomUserEntity;
		this.apeUserEntity = apeUserEntity;
		this.fecUserEntity = fecUserEntity;
		this.tipUserEntity = tipUserEntity;
	}

	public int getRunUserEntity() {
		return runUserEntity;
	}

	public void setRunUserEntity(int runUserEntity) {
		this.runUserEntity = runUserEntity;
	}

	public String getNomUserEntity() {
		return nomUserEntity;
	}

	public void setNomUserEntity(String nomUserEntity) {
		this.nomUserEntity = nomUserEntity;
	}

	public String getApeUserEntity() {
		return apeUserEntity;
	}

	public void setApeUserEntity(String apeUserEntity) {
		this.apeUserEntity = apeUserEntity;
	}

	public String getFecUserEntity() {
		return fecUserEntity;
	}

	public void setFecUserEntity(String fecUserEntity) {
		this.fecUserEntity = fecUserEntity;
	}

	public int getTipUserEntity() {
		return tipUserEntity;
	}

	public void setTipUserEntity(int tipUserEntity) {
		this.tipUserEntity = tipUserEntity;
	}
}
