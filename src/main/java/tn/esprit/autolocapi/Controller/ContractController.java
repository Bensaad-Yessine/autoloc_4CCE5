package tn.esprit.autolocapi.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Contrat;
import tn.esprit.autolocapi.service.IContractService;

import java.util.List;

@RestController
@RequestMapping("/Contract")
@AllArgsConstructor
public class ContractController {
    private final IContractService contractService;

    @PostMapping("/add")
    public Contrat addContract(@RequestBody Contrat contract) {
        return contractService.AddContract(contract);
    }

    @PutMapping("/update")
    public Contrat updateContract(@RequestBody Contrat contract) {
        return contractService.UpdateContract(contract);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContract(@PathVariable Long id) {
        contractService.DeleteContract(id);
    }

    @GetMapping("/{id}")
    public Contrat getContract(@PathVariable Long id) {
        return contractService.getContractById(id);
    }

    @GetMapping("/all")
    public List<Contrat> getAllContracts() {
        return contractService.getAllContracts();
    }
}