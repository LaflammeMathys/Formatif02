package Quiz1.forme;

import Quiz1.Couleur;

public class Rectangle extends Forme {
    private int hauteur;
    private int largeur;
    public final static String NOM = "Rectangle";

    public Rectangle( Couleur couleur, int hauteur, int largeur) {
        super(NOM, couleur);
        this.hauteur = hauteur;
        this.largeur = largeur;
    }
    public boolean hauteurEstValide(int hauteur){
        return true;
    }
    public boolean largeurEstValide(int largeur){
        return true;
    }

    @Override
    public int calculerPerimetre() {
        return 0;
    }
    @Override
    public int calculerSurface() {
        return 0;
    }

    public int getHauteur() {
        return hauteur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }
}
