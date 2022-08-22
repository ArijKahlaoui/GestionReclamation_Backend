package xtensus.stage.GReclamation.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EtatSuivi {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long etatSuiviId;
	@Column(length=45)
	private String etatSuiviLibelle;
	@Column(length=1000)
	private String etatSuiviDescription;
	
	
	
	
	public EtatSuivi() {
		super();
	}
	
	public Long getEtatSuiviId() {
		return etatSuiviId;
	}
	public void setEtatSuiviId(Long etatSuiviId) {
		this.etatSuiviId = etatSuiviId;
	}
	public String getEtatSuiviLibelle() {
		return etatSuiviLibelle;
	}
	public void setEtatSuiviLibelle(String etatSuiviLibelle) {
		this.etatSuiviLibelle = etatSuiviLibelle;
	}
	public String getEtatSuiviDescription() {
		return etatSuiviDescription;
	}
	public void setEtatSuiviDescription(String etatSuiviDescription) {
		this.etatSuiviDescription = etatSuiviDescription;
	}

	
	
}
