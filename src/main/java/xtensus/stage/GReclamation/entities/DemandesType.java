package xtensus.stage.GReclamation.entities;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class DemandesType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer demandeTypeId;
	@Column(length=45)
	private String demandeTypeLibelle;
	@Column(length=1000)
	private String demandeTypeDescription;
	@Column(length=45)
	private String demandeTypeAcronym;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="categorieId")
	private Categorie demandeTypeCategorie;
	
	@OneToMany(mappedBy = "etapesDemandesType",fetch= FetchType.EAGER,cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<EtapesDemandes> etapesdemandes = new HashSet<>();
	
	@OneToMany(mappedBy = "demandesType",fetch= FetchType.EAGER,cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Plainte> plainteId = new HashSet<>();
	
	public DemandesType() {
		super();
	}
	
	
	
	
	



	public DemandesType(Integer demandeTypeId, String demandeTypeLibelle, String demandeTypeDescription,
			String demandeTypeAcronym, Categorie demandeTypeCategorie, Set<EtapesDemandes> etapesdemandes) {
		super();
		this.demandeTypeId = demandeTypeId;
		this.demandeTypeLibelle = demandeTypeLibelle;
		this.demandeTypeDescription = demandeTypeDescription;
		this.demandeTypeAcronym = demandeTypeAcronym;
		this.demandeTypeCategorie = demandeTypeCategorie;
		this.etapesdemandes = etapesdemandes;
	}








	public Integer getDemandeTypeId() {
		return demandeTypeId;
	}
	
	
	public void setDemandeTypeId(Integer demandeTypeId) {
		this.demandeTypeId = demandeTypeId;
	}
	
	
	public String getDemandeTypeLibelle() {
		return demandeTypeLibelle;
	}
	
	
	public void setDemandeTypeLibelle(String demandeTypeLibelle) {
		this.demandeTypeLibelle = demandeTypeLibelle;
	}
	
	
	public String getDemandeTypeDescription() {
		return demandeTypeDescription;
	}
	
	
	
	public void setDemandeTypeDescription(String demandeTypeDescription) {
		this.demandeTypeDescription = demandeTypeDescription;
	}
	
	
	public String getDemandeTypeAcronym() {
		return demandeTypeAcronym;
	}
	
	
	public void setDemandeTypeAcronym(String demandeTypeAcronym) {
		this.demandeTypeAcronym = demandeTypeAcronym;
	}


	public Categorie getDemandeTypeCategorie() {
		return demandeTypeCategorie;
	}


	public void setDemandeTypeCategorie(Categorie demandeTypeCategorie) {
		this.demandeTypeCategorie = demandeTypeCategorie;
	}



	public Set<EtapesDemandes> getEtapesdemandes() {
		return etapesdemandes;
	}


	public void setEtapesdemandes(Set<EtapesDemandes> etapesdemandes) {
		this.etapesdemandes = etapesdemandes;
	}


	
	

}
