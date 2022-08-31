package xtensus.stage.GReclamation.entities;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "traitementplainte")
public class TraitementPlainte {
	
	private Integer traitementId;
	private String reponse;
	private Decision decision;
	private Set<Document> documents;
	private Plainte plainte;
	
	public TraitementPlainte() {
		super();
	}


	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "traitementId", unique = true, nullable = false)
	public Integer getTraitementId() {
		return traitementId;
	}

	
	public void setTraitementId(Integer traitementId) {
		this.traitementId = traitementId;
	}


	public String getReponse() {
		return reponse;
	}


	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "decisiontraitement")
	public Decision getDecision() {
		return decision;
	}


	public void setDecision(Decision decision) {
		this.decision = decision;
	}


	@OneToMany(fetch = FetchType.LAZY)
	public Set<Document> getDocuments() {
		return documents;
	}


	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}


	@ManyToOne(fetch = FetchType.EAGER)
	public Plainte getPlainte() {
		return plainte;
	}


	public void setPlainte(Plainte plainte) {
		this.plainte = plainte;
	}
	
	
	

}
