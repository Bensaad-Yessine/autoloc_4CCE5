package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Employe;
import java.util.List;
import tn.esprit.autolocapi.domain.Vehicule;

public interface IEmployeService {
    public void DeleteEmploye(Long idEmployee);
    public Employe findById(Long idEmployee);
    public List<Employe> findAll();
    public Employe AjouterEmploye(Employe employe);
    public Employe ModifierEmploye(Employe employe);
}
