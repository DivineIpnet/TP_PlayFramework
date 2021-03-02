package modeles;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="VENTE")
public class Vente {
    @Id
    @Column(name = "ID_VENTE_CLIENT")
    private int idVenteClient;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENT")
    private Client client;
    private Date dateVente;


}
