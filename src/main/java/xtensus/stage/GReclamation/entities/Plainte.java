package xtensus.stage.GReclamation.entities;
import static javax.persistence.GenerationType.IDENTITY;


import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

/**
 * Entity implementation class for Entity: Plainte
 *
 */
@Entity
@Table(name = "plainte")
public class Plainte implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	
	private Integer plainteId;
	private String plainteObjet;
	private String plainteDescription;
    private Date plainteDate;
    private Appeloffre appeloffre;
    private Soumissionnaire soumissionnaire;
    private DemandesType demandesType; 
    //private CategoriePlainte categoriePlainte;
    //private int etatId;
    
    
    public Plainte(){
    	
    }
    
	public Plainte(Integer plainteId, String plainteObjet,
			String plainteDescription, Date plainteDate,DemandesType demandesType) {
		super();
		this.plainteId = plainteId;
		this.plainteObjet = plainteObjet;
		this.plainteDescription = plainteDescription;
		this.plainteDate = plainteDate;
		this.demandesType= demandesType;
	}
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "plainteId", unique = true, nullable = false)
	public Integer getPlainteId() {
		return plainteId;
	}
	public void setPlainteId(Integer plainteId) {
		this.plainteId = plainteId;
	}
	
	@Column(name = "plainteObjet", length = 254)
	public String getPlainteObjet() {
		return plainteObjet;
	}
	public void setPlainteObjet(String plainteObjet) {
		this.plainteObjet = plainteObjet;
	}
	@Column(name = "plainteDescription", length = 254)
	public String getPlainteDescription() {
		return plainteDescription;
	}
	public void setPlainteDescription(String plainteDescription) {
		this.plainteDescription = plainteDescription;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-mm-dd",shape = Shape.STRING)
	@Column(name = "plainteDate", length = 19)
	public Date getPlainteDate() {
		return plainteDate;
	}
	public void setPlainteDate(Date plainteDate) {
		this.plainteDate = plainteDate;
	}

	public void setAppeloffre(Appeloffre appeloffre) {
		this.appeloffre = appeloffre;
	}
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "plainteAoReference")
	public Appeloffre getAppeloffre() {
		return appeloffre;
	}


	public void setSoumissionnaire(Soumissionnaire soumissionnaire) {
		this.soumissionnaire = soumissionnaire;
	}
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "plainteSoumissionaireReference")
	public Soumissionnaire getSoumissionnaire() {
		return soumissionnaire;
	}
	
	public void setDemandesType(DemandesType demandesType) {
		this.demandesType = demandesType;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "demandeTypeId")
	public DemandesType getDemandesType() {
		return demandesType;
	}

	/*
	public void setCategoriePlainte(CategoriePlainte categoriePlainte) {
		this.categoriePlainte = categoriePlainte;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "categoriePlainteId")
	public CategoriePlainte getCategoriePlainte() {
		return categoriePlainte;
	}*/

	/*public void setEtatId(int etatId) {
		this.etatId = etatId;
	}
	@Column(name = "etatId")
	public int getEtatId() {
		return etatId;
	}*/
	


   
}
