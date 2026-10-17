package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Equipement;

import java.util.List;

public interface IEquipementService {
	Equipement ajouterEquipement(Equipement equipement);
	List<Equipement> listerEquipements();
	Equipement modifierEquipement(Equipement equipement);
	void supprimerEquipement(Long idEquipement);
	Equipement getEquipementById(Long idEquipement);
}
