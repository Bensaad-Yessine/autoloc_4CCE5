package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Reservation;

import java.util.List;

public interface IReservationService {
	Reservation ajouterReservation(Reservation reservation);
	List<Reservation> listerReservations();
	Reservation modifierReservation(Reservation reservation);
	void supprimerReservation(Long idReservation);
	Reservation getReservationById(Long idReservation);
}
