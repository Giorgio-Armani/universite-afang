package fr.afang.universite.etudiants.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.afang.universite.enseignant.business.IEnseignantBusiness;
import fr.afang.universite.enseignant.domain.Enseignant;
import fr.afang.universite.etudiants.business.IEtudiantsBusiness;
import fr.afang.universite.etudiants.controller.IEtudiantsController;
import fr.afang.universite.etudiants.domain.Etudiants;

@Controller
public class EtudiantsControllerImpl implements IEtudiantsController {
	
	@Autowired
	private IEtudiantsBusiness etudiantsBusiness;
	
	
	@Override
	@RequestMapping("/etudiants")
	public String getEtudiants(Model model) {
		List<Etudiants> listeEt = etudiantsBusiness.getListeEtudiants();
		model.addAttribute("liste", listeEt);
		return "etudiant/etudiants";

}
   
	@Override
	@RequestMapping("/etudiant_details")
	public String getEtudiantsById(Model model, @RequestParam Integer id) {
		Etudiants listeEt = etudiantsBusiness.getEtudiantsById(id);
		model.addAttribute("etudiants", listeEt);
		
		return"etudiant/detailsEtudiants";
	}
	
	@Override
	@RequestMapping("/ajout-etudiants")
	public String ajoutEtudiantst(Model model) {
		Etudiants etud = new Etudiants();
		model.addAttribute("etudiants", etud);
		return "etudiant/ajoutEtudiants";
		
	}
	
	@Override
	@PostMapping("/ajouter-etudiants")
	public String ajouterEtudiants(Model model, @ModelAttribute Etudiants etudiant) {	
		etudiantsBusiness.saveEtudiants(etudiant);		
		return"redirect:/etudiants";
	}
	
	@Override
	@RequestMapping("/supprimer_etudiant")
	public String supprimerEtudiantById(Model model, @RequestParam Integer id) {
		etudiantsBusiness.supprimerEtudiant(id);
		return"redirect:/etudiants";
		
	}
	
	@Override
	@RequestMapping("/modifier-etudiants")
	public String modifieEtudiantst(Model model, @RequestParam Integer id) {
		Etudiants etud = etudiantsBusiness.getEtudiantsById(id);
		model.addAttribute("etudiants", etud);
		return "etudiant/modifierEtudiant";
}
	@Override
	@PostMapping("/modifier-etudiants")
	public String modifieEtudiants(Model model, @ModelAttribute Etudiants etudiant) {	
		etudiantsBusiness.saveEtudiants(etudiant);		
		return"redirect:/etudiants";
}

	@Override
	public String modifieEtudiantst(Model model) {
		// TODO Auto-generated method stub
		return null;
	}
}