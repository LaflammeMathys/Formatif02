package Quiz1.forme;

import Quiz1.Couleur;

public class Cercle extends Forme {
    private int rayon;

    public Cercle(Couleur couleur, int rayon) {
        super(NOM, couleur);
        this.rayon = rayon;
    }

    public final static String NOM = "Cercle";

    public boolean estRayonValide(){
        return true;
    }

    @Override
    public int calculerPerimetre() {
        return 0;
    }
    @Override
    public int calculerSurface(){
        return 0;
    }

    public int getRayon() {
        return rayon;
    }
    public int setRayon(int rayon){
        return 0;
    }
}
