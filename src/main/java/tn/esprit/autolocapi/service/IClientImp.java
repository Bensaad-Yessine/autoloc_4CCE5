package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import tn.esprit.autolocapi.domain.Client;
import tn.esprit.autolocapi.repository.ClientRepository;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.repository.VehiculeRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class IClientImp implements IClientService{

    private final ClientRepository clientRepository;

    @Override
    public List<Client> listerClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client ajouterClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client modifierClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void supprimerClient(Long idclient) {
        clientRepository.deleteById(idclient);

    }

    @Override
    public Client getClientById(Long idclient) {
        return clientRepository.findById(idclient).orElse(null);
    }
}
