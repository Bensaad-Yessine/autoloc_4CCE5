package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Paiement;
import tn.esprit.autolocapi.repository.PaiementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IPaiementImp implements IPaiementService{
	private final PaiementRepository paiementRepository;

	@Override
	public Paiement ajouterPaiement(Paiement paiement) {
		return paiementRepository.save(paiement);
	}

	@Override
	public List<Paiement> listerPaiements() {
		return paiementRepository.findAll();
	}

	@Override
	public Paiement modifierPaiement(Paiement paiement) {
		return paiementRepository.save(paiement);
	}

	@Override
	public void supprimerPaiement(Long idPaiement) {
		paiementRepository.deleteById(idPaiement);
	}

	@Override
	public Paiement getPaiementById(Long idPaiement) {
		return paiementRepository.findById(idPaiement).orElse(null);
	}
}
