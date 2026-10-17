package tn.esprit.autolocapi.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Equipement;
import tn.esprit.autolocapi.service.IEquipementService;

import java.util.List;

@RestController
@RequestMapping("/Equipement")
@AllArgsConstructor
public class EquipementController {
    private final IEquipementService equipementService;

    @PostMapping("/add")
    public Equipement addEquipement(@RequestBody Equipement equipement) {
        return equipementService.ajouterEquipement(equipement);
    }

    @PutMapping("/update")
    public Equipement updateEquipement(@RequestBody Equipement equipement) {
        return equipementService.modifierEquipement(equipement);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEquipement(@PathVariable Long id) {
        equipementService.supprimerEquipement(id);
    }

    @GetMapping("/{id}")
    public Equipement getEquipement(@PathVariable Long id) {
        return equipementService.getEquipementById(id);
    }

    @GetMapping("/all")
    public List<Equipement> getAllEquipements() {
        return equipementService.listerEquipements();
    }
}