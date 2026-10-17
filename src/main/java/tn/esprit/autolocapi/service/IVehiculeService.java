package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
	Vehicule ajouterVehicule(Vehicule vehicule);
	List<Vehicule> listerVehicules();
	Vehicule modifierVehicule(Vehicule vehicule);
	void supprimerVehicule(Long idVehicule);
	Vehicule getVehiculeById(Long idVehicule);
}
