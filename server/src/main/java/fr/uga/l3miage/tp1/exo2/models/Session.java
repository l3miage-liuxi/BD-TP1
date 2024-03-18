package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.UUID;
@Entity
public class Session {
    @Id
    public UUID idsession;

    public String lastCommand;

    public String currentDir;

    public boolean lock;

    @OneToOne
    @JoinColumn(name = "user_id")
    public User user;
}
