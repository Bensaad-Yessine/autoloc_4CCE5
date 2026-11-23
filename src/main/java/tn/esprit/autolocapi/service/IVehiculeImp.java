package tn.esprit.autolocapi.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Agence;
import tn.esprit.autolocapi.domain.Employe;
import tn.esprit.autolocapi.domain.Equipement;
import tn.esprit.autolocapi.domain.Vehicule;
import tn.esprit.autolocapi.repository.EquipementRepository;
import tn.esprit.autolocapi.repository.VehiculeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IVehiculeImp implements IVehiculeService{
	private final VehiculeRepository vehiculeRepository;
    private final EquipementRepository equipementRepository;

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

    @Override
    @Transactional
    public Vehicule affecterEquipement(Long idVehicule, Long idEquipement) {
        Vehicule v = vehiculeRepository.findById(idVehicule).get();
        Equipement e = equipementRepository.findById(idEquipement).get();
        v.getEquipements().add(e);
        return vehiculeRepository.save(v);
    }

    @Override
    @Transactional
    public Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement) {
        Vehicule v = vehiculeRepository.findById(idVehicule).get();
        Equipement e = equipementRepository.findById(idEquipement).get();
        v.getEquipements().remove(e);
        return vehiculeRepository.save(v);
    }
}
