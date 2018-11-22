package fr.afang.universite.note.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afang.universite.note.business.INoteBusiness;
import fr.afang.universite.note.domain.Note;
import fr.afang.universite.note.repository.INoteRepository;

@Service
public class NoteBusinessImpl implements INoteBusiness {

	@Autowired
	private INoteRepository noteRepository;

	@Override
	public List<Note> getListeNote() {
		List<Note> listNot = noteRepository.findAll();
		return listNot;
	}

}
