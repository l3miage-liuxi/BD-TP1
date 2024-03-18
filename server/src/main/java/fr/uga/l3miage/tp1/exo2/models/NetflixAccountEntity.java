package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.TypeAccount;

import javax.persistence.*;

@Entity
public class NetflixAccountEntity {
    @Id
    public long id;

    public int nb_devices;

    @Enumerated(EnumType.STRING)
    public TypeAccount typeAccount;

    @OneToOne
    @JoinColumn(name = "uuid_user", referencedColumnName = "uuid")

    public NetflixUserEntity user;
}
