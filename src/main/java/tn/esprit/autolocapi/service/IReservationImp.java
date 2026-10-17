package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Reservation;
import tn.esprit.autolocapi.repository.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IReservationImp implements IReservationService{
	private final ReservationRepository reservationRepository;

	@Override
	public Reservation ajouterReservation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}

	@Override
	public List<Reservation> listerReservations() {
		return reservationRepository.findAll();
	}

	@Override
	public Reservation modifierReservation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}

	@Override
	public void supprimerReservation(Long idReservation) {
		reservationRepository.deleteById(idReservation);
	}

	@Override
	public Reservation getReservationById(Long idReservation) {
		return reservationRepository.findById(idReservation).orElse(null);
	}
}
