package xtensus.stage.GReclamation.entities;


import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="etapesdemandes")
public class EtapesDemandes  implements Serializable{

	/**
	 * 
	 */

	private static final long serialVersionUID = -835031884075936779L;
	private Integer etapesDemandesId ;
	private String etapesDemandesLibelle;
	private String etapesDemandesDescription;
	private Integer etapesDemandesDelaiExecution;
	private Integer etapesDemandesOrdre;
	private Boolean etapesDemandesEnvoiAlerte;
	private  Integer etapesDemandesDureeJour;
	private Boolean etapesDemandesDureeJourOuvrable;
	private ActeurType etapesDemandesActeurType;
	private DemandesType etapesDemandesType;
	public EtapesDemandes() {
		super();
	}
	public EtapesDemandes(Integer etapesDemandesId, String etapesDemandesLibelle, String etapesDemandesDescription,
			Integer etapesDemandesDelaiExecution, Integer etapesDemandesOrdre, Boolean etapesDemandesEnvoiAlerte,
			Integer etapesDemandesDureeJour, Boolean etapesDemandesDureeJourOuvrable,
			ActeurType etapesDemandesActeurType, DemandesType etapesDemandesType) {
		super();
		this.etapesDemandesId = etapesDemandesId;
		this.etapesDemandesLibelle = etapesDemandesLibelle;
		this.etapesDemandesDescription = etapesDemandesDescription;
		this.etapesDemandesDelaiExecution = etapesDemandesDelaiExecution;
		this.etapesDemandesOrdre = etapesDemandesOrdre;
		this.etapesDemandesEnvoiAlerte = etapesDemandesEnvoiAlerte;
		this.etapesDemandesDureeJour = etapesDemandesDureeJour;
		this.etapesDemandesDureeJourOuvrable = etapesDemandesDureeJourOuvrable;
		this.etapesDemandesActeurType = etapesDemandesActeurType;
		this.etapesDemandesType = etapesDemandesType;
	}
	
	
	@Id
	@GeneratedValue(strategy=IDENTITY)
	@Column(name="etapesDemandesId",unique=true,nullable=false)
	public Integer getEtapesDemandesId() {
		return etapesDemandesId;
	}
	public void setEtapesDemandesId(Integer etapesDemandesId) {
		this.etapesDemandesId = etapesDemandesId;
	}
	@Column(name = "etapesDemandesLibelle", length =45)
	public String getEtapesDemandesLibelle() {
		return etapesDemandesLibelle;
	}
	public void setEtapesDemandesLibelle(String etapesDemandesLibelle) {
		this.etapesDemandesLibelle = etapesDemandesLibelle;
	}
	@Column(name = "etapesDemandesDescription", length =1000)
	public String getEtapesDemandesDescription() {
		return etapesDemandesDescription;
	}
	public void setEtapesDemandesDescription(String etapesDemandesDescription) {
		this.etapesDemandesDescription = etapesDemandesDescription;
	}
	@Column(name = "etapesDemandesDelaiExecution")
	public Integer getEtapesDemandesDelaiExecution() {
		return etapesDemandesDelaiExecution;
	}
	public void setEtapesDemandesDelaiExecution(Integer etapesDemandesDelaiExecution) {
		this.etapesDemandesDelaiExecution = etapesDemandesDelaiExecution;
	}
	@Column(name = "etapesDemandesOrdre")
	public Integer getEtapesDemandesOrdre() {
		return etapesDemandesOrdre;
	}
	public void setEtapesDemandesOrdre(Integer etapesDemandesOrdre) {
		this.etapesDemandesOrdre = etapesDemandesOrdre;
	}
	@Column(name = "etapesDemandesEnvoiAlerte")
	public Boolean getEtapesDemandesEnvoiAlerte() {
		return etapesDemandesEnvoiAlerte;
	}
	public void setEtapesDemandesEnvoiAlerte(Boolean etapesDemandesEnvoiAlerte) {
		this.etapesDemandesEnvoiAlerte = etapesDemandesEnvoiAlerte;
	}
	@Column(name = "etapesDemandesDureeJour")
	public Integer getEtapesDemandesDureeJour() {
		return etapesDemandesDureeJour;
	}
	public void setEtapesDemandesDureeJour(Integer etapesDemandesDureeJour) {
		this.etapesDemandesDureeJour = etapesDemandesDureeJour;
	}
	@Column(name = "etapesDemandesDureeJourOuvrable")
	public Boolean getEtapesDemandesDureeJourOuvrable() {
		return etapesDemandesDureeJourOuvrable;
	}
	public void setEtapesDemandesDureeJourOuvrable(Boolean etapesDemandesDureeJourOuvrable) {
		this.etapesDemandesDureeJourOuvrable = etapesDemandesDureeJourOuvrable;
	}
	@ManyToOne( fetch=FetchType.EAGER)
	@JoinColumn(name = "etapesDemandesActeurType")
	public ActeurType getEtapesDemandesActeurType() {
		return etapesDemandesActeurType;
	}
	public void setEtapesDemandesActeurType(ActeurType etapesDemandesActeurType) {
		this.etapesDemandesActeurType = etapesDemandesActeurType;
	}

	@ManyToOne( fetch=FetchType.EAGER)
	@JoinColumn(name = "etapesDemandesType")
	
	public DemandesType getEtapesDemandesType() {
		return etapesDemandesType;
	}
	public void setEtapesDemandesType(DemandesType etapesDemandesType) {
		this.etapesDemandesType = etapesDemandesType;
	}


	

}
