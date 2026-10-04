package tn.esprit.autolocapi.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

import lombok.* ;
import org.hibernate.Length;

@Entity
@Getter @Setter
@Table(name = "client")
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idClient;
    @Column( nullable = false , length = 50)
    private String nom;
    @Column( nullable = false , length = 50)
    private String prenom;
    @Column( nullable = false , length = 250)
    private String email;
    @Column( nullable = false , length = 50)
    private String telephone;
    @Column( nullable = false , length = 50)
    private String numPermis;
    @Column( nullable = false )
    private LocalDate dateInscription;

    @OneToMany(mappedBy = "client",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    List<Reservation> Reservations;
}
