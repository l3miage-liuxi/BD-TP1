package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.Sex;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class NetflixUserEntity {
    @Id
    public long id;

    public String uuid;
    public String lastname;

    public String firstname;

    public LocalDate birthDate;

    @Column(length = 2)
    @Enumerated(EnumType.STRING)
    public Sex sex;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private NetflixAccountEntity account;
}
