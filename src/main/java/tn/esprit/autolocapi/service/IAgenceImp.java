package tn.esprit.autolocapi.service;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.repository.AgenceRepository;
import tn.esprit.autolocapi.domain.Agence;
import lombok.AllArgsConstructor;
import java.util.List;

@Service
@AllArgsConstructor
public class IAgenceImp implements IAgenceService {
    /*@Autowired
      private AgenceRepository agenceRepository;
     */
    private final AgenceRepository agenceRepository;
    @Override
    public Agence ajouterAgence(Agence agence){
        return agenceRepository.save(agence);
    }

    @Override
    public List<Agence> listerAgences() {
        return agenceRepository.findAll();
    }

    @Override
    public Agence ModifierAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void supprimerAgence(Long idAgence) {
         agenceRepository.deleteById(idAgence);
    }

    @Override
    public Agence getAgenceById(Long idAgence) {
        return agenceRepository.findById(idAgence).orElse(null);
    }

}
