package fr.afang.universite.matiere.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.afang.universite.enseignant.domain.Enseignant;
import fr.afang.universite.matiere.business.IMatiereBusiness;
import fr.afang.universite.matiere.controller.IMatiereController;
import fr.afang.universite.matiere.domain.Matiere;

@Controller
public class MatiereControllerImpl implements IMatiereController {

	@Autowired
	private IMatiereBusiness matiereBusiness;

	@Override
	@RequestMapping("/matiere")
	public String getMatiere(Model model) {
		List<Matiere> listeMat = matiereBusiness.getListeMatiere();
		model.addAttribute("liste", listeMat);
		return "matiere/matieres";

	}

	@Override
	@RequestMapping("/matiere_details")
	public String getMatiereById(Model model, @RequestParam Integer id) {
		Matiere listeMat = matiereBusiness.getMatiereById(id);
		model.addAttribute("matiere", listeMat);

		return "matiere/detailsMatiere";
	}

	@Override
	@RequestMapping("/ajout-matiere")
	public String ajoutMatiere(Model model) {

		List<Enseignant> enseignant = matiereBusiness.getAllEnseignant();
		model.addAttribute("enseignant", enseignant);

		model.addAttribute("matiere", new Matiere());
		return "matiere/ajoutMatiere";

	}

	@Override
	@PostMapping("/ajouter-matiere")
	public String ajouterMatiere(Model model, @ModelAttribute Matiere matiere, @RequestParam Integer idEnseignant) {
		Enseignant enseignant = matiereBusiness.getEnseignantByID(idEnseignant);
		matiere.setEnseignant(enseignant);
		matiereBusiness.saveMatiere(matiere);
		return "redirect:/matiere";
	}

	@Override
	@RequestMapping("/supprimer_matiere")
	public String supprimerMatiereById(Model model, @RequestParam Integer id) {
		matiereBusiness.supprimeMatiere(id);
		return "redirect:/matiere";

	}

	@Override
	@PostMapping("/modifier-matiere")
	public String modifieMatiere(Model model, @ModelAttribute Matiere matiere, @RequestParam Integer idEnseignant) {
		Enseignant enseignant = matiereBusiness.getEnseignantByID(idEnseignant);
		matiere.setEnseignant(enseignant);
		matiereBusiness.saveMatiere(matiere);
		return "redirect:/matiere";
	}

	@Override
	@GetMapping("/modifier-matiere-form")
	public String modifieMatiere(Model model, @RequestParam Integer id) {
		List<Enseignant> enseignant = matiereBusiness.getAllEnseignant();
		model.addAttribute("enseignant", enseignant);
		Matiere listeMat = matiereBusiness.getMatiereById(id);
		model.addAttribute("matiere", listeMat);
		return "matiere/modifierMatiere";
	}

}
