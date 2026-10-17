package tn.esprit.autolocapi.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Maintenance;
import tn.esprit.autolocapi.service.IMaintenanceService;

import java.util.List;

@RestController
@RequestMapping("/Maintenance")
@AllArgsConstructor
public class MaintenanceController {
    private final IMaintenanceService maintenanceService;

    @PostMapping("/add")
    public Maintenance addMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.ajouterMaintenance(maintenance);
    }

    @PutMapping("/update")
    public Maintenance updateMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.modifierMaintenance(maintenance);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMaintenance(@PathVariable Long id) {
        maintenanceService.supprimerMaintenance(id);
    }

    @GetMapping("/{id}")
    public Maintenance getMaintenance(@PathVariable Long id) {
        return maintenanceService.getMaintenanceById(id);
    }

    @GetMapping("/all")
    public List<Maintenance> getAllMaintenances() {
        return maintenanceService.listerMaintenances();
    }
}