package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Agence;
import tn.esprit.autolocapi.domain.Client;

import java.util.List;

public interface IClientService {
    public List<Client> listerClients();
    public Client ajouterClient(Client client);
    public Client modifierClient(Client client);
    public void supprimerClient(Long idclient);
    public Client getClientById(Long idclient);
}
