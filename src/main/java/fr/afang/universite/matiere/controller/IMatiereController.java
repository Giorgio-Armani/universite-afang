package fr.afang.universite.matiere.controller;

import org.springframework.ui.Model;

import fr.afang.universite.matiere.domain.Matiere;

public interface IMatiereController {

	public String getMatiere(Model model);

	public String getMatiereById(Model model, Integer id);

	public String ajoutMatiere(Model model);

	public String ajouterMatiere(Model model, Matiere matiere, Integer idEnseignant);

	public String supprimerMatiereById(Model model, Integer id);

	public String modifieMatiere(Model model, Integer id);

	public String modifieMatiere(Model model, Matiere matiere, Integer idEnsegnant);

}
