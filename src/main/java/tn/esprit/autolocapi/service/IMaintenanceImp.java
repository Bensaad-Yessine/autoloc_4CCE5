package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Maintenance;
import tn.esprit.autolocapi.repository.MaintenanceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IMaintenanceImp implements IMaintenanceService{
	private final MaintenanceRepository maintenanceRepository;

	@Override
	public Maintenance ajouterMaintenance(Maintenance maintenance) {
		return maintenanceRepository.save(maintenance);
	}

	@Override
	public List<Maintenance> listerMaintenances() {
		return maintenanceRepository.findAll();
	}

	@Override
	public Maintenance modifierMaintenance(Maintenance maintenance) {
		return maintenanceRepository.save(maintenance);
	}

	@Override
	public void supprimerMaintenance(Long idMaintenance) {
		maintenanceRepository.deleteById(idMaintenance);
	}

	@Override
	public Maintenance getMaintenanceById(Long idMaintenance) {
		return maintenanceRepository.findById(idMaintenance).orElse(null);
	}
}
