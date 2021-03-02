package modeles;

import javax.persistence.*;

@Entity
@Table(name="CLIENT")
public class Client {
    @Id
    private int idClient;
    private String nomClient;
    private int telephone;
    private String adresse;

    public Client(String nomClient, int telephone, String adresse) {
        this.nomClient = nomClient;
        this.telephone = telephone;
        this.adresse = adresse;
    }
}
