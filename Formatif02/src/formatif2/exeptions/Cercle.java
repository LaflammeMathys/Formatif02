package formatif2.exeptions;

import java.util.Objects;

public class Cercle {
    public Cercle(int rayon){
        setRayon(rayon);
        setCouleur(COULEUR_DEFAUT);
        this.nom = "Cercle";
    }
    private String couleur;
    public static final int RAYON_DEFAUT = 10;
    private String nom;
    public static final String COULEUR_DEFAUT = "vert";
    public static final int MIN_VAL = 1;
    private int rayon;
    public static final int MAX_VAL = 1;
    public static final String[] LES_COULEURS = {"rouge","vert","bleu","jaune","noir","orange"};

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cercle cercle = (Cercle) o;
        return Objects.equals(couleur, cercle.couleur) && Objects.equals(calculerSurface(),cercle.calculerSurface());
    }

    public String getCouleur() {
        return couleur;
    }

    public int calculerSurface(){
        Double surfaceDouble;
        surfaceDouble = Math.pow(rayon,2) * Math.PI;
        int surface =surfaceDouble.intValue();

        return surface;
    }

    public boolean rayonEstValide(int rayon){
        boolean b = false;

        b = rayon >=  MIN_VAL && MAX_VAL >= rayon;
        return b;

    }

    public void setCouleur(String couleur) {
        if (couleurEstValide(couleur)){
            this.couleur = couleur;
        }else {
            throw new FormeExeption();
        }
    }

    public boolean couleurEstValide(String couleur){
        boolean b = false;
        couleur = couleur.trim();
        for (int i = 0; i < LES_COULEURS.length ; i++) {
            b = couleur.equalsIgnoreCase(LES_COULEURS[i]);
            if (b){
                return b;
            }
        }
        return b;
    }

    @Override
    public String toString() {
        return nom + " "+ couleur + " " + rayon;
    }

    public int getRayon() {
        return rayon;
    }

    public String getNom() {
        return nom;
    }

    public void setRayon(int rayon) {
        if (rayonEstValide(rayon)){
            this.rayon = rayon;
        }else {
            throw new FormeExeption();
        }
    }
    public int calculerPerimetre(){
        Double perimetreeDouble;
        perimetreeDouble = 2* rayon * Math.PI;
        int surface =perimetreeDouble.intValue();

        return surface;
    }

}
