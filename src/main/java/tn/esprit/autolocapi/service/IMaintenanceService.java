package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Maintenance;

import java.util.List;

public interface IMaintenanceService {
	Maintenance ajouterMaintenance(Maintenance maintenance);
	List<Maintenance> listerMaintenances();
	Maintenance modifierMaintenance(Maintenance maintenance);
	void supprimerMaintenance(Long idMaintenance);
	Maintenance getMaintenanceById(Long idMaintenance);
}
