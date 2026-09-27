# AutoLoc API — Atelier 1 (Séance 2)

Projet Spring Boot + Maven, connecté à MySQL via Spring Data JPA, réalisé dans le cadre de l'UP ASI (Architecture des Systèmes d'Information).

## Objectif de l'atelier

Mettre en place le squelette technique du projet `autoloc-api` : un projet Spring Boot fonctionnel, connecté à une base MySQL, avec la première vague d'entités JPA du domaine AutoLoc (sans associations — celles-ci seront ajoutées à l'Atelier 2).

## Stack technique

- Java 17
- Spring Boot 4.1.1 (Maven)
- Spring Data JPA / Hibernate
- MySQL (pilote `mysql-connector-j`)
- Lombok (annotations ciblées `@Getter`/`@Setter`, pas de `@Data`)
- Spring Boot DevTools, Validation

## Structure du projet

```
autoloc-api
├── src/main/java/tn/esprit/autolocapi
│   ├── AutolocApiApplication.java
│   └── domain/
│       ├── Vehicule.java
│       ├── Agence.java
│       ├── Client.java
│       ├── Employe.java
│       ├── Equipement.java
│       ├── Reservation.java
│       ├── Contrat.java
│       ├── Paiement.java
│       ├── Maintenance.java
│       ├── StatutVehicule.java (enum)
│       ├── CategorieVehicule.java (enum)
│       ├── RoleEmploye.java (enum)
│       ├── StatutReservation.java (enum)
│       └── ModePaiement.java (enum)
├── src/main/resources/application.properties
└── pom.xml
```

## Entités livrées (9/9)

| Entité | Statut |
|---|---|
| Vehicule | ✅ |
| Agence | ✅ |
| Client | ✅ |
| Employe | ✅ |
| Equipement | ✅ |
| Reservation | ✅ |
| Contrat | ✅ |
| Paiement | ✅ |
| Maintenance | ✅ |

Toutes les entités utilisent `@Id` + `@GeneratedValue(strategy = GenerationType.IDENTITY)`, et des annotations Lombok ciblées (`@Getter`, `@Setter`, `@NoArgsConstructor`, `@AllArgsConstructor`) plutôt que `@Data`, conformément à la recommandation de l'atelier pour anticiper les associations bidirectionnelles de l'Atelier 2.

Aucune association n'a été ajoutée à ce stade — c'est volontaire, elle sera construite pas à pas à l'Atelier 2.

## Configuration (`application.properties`)

```properties
spring.application.name=autoloc-api
spring.datasource.url=jdbc:mysql://localhost:3306/autoloc_db?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

logging.level.org.hibernate.SQL=DEBUG
logging.level.tn.esprit.autolocapi=INFO
```

> `createDatabaseIfNotExist=true` crée automatiquement la base `autoloc_db` au premier démarrage.
> `ddl-auto=update` fait créer/mettre à jour les tables par Hibernate à partir des entités, sans perte de données entre deux démarrages — le réglage recommandé pour le développement itératif.

## Lancer le projet

1. Démarrer un serveur MySQL local (port 3306).
2. Renseigner `spring.datasource.password` (idéalement via une variable d'environnement, pas en clair dans le fichier versionné).
3. Lancer `AutolocApiApplication.java` depuis IntelliJ, ou :
   ```bash
   ./mvnw spring-boot:run
   ```
4. Vérifier dans les logs la génération des `create table` par Hibernate.
5. Confirmer via un client MySQL (phpMyAdmin, DBeaver…) que les 9 tables existent avec les bonnes colonnes.

## État actuel / points de vigilance connus

- [ ] Vérifier la casse du nom de table `maintenance` (une coquille l'a fait apparaître sous un autre nom en base — à corriger avant la Séance 3).
- [ ] Corriger l'orthographe du champ `immatriculation` dans `Vehicule`.
- [ ] Aligner `ddl-auto` sur `update` plutôt que `create-drop` pour ne pas perdre les données entre deux redémarrages.
- [ ] Nettoyer les imports inutilisés (code mort) relevés dans quelques entités.
- [ ] Uniformiser le type de l'identifiant `Equipement` (`Long`, comme les autres entités).

## Prochaine étape — Atelier 2 (Séance 3)

Ajout des associations du modèle AutoLoc (Vehicule ↔ Agence, Client ↔ Reservation, Contrat, Equipement…) avec les stratégies de cascade et de fetch adaptées.
