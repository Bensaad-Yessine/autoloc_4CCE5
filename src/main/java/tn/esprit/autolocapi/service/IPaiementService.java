package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Paiement;

import java.util.List;

public interface IPaiementService {
	Paiement ajouterPaiement(Paiement paiement);
	List<Paiement> listerPaiements();
	Paiement modifierPaiement(Paiement paiement);
	void supprimerPaiement(Long idPaiement);
	Paiement getPaiementById(Long idPaiement);
}
