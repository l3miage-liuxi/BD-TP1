package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.OffsetDateTime;
@Entity
public class User {
    @Id
    public long idUser;

    public boolean SSO;

    public OffsetDateTime lastConnexion;

    @OneToOne(mappedBy = "user",cascade =  CascadeType.ALL)
    public Session session;

}
