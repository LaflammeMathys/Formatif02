package formatif2.exeptions;

import java.util.Objects;

public class Cercle {
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
        return Objects.equals(couleur, cercle.couleur);
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

}
