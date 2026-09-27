package tn.esprit.autolocapi.domain;

import jakarta.persistence.*;

import lombok.*;

import java.util.Date;
@Entity
@Getter
@Setter
@Table(name = "agence")
@NoArgsConstructor
@AllArgsConstructor
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence ;
    @Column(nullable = false , length = 50)
    private String nom  ;
    @Column(nullable = false , length = 50)
    private String ville ;
    @Column(nullable = false , length = 250)
    private String adresse ;
    @Column(nullable = false , length = 50)
    private String telephone ;

}
