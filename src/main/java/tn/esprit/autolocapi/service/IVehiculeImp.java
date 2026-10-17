package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Vehicule;
import tn.esprit.autolocapi.repository.VehiculeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IVehiculeImp implements IVehiculeService{
	private final VehiculeRepository vehiculeRepository;

	@Override
	public Vehicule ajouterVehicule(Vehicule vehicule) {
		return vehiculeRepository.save(vehicule);
	}

	@Override
	public List<Vehicule> listerVehicules() {
		return vehiculeRepository.findAll();
	}

	@Override
	public Vehicule modifierVehicule(Vehicule vehicule) {
		return vehiculeRepository.save(vehicule);
	}

	@Override
	public void supprimerVehicule(Long idVehicule) {
		vehiculeRepository.deleteById(idVehicule);
	}

	@Override
	public Vehicule getVehiculeById(Long idVehicule) {
		return vehiculeRepository.findById(idVehicule).orElse(null);
	}
}
