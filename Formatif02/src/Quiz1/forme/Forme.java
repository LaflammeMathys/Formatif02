package Quiz1.forme;

import Quiz1.Couleur;

public abstract class Forme {
    public Forme(String nom, Couleur couleur) {
        this.nom = nom;
        this.couleur = couleur;
    }

    private String nom;
    private Couleur couleur;



    public abstract int calculerPerimetre();
    public abstract int calculerSurface();

    public Couleur getCouleur() {
        return couleur;
    }

    public String getNom(Forme f) {
        return "nom";
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return nom +" "+couleur+" "+calculerPerimetre()+" "+" "+calculerSurface();
    }
}
