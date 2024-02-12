package formatif2.exeptions;

import java.util.Objects;

public class Rectangle {
    private String couleur;
    public final String COULEUR_DEFAUT = "rouge";
    private int largeur;
    public static final int MIN_VAL = 1;
    private static String nom;
    public static final int MAX_VAL = 30;
    public final String[] LES_COULEURS = {"rouge","vert","bleu","jaune","noir","orange"};
    private int hauteur;

    public Rectangle(int hauteur, int largeur){
        setHauteur(hauteur);
        setLargeur(largeur);
        setCouleur(COULEUR_DEFAUT);
        this.nom = "Rectangle";
    }

    public int calculerSurface(){
        int surface;
        surface = largeur * hauteur;

        return surface;
    }

    public int getLargeur() {
        return largeur;
    }

    public String getCouleur() {
        return couleur;
    }
    public  boolean largeurEstValide(int largeur){
        boolean b = false;

        b = largeur >=  MIN_VAL && 30 >= largeur;
        return b;
    }

    public void setCouleur(String couleur) {
        if (couleurEstValide(couleur)){
        this.couleur = couleur;
        }else {
            throw new FormeExeption();
        }
    }

    public boolean hauteurEstValide(int hauteur){
        boolean b = false;

        b = hauteur >=  MIN_VAL && MAX_VAL >= hauteur;
        return b;

    }

    public int calculerPerimetre(){
        int perimetre;
        perimetre = 2*largeur + 2*hauteur;

        return perimetre;
    }

    public void setHauteur(int hauteur) {
        if (hauteurEstValide(hauteur)){
            this.hauteur = hauteur;
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

    public int getHauteur() {
        return hauteur;
    }

    @Override
    public String toString() {
        return nom + " "+ couleur + " " + hauteur + ","+ largeur;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle rectangle)) return false;
        return calculerSurface() == rectangle.calculerSurface() && Objects.equals(couleur, rectangle.couleur);
    }

    public void setLargeur(int largeur)  {
        if (largeurEstValide(largeur)){
            this.largeur = largeur;
        } else {
            throw new FormeExeption();
        }

    }
}
