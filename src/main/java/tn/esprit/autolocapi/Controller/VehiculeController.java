package tn.esprit.autolocapi.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Vehicule;
import tn.esprit.autolocapi.service.IVehiculeService;

import java.util.List;

@RestController
@RequestMapping("/Vehicule")
@AllArgsConstructor
public class VehiculeController {
    private final IVehiculeService vehiculeService;

    @PostMapping("/add")
    public Vehicule addVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.ajouterVehicule(vehicule);
    }

    @PutMapping("/update")
    public Vehicule updateVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.modifierVehicule(vehicule);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteVehicule(@PathVariable Long id) {
        vehiculeService.supprimerVehicule(id);
    }

    @GetMapping("/{id}")
    public Vehicule getVehicule(@PathVariable Long id) {
        return vehiculeService.getVehiculeById(id);
    }

    @GetMapping("/all")
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.listerVehicules();
    }
}