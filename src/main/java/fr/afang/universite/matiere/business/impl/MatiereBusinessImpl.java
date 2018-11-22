package fr.afang.universite.matiere.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afang.universite.enseignant.business.IEnseignantBusiness;
import fr.afang.universite.enseignant.domain.Enseignant;
import fr.afang.universite.matiere.business.IMatiereBusiness;
import fr.afang.universite.matiere.domain.Matiere;
import fr.afang.universite.matiere.repository.IMatiereRepository;

@Service
public class MatiereBusinessImpl implements IMatiereBusiness {

	@Autowired
	private IMatiereRepository matiereRepository;

	@Autowired
	private IEnseignantBusiness enseignantBusiness;

	@Override
	public List<Matiere> getListeMatiere() {
		List<Matiere> liste = matiereRepository.findAll();
		return liste;
	}

	@Override
	public Matiere getMatiereById(Integer id) {
		Matiere mat = matiereRepository.getOne(id);
		return mat;
	}

	@Override
	public void saveMatiere(Matiere matiere) {
		matiereRepository.save(matiere);

	}

	@Override
	public void supprimeMatiere(Integer id) {
		matiereRepository.deleteById(id);

	}

	@Override
	public void FindAllEnseignants() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Enseignant> getAllEnseignant() {
		List<Enseignant> liste = enseignantBusiness.getListeEnseignants();
		return liste;
	}

	@Override
	public Enseignant getEnseignantByID(Integer idEnseignant) {
		Enseignant enseignant = enseignantBusiness.getEnseignantById(idEnseignant);
		return enseignant;
	}

}
