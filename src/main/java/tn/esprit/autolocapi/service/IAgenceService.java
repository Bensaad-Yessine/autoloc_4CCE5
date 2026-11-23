package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Agence;

import java.util.List;

public interface IAgenceService {
    public Agence ajouterAgence(Agence agence);
    public List<Agence> listerAgences();
    public Agence ModifierAgence(Agence agence);
    public void supprimerAgence(Long idAgence);
    public Agence getAgenceById(Long idAgence);
    public Agence ajouterAgenceEtAffecterVehicules(Agence agence);

}
