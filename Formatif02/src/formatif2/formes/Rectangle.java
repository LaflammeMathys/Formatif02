package formatif2.formes;

import formatif2.exeptions.FormeExeption;

import java.util.Objects;
/*
    Rectangle est composé d'une hauteur et d'une largeur situé entre 1 et 30 inclusivement,d'une des couleurs suivantes
    (rouge,vert,bleu,jaune,noir,orange) avec rouge comme couleur de base et d'un nom défénie par default comme
    étant Rectangle.
     */

public class Rectangle {
    private String couleur;
    public final String COULEUR_DEFAUT = "rouge";
    private int largeur;
    public static final int MIN_VAL = 1;
    private static String nom;
    public static final int MAX_VAL = 30;
    public final String[] LES_COULEURS = {"rouge","vert","bleu","jaune","noir","orange"};
    private int hauteur;
    /*
    Ininitialise un Rectanle avec une hauteur valide et une largeur valide. La couleurs est définie par defaut en rouge et le nom est définie par defaut
    comme Rectangle.
     */

    public Rectangle(int hauteur, int largeur){
        setHauteur(hauteur);
        setLargeur(largeur);
        setCouleur(COULEUR_DEFAUT);
        this.nom = "Rectangle";
    }
    /*
    Retourne la surface du Rectangle.
     */

    public int calculerSurface(){
        int surface;
        surface = largeur * hauteur;

        return surface;
    }
    /*
    Retourne la largeur du Rectangle.
     */

    public int getLargeur() {
        return largeur;
    }
    /*
    Retourne la couleur du Rectangle.
     */

    public String getCouleur() {
        return couleur;
    }
    /*
    Retourne true si la largeur est valide. La largeur est valide si elle est entre 1 et 30.
     */
    public  boolean largeurEstValide(int largeur){
        boolean b = false;

        b = largeur >=  MIN_VAL && 30 >= largeur;
        return b;
    }
    /*
    Change la couleur du Rectangle avec une couleur valide. Si la valeur n'est pas valide throw FormeExeption
     */

    public void setCouleur(String couleur) {
        if (couleurEstValide(couleur)){
        this.couleur = couleur;
        }else {
            throw new FormeExeption();
        }
    }
    /*
    Retourne true si la hauteur est valide. La hauteur est valide si elle est entre 1 et 30.
     */

    public boolean hauteurEstValide(int hauteur){
        boolean b = false;

        b = hauteur >=  MIN_VAL && MAX_VAL >= hauteur;
        return b;

    }
    /*
    Retourne le perimètre du Rectangle.
     */

    public int calculerPerimetre(){
        int perimetre;
        perimetre = 2*largeur + 2*hauteur;

        return perimetre;
    }
    /*
    Change la hauteur du Rectangle avec une hauteur valide recu. Si la valeur n'est pas valide throw FormeExeption
     */

    public void setHauteur(int hauteur) {
        if (hauteurEstValide(hauteur)){
            this.hauteur = hauteur;
        }else {
            throw new FormeExeption();
        }
    }
    /*
    Retourne vrai si la couleur envoyé est dans la liste des couleurs. La couleurs fournie peut comporté des majuscule et
    des espaces au début
     */

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
    /*
    Retourne la hauteur
     */

    public int getHauteur() {
        return hauteur;
    }
    /*
    Retourne une chaîne de caractères qui représente le Rectangle. Exemple: ": Rectangle rouge 3, 4"
     */

    @Override
    public String toString() {
        return nom + " "+ couleur + " " + hauteur + ","+ largeur;
    }
    /*
    Retourne le nom.
     */

    public String getNom() {
        return nom;
    }
    /*
    Retourne vrai si deux Rectangle sont égaux. 2 Recatangle sont égaux si leur surface et leur couleur sont égales.
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle rectangle)) return false;
        return calculerSurface() == rectangle.calculerSurface() && Objects.equals(couleur, rectangle.couleur);
    }
    /*
    Change la largeur du Rectangle avec une largeur valide recu. Si la valeur n'est pas valide throw FormeExeption
     */

    public void setLargeur(int largeur)  {
        if (largeurEstValide(largeur)){
            this.largeur = largeur;
        } else {
            throw new FormeExeption();
        }

    }
}
