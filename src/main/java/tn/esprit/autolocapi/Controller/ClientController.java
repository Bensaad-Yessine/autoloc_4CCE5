package tn.esprit.autolocapi.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Client;
import tn.esprit.autolocapi.service.IClientService;

import java.util.List;

@RestController
@RequestMapping("/Client")
@AllArgsConstructor
public class ClientController {
    private final IClientService clientService;

    @PostMapping("/add")
    public Client addClient(@RequestBody Client client) {
        return clientService.ajouterClient(client);
    }

    @PutMapping("/update")
    public Client updateClient(@RequestBody Client client) {
        return clientService.modifierClient(client);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.supprimerClient(id);
    }

    @GetMapping("/{id}")
    public Client getClient(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    @GetMapping("/all")
    public List<Client> getAllClients() {
        return clientService.listerClients();
    }
}