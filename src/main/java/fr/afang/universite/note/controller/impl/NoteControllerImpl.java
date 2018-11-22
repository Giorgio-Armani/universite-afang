package fr.afang.universite.note.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.afang.universite.note.business.INoteBusiness;
import fr.afang.universite.note.controller.INoteController;
import fr.afang.universite.note.domain.Note;

@Controller
public class NoteControllerImpl implements INoteController {

	@Autowired
	private INoteBusiness noteBusiness;

	@Override
	@RequestMapping("/note")
	public String getNote(Model model) {
		List<Note> listeNot = noteBusiness.getListeNote();
		model.addAttribute("note", listeNot);
		return "notes/note";

	}
}