package tn.esprit.autolocapi.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Paiement;
import tn.esprit.autolocapi.service.IPaiementService;

import java.util.List;

@RestController
@RequestMapping("/Paiement")
@AllArgsConstructor
public class PaiementController {
    private final IPaiementService paiementService;

    @PostMapping("/add")
    public Paiement addPaiement(@RequestBody Paiement paiement) {
        return paiementService.ajouterPaiement(paiement);
    }

    @PutMapping("/update")
    public Paiement updatePaiement(@RequestBody Paiement paiement) {
        return paiementService.modifierPaiement(paiement);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePaiement(@PathVariable Long id) {
        paiementService.supprimerPaiement(id);
    }

    @GetMapping("/{id}")
    public Paiement getPaiement(@PathVariable Long id) {
        return paiementService.getPaiementById(id);
    }

    @GetMapping("/all")
    public List<Paiement> getAllPaiements() {
        return paiementService.listerPaiements();
    }
}