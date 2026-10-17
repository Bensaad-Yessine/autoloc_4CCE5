package tn.esprit.autolocapi.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Agence;
import tn.esprit.autolocapi.service.IAgenceService;

import java.util.List;

@RestController
@RequestMapping("/Agence")
@AllArgsConstructor
public class AgenceController {
    private final IAgenceService agenceService;

    @PostMapping("/add")
    public Agence addAgence(@RequestBody Agence agence) {
        return agenceService.ajouterAgence(agence);
    }
    @PutMapping("/update")
    public Agence updateAgence(@RequestBody Agence agence) {
        return agenceService.ModifierAgence(agence);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteAgence(@PathVariable Long id) {
        agenceService.supprimerAgence(id);
    }

    @GetMapping("/{id}")
    public Agence getAgence(@PathVariable Long id) {
        return agenceService.getAgenceById(id);
    }

    @GetMapping("/all")
    public List<Agence> getAllAgence() {
        return agenceService.listerAgences();
    }
}
