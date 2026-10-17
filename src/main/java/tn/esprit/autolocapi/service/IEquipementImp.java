package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Equipement;
import tn.esprit.autolocapi.repository.EquipementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IEquipementImp implements IEquipementService{
	private final EquipementRepository equipementRepository;

	@Override
	public Equipement ajouterEquipement(Equipement equipement) {
		return equipementRepository.save(equipement);
	}

	@Override
	public List<Equipement> listerEquipements() {
		return equipementRepository.findAll();
	}

	@Override
	public Equipement modifierEquipement(Equipement equipement) {
		return equipementRepository.save(equipement);
	}

	@Override
	public void supprimerEquipement(Long idEquipement) {
		equipementRepository.deleteById(idEquipement);
	}

	@Override
	public Equipement getEquipementById(Long idEquipement) {
		return equipementRepository.findById(idEquipement).orElse(null);
	}
}
