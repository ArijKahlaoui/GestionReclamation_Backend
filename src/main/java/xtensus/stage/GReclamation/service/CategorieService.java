package xtensus.stage.GReclamation.service;

import java.util.Set;

import xtensus.stage.GReclamation.entities.Categorie;

public interface CategorieService {
	
	public Categorie createCategorie(Categorie categorie);
	
	public Categorie updateCategorie(Categorie categorie);
	
	public Set<Categorie> getCategories();
	
	public Categorie getCategorie(Integer categorieId);

	public void delete(Integer categorieId);
}
