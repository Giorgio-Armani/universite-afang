package fr.afang.universite.etudiants.controller;

import org.springframework.ui.Model;

import fr.afang.universite.etudiants.domain.Etudiants;

public interface IEtudiantsController {

	public String getEtudiants(Model model);

	public String getEtudiantsById(Model model, Integer id);

	public String ajoutEtudiantst(Model model);

	public String ajouterEtudiants(Model model, Etudiants etudiant);

	public String supprimerEtudiantById(Model model, Integer id);

	public String modifieEtudiantst(Model model);

	public String modifieEtudiants(Model model, Etudiants etudiant);

	public String modifieEtudiantst(Model model, Integer id);

}