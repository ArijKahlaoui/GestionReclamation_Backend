package xtensus.stage.GReclamation.service.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xtensus.stage.GReclamation.Repositories.CategorieRepository;
import xtensus.stage.GReclamation.entities.Categorie;
import xtensus.stage.GReclamation.service.CategorieService;

@Service
public class CategorieServiceImpl implements CategorieService{
	
	@Autowired
	private CategorieRepository categorieRepository;

	@Override
	public Categorie createCategorie(Categorie categorie) {
		
		return this.categorieRepository.save(categorie);
	}

	@Override
	public Categorie updateCategorie(Categorie categorie) {
		
		return this.categorieRepository.save(categorie);
	}

	@Override
	public Set<Categorie> getCategories() {
		
		return new LinkedHashSet<>(this.categorieRepository.findAll());
	}

	@Override
	public Categorie getCategorie(Integer categorieId) {
		
		return this.categorieRepository.findById(categorieId).get() ;
	}

	@Override
	public void delete(Integer categorieId) {
		Categorie categorie = new Categorie();
		categorie.setCategorieId(categorieId);
		this.categorieRepository.delete(categorie);
	} 

}
