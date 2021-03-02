package modeles;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORIE")
public class Categorie {
    @Id
    private int idCateg;
    private String nomCateg;

    private Categorie(){

    }
}

