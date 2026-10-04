package tn.esprit.autolocapi.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "vehicule")

public class Vehicule
{
     @Id
     @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long idVehicule;
    @Column(nullable = false, unique = true , length = 20)
    String immatriculation;
    @Column(nullable = false, length = 50)
    String marque;
    @Column(nullable = false, length = 50)
    String modele;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    CategorieVehicule categorie;
    @Column(nullable = false, precision = 10, scale = 2)
    BigDecimal tarifJournalier ;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    StatutVehicule statut ;
    @ManyToMany(fetch = FetchType.EAGER)
    List<Equipement> equipements;
    @ManyToOne
    Agence agence;
    @OneToMany(mappedBy = "vehicule", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    List<Reservation> reservations;
}
