package xtensus.stage.GReclamation.entities;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="categorie")
public class Categorie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4045795257450126474L;
	private Integer categorieId;
	private String categorieLibelle;
	private String categorieAcronyme;
	private String categorieDescription;
	public Categorie() {
		super();
	}
	public Categorie(Integer categorieId, String categorieLibelle, String categorieAcronyme,String categorieDescription) {
		super();
		this.categorieId = categorieId;
		this.categorieLibelle = categorieLibelle;
		this.categorieAcronyme = categorieAcronyme;
		this.categorieDescription=categorieDescription;
	}
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "categorieId", unique = true, nullable = false)
	public Integer getCategorieId() {
		return categorieId;
	}
	public void setCategorieId(Integer categorieId) {
		this.categorieId = categorieId;
	}
	@Column(name = "categorieLibelle", length = 45)
	public String getCategorieLibelle() {
		return categorieLibelle;
	}
	public void setCategorieLibelle(String categorieLibelle) {
		this.categorieLibelle = categorieLibelle;
	}
	@Column(name = "categorieAcronyme", length = 45)
	public String getCategorieAcronyme() {
		return categorieAcronyme;
	}
	public void setCategorieAcronyme(String categorieAcronyme) {
		this.categorieAcronyme = categorieAcronyme;
	}
	public String getCategorieDescription() {
		return categorieDescription;
	}
	public void setCategorieDescription(String categorieDescription) {
		this.categorieDescription = categorieDescription;
	}

}
