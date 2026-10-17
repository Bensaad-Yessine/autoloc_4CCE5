package tn.esprit.autolocapi.service;

import io.micrometer.common.lang.internal.Contract;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Contrat;
import tn.esprit.autolocapi.repository.ContratRepository;
import java.util.List;
@Service
@AllArgsConstructor
public class IContractImp implements IContractService{

    private final ContratRepository contractRepository;


    @Override
    public Contrat getContractById(Long idContract) {
        return contractRepository.findById(idContract).orElse(null);
    }

    @Override
    public List<Contrat> getAllContracts() {
        return contractRepository.findAll();
    }

    @Override
    public Contrat AddContract(Contrat contract) {
        return contractRepository.save(contract);
    }

    @Override
    public Contrat UpdateContract(Contrat contract) {
        return contractRepository.save(contract);
    }

    @Override
    public void DeleteContract(Long idContract) {
         contractRepository.deleteById(idContract);
    }
}
