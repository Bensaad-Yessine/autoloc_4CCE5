package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Employe;
import tn.esprit.autolocapi.repository.EmployeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IEmployeImp implements IEmployeService{

    private final EmployeRepository employeRepository;
    @Override
    public void DeleteEmploye(Long idEmployee) {
        employeRepository.deleteById(idEmployee);

    }

    @Override
    public Employe findById(Long idEmployee) {
        return employeRepository.findById(idEmployee).orElse(null);
    }

    @Override
    public List<Employe> findAll() {
        return employeRepository.findAll();
    }

    @Override
    public Employe AjouterEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe ModifierEmploye(Employe employe) {
        return employeRepository.save(employe);
    }
}
