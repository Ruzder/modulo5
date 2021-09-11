package cl.awakelab.evaluacionModulo5.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="usuario_runuser", referencedColumnName = "usuario_runuser")
	 * Usuario usuario; // tiene que ser declarado como objeto
	 */
}
