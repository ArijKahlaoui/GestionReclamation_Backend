package xtensus.stage.GReclamation.entities;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="acteurtype")
public class ActeurType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer acteurTypeId;
	@Column(length=1000)
	private String acteurTypeDescription;
	@Column(length=45)
	private String acteurTypeDesignationCourte;
	@Column(length=45)
	private String acteurTypeDesignationComplete;
	
	@OneToMany(mappedBy = "etapesDemandesActeurType",fetch= FetchType.EAGER,cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<EtapesDemandes> Etapesdemandes = new LinkedHashSet<>();
	
	public ActeurType() {
		super();
	}

	public Integer getActeurTypeId() {
		return acteurTypeId;
	}


	public void setActeurTypeId(Integer acteurTypeId) {
		this.acteurTypeId = acteurTypeId;
	}


	public String getActeurTypeDescription() {
		return acteurTypeDescription;
	}


	public void setActeurTypeDescription(String acteurTypeDescription) {
		this.acteurTypeDescription = acteurTypeDescription;
	}


	public String getActeurTypeDesignationCourte() {
		return acteurTypeDesignationCourte;
	}


	public void setActeurTypeDesignationCourte(String acteurTypeDesignationCourte) {
		this.acteurTypeDesignationCourte = acteurTypeDesignationCourte;
	}


	public String getActeurTypeDesignationComplete() {
		return acteurTypeDesignationComplete;
	}


	public void setActeurTypeDesignationComplete(String acteurTypeDesignationComplete) {
		this.acteurTypeDesignationComplete = acteurTypeDesignationComplete;
	}
	
}
