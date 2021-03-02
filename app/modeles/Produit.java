package modeles;

import javax.persistence.*;

@Entity
@Table(name="PRODUIT")
public class Produit {
    @Id
    private int id;
    @ManyToOne
    @JoinColumn(name="ID_CATEG")
    private Categorie Categorie;
    private String nom;
    private String description;
    private int quantiteStock;
    private float prixUntaire;

    public Produit(modeles.Categorie categorie, String nom, String description, int quantiteStock, float prixUntaire) {
        Categorie = categorie;
        this.nom = nom;
        this.description = description;
        this.quantiteStock = quantiteStock;
        this.prixUntaire = prixUntaire;
    }

    public modeles.Categorie getCategorie() {
        return Categorie;
    }

    public void setCategorie(modeles.Categorie categorie) {
        Categorie = categorie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public float getPrixUntaire() {
        return prixUntaire;
    }

    public void setPrixUntaire(float prixUntaire) {
        this.prixUntaire = prixUntaire;
    }
}
