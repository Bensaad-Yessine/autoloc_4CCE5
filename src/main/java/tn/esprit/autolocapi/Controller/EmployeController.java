package tn.esprit.autolocapi.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Employe;
import tn.esprit.autolocapi.service.IEmployeService;

import java.util.List;

@RestController
@RequestMapping("/Employe")
@AllArgsConstructor
public class EmployeController {
    private final IEmployeService employeService;

    @PostMapping("/add")
    public Employe addEmploye(@RequestBody Employe employe) {
        return employeService.AjouterEmploye(employe);
    }

    @PutMapping("/update")
    public Employe updateEmploye(@RequestBody Employe employe) {
        return employeService.ModifierEmploye(employe);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        employeService.DeleteEmploye(id);
    }

    @GetMapping("/{id}")
    public Employe getEmploye(@PathVariable Long id) {
        return employeService.findById(id);
    }

    @GetMapping("/all")
    public List<Employe> getAllEmployes() {
        return employeService.findAll();
    }
}