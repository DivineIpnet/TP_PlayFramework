package modeles;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LigneVente {
    @Id
    private int idVente;

    @ManyToOne
    private Vente vente;

    @ManyToOne
    private Produit produit;
    private int quantite;
    private float prixVente;
}
