package formatif2.formes;

import formatif2.exeptions.FormeExeption;

import java.util.Objects;


    /*

    Cercle est composé d'un rayon situé entre 1 et 30 inclusivement,d'une des couleurs suivantes
    (rouge,vert,bleu,jaune,noir,orange) avec vert comme couleur de base et d'un nom défénie par default comme
    étant Cercle.
     */
public class Cercle {
    /*
    Ininitialise un cercle avec un rayon défaut de 10. La couleurs est définie par defaut en vert et le nom est définie par défaut
    comme cercle.
     */
    public Cercle(){
        setRayon(RAYON_DEFAUT);
        setCouleur(COULEUR_DEFAUT);
        this.nom = "Cercle";
    }
    /*
    Ininitialiser un cercle avec un rayon valide. La couleurs est définie par defaut en vert et le nom est définie par defaut
    comme cercle.
     */
    public Cercle(int rayon){
        setRayon(rayon);
        setCouleur(COULEUR_DEFAUT);
        this.nom = "Cercle";
    }

    private String couleur;
    /*
    Rayon est 10 si il n'est pas définie.
     */
    public static final int RAYON_DEFAUT = 10;
    private String nom;
    /*
    Couleur par defaut atribué quand le cercle est initialisé.
     */
    public static final String COULEUR_DEFAUT = "vert";
    /*
    Valeur minimum du rayon.
     */
    public static final int MIN_VAL = 1;
    private int rayon;
    /*
    Valeur maximum du rayon.
     */
    public static final int MAX_VAL = 30;
    /*
    Couleur pouvant être atribué avec setCouleur au cercle.
     */
    public static final String[] LES_COULEURS = {"rouge","vert","bleu","jaune","noir","orange"};
    /*
    Retourne vrai si deux cercles sont égaux. 2 cercles sont égaux si leur surface et leur couleur sont égales.
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cercle cercle = (Cercle) o;
        return Objects.equals(couleur, cercle.couleur) && Objects.equals(calculerSurface(),cercle.calculerSurface());
    }
    /*
    Retourne la couleur
     */

    public String getCouleur() {
        return couleur;
    }
    /*
    Retourne la surface du cercle
     */

    public int calculerSurface(){
        Double surfaceDouble;
        surfaceDouble = Math.pow(rayon,2) * Math.PI;
        int surface =surfaceDouble.intValue();

        return surface;
    }
    /*
    Retourne true si le rayon est valide. Le rayon est valide si il est entre 1 et 30.
     */

    public boolean rayonEstValide(int rayon){
        boolean b;

        b = rayon >=  MIN_VAL && MAX_VAL >= rayon;
        return b;

    }
    /*
    Change la couleur du cercle avec une couleur valide. Si la valeur n'est pas valide throw FormeExeption
     */

    public void setCouleur(String couleur) {
        if (couleurEstValide(couleur)){
            this.couleur = couleur;
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
    Retourne une chaîne de caractères qui représente le cercle. Exemple: "Cercle orange 20"
     */

    @Override
    public String toString() {
        return nom + " "+ couleur + " " + rayon;
    }
    /*
    Retourne le rayon
     */

    public int getRayon() {
        return rayon;
    }
    /*
    Retourne le nom
     */

    public String getNom() {
        return nom;
    }
    /*
    Change la valeur du rayon avec un rayon valide recu. Si la valeur n'est pas valide throw FormeExeption.
     */

    public void setRayon(int rayon) {
        if (rayonEstValide(rayon)){
            this.rayon = rayon;
        }else {
            throw new FormeExeption();
        }
    }
    /*
    Retourne le périmètre du cercle
     */
    public int calculerPerimetre(){
        Double perimetreeDouble;
        perimetreeDouble = 2* rayon * Math.PI;
        int surface =perimetreeDouble.intValue();

        return surface;
    }

}
