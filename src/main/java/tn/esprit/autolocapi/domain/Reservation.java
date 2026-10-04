package tn.esprit.autolocapi.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reservation")

public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    private LocalDate dateDebut;
    private LocalDate dateFin;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private StatutReservation statut ;
    @OneToOne(mappedBy = "reservation")
    Contrat contrat;

    @ManyToOne
    Vehicule vehicule;

    @ManyToOne
    Client client;
}
