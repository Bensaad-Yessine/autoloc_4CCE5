package tn.esprit.autolocapi.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import lombok.*;
@Entity
@Table(name="Maibtenance")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaintenance;

    private LocalDate dateDebut;
    private  LocalDate dateFin;
    @Column(nullable = true)
    private  String description;

}
