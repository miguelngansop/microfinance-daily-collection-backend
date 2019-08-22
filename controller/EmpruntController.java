package com.sarki.micro.controller;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarki.micro.model.Emprunt;
import com.sarki.micro.model.Operation;
import com.sarki.micro.repository.AgentRepository;
import com.sarki.micro.repository.CompteRepository;

@RestController
@RequestMapping("/emprunt")
public class EmpruntController {
/*	
	@Autowired
	 CompteRepository compteRepo;
	@Autowired
     AgentRepository agentRepo;
	@Autowired
	Operation operationRepo;
	
	// un client fais un pret d'argent : montant, duree jours, montant minimum, idClient, taux d'escompte en paramettre
	@PatchMapping("/emprunter/{idCompte}/{idAgent}/{duree}/{montant}/{min}/{taux}")
	public Long emprunter(
			@PathVariable(value="idCompte") Long idCompte,
			@PathVariable(value="idAgent") Long idAgent,
			@PathVariable(value="duree") Long duree,
			@PathVariable(value="min") Long min,
			@PathVariable(value="montant") Long montant,
			@PathVariable(value="taux") Long taux) {
		
		Emprunt emprunt = new Emprunt();
		emprunt.setAgent(agentRepo.getOne(idAgent));
		emprunt.setCompte(compteRepo.getOne(idCompte));
		emprunt.setCreatedAt(new Date());
		emprunt.setUpdatedAt(new Date());
		emprunt.setMontant(montant);
		emprunt.setMontantMinimum(min);
		emprunt.setTauxEscompte(taux);
		emprunt.setDuree(duree);
		
		return montant;
	}
*/
}
