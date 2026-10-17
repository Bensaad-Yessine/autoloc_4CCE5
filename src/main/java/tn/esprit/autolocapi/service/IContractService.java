package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Contrat;
import java.util.List;

public interface IContractService {
    public Contrat getContractById(Long idContract);
    public List<Contrat> getAllContracts();
    public Contrat AddContract(Contrat contract);
    public Contrat UpdateContract(Contrat contract);
    public void DeleteContract(Long idContract);
}
