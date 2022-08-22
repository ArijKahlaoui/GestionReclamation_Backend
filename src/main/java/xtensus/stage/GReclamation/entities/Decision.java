package xtensus.stage.GReclamation.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Decision {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer decisionId;
	@Column(length=45)
	private String decisionLibelle;
	@Column(length=1000)
	private String decisionDescription;
	
	
	public Decision() {
		super();
	}


	public Integer getDecisionId() {
		return decisionId;
	}


	public void setDecisionId(Integer decisionId) {
		this.decisionId = decisionId;
	}


	public String getDecisionLibelle() {
		return decisionLibelle;
	}


	public void setDecisionLibelle(String decisionLibelle) {
		this.decisionLibelle = decisionLibelle;
	}


	public String getDecisionDescription() {
		return decisionDescription;
	}


	public void setDecisionDescription(String decisionDescription) {
		this.decisionDescription = decisionDescription;
	}
	
}
