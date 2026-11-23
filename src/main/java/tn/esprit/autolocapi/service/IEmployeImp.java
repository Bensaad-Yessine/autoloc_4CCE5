package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Agence;
import tn.esprit.autolocapi.domain.Employe;
import tn.esprit.autolocapi.repository.AgenceRepository;
import tn.esprit.autolocapi.repository.EmployeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IEmployeImp implements IEmployeService{

    private final EmployeRepository employeRepository;
    private final AgenceRepository agenceRepository;

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

    @Override
    public Employe desaffectAgence(Long idEmployee) {
        Employe employe = employeRepository.findById(idEmployee).get();
        employe.setAgence(null);

        return employeRepository.save(employe);
    }

    @Override
    public Employe affectAgence(Long idEmployee, Long idAgence) {
        Employe e = employeRepository.findById(idEmployee).get();
        Agence a = agenceRepository.findById(idAgence).get();

        e.setAgence(a);
        return employeRepository.save(e);

    }
}
